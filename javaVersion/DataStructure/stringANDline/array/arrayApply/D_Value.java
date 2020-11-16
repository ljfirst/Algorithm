package DataStructure.stringANDline.array.arrayApply;

import java.util.Arrays;

/**
 * @author liujun
 * @version 1.0
 * @date 2018-8-23 下午10:54:34
 * @author—Email liujunfirst@outlook.com
 * @description 两两之差绝对值
 * 有一个整数数组，请求出两两之差绝对值最小的值,记住，
 * 只要得出最小值即可，不需要求出是哪两个数。
 * 解题思路：
 * 方法一：设这个整数数组是a1,a2,...,an，构造数组B=(b1,b2,...,bn-1)，
 * b1 = a1-a2，b2 = a2-a3，b3 = a3-a4，...，bn-1 = an-1 - an。
 * 那么原数组中，任意两整数之差 ai - aj（1<=i,j<=n）可以表示成 B 中第i个到第j-1个元素的连续求和，
 * 例如b2+b3+b4 = (a2-a3) + (a3-a4) + (a4-a5) = a2 - a5
 * O(n)构造出B序列后，用类似“最大子段和”算法求“最小绝对值子段和”（不是最简洁）。
 * <p>
 * 方法二(废)：遍历一遍数据，找出最大值Max和最小值Min，然后把整个数据进行划分，step=(Max - Min)/n.然后遍历这n个桶，
 * 相邻元素的最大值一定是某个桶i中的最大值和桶(i+1)中的最小值的差值。满足Min + n * step = Max。
 * 反证法：假如这个相邻元素的最大间距不是某个桶 i 中的最大值和桶 (i+1) 中的最小值的差值，
 * 即最大间距的两个元素位于同一个桶中，即最大间距小于step，所以Min + n * step < Maxd的。
 * 因此矛盾。所以最大元素肯定是位于不同桶中的。整个算法时间复杂度为O(n)，空间复杂度也是O(n)
 */
public class D_Value {

    public void method1(int[] array) {
        // TODO Auto-generated method stub
        //排序
        Arrays.sort(array);
        int min = Integer.MAX_VALUE;
        int temp = 0;
        for (int i = 1; i < array.length; i++) {
            temp = array[i] - array[i - 1];
            if (min > temp) {
                min = temp;
            }
        }
        System.out.println(min);
    }

    //最小绝对值子段和
    public void method2(int[] array) {

        //构造数组B=(b1,b2,...,bn-1)
        int[] array_b = new int[array.length - 1];
        for (int i = 0; i < array.length - 1; i++) {
            array_b[i] = array[i] - array[i + 1];
            if (array_b[i] == 0) {
                System.out.println(0);
                return;
            }
        }
        //数组B 最小绝对值子段和
        int[] array_c = new int[array_b.length];
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < array_c.length; i++) {
            for (int j = 0; j <= i; j++) {
                array_c[j] += array_b[i];
                if (Math.abs(min) > Math.abs(array_c[j])) {
                    min = Math.abs(array_c[j]);
                }
            }
        }
        //数组B 最小绝对值子段和(有问题)
		/*int start = 0;
		int end = 0;
		int start_temp = 0;
		int temp_abs = 0;
		int best_min = Integer.MAX_VALUE;
		int sum_temp = 0;
		int sum_temp_abs = 0;
		
		for (int i = 0; i < array_b.length; i++) {
			sum_temp += array_b[i];
			sum_temp_abs = sum_temp > 0 ? sum_temp : 0 - sum_temp;
			temp_abs = array_b[i] > 0 ? array_b[i] : 0 - array_b[i]; 
			
			if (temp_abs < best_min) {
				best_min = temp_abs;
				start = i;
				end = i;
				sum_temp = temp_abs;
			}else {
				if(sum_temp_abs < best_min){
					best_min = sum_temp_abs;
					start = start_temp;
					end = i;
				}else {
					start_temp = i + 1;
					sum_temp = best_min;
				}
			}
		}*/
        //输出差值
        System.out.println(min);
    }

    //桶方法:这个方法有极大的漏洞
	/*public void method3(int[] array) {
		// TODO Auto-generated method stub
		//找出最大值Max和最小值Min
		Arrays.sort(array);
		int min = array[0];
		int max = array[array.length - 1];
		
		//step=(Max - Min)/n
		int n = array.length;
		int step = (max - min) / n;
		int count = min + step;
		int start = 0;
		int best_min = Integer.MAX_VALUE;
		
		//遍历这n个桶,相邻元素的最大值一定是某个桶i中的最大值和桶(i+1)中的最小值的差值
		while (count < max) {
			if (array[start] < count) {
				while (array[start] < count) {
					start++;
				}
				if(start <= n - 1 && best_min > (array[start] - array[start - 1])){
					best_min = array[start] - array[start - 1];
				}
			}
			count += step;
		}
		System.out.println(best_min);
	}*/

    //主方法测试
    public static void main(String[] args) {
        int[] array = {15, 7, -640, 10, 80, -2, 33, 25, 41, -5, 84, 22};
        int[] array1 = {15, 7, -640, 10, 80, -2, 33, 25, 41, -5, 84, 22};
        //int[] array2 = {15,7,-640,10,80,-2,33,25,41,-5,84,22};

        //期望输出10 - 7 = 3
        D_Value dv = new D_Value();
        System.out.println("方法一：排序暴力差值");
        dv.method1(array);
        System.out.println("方法二：最小绝对值子段和");
        dv.method2(array1);
    }
}
