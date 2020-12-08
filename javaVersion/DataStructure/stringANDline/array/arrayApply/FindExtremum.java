package DataStructure.stringANDline.array.arrayApply;

import java.util.Arrays;

/**
 * @author liujun
 * @version 1.0
 * @date 2020/9/3
 * @author—Email liujunfirst@outlook.com
 * @blogURL https://blog.csdn.net/ljfirst
 * @description 寻找极值
 * 获取最大值：有一个整数数组，请求出两两之差绝对值最大的值
 * 获取最小值：有一个整数数组，请求出两两之差绝对值最小的值
 * <p>
 * first：寻找绝对值最大的值，那么只要找出最大值最小值，做差即可。
 * second：
 * 思路一：暴力的方式。遍历所有的两个数的差，记录最小值。算法的复杂度O(n2)
 * 思路二：
 */
public class FindExtremum {

    //获取最大值
    public int getMax(int[] array) {
        if (array == null || array.length <= 1) {
            return Integer.MIN_VALUE;
        }
        int min = array[0];
        int max = array[0];
        max = Arrays.stream(array).max().getAsInt();
        min = Arrays.stream(array).min().getAsInt();
        /*for (int i = 1; i < array.length; i++) {
            max = Math.max(array[i], max);
            min = Math.min(array[i], min);
        }*/
        return max - min;
    }

    //获取最小值:暴力的方式
    public int getMin1(int[] array) {
        if (array == null || array.length <= 1) {
            return Integer.MIN_VALUE;
        }
        int count = Integer.MAX_VALUE;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                count = Math.min(Math.abs(array[j] - array[i]), count);
            }
        }
        return count;
    }

    //获取最小值:排序做差的方式
    public int getMin2(int[] array) {
        if (array == null || array.length <= 1) {
            return Integer.MIN_VALUE;
        }
        Arrays.sort(array);
        int count = Integer.MAX_VALUE;
        for (int i = 0; i < array.length - 1; i++) {
            count = Math.min(array[i + 1] - array[i], count);
        }
        return count;
    }

    //获取最小值:动态规划
    public int getMin3(int[] array) {
        if (array == null || array.length <= 1) {
            return Integer.MIN_VALUE;
        }
        int min = Integer.MIN_VALUE;
        int length = array.length - 1;
        int[] array_b = new int[length];
        for (int i = 0; i < length; i++) {
            array_b[i] = array[i + 1] - array[i];
        }
        int[] LargestSum = new int[length];
        min = LargestSum[0] = array_b[0];
        for (int i = 1; i < length; i++) {
            LargestSum[i] = Math.abs(LargestSum[i - 1] + array_b[i]) < Math.abs(array_b[i]) ?
                    (LargestSum[i - 1] + array_b[i]) : array_b[i];
            if (Math.abs(LargestSum[i]) < Math.abs(min)) {
                min = Math.abs(LargestSum[i]);
            }
        }
        return min;
    }
}
