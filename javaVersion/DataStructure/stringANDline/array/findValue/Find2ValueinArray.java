package DataStructure.stringANDline.array.findValue;

import java.util.Arrays;

/**
 * @author liujun
 * @version 1.0
 * @date 2020/7/20
 * @author—Email liujunfirst@outlook.com
 * @blogURL https://blog.csdn.net/ljfirst
 * @description 给定一个数 a，在一维数组中，找出某两个数相加得 a。
 * 要求一：如果存在这个两个数，返回true，反则返回false。
 * 要求二：返回这两个数在数组中的位置
 */
public class Find2ValueinArray {
    // 要求一：如果存在这个两个数，返回true，反则返回false。
    public boolean exist(int[] array, int value) {
        if (array == null || array.length <= 1) {
            return false;
        }
        Arrays.sort(array);
        int left = 0;
        int right = array.length - 1;
        while (left < right) {
            while ((left < right) && (array[left] + array[right] < value)) {
                left++;
            }
            while ((left < right) && (array[left] + array[right] > value)) {
                right--;
            }
            if (array[left] + array[right] == value) {
                return true;
            }
        }
        return false;
    }

    // 要求二：返回这两个数在数组中的位置
    public int[] getValuePosition(int[] array, int value) {
        if (array == null || array.length == 0) {
            return new int[]{};
        }
        int[] a = {-1, -1};
        int left = 0;
        int right = array.length - 1;
        while (left < right) {
            while ((left < right) && (array[left] + array[right] < value)) {
                left++;
            }
            while ((left < right) && (array[left] + array[right] > value)) {
                right--;
            }
            if (array[left] + array[right] == value) {
                int x = 0;
                int y = array.length - 1;
                for (int i = 0; i < array.length; i++) {
                    if (array[left] == array[i]) {
                        x = i;
                    }
                    if (array[right] == array[i]) {
                        y = i;
                    }
                }
                return new int[]{x, y};
            }
        }
        return a;
    }
}
