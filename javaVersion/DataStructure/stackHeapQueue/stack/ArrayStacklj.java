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
        maxSize = num;
        stackTop = 0;
        stackValue = new int[maxSize];
    }

    public ArrayStacklj() {
        //default size is 50
        maxSize = 50;
        stackTop = 0;
        stackValue = new int[maxSize];
    }

    public int pop() {
        //出栈判空
        if (!this.empty()) {
            return stackValue[--stackTop];
        }
        return -1;
    }

    public boolean push(int value) {
        if (this.stackTop + 1 == maxSize) {
            resize();
        }
        stackValue[stackTop++] = value;
        return true;
    }

    public int peek() {
        return this.empty() ? -1 : stackValue[stackTop - 1];
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
        return stackTop;
    }

    public int getMaxsize() {
        return this.maxSize;
    }

    @Override
    public void resize() {
        maxSize <<= 1;
        int[] copy = new int[maxSize];
        System.arraycopy(stackValue, 0, copy, 0, stackValue.length);
        stackValue = copy;
    }
}
