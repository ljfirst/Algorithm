package DataStructure.sort.innerSort.innerSortRealize;

import DataStructure.sort.innerSort.SortInterface;

/**
 * @author liujun
 * @version 1.0
 * @date 2019-3-23 ����12:10:15
 * @authorEmail liujunfirst@outlook.com
 * @description 计数排序
 */
public class CountSort implements SortInterface {

    @Override
    public void sortMethod(int[] arrayA) {

        //安全性检测
        if (!check(arrayA)) {
            return ;
        }

        //1、找出原始数组的最大最小值
        int max = arrayA[0];
        int min = arrayA[0];

        for (int i : arrayA) {
            max = Math.max(max, i);
            min = Math.min(min, i);
        }
        //2�������µ������С  min��max֮�䣬�����䣬�У�max-min+1��������
        int[] arrayB = new int[max - min + 1];

        //3��һ��ѭ��ͳ�����ݡ����Ż�����Сֵ֮ǰ�����ô洢
        for (int value : arrayA) {
            arrayB[value - min]++;
        }

		/*for (int i = 0; i < arrayA.length; i++) {
			arrayB[arrayA[i]-min]++;
		}*/

        //4������������
        int[] arrayC = new int[arrayA.length];

        //�Ż�ǰ������������ѭ�������п�,�˷�ѭ������
		/*int count = 0;
		for (int i = 0; i < arrayB.length; i++) {
			while(arrayB[i] != 0){
				arrayC[count++] = i + min;
				arrayB[i]--;
			}
		}*/
		
		/*�Ż��󷽰�:1���ҳ���Ӧλ�ж����ۼӵ�ͳ�����ݣ�
		          2�������ۻ��������b���顣
		 *ע������:1��i���뵽0������arrayA[0]�޷�������
		         2��b���飬������--�����ǵ�arrayB����С��ͳ��λ��1����ʾ��һ����������
		           �������Ӧ�����������Сֵ(��0λ)�����Ա�����--*/
        for (int i = 1; i < arrayB.length; i++) {
            arrayB[i] += arrayB[i - 1];
        }

        for (int i = arrayA.length - 1; i >= 0; i--) {
            arrayC[--arrayB[arrayA[i] - min]] = arrayA[i];
        }
        //ԭַ����
        for (int i = 0; i < arrayA.length; i++) {
            arrayA[i] = arrayC[i];
        }
    }
}
