package DataStructure.sort.innerSort.innerSortRealize;

import DataStructure.sort.innerSort.SortInterface;

/**
 * @author liujun
 * @version 1.0
 * @date 2018-7-19 上午11:55:48
 * @author—Email liujunfirst@outlook.com
 * @description 快速排序  双向快排
 * <p>
 * 双向快排：
 * 1.设高低指针，低指针从左往右找大于标杆的元素，高指针找小的
 * 2.交换高低指针所指向的元素
 * 3.交换标杆和低指针所指向的元素
 * 4.依次递归
 * 注意事项：
 * 1）发生两次数值交换
 * 2）left, right, low, high, mid,交换需注意
 */

public class QuickSortDuplexing implements SortInterface {

    @Override
    public void sortMethod(int[] array) {
        //边界判空
        if (check(array)) {
            quicksortDuplexing(array, 0, array.length - 1);
        }
    }

    //双向快排
    public int[] quicksortDuplexing(int[] sortNum, int left, int right) {

        int temp = 0;
        //记录双向指针
        int low = left;
        int high = right;

        if (left < right) {
            while (low < high) {
                //注意1：两个while必须有一个=，不然会导致死循环
                //注意2：下方两个while互换顺序，会导致出错，需要注意"="的顺序
                //高指针从右往左找小于标杆的元素
                while ((low < high) && (sortNum[high] >= sortNum[left])) {
                    high--;
                }
                //低指针从左往右找大于标杆的元素
                while ((low < high) && (sortNum[low] < sortNum[left])) {
                    low++;
                }
                //高低值，交换元素，此处if可以不写
                if (low < high) {
                    temp = sortNum[high];
                    sortNum[high] = sortNum[low];
                    sortNum[low] = temp;
                }
            }
            //中位数与标杆，交换元素
            temp = sortNum[low];
            sortNum[low] = sortNum[left];
            sortNum[left] = temp;

            //递归
            quicksortDuplexing(sortNum, left, low - 1);
            quicksortDuplexing(sortNum, low + 1, right);
        }
        return sortNum;
    }
}
