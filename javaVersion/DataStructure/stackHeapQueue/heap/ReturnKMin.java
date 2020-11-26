package DataStructure.stackHeapQueue.heap;

import DataStructure.sort.innerSort.innerSortRealize.HeapSort;
import java.util.Arrays;

/**
 * @author liujun
 * @version 1.0
 * @date 2018-8-25 04:58:29
 * @author-Email liujunfirst@outlook.com
 * @description 返回最小的 K 个元素
 * @method 快排法、堆排法
 */
public class ReturnKMin {

    HeapSort heapify = new HeapSort();

    //堆排法
    public int[] kMinHeap_1(int[] array, int k) {
        if (array == null || array.length < k) {
            return null;
        }
        int[] arraycopy = Arrays.copyOfRange(array,0,array.length);
        //build k size heap
        for (int i = k / 2; i >= 0; i--) {
            heapify.heapify_big(arraycopy, i, k - 1);
        }
        //update k size heap
        for (int i = arraycopy.length - 1; i >= k; i--) {
            if (arraycopy[0] > arraycopy[i]) {
                int temp = arraycopy[0];
                arraycopy[0] = arraycopy[i];
                arraycopy[i] = temp;
                //fix up heap
                heapify.heapify_big(arraycopy, 0, k - 1);
            }
        }
        //sort k size heap
        int[] kmin = new int[k];
        int u = k - 1;
        for (int i = 1; i < k; i++) {
            kmin[u] = arraycopy[0];
            u--;
            arraycopy[0] = arraycopy[k - i];
            heapify.heapify_big(arraycopy, 0, k - i - 1);
        }
        kmin[u] = arraycopy[u];
        return kmin;
    }

    public int[] kMinHeap_2(int[] array, int k) {
        if (array == null || array.length < k) {
            return null;
        }
        int[] arraycopy = Arrays.copyOfRange(array,0,array.length);
        int border = arraycopy.length - k - 1;
        //build (array.length - k) size heap
        for (int i = (arraycopy.length - k - 1) / 2; i >= 0; i--) {
            heapify.heapify_small(arraycopy, i, border);
        }
        int kcount = 0;
        int[] kmin = new int[k];
        //update (array.length - k) size heap
        for (int i = arraycopy.length - 1; i >= arraycopy.length - k; i--) {
            if (arraycopy[0] < arraycopy[i]) {
                kmin[kcount++] = arraycopy[0];
                int temp = arraycopy[0];
                arraycopy[0] = arraycopy[i];
                arraycopy[i] = temp;
                heapify.heapify_small(arraycopy, 0, border);
            } else {
                kmin[kcount++] = arraycopy[i];
            }
        }
        return kmin;
    }

    public int[] kMinQuickSort(int[] array, int k) {
        if (array == null || array.length < k) {
            return null;
        }
        int[] arraycopy = Arrays.copyOfRange(array,0,array.length);
        QuickSortExe(arraycopy, k, 0, arraycopy.length - 1);
        int[] kmin = new int[k];
        for (int i = 0; i < k; i++) {
            kmin[i] = arraycopy[i];
        }
        heapify.sortMethod(kmin);
        return kmin;
    }

    public void QuickSortExe(int[] array, int k, int begin, int end) {
        int low = begin;
        int high = end;
        int temp = 0;
        if (begin < end) {
            while (low < high) {
                while (low < high && array[high] > array[begin]) {
                    high--;
                }
                while (low < high && array[low] <= array[begin]) {
                    low++;
                }
                if (low < high) {
                    temp = array[high];
                    array[high] = array[low];
                    array[low] = temp;
                }
            }
            temp = array[begin];
            array[begin] = array[low];
            array[low] = temp;
            //if(k == low || k  == low- 1){����Ҳ���ԣ�����
            if (k == low) {
                return;
            }
            if (low < k) {
                QuickSortExe(array, k, low + 1, end);
            } else {
                QuickSortExe(array, k, begin, low - 1);
            }
        }
    }
}
