package Logic.math;

import java.util.ArrayList;
import java.util.List;

/** 
 *@author liujun
 *@date 2019-8-2 上午10:30:01
 *@author—Email liujunfirst@outlook.com
 *@CSDN Blog URL:https://blog.csdn.net/ljfirst/article/details/98177653
 *@description 水仙花数的实现
 *@version 1.0
 */
public class Narcissistic {

	public void narcissistic() {
		List<Integer> list = new ArrayList<Integer>();
		int value;
		int temp;
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				for (int k = 0; k < 10; k++) {
					value = i*100+j*10+k;
					temp = i*i*i+j*j*j+k*k*k;
					if(value >= 100 && value == temp){
						list.add(i*100+j*10+k);
					}
				}
			}
		}
		/*for (int i : list) {
			System.out.println(i);
		}*/
	}
	
	public void narcissisticOptic() {
		int[] cubic = new int[10];
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < cubic.length; i++) {
			cubic[i] = i*i*i;
		}
		int value;
		for (int i = 0; i < cubic.length; i++) {
			for (int j = i; j < cubic.length; j++) {
				for (int k = j; k < cubic.length; k++) {
					value = cubic[i]+cubic[j]+cubic[k];
					char[] c = Integer.toString(value).toCharArray();
					int cmp = i^j^k;
					for (int l = 0; l < c.length; l++) {
						cmp ^= Integer.valueOf(c[l]+"");
					}
					if(cmp == 0 && value < 1000 && value > 100){
						if(value == i*100+j*10+k || value == i*100+k*10+j || value == j*100+i*10+k
								|| value == j*100+k*10+i || value == k*100+j*10+i || value == k*100+i*10+j){
							list.add(value);
						}
					}
				}
			}
		}
		/*for (int i : list) {
			System.out.println(i);
		}*/
	}
	
	public static void main(String[] args) {
		Narcissistic c = new Narcissistic();
		long time1 = System.nanoTime();
		for (int i = 0; i < 1000; i++) {
			c.narcissistic();
		}
		System.out.println(System.nanoTime() - time1);
		
		time1 = System.nanoTime();
		for (int i = 0; i < 1000; i++) {
			c.narcissisticOptic();
		}
		System.out.println(System.nanoTime() - time1);
		
	}
}
