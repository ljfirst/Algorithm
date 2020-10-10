package DataStructure.stringANDline.array.doublePoint;

import java.util.Arrays;

/**
 * @author liujun
 * @version 1.0
 * @date 2020/10/10
 * @author—Email liujunfirst@outlook.com
 * @blogURL https://blog.csdn.net/ljfirst
 * @description 去除指定元素
 */
public class ReduceNum {

    public int head = 0;
    public int tail = 0;

    //给定数组，去除指定元素，返回不含指定元素的数组
    public int[] method(int[] array, int key) {
        if (array == null || array.length == 0) {
            return new int[]{};
        }
        head = 0;
        tail = 0;
        for (; tail < array.length; tail++) {
            if (array[tail] != key) {
                array[head] = array[tail];
                head++;
            }
        }
        return Arrays.copyOfRange(array, 0, head);
    }

    //给定数组，去除指定元素，返回剩余元素的个数
    public int method1(int[] array, int key) {
        method(array, key);
        return head;
    }

}
