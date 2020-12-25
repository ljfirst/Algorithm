package DataStructure.stackHeapQueue.stack;

import DataStructure.stringANDline.list.Nodelj;

/**
 * @author liujun
 * @version 1.0
 * @date 2019-10-21 12:17
 * @author-Email liujunfirst@outlook.com
 * @description 链式栈
 */
public class LinkedStacklj implements Stacklj {

    public Nodelj stackTop;
    public int stackRealSize;
    public int stackMaxSize;

    public LinkedStacklj(int num) {
        this.stackRealSize = 0;
        this.stackMaxSize = num;
        this.stackTop = null;
    }

    public LinkedStacklj() {
        //init size 32
        this.stackRealSize = 0;
        this.stackMaxSize = 32;
        this.stackTop = null;
    }

    public int pop() {
        if (!this.empty()) {
            this.stackRealSize--;
            int value = this.stackTop.value;
            this.stackTop = this.stackTop.next;
            return value;
        }
        return Integer.MIN_VALUE;
    }

    public boolean push(int value) {
        Nodelj node = new Nodelj(value);
        if (this.stackRealSize == this.stackMaxSize) {
            resize();
        }
        node.next = this.stackTop;
        this.stackTop = node;
        this.stackRealSize++;
        return true;
    }

    public int peek() {
        return (stackTop == null && stackRealSize == 0) ? Integer.MIN_VALUE : stackTop.value;
    }

    public boolean empty() {
        return (stackTop == null && stackRealSize == 0);
    }

    public boolean search(int value) {
        Nodelj test = stackTop;
        while (test != null) {
            if (test.value == value) {
                return true;
            }
            test = test.next;
        }
        return false;
    }

    public int getRealsize() {
        return this.stackRealSize;
    }

    public int getMaxsize() {
        return this.stackMaxSize;
    }

    @Override
    public void resize() {
        this.stackMaxSize <<= 1;
    }

}
