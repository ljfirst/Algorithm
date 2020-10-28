package DataStructure.sort.innerSort.innerSortRealize;

import DataStructure.sort.innerSort.SortInterface;

/**
 * @author liujun
 * @version 1.0
 * @date 2019-11-04 21:09
 * @author—Email liujunfirst@outlook.com
 * @description 选择排序
 */
public class SelectSort implements SortInterface {

    //选择排序
    @Override
    public void sortMethod(int[] array) {
        //输入检查
        if (!check(array)) {
            return ;
        }
        int length = array.length;
        int temp = 0;
        int flag = 0;
        //外部循环从0到n-1
        for (int i = 0; i < length - 1; i++) {
            //记录最值元素的下角标
            flag = i;
            //从待交换元素的下一个开始查找，直到最后一个元素
            for (int j = i + 1; j <= length - 1; j++) {
                if (array[j] < array[flag]) {
                    flag = j;
                }
            }
            //元素交换
            if (i != flag) {
                temp = array[i];
                array[i] = array[flag];
                array[flag] = temp;
            }
        }
    }
}
