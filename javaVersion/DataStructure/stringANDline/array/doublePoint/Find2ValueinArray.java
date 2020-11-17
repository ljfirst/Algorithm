package DataStructure.stringANDline.array.doublePoint;

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
        int[] newarray = Arrays.copyOf(array, array.length);
        Arrays.sort(newarray);
        int left = 0;
        int right = array.length - 1;
        while (left < right) {
            while ((left < right) && (newarray[left] + newarray[right] < value)) {
                left++;
            }
            while ((left < right) && (newarray[left] + newarray[right] > value)) {
                right--;
            }
            if ((left < right) && (newarray[left] + newarray[right] == value)) {
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
        int[] newarray = Arrays.copyOf(array, array.length);
        Arrays.sort(newarray);
        while (left < right) {
            while ((left < right) && (newarray[left] + newarray[right] < value)) {
                left++;
            }
            while ((left < right) && (newarray[left] + newarray[right] > value)) {
                right--;
            }
            if ((left < right) && (newarray[left] + newarray[right] == value)) {
                return transvalue2position(array, newarray[left], newarray[right]);
            }
        }
        return Arrays.equals(a, new int[]{-1, -1}) ? new int[]{} : a;
    }

    private int[] transvalue2position(int[] array, int value1, int value2) {
        int p1 = 0;
        int p2 = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value1) {
                p1 = i;
            }
            if (array[i] == value2) {
                p2 = i;
            }
        }
        if (p1 > p2) {
            int temp = p1;
            p1 = p2;
            p2 = temp;
        }
        return new int[]{p1, p2};
    }
}
