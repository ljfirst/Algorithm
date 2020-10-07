package DataStructure.stackHeapQueue.queue;

/**
 * @author liujun
 * @version 1.0
 * @date 2019-11-09 22:56
 * @authorEmail liujunfirst@outlook.com
 * @description 数组队列
 */
public class ArrayQueuelj implements Queuelj {

    public int[] queue;
    public int QueueRealsize;
    public int QueueMaxsize;
    public int front;
    public int tail;

    public ArrayQueuelj() {
        //默认初始值为50
        new ArrayQueuelj(50);
    }

    public ArrayQueuelj(int num) {
        //指定初始值
        QueueMaxsize = num;
        queue = new int[QueueMaxsize];
        QueueRealsize = 0;
        front = tail = 0;
    }

    @Override
    //插入元素
    public boolean offer(int value) {
        if (QueueMaxsize == tail + 1) {
            resize();
        }
        //循环队列
        if (tail + 1 != front) {
            queue[tail] = value;
            tail = (++tail) % QueueMaxsize;
            QueueRealsize++;
            return true;
        }
        return false;
    }

    @Override
    public int poll() {
        int value = -1;
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
        int value = -1;
        //判空
        if (!empty()) {
            value = queue[front];
        }
        return value;
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
        QueueMaxsize <<= 1;
        int[] copy = new int[QueueMaxsize];
        int copyLength = tail - front;
        System.arraycopy(queue, front, copy, 0, copyLength);
        queue = copy;
        front = 0;
        tail = copyLength;
        /*if (front < tail) {
            for (int i = front; i < tail; i++) {
                queue1[point] = queue[(i + QueueMaxsize) / QueueMaxsize];
                point++;
            }
        } else {
            for (int i = front; i < QueueMaxsize; i++) {
                queue1[point] = queue[i];
                point++;
            }
            for (int i = 0; i < tail; i++) {
                queue1[point] = queue[i];
                point++;
            }
        }

        front = 0;
        tail = point;*/

    }

    @Override
    public boolean search(int x) {
        if (!empty()) {
            int point = front;
            while (point != tail) {
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
        return tail == front;
    }
}
