package DataStructure.sort.innerSort.innerSortRealize;

import DataStructure.sort.innerSort.SortInterface;

/**
 *@author liujun
 *@date 2019-3-23 下午12:08:37
 *@author—Email liujunfirst@outlook.com
 *@description  采用插入法来优化快速排序
 *@URL
 *@version 1.0
 */
public class QuickSortOpt implements SortInterface {

	InsertSort insertionsort = new InsertSort();

	@Override
	public void sortMethod(int [] array) {
		//边界判空
		if (!check(array)) {
			return ;
		}
		// 默认k为3
		quicksortOpsSimplex(array, 0, array.length - 1, 8);
	}
	
	public int[] quicksortOpsSimplex(int [] sortNum, int left, int right, int k) {

		//定位变量
		int mid = left;
		int temp = 0;
		if(right - left + 1 <= k){
			insertionsort.insertionsort(sortNum, left, right);
			return sortNum;
		}
		if(left < right){
			//从左到右寻找比标杆小的元素，依次与mid交换
			for (int i = left + 1; i <= right; i++) {
				if(sortNum[i] < sortNum[left]){
					mid++;
					temp = sortNum[mid];
					sortNum[mid] = sortNum[i];
					sortNum[i] = temp;
				}
			}
			//最后一个比对元素跟标杆元素交换
			temp = sortNum[mid];
			sortNum[mid] = sortNum[left];
			sortNum[left] = temp;
			
			//递归
			quicksortOpsSimplex(sortNum, left, mid - 1, k);
			quicksortOpsSimplex(sortNum, mid + 1, right, k);
		}
		return sortNum;
	}
}
