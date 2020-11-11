package Logic.utils;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *@author liujun
 *@date 2018-7-19 ����11:55:48
 *@author��Email liujunfirst@outlook.com
 *@description  ѡ������
 *@version 1.0
 */
//��list�ڵ�Ԫ������
public class SelectionSortforFileCompare {

	public String[] selectionSort(ArrayList<String> list) {

		int length = list.size();
		String[] compareStorage = new String[length];

		int count = 0;
		for (Iterator<String> it = list.iterator(); it.hasNext(); ) {
			compareStorage[count++] = it.next();
		}

		int flag;
		//�ⲿѭ����0��n-1
		for (int i = 0; i < length - 1; i++) {
			//��¼��ֵԪ�ص��½Ǳ�
			flag = i;
			int targetStringNum = Integer.parseInt(String.valueOf(compareStorage[i].charAt(0)));
			//�Ӵ�����Ԫ�ص���һ����ʼ���ң�ֱ�����һ��Ԫ��
			for (int j = i+1; j <= length - 1; j++) {
				int commpStringNum = Integer.parseInt(String.valueOf(compareStorage[j].charAt(0)));
				if(commpStringNum > targetStringNum){
					flag = j;
					targetStringNum = commpStringNum;
				}
			}
			//Ԫ�ؽ���
			String temp = compareStorage[i];
			compareStorage[i] = compareStorage[flag];
			compareStorage[flag] = temp;
		}
		return compareStorage;
	}
}
