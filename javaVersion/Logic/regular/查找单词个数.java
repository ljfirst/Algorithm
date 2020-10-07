package Logic.regular;

import java.util.Scanner;

/**
 *@author liujun
 *@date 2018-5-2 Time������09:46:20
 *@author��Email liujunfirst@outlook.com
 *@description д��һ�����򣬽���һ������ĸ�������Լ��ո���ɵ��ַ�����
 *��һ���ַ���Ȼ����������ַ����к��и��ַ��ĸ����������ִ�Сд��
 *@version 1.0
 */
public class 查找单词个数 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//����һ���ַ���
		String string = scan.nextLine();
		//����һ������
		
		String s = scan.next();
		System.out.println(string.toLowerCase().split(s).length-1);
		
		
	}
}
