package DataStructure.stringANDline.array.doublePoint;

import java.util.Arrays;

/**
 * @author liujun
 * @version 1.0
 * @date 2020/10/10
 * @author—Email liujunfirst@outlook.com
 * @blogURL https://blog.csdn.net/ljfirst
 * @description 给定一个包含重复数字的数组，返回不重复的个数
 * 找出重复数组中不重复的个数
 */
public class OriginLength {

    int[] ans = null;
    int head = 0;
    int tail = 0;

    //给定一个包含重复数字的数组，返回不重复的个数
    public int method(int[] array) {
        if (array == null || array.length == 0) {
            return 0;
        }
        head = 0;
        tail = 0;
        Arrays.sort(array);
        for (int i = 0; i < array.length; i++) {
            if (array[head] == array[tail]) {
                tail++;
            } else {
                head++;
                int temp = array[head];
                array[head] = array[tail];
                array[tail] = temp;
                tail++;
            }
        }
        ans = array;
        return head + 1;
    }

    //给定一个包含重复数字的数组，返回排序后不重复的数组
    public int[] method1(int[] array) {
        method(array);
        return Arrays.copyOfRange(array, 0, head + 1);
    }
}
