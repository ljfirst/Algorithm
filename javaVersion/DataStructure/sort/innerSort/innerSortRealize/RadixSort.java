package DataStructure.sort.innerSort.innerSortRealize;

import DataStructure.sort.innerSort.SortInterface;

/**
 * @author liujun
 * @version 1.0
 * @date 2019-3-23 12:09:48
 * @author-Email liujunfirst@outlook.com
 * @description 基数排序
 */
public class RadixSort implements SortInterface {

    @Override
    public void sortMethod(int[] array) {
        //检查
        if (!check(array)) {
            return;
        }
        int max = Integer.MIN_VALUE;
        int temp = 0;
        for (int i = 0; i < array.length; i++) {
            temp = array[i] > 0 ? array[i] : -array[i];
            if (max < temp) {
                max = temp;
            }
        }
        int d = String.valueOf(max).length();
        radixsort(array, d, 10);
    }

    public void radixsort(int[] array, int d, int radix) {
        int radixtemp = 1;
        int[][] radixbucket = new int[radix][array.length];
        int[] radixpoint = new int[radix];
        int temp = 0;
        for (int loopcount = 0; loopcount <= d; loopcount++) {
            for (int i = 0; i < array.length; i++) {
                temp = (array[i] / radixtemp) % radix;
                radixbucket[temp][radixpoint[temp]] = array[i];
                radixpoint[temp]++;
            }
            int bucketcount = 0;
            for (int i = 0; i < radix; i++) {
                int j = 0;
                while (radixpoint[i] != 0) {
                    array[bucketcount++] = radixbucket[i][j++];
                    radixpoint[i]--;
                }
            }
            radixtemp *= radix;
        }
    }
}