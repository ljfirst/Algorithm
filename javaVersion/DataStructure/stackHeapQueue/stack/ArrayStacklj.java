package DataStructure.stackHeapQueue.stack;

/**
 * @author liujun
 * @version 1.0
 * @date 2019-10-21 12:17
 * @author-Email liujunfirst@outlook.com
 * @description 数组栈
 */
public class ArrayStacklj implements Stacklj {

    public int[] stackValue;
    public int stackTop;
    public int maxSize;

    public ArrayStacklj(int num) {
        this.maxSize = num;
        this.stackTop = 0;
        this.stackValue = new int[maxSize];
    }

    public ArrayStacklj() {
        //default size is 32
        this.maxSize = 32;
        this.stackTop = 0;
        this.stackValue = new int[maxSize];
    }

    public int pop() {
        //出栈判空
        if (!this.empty()) {
            return stackValue[--stackTop];
        }
        return Integer.MIN_VALUE;
    }

    public boolean push(int value) {
        if (this.stackTop + 1 == maxSize) {
            resize();
        }
        stackValue[stackTop++] = value;
        return true;
    }

    public int peek() {
        return this.empty() ? Integer.MIN_VALUE : stackValue[stackTop - 1];
    }

    public boolean empty() {
        return this.stackTop == 0;
    }

    public boolean search(int value) {
        for (int i = 0; i < stackTop; i++) {
            if (value == stackValue[i]) {
                return true;
            }
        }
        return false;
    }

    public int getRealsize() {
        return this.stackTop;
    }

    public int getMaxsize() {
        return this.maxSize;
    }

    @Override
    public void resize() {
        this.maxSize <<= 1;
        int[] copy = new int[maxSize];
        System.arraycopy(stackValue, 0, copy, 0, stackValue.length);
        this.stackValue = copy;
    }
}
