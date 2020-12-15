package DataStructure.stackHeapQueue.queue;

import DataStructure.stringANDline.list.Nodelj;

/**
 * @author liujun
 * @version 1.0
 * @date 2019-11-09 22:56
 * @author-Email liujunfirst@outlook.com
 * @description 链队列
 */
public class LinkedQueuelj implements Queuelj {

    public int queueRealsize;
    public int queueMaxsize;
    public Nodelj front;
    public Nodelj tail;


    public LinkedQueuelj() {
        //默认初始值为32
        this.queueMaxsize = 32;
        new LinkedQueuelj(queueMaxsize);
    }

    public LinkedQueuelj(int num) {
        this.queueRealsize = 0;
        this.queueMaxsize = num;
        this.front = this.tail = null;
    }

    @Override
    public boolean offer(int value) {
        //队空判断
        if (this.queueRealsize == this.queueMaxsize) {
            resize();
        }
        Nodelj linkedQueueNode = new Nodelj(value);
        if (this.queueRealsize == 0) {
            this.front = linkedQueueNode;
        } else {
            this.tail.next = linkedQueueNode;
        }
        this.tail = linkedQueueNode;
        this.queueRealsize++;
        return true;
    }

    @Override
    public int poll() {
        int value = Integer.MIN_VALUE;
        //判空
        if (!empty()) {
            value = this.front.value;
            this.front = front.next;
            this.queueRealsize--;
        }
        return value;
    }

    @Override
    public int peek() {
        int value = Integer.MIN_VALUE;
        //判空
        if (!empty()) {
            value = this.front.value;
        }
        return value;
    }

    @Override
    public int getRealsize() {
        return this.queueRealsize;
    }

    @Override
    public int getMaxsize() {
        return this.queueMaxsize;
    }

    @Override
    public void resize() {
        this.queueMaxsize <<= 1;
    }

    @Override
    public boolean search(int x) {
        if (!empty()) {
            Nodelj node = this.front;
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
        return this.queueRealsize == 0;
    }
}