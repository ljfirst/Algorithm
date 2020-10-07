package Logic.math;

import java.util.Scanner;

/**
 *@author liujun
 *@date 2018-4-24 Time：上午12:02:48
 *@author—Email liujunfirst@outlook.com
 *@description 假定一种编码的编码范围是a ~ y的25个字母，从1位到4位的编码，
 *如果我们把该编码按字典序排序，形成一个数组如下： a, aa, aaa, aaaa, aaab, 
 *aaac, … …, b, ba, baa, baaa, baab, baac … …, yyyw, yyyx, 
 *yyyy 其中a的Index为0，aa的Index为1，aaa的Index为2，以此类推。 
 *编写一个函数，输入是任意一个编码，输出这个编码对应的Index.
 *思路：
 *   当出现b的时候，说明a的时代已经结束，一个a时代循环完是16276。
 *仅一个b就是16276+1，需要数组记录进制数16276-651-26-1,
 *然后对应字符串位数相乘，特别注意：最后需要加上字符串长度值减一,因为a是0。
 *@version 1.0
 */
public class Alpha_transto_num {

	/**
	 * trans alpha to num
	 */
	public Alpha_transto_num(String s) {

		//获取字符串长度
		double [] count_num = new double [4];
	    double temp = 1;
	    double alpha_hex = 25;
	    count_num[3] = 1; 
	    
	    //定义进位数值,数组存放
	    for (int i = 0; i < 3; i++) {
			count_num[2-i] = count_num[3-i] + Math.pow(alpha_hex, temp);
			//System.out.println(count_num[2-i]);
			temp++;
		}
	    //定义总值sum
	    double sum = 0;
	    int count = s.length();
	    for (int j = 0; j < count; j++) {
	    	sum += (s.charAt(j) - 'a') * count_num[j];
		}
	    sum = sum + count - 1;
	    System.out.println("real:" + sum);
	}
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String s=scanner.next();
		s=s.trim();
		
		if(s.length()>4){
			System.out.println("error");
			return ;
		}
		
		new Alpha_transto_num(s);
		
	}
}
