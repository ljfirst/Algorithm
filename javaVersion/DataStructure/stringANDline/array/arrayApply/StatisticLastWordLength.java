package DataStructure.stringANDline.array.arrayApply;

import java.util.Scanner;

/**
 *@author liujun
 *@date 2018-5-2 Time������09:34:09
 *@author-Email liujunfirst@outlook.com
 *@description 统计最后一个字母的长度
 *@version 1.0
 */
public class StatisticLastWordLength {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			String string = scan.nextLine();
			//�Ӱ�ȫ�Ƕȿ��ǣ���trim()��ֹǰ����ֶ���ո�
			System.out.println(string.trim().length() - 
					string.trim().lastIndexOf(" ") - 1);
		}
	}
}
