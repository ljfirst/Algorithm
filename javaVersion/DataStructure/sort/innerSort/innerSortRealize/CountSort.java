package DataStructure.sort.innerSort.innerSortRealize;

import DataStructure.sort.innerSort.SortInterface;

import java.util.Arrays;

/**
 * @author liujun
 * @version 1.0
 * @date 2019-3-23 12:10:15
 * @author-Email liujunfirst@outlook.com
 * @description 计数排序
 */
public class CountSort implements SortInterface {

    public void sortMethod(int[] arrayA) {
        if (!check(arrayA)) {
            return;
        }
        int max = Arrays.stream(arrayA).max().getAsInt();
        int min = Arrays.stream(arrayA).min().getAsInt();
        //根据最大最小值 确定数组大小
        int[] arrayB = new int[max - min + 1];
        //桶内数据自增，计量
        for (int value : arrayA) {
            arrayB[value - min]++;
        }
        for (int i = 1; i < arrayB.length; i++) {
            arrayB[i] += arrayB[i - 1];
        }
        int[] arrayC = new int[arrayA.length];
        for (int i = arrayA.length - 1; i >= 0; i--) {
            arrayC[--arrayB[arrayA[i] - min]] = arrayA[i];
        }
        System.arraycopy(arrayC, 0, arrayA, 0, arrayC.length);
    }

    public void sortMethod1(int[] arrayA) {
        if (!check(arrayA)) {
            return;
        }
        int max = arrayA[0];
        int min = arrayA[0];
        for (int i : arrayA) {
            max = Math.max(max, i);
            min = Math.min(min, i);
        }
        //根据最大最小值 确定数组大小
        int[] arrayB = new int[max - min + 1];
        //桶内数据自增，计量
        for (int value : arrayA) {
            arrayB[value - min]++;
        }
        int[] arrayC = new int[arrayA.length];
        int count = 0;
        for (int i = 0; i < arrayB.length; i++) {
            while (arrayB[i] != 0) {
                arrayC[count++] = i + min;
                arrayB[i]--;
            }
        }
        System.arraycopy(arrayC, 0, arrayA, 0, arrayC.length);
    }
}
