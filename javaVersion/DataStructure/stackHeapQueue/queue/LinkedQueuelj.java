package DataStructure.stackHeapQueue.queue;

/**
 * @author liujun
 * @version 1.0
 * @date 2019-11-09 22:56
 * @authorEmail liujunfirst@outlook.com
 * @description 链队列
 */
public class LinkedQueuelj implements Queuelj {

    public int QueueRealsize;
    public int QueueMaxsize;
    public LinkedQueueNode front;
    public LinkedQueueNode tail;

    private class LinkedQueueNode {
        int value;
        LinkedQueueNode next;

        LinkedQueueNode(int value) {
            this.value = value;
            this.next = null;
        }
    }

    public LinkedQueuelj() {
        //默认初始值为50
        new LinkedQueuelj(50);
    }

    public LinkedQueuelj(int num) {
        QueueRealsize = 0;
        QueueMaxsize = num;
        front = tail = null;
    }

    @Override
    public boolean offer(int value) {
        //队空判断
        if (QueueRealsize == QueueMaxsize) {
            resize();
        }
        LinkedQueueNode linkedQueueNode = new LinkedQueueNode(value);
        //��һ�����
        if (QueueRealsize == 0) {
            front = linkedQueueNode;
        } else {
            tail.next = linkedQueueNode;
        }
        tail = linkedQueueNode;
        QueueRealsize++;
        return true;
    }

    @Override
    public int poll() {
        int value = -1;
        //判空
        if (!empty()) {
            value = front.value;
            front = front.next;
            QueueRealsize--;
        }
        return value;
    }

    @Override
    public int peek() {
        int value = -1;
        //判空
        if (!empty()) {
            value = front.value;
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
        QueueRealsize <<= 1;
    }

    @Override
    public boolean search(int x) {
        if (!empty()) {
            LinkedQueueNode node = front;
            while (node.next != null) {
                if (node.value == x) {
                    return true;
                }
                node = node.next;
            }
        }
        return false;
    }

    @Override
    public boolean empty() {
        if (QueueRealsize == 0) {
            return true;
        }
        return false;
    }
}