package Logic.regular;

import java.util.Scanner;

/** 
 *@author liujun
 *@date 2018-8-8 下午07:03:55
 *@author—Email liujunfirst@outlook.com
 *@description 将输入字符串的大小写互换，输出时小写字母按序排在前，大写在后。
 *@version 1.0
 */
public class 大小写互换 {

	public void trans(String s) {
		// TODO Auto-generated method stub

		String[] c1 = s.split("[a-z]");
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < c1.length; i++) {
			sb.append(c1[i].toLowerCase());
		}
		String[] c2 = s.split("[A-Z]");
		for (int j = 0; j < c2.length; j++) {
			sb.append(c2[j].toUpperCase());
		}
		System.out.println(sb);
	}
	
	//主方法测试
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		大小写互换 d = new 大小写互换();
		d.trans(s);
	}
}
