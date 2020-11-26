package DataStructure.stringANDline.array.doublePoint;

import java.util.Arrays;
import java.util.List;

/**
 * @author liujun
 * @version 1.0
 * @date 2020/7/20
 * @author—Email liujunfirst@outlook.com
 * @blogURL https://blog.csdn.net/ljfirst
 * @description 2数之和
 * 给定一个数 target，在一维数组中，找出某 2 个数相加得 target。
 * 要求一：如果存在这个 2 个数，返回true，反则返回false。
 * 要求二：返回存在的这 2 个值
 * 要求三：返回存在的这 2 个值在数组中的原位置
 * 要求四：返回所有的 2 数之和的组合
 * 要求五：返回所有的 2 数之和在数组中原位置的组合
 */
public class Find2ValueinArray implements FindValueinArray{

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

    @Override
    public int[] getValue(int[] array, int target) {
        return new int[0];
    }

    @Override
    public int[] getPosition(int[] array, int target) {
        return new int[0];
    }

    @Override
    public List getValues(int[] array, int target) {
        return null;
    }

    @Override
    public List getPositions(int[] array, int target) {
        return null;
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
                return findPosition(array, newarray[left], newarray[right]);
            }
        }
        return Arrays.equals(a, new int[]{-1, -1}) ? new int[]{} : a;
    }

    //找出确认位置
    private int[] findPosition(int[] array, int value1, int value2) {
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
