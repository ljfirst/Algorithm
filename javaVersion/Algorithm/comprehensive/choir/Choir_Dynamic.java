package Algorithm.comprehensive.choir;

/**
 *@author liujun
 *@date 2018-6-19 下午11:40:18
 *@author—Email liujunfirst@outlook.com
 *@description  合唱团 动态规划
 * 有 n 个学生站成一排，每个学生有一个能力值，牛牛想从这 n 个学生中按照顺序选取 k 名学生，
 *要求相邻两个学生的位置编号的差不超过 d，使得这 k 个学生的能力值的乘积最大，你能返回最大的乘积吗？
 *@version 1.0
 */
public class Choir_Dynamic implements Choir {

	@Override
	public int getMaxValue(int[] array, int choseNum, int intervald) {
		return check(array, choseNum, intervald) ? countMaxValue(array, choseNum, intervald) : -1;
	}

	public int countMaxValue(int[] array, int choseNum, int intervald) {

		int arrayLength = array.length;
		//存储正值和负值的二维矩阵
		int[][] ValueMax = new int[choseNum][arrayLength];
		int[][] ValueMin = new int[choseNum][arrayLength];
		for (int i = 0; i < arrayLength; i++) {
			for (int j = i; j < arrayLength; j++) {

			}
		}

		return 0;
	}

}
