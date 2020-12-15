package DataStructure.sort.innerSort.innerSortRealize;

import DataStructure.sort.innerSort.SortInterface;

/**
 * @author liujun
 * @version 1.0
 * @date 2019-11-14 22:14
 * @author—Email liujunfirst@outlook.com
 * @description 堆排序
 * 设计思路 1)初试化建堆，建完后，堆顶即最大/最小元素。
 * 2)交换堆顶和数组末尾元素，然后针对剩余的n-1个元素，对堆顶元素进行调整即可，
 * 3)重复2),直到所有元素有序。
 * <p>
 * 如何将数组调整为大顶堆
 * 1、初始化建堆只需要对二叉树的非叶子节点调用，从数组二分之n处分别跟左右孩子对比，
 * 发生交换，交换后的孩子，进一步跟它的左右孩子发生对比，直到数组对比达到边界,
 * 至此，二分之n这个二叉树有序(大顶堆)。O(n)
 * 2、不断缩小范围，自底向上，从右到左，从二分之n循环到顶(1)，
 * 至此，整个数组/二叉树有序(大顶堆)。
 * @blogURL
 */
public class HeapSort implements SortInterface {

    @Override
    public void sortMethod(int[] heap) {
        if (!check(heap)) {
            return;
        }
        //初试化建堆,数组的左孩子/2 一定是父节点
        for (int i = heap.length / 2; i >= 0; i--) {
            heapify_big(heap, i, heap.length - 1);
        }
        //交换堆顶和数组末尾元素，循环整堆,注意边界值
        for (int i = heap.length - 1; i > 0; i--) {
            int temp = heap[0];
            heap[0] = heap[i];
            heap[i] = temp;
            heapify_big(heap, 0, i - 1);
        }
    }

    //整堆函数——小顶堆
    public void heapify_small(int[] heap, int parent, int border) {

        //左孩子，最大值标记
        int flag = parent * 2 + 1;
        //越界判断：如果左孩子存在
        if (flag > border) {
            return;
        }
        //如果右孩子存在，左右孩子对比，找最大值
        if (flag + 1 <= border) {
            flag = heap[flag] > heap[flag + 1] ? flag + 1 : flag;
        }
        //对比父节点和孩子结点，找最大值,发生交换,并递归其最大值孩子结点
        if (heap[flag] < heap[parent]) {
            int temp = heap[flag];
            heap[flag] = heap[parent];
            heap[parent] = temp;
            heapify_small(heap, flag, border);
        }
    }

    /**
     * @param heap   整堆函数——大顶堆
     * @param parent 父节点的位置
     * @param border 边界（包含）
     */
    public void heapify_big(int[] heap, int parent, int border) {

        if (border >= heap.length || border <= 0) {
            return;
        }
        //左孩子，最大值标记
        int flag = parent * 2 + 1;
        //越界判断：如果左孩子存在
        if (flag > border) {
            return;
        }
        //如果右孩子存在
        if (flag + 1 <= border) {
            //左右孩子对比，找最大值
            flag = heap[flag] > heap[flag + 1] ? flag : flag + 1;
        }
        //对比父节点和孩子结点，找最大值,发生交换,并递归其最大值孩子结点
        if (heap[flag] > heap[parent]) {
            int temp = heap[flag];
            heap[flag] = heap[parent];
            heap[parent] = temp;
            heapify_big(heap, flag, border);
        }
    }
}
