package DataStructure.stackHeapQueue.heap;

import DataStructure.sort.innerSort.innerSortRealize.HeapSort;

/**
 * @author liujun
 * @version 1.0
 * @date 2019-12-10 09:49
 * @author-Email liujunfirst@outlook.com
 * @description 返回最小的 第K个 元素
 * @blogURL
 */
public class ReturnKthMin {

    private HeapSort heapify = new HeapSort();
    private ReturnKMin returnKMin = new ReturnKMin();

    public int returnKthMinbyheap(int[] array, int k) {
        if (array == null || array.length < k) {
            return -1;
        }
        for (int i = k / 2; i >= 0; i--) {
            heapify.heapify_big(array, i, k - 1);
        }
        int temp = 0;
        for (int i = array.length - 1; i >= k; i--) {
            if (array[0] > array[i]) {
                temp = array[0];
                array[0] = array[i];
                array[i] = temp;
                heapify.heapify_big(array, 0, k - 1);
            }
        }
        return array[0];
    }

    public int returnKthMinbyheap2(int[] array, int k) {
        if (array == null || array.length < k) {
            return -1;
        }
        for (int i = (array.length - k) / 2; i >= 0; i--) {
            heapify.heapify_small(array, i, array.length - 1);
        }
        for (int i = array.length - (k - 1); i < array.length; i++) {
            if (array[0] < array[i]) {
                int temp = array[0];
                array[0] = array[i];
                array[i] = temp;
                heapify.heapify_small(array, 0, array.length - 1 - k);
            }
        }
        return array[0];
    }

    public int returnKthMinbyquicksort(int[] array, int k) {
        if (array == null || array.length < k) {
            return -1;
        }
        returnKMin.QuickSortExe(array, k, 0, array.length - 1);
        return array[k - 1];
    }
}
