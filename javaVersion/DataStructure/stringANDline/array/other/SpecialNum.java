package DataStructure.stringANDline.array.other;

import java.util.ArrayList;
import java.util.List;

/** 
 *@author liujun
 *@date 2018-8-23 上午11:59:55
 *@author—Email liujunfirst@outlook.com
 *@description 左小右大的数
 * 一个int 数组，里面数据无任何限制，要求求出所有这样的数a[i]，其左边的数都小于等于它，右边的数都大于等于它。
 * 能否只用一个额外数组和少量其它空间实现。
 *@version 1.0
 *
 *@attention 为什么这个数一定满足：max <= array[i] = min_right[i]?
 *answer:
 *1.为什么要定义max？因为他满足其左边的数都小于等于它。
 *2.为什么max <= array[i]？使得array[i]满足其左边的数都小于等于它。
 *3.为什么array[i] = min_right[i]？而不是小于或者大于？
 *  小于不成立，违反了min_right设立的初衷。
 *  大于不成立，违反了右边的数都大于等于它。
 *4.这一句中：max = max > array[i] ? max : array[i];如果存在
 *非array[i]的max较大，并且等于min_right[i]？
 *  不成立，如果max = min_right[i] > array[i]，不满足第三问的大于不成立。
 */
public class SpecialNum {

	//找出其左边的数都小于等于它，右边的数都大于等于它
	public void findSpecialNum(int[] array) {

		//构建一个数组min_right[]
		//满足min_right[i]是当前位i至最后数组中最小的那个数。
		int[] min_right = new int[array.length];
		min_right[array.length - 1] = array[array.length - 1];
		for (int i = min_right.length - 2; i >= 0 ; i--) {
			min_right[i] = array[i] < min_right[i + 1] ? array[i] : min_right[i + 1];
		}
		//定义一个当前最大值用于比较，定义list用来存数据
		int max = Integer.MIN_VALUE;
		List<Integer> list = new ArrayList<Integer>();
		
		//为什么这个数一定满足：max = array[i] = min_right[i]，见attention。
		for (int i = 0; i < array.length; i++) {
			max = max > array[i] ? max : array[i];
			if(max == min_right[i]){
				list.add(max);
			}
		}
		//输出这些数
		for (Integer integer : list) {
			System.out.print(integer + " ");
		}
	}
	
	//主方法测试
	public static void main(String[] args) {
		int[] num = {1,7,3,4,5,6,2,8,9};
		//期望输出1,8,9
		SpecialNum sn = new SpecialNum();
		sn.findSpecialNum(num);
	}
}
