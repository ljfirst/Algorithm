package DataStructure.sort.innerSort.innerSortRealize;

import DataStructure.sort.innerSort.SortInterface;

/**
 * @author liujun
 * @version 1.0
 * @date 2020/5/2
 * @author-Email liujunfirst@outlook.com
 * @blogURL https://blog.csdn.net/ljfirst
 * @description 希尔排序
 */
public class ShellSort implements SortInterface {
    @Override
    public void sortMethod(int[] array) {
        //判空
        if (!check(array)) {
            return ;
        }
        int length = array.length;
        //间隔gap ，直到gap为1结束
        int gap = length / 2;
        for (; gap >= 1; gap /= 2) {//注意此处的gap等于1，就相当于全排序，是需要的，“=”不能少
            for (int i = 0; i < gap; i++) {
                //内部使用插入排序
                for (int j = i + gap; j < length; j += gap) {
                    int temp = array[j];
                    int k = j;
                    //k-gap 要判断越界
                    while ((k - gap) >= 0 && (array[k - gap] > temp)) {
                        array[k] = array[k - gap];
                        k -= gap;
                    }
                    if (k != j) {
                        array[k] = temp;
                    }
                }
            }
        }
    }
}
