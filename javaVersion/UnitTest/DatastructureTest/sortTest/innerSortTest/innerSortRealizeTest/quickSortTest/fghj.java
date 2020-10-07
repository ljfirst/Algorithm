package UnitTest.DatastructureTest.sortTest.innerSortTest.innerSortRealizeTest.quickSortTest;

import DataStructure.sort.innerSort.SortInterface;
import UnitTest.DatastructureTest.sortTest.innerSortTest.innerSortRealizeTest.InnerSortRealizeTestData;
import org.junit.Test;

/**
 * @author liujun
 * @version 1.0
 * @date 2020/9/10
 * @author—Email liujunfirst@outlook.com
 * @blogURL https://blog.csdn.net/ljfirst
 * @description
 */
public class fghj extends InnerSortRealizeTestData implements SortInterface {

    @Test
    public void de() {
        fghj j = new fghj();
        super.TestInnerSortRealize(j);
    }

    @Override
    public void sortMethod(int[] array) {
        if (check(array)) {
            sor1t(array, 0, array.length - 1);
        }
    }

    public void sor1t(int[] arr, int left, int right) {
        if (left < right) {
            int head = left;
            int tail = left + 1;
            while (tail <= right) {
                if (arr[tail] < arr[left]) {
                    head++;
                    int temp = arr[tail];
                    arr[tail] = arr[head];
                    arr[head] = temp;
                }
                tail++;
            }
            if (head != left) {
                int temp = arr[left];
                arr[left] = arr[head];
                arr[head] = temp;
            }
            sor1t(arr, left, head - 1);
            sor1t(arr, head + 1, right);
        }
    }
}
