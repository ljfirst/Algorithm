package DataStructure.stackHeapQueue.heap;

import DataStructure.sort.innerSort.innerSortRealize.HeapSort;

/**
 * @author liujun
 * @version 1.0
 * @date 2019-12-10 09:49
 * @authorEmail  liujunfirst@outlook.com
 * @description  返回最小的 第K个 元素
 * @blogURL
 */
public class ReturnKthMin {

    HeapSort heapify = new HeapSort();
    ReturnKMin returnKMin = new ReturnKMin();

    //ʹ�ö��š�������һ��ά��һ��k��С�Ķѣ���󷵻ضѶ�
    public int returnKthMinbyheap(int[] array, int k){
        if(array == null || array.length < k){
            return -1;
        }
        //����(ά���Ĵ󶥶�)
        for (int i = k / 2; i >= 0; i--) {
            heapify.heapify_big(array, i, k - 1);
        }
        //�����Ѷ�������ĩβԪ�أ�ѭ������,ע��߽�ֵ k
        int temp = 0;
        for (int i = array.length - 1; i >= k; i--) {
            if(array[0] > array[i]){
                temp = array[0];
                array[0] = array[i];
                array[i] = temp;
                heapify.heapify_big(array, 0, k - 1);
            }
        }
        return array[0];
    }

    //ʹ�ÿ���
    public int returnKthMinbyquicksort(int[] array, int k){
        if(array == null || array.length < k){
            return -1;
        }
        returnKMin.kMinQuickSortExe(array,k,0,array.length-1);
        return array[k-1];
    }
}
