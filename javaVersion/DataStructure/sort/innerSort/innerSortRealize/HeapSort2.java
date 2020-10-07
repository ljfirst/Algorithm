package DataStructure.sort.innerSort.innerSortRealize;

import DataStructure.sort.innerSort.SortInterface;

/**
 * @author liujun
 * @version 1.0
 * @date 2020/6/21
 * @author—Email liujunfirst@outlook.com
 * @blogURL https://blog.csdn.net/ljfirst
 * @description
 */
public class HeapSort2 implements SortInterface {
    @Override
    public void sortMethod(int[] array) {
        //输入检查
        if (!check(array)) {
            return;
        }
        int length = array.length - 1;
        for (int i = 0; i < length; i++) {
            heapify_big(array, length - i);
            int temp = array[0];
            array[0] = array[length - i];
            array[length - i] = temp;
        }
    }

    //小顶堆
    public void heapify_big(int[] array, int bound) {
        //数组从0开始，因此中间值是 (bound - 1) / 2
        int mid = (bound - 1) / 2;
        int temp;
        for (int i = mid; i >= 0; i--) {
            int flag = 2 * i + 1;
            if (flag + 1 <= bound) {
                flag = array[flag] > array[flag + 1] ? flag : flag + 1;
            }
            if (flag <= bound && array[flag] > array[i]) {
                temp = array[flag];
                array[flag] = array[i];
                array[i] = temp;
            }
        }
    }
}
