package DataStructure.sort.innerSort.innerSortRealize;

import DataStructure.sort.innerSort.SortInterface;

/**
 * @author liujun
 * @version 1.0
 * @date 2019-3-23 ����12:09:48
 * @author-Email liujunfirst@outlook.com
 * @description
 * @URL
 */
public class RadixSort implements SortInterface {

    @Override
    public void sortMethod(int[] array) {
        //检查
        if (!check(array)) {
            return ;
        }
        //�ҳ����λ��
        int max = Integer.MIN_VALUE;
        int temp = 0;
        for (int i = 0; i < array.length; i++) {
            temp = array[i] > 0 ? array[i] : -array[i];
            if (max < temp) {
                max = temp;
            }
        }
        int d = String.valueOf(max).length();
        //��������λ��d �� radix
        radixsort(array, d, 10);
    }

    public void radixsort(int[] array, int d, int radix) {

        //��ǰѭ������λ�����ӵ�һλ���� d λ
        int radixtemp = 1;
        //��ά�������ڻ�������radixpoint�Ƕ�άͰ��ָ��,ÿ��Ͱһ���������䱾��Ҳ��һ������
        int[][] radixbucket = new int[radix][array.length];
        int[] radixpoint = new int[radix];
        int temp = 0;

        //ѭ������λ loopcount
        for (int loopcount = 0; loopcount <= d; loopcount++) {
            //��������(����ʹ�����������Ĺ�ϣ�ṹ���߶�ά���飬���׾���)
            for (int i = 0; i < array.length; i++) {
                //ȡ����ǰβ������������
                temp = (array[i] / radixtemp) % radix;
                radixbucket[temp][radixpoint[temp]] = array[i];
                radixpoint[temp]++;
            }
            //����ͳ�ƺϲ�,ͨ��Ͱ��ָ���ж�Ͱ���Ƿ���Ԫ��
            int bucketcount = 0;
            for (int i = 0; i < radix; i++) {
                int j = 0;
                while (radixpoint[i] != 0) {
                    array[bucketcount++] = radixbucket[i][j++];
                    radixpoint[i]--;
                }
            }
            //�޸�ѭ������
            radixtemp *= radix;
        }
    }
}