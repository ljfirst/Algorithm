package DataStructure.stackHeapQueue.queue;

/**
 * @author liujun
 * @version 1.0
 * @date 2019-11-09 22:56
 * @author-Email liujunfirst@outlook.com
 * @description 数组队列  循环队列
 */
public class ArrayQueuelj implements Queuelj {

    public int[] queue;
    public int QueueRealsize;
    public int QueueMaxsize;
    public int front;
    public int tail;

    public ArrayQueuelj() {
        //默认初始值为50
        this.QueueMaxsize = 32;
        this.QueueRealsize = 0;
        this.queue = new int[QueueMaxsize];
        this.front = this.tail = 0;
    }

    public ArrayQueuelj(int num) {
        //指定初始值
        this.QueueMaxsize = num;
        this.QueueRealsize = 0;
        this.queue = new int[QueueMaxsize];
        this.front = this.tail = 0;
    }

    @Override
    //插入元素
    public boolean offer(int value) {

        if ((tail + 1 + QueueMaxsize) % QueueMaxsize == front) {
            resize();
        }
        //循环队列
        if (tail + 1 != front) {
            queue[tail] = value;
            tail = (++tail) % QueueMaxsize;
            this.QueueRealsize++;
            return true;
        }
        return false;
    }

    @Override
    public int poll() {
        int value = Integer.MIN_VALUE;
        //判空，元素出队
        if (!empty()) {
            value = queue[front];
            front = (front + 1 + QueueMaxsize) % QueueMaxsize;
            QueueRealsize--;
        }
        return value;
    }

    //获取队首元素，不删除元素
    @Override
    public int peek() {
        int value = Integer.MIN_VALUE;
        //判空
        if (!empty()) {
            value = queue[front];
        }
        return value;
    }

    @Override
    public int getRealsize() {
        return this.QueueRealsize;
    }

    @Override
    public int getMaxsize() {
        return this.QueueMaxsize;
    }

    @Override
    public void resize() {
        //QueueMaxsize扩大一倍
        int before = QueueMaxsize;
        QueueMaxsize <<= 1;
        int[] copy = new int[QueueMaxsize];
        int point = 0;
        if (tail < front) {
            while (front < tail + before) {
                copy[point] = queue[(front + before) % before];
                front++;
                point++;
            }
        } else {
            for (int i = front; i < tail; i++) {
                System.arraycopy(queue, front, copy, 0, tail - front);
            }
            point = tail;
        }
        front = 0;
        tail = point;
        queue = copy;
    }

    @Override
    public boolean search(int x) {
        if (!empty()) {
            int point = this.front;
            while (point != this.tail) {
                if (queue[point] == x) {
                    return true;
                }
                point = (point + 1 + QueueMaxsize) % QueueMaxsize;
            }
        }
        return false;
    }

    @Override
    public boolean empty() {
        return this.tail == this.front;
    }
}
