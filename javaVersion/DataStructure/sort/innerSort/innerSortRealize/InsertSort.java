package DataStructure.sort.innerSort.innerSortRealize;

import Algorithm.comprehensive.backpack.Goods;
import DataStructure.sort.innerSort.SortInterface;

/**
 * @author liujun
 * @version 1.0
 * @date 2019-11-14 22:15
 * @author—Email liujunfirst@outlook.com
 * @description 插入排序
 * @blogURL
 */
public class InsertSort implements SortInterface {

    //插入排序
    @Override
    public void sortMethod(int[] array) {

        //输入检查
        if (!check(array)) {
            return ;
        }
        int temp = 0;
        //外部循环从1开始，直到最后
        for (int i = 1; i < array.length; i++) {
            //内部循环从外部位置遍历到0
            //====实现1
            int j = i;
            temp = array[i];
            while ((j > 0) && (temp < array[j - 1])) {
                array[j] = array[j - 1];
                j--;
            }
            if (j != i) {
                //因为在循环内j已经被减过。所以此处赋值给j，而不是j-1
                array[j] = temp;
            }
            //====实现2
            /*for (int j = i; j > 0; j--) {
                if(array[j] < array[j - 1]){
                    temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                }
            }*/
        }
    }

    //插入排序（指定范围的插入排序）
    public void insertionsort(int[] array, int left, int right) {
        //越界检查
        if (left < 0 || right >= array.length) {
            return ;
        }
        int temp = 0;
        //外部循环从1开始，直到最后
        for (int i = left + 1; i <= right; i++) {
            //内部循环从外部位置遍历到0
            int j = i;
            temp = array[i];
            while ((j > left) && (temp < array[j - 1])) {
                array[j] = array[j - 1];
                j--;
            }
            if (j != i) {
                //因为在循环内j已经被减过。所以此处赋值给j，而不是j-1
                array[j] = temp;
            }
        }
    }

    public static void sortMethodT(Goods[] array) {
        //输入检查
        if (array == null || array.length <= 1) {
            return ;
        }
        Goods temp;
        //外部循环从1开始，直到最后
        for (int i = 1; i < array.length; i++) {
            //内部循环从外部位置遍历到0
            int j = i;
            temp = array[i];
            while ((j > 0) && (temp.getPw() < array[j - 1].getPw())) {
                array[j] = array[j - 1];
                j--;
            }
            if (j != i) {
                //因为在循环内j已经被减过。所以此处赋值给j，而不是j-1
                array[j] = temp;
            }
        }
    }
}
