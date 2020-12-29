package DataStructure.stackHeapQueue.heap;

import DataStructure.stackHeapQueue.queue.Queuelj;

/**
 * @author liujun
 * @version 1.0
 * @date 2020/7/14
 * @author—Email liujunfirst@outlook.com
 * @blogURL https://blog.csdn.net/ljfirst
 * @description 优先队列
 */
public class PriorityQueuelj implements Queuelj {

    public int[] queue;
    public int QueueRealsize;
    public int QueueMaxsize;

    public PriorityQueuelj() {
        this.QueueRealsize = 0;
        this.QueueMaxsize = 32;
        this.queue = new int[QueueMaxsize];
    }

    public PriorityQueuelj(int num) {
        this.QueueRealsize = 0;
        this.QueueMaxsize = num;
        this.queue = new int[QueueMaxsize];
    }

    @Override
    //入队判满
    public boolean offer(int value) {
        if (QueueRealsize + 1 >= QueueMaxsize) {
            resize();
        }
        if (QueueRealsize == 0) {
            queue[QueueRealsize] = value;
        } else {
            //插入值并进行调整
            insert_up_small(value);
        }
        QueueRealsize++;
        return true;
    }

    /**
     * >>： 带符号右移。正数右移高位补0，负数右移高位补1。比如：4 >> 1，结果是2；-4 >> 1，结果是-2。-2 >> 1，结果是-1。
     * >>>：无符号右移。无论是正数还是负数，高位通通补0。
     */
    //大顶堆
    private void insert_up_big(int value) {
        int position = QueueRealsize;
        while (position > 0) {
            int parent = (position - 1) >> 1;
            if (queue[parent] >= value) {
                break;
            }
            queue[position] = queue[parent];
            position = parent;
        }
        queue[position] = value;
    }

    //小顶堆
    private void insert_up_small(int value) {
        int position = QueueRealsize;
        while (position > 0) {
            int parent = (position - 1) >> 1;
            if (queue[parent] < value) {
                break;
            }
            queue[position] = queue[parent];
            position = parent;
        }
        queue[position] = value;
    }

    @Override
    //出队判空
    public int poll() {
        int value = Integer.MIN_VALUE;
        if (!empty()) {
            value = queue[0];
            int x = queue[QueueRealsize - 1];
            insert_down_small(0, x);
            QueueRealsize--;
        }
        return value;
    }

    public void insert_down_big(int position, int value) {
        int half = QueueRealsize >> 1;
        while (position < half) {
            //注意：此处不可以写成 position << 1 + 1;
            int leftchild = (position << 1) + 1;
            if (leftchild + 1 <= QueueRealsize) {
                leftchild = queue[leftchild] > queue[leftchild + 1] ? leftchild : leftchild + 1;
            }
            if (value > queue[leftchild]) {
                break;
            }
            queue[position] = queue[leftchild];
            position = leftchild;
        }
        queue[position] = value;
    }

    public void insert_down_small(int position, int value) {
        int half = QueueRealsize >> 1;
        while (position < half) {
            //注意：此处不可以写成 position << 1 + 1;
            int leftchild = (position << 1) + 1;
            if (leftchild + 1 < QueueRealsize) {
                leftchild = queue[leftchild] < queue[leftchild + 1] ? leftchild : leftchild + 1;
            }
            if (value <= queue[leftchild]) {
                break;
            }
            queue[position] = queue[leftchild];
            position = leftchild;
        }
        queue[position] = value;
    }

    @Override
    public int peek() {
        int value = Integer.MIN_VALUE;
        if (!empty()) {
            value = queue[0];
        }
        return value;
    }

    @Override
    public boolean empty() {
        return QueueRealsize == 0;
    }

    @Override
    public int getRealsize() {
        return QueueRealsize;
    }

    @Override
    public int getMaxsize() {
        return QueueMaxsize;
    }


    @Override
    public void resize() {
        //QueueMaxsize扩大一倍
        this.QueueMaxsize <<= 1;
        int[] copy = new int[QueueMaxsize];
        System.arraycopy(queue, 0, copy, 0, queue.length);
        queue = copy;
    }

    @Override
    public boolean search(int x) {
        if (!empty()) {
            for (int i = 0; i < QueueRealsize; i++) {
                if (queue[i] == x) {
                    return true;
                }
            }
        }
        return false;
    }
}
