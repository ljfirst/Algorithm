package DataStructure.stackHeapQueue.heap;

import DataStructure.sort.innerSort.innerSortRealize.HeapSort;

/**
 *@author liujun
 *@date 2018-8-25 ����04:58:29
 *@authorEmail liujunfirst@outlook.com
 *@description  返回最小的 K 个元素
 *@method:
 *    快排法
 *    堆排法
 *@version 1.0
 */
public class ReturnKMin {

	HeapSort heapify = new HeapSort();

	//����һ��(ά��һ��k��С�Ķ�)
	public int[] kMinHeap_K(int[] array ,int k) {
		//������
		if (array == null || array.length < k) {
			return null;
		}
		int[] kmin = new int[k];
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
		int kcount = 0;
		for (int i = k - 1; i >= 0; i--) {
			kmin[kcount++] = array[i];
		}
		//Ϊ�˲��ԣ����Բ�Ҫ
		heapify.sortMethod(kmin);
		return kmin;
	}

	//����һ��ʹ�ö�(ά��һ��array.length - k��С�Ķ�)
	public int[] kMinHeap_length(int[] array ,int k) {
		//������
		if(array == null || array.length < k){
			return null;
		}
		int[] kmin = new int[k];
		int kcount = 0;
		//����(ά����С����)
		for (int i = (array.length - k - 1)/2; i >= 0; i--) {
			heapify.heapify_small(array, i, array.length - k - 1);
		}
		//�����Ѷ�������ĩβԪ�أ�ѭ������,ע��߽�ֵ
		int temp = 0;
		for (int i = array.length - 1; i >= array.length - k; i--) {
			if(array[0] < array[i]){
				temp = array[0];
				kmin[kcount++] = array[0];//��¼
				array[0] = array[i];
				array[i] = temp;
				heapify.heapify_small(array, 0, array.length - k - 1);
			}else{
				kmin[kcount++] = array[i];//��¼
			}
		}
		//Ϊ�˲��ԣ�������kmin,��������
		heapify.sortMethod(kmin);
		return kmin;
	}

	//��������ʹ�ÿ���
	public int[] kMinQuickSort(int[] array, int k){
		if(array == null || array.length < k){
			return null;
		}

		kMinQuickSortExe(array, k, 0,array.length - 1);
		int[] kmin = new int[k];
		for (int i = 0; i < k; i++) {
			kmin[i] = array[i];
		}
		heapify.sortMethod(kmin);
		return kmin;
	}

	public void kMinQuickSortExe(int[] array, int k, int begin, int end) {
		int low = begin;
		int high = end;
		int temp = 0;
		//�߽��ж�
		if (begin < end) {
			//˫����ŷ�ʽ
			while(low < high){
				while(low < high && array[high] > array[begin]){
					high--;
				}
				//array[low] < array[begin]�Ǵ���д����������������ѭ��
				//��������whileѭ�������и�=,��������ѭ��
				//ÿ��ѭ������Ҫ�жϳ��������low < high
				while(low < high && array[low] <= array[begin]){
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
			//kλ�жϣ���ʱֹͣ�ݹ顣
			//if(k == low || k  == low- 1){����Ҳ���ԣ�����
			if(k == low){
				return ;
			}
			if(low < k){
				kMinQuickSortExe(array, k, low + 1, end);
			}else {
				kMinQuickSortExe(array, k, begin, low - 1);
			}
		}
	}
}
