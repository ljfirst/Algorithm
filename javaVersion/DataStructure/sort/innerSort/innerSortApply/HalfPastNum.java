package DataStructure.sort.innerSort.innerSortApply;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/** 
 *@author liujun
 *@date 2018-7-26 上午11:16:37
 *@author—Email liujunfirst@outlook.com
 *@description 数组中有一个数字出现的次数超过数组长度的一半，请找出这个数字。
 *例如输入一个长度为9的数组{1,2,3,2,2,2,5,4,2}。由于数字2在数组中出现了5次，
 *超过数组长度的一半，因此输出2。如果不存在则输出-1。
 *
 *思路一（最简洁）：根据鸽笼原理，最差情况下，也会出现三个“该数字”连续排在一起，
 *             定义变量count，如果左右数据相同，count++，并保存该数据。
 *思路二（最常规）：通过快排的方式，将从小到大排序，中位数就是重数，既所求值。
 *思路三（最简单）：通过map，统计出现的最多值。
 *@version 1.0
 */
//找出超过半数的那个数字
public class HalfPastNum {

	//思路一：鸽笼原理
	public int method_pigeon(int [] array){
		if(array == null || array.length == 0){
			return -1;
		}
		//定义count变量全局监控。
		int count = 0;
		//随机取第一个数据最为对比值
		int num = array[0];

		//如果有符合条件的数字，则它出现的次数比其他所有数字出现的次数和还要多。
		for (int i = 0; i < array.length; i++) {
			//清空重置
			if(count == 0){
				num = array[i];
				count = 1;
			}else if(num == array[i]){
				count++;
			}else{
				count--;
			}
		}

		//如果存在超过半数的数则输出，否则输出-1
		count = 0;
		for (int i = 0; i < array.length; i++) {
			if(array[i] == num){
				count++;
			}
		}
		return count > array.length/2 ? num : -1;
	}

	//思路二：快排原理
	public int method_quicksort(int [] array){
		if(array == null || array.length == 0){
			return -1;
		}
		//快排
		Arrays.sort(array);
		//输出
		int count = 0;
		int flag = array[array.length/2];
		for (int i = 0; i < array.length; i++) {
			if(array[i] == flag){
				count++;
			}
		}
		//如果存在超过半数的数则输出，否则输出-1
		return count > array.length/2 ? flag : -1;
	}

	//思路三：map方法
	public int method_map(int [] array){

		if(array == null || array.length == 0){
			return -1;
		}
		if(array.length == 1){
			return array[0];
		}
		Map<Integer ,Integer> map = new HashMap<Integer ,Integer>();
		//定义出现最多的值和其数量
		int num = 0;
		int count = 0;

		for (int i = 0; i < array.length; i++) {
			if(map.containsKey(array[i])){
				map.put(array[i], map.get(array[i])+1);
				if(map.get(array[i]) > count){
					count = map.get(array[i]);
					num = array[i];
				}
			}else{
				map.put(array[i], 1);
			}
		}
		
		//如果存在超过半数的数则输出，否则输出-1
		return count > array.length/2 ? num : -1;
	}
}
