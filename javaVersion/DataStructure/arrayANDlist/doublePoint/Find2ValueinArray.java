package DataStructure.arrayANDlist.doublePoint;

import java.util.ArrayList;
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
public class Find2ValueinArray implements FindValueinArray {

    // 要求一：如果存在这个两个数，返回true，反则返回false。
    public boolean exist(int[] array, int target) {
        if (array == null || array.length <= 1) {
            return false;
        }
        int[] newarray = Arrays.copyOf(array, array.length);
        Arrays.sort(newarray);
        int left = 0;
        int right = array.length - 1;
        while (left < right) {
            while ((left < right) && (newarray[left] + newarray[right] < target)) {
                left++;
            }
            while ((left < right) && (newarray[left] + newarray[right] > target)) {
                right--;
            }
            if ((left < right) && (newarray[left] + newarray[right] == target)) {
                return true;
            }
        }
        return false;
    }


    @Override
    public List<int[]> getValues(int[] array, int target) {
        if (array == null || array.length <= 1) {
            return null;
        }
        int left = 0;
        int right = array.length - 1;
        int[] newarray = Arrays.copyOf(array, array.length);
        Arrays.sort(newarray);
        List<int[]> lists = new ArrayList<>();

        while (left < right) {
            while ((left < right) && (newarray[left] + newarray[right] < target)) {
                left++;
            }
            while ((left < right) && (newarray[left] + newarray[right] > target)) {
                right--;
            }
            if ((left < right) && (newarray[left] + newarray[right] == target)) {
                int[] a = new int[]{newarray[left], newarray[right]};
                lists.add(a);
                left++;
                right--;
            }
        }
        return lists.size() == 0 ? null : lists;
    }

    @Override
    public List getPositions(int[] array, int target) {
        return null;
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
