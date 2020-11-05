package Logic.utils;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *@author liujun
 *@date 2018-7-19 上午11:55:48
 *@author—Email liujunfirst@outlook.com
 *@description  选择排序
 *@version 1.0
 */
//对list内的元素排序
public class SelectionSortforFileCompare {

	public String[] selectionSort(ArrayList<String> list) {

		int length = list.size();
		String[] compareStorage = new String[length];

		int count = 0;
		for (Iterator<String> it = list.iterator(); it.hasNext(); ) {
			compareStorage[count++] = it.next();
		}

		int flag;
		//外部循环从0到n-1
		for (int i = 0; i < length - 1; i++) {
			//记录最值元素的下角标
			flag = i;
			int targetStringNum = Integer.parseInt(String.valueOf(compareStorage[i].charAt(0)));
			//从待交换元素的下一个开始查找，直到最后一个元素
			for (int j = i+1; j <= length - 1; j++) {
				int commpStringNum = Integer.parseInt(String.valueOf(compareStorage[j].charAt(0)));
				if(commpStringNum > targetStringNum){
					flag = j;
					targetStringNum = commpStringNum;
				}
			}
			//元素交换
			String temp = compareStorage[i];
			compareStorage[i] = compareStorage[flag];
			compareStorage[flag] = temp;
		}
		return compareStorage;
	}
}
