package DataStructure.stackHeapQueue.queue;

import DataStructure.stackHeapQueue.stack.ArrayStacklj;
import DataStructure.stackHeapQueue.stack.Stacklj;

/**
 * @author liujun
 * @version 1.0
 * @date 2020/7/23
 * @author—Email liujunfirst@outlook.com
 * @blogURL https://blog.csdn.net/ljfirst
 * @description 使用栈实现队列的功能
 */
public class StackQueue extends ArrayQueuelj {

    Stacklj stack1;
    Stacklj stack2;

    public StackQueue() {
        stack1 = new ArrayStacklj();
        stack2 = new ArrayStacklj();
    }

    public StackQueue(int num) {
        stack1 = new ArrayStacklj(num);
        stack2 = new ArrayStacklj(num);
    }

    @Override
    public boolean offer(int value) {
        stack1.push(value);
        return true;
    }

    @Override
    public int poll() {
        int count = stack1.getRealsize();
        for (int i = 0; i < count - 1; i++) {
            stack2.push(stack1.pop());
        }
        int value = stack1.pop();
        int real = stack2.getRealsize();
        for (int i = 0; i < real; i++) {
            stack1.push(stack2.pop());
        }
        return value;
    }

    @Override
    public int peek() {
        //因为stack1本身在变化，此处判断条件不可以用stack1.getRealsize()；
        int count = stack1.getRealsize();
        for (int i = 0; i < count - 1; i++) {
            stack2.push(stack1.pop());
        }
        int value = stack1.peek();
        int real = stack2.getRealsize();
        for (int i = 0; i < real; i++) {
            stack1.push(stack2.pop());
        }
        return value;
    }

    @Override
    public boolean empty() {
        return stack1.empty();
    }

    @Override
    public int getRealsize(){
        return stack1.getRealsize();
    }
}
