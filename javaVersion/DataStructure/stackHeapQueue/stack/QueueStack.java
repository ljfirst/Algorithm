package DataStructure.stackHeapQueue.stack;

import DataStructure.stackHeapQueue.queue.ArrayQueuelj;

/**
 * @author liujun
 * @version 1.0
 * @date 2020/7/23
 * @author—Email liujunfirst@outlook.com
 * @blogURL https://blog.csdn.net/ljfirst
 * @description 使用队列实现栈的功能
 * 主要实现：出栈、入栈、获取栈首元素
 */
public class QueueStack extends ArrayStacklj {

    ArrayQueuelj queue1;
    ArrayQueuelj queue2;

    public QueueStack() {
        queue1 = new ArrayQueuelj();
        queue2 = new ArrayQueuelj();
    }

    public QueueStack(int num) {
        queue1 = new ArrayQueuelj(num);
        queue2 = new ArrayQueuelj(num);
    }

    public boolean empty() {
        return queue1.empty();
    }

    public boolean search(int value) {
        return queue1.search(value);
    }

    public int getRealsize() {
        int u = queue1.getRealsize();
        return u;
    }

    @Override
    public int pop() {
        int size = queue1.getRealsize();
        for (int i = 0; i < size - 1; i++) {
            queue2.offer(queue1.poll());
        }
        int value = queue1.poll();
        int realsize = queue2.getRealsize();
        for (int i = 0; i < realsize; i++) {
            queue1.offer(queue2.poll());
        }
        return value;
    }

    @Override
    public boolean push(int value) {
        queue1.offer(value);
        return true;
    }

    @Override
    public int peek() {
        //此处需要谨慎，注意到tail并不是尾元素
        if (queue1.tail != queue1.front) {
            return queue1.queue[(queue1.front + queue1.QueueRealsize) % queue1.QueueRealsize - 1];
        }
        return -1;

        //这种写法是错误的，回导致元素混淆
        /*int size = queue1.getRealsize();
        for (int i = 0; i < size - 1; i++) {
            queue2.offer(queue1.poll());
        }
        int value = queue1.peek();
        int realsize = queue2.getRealsize();
        for (int i = 0; i < realsize; i++) {
            queue1.offer(queue2.poll());
        }
        return value;*/
    }

}
