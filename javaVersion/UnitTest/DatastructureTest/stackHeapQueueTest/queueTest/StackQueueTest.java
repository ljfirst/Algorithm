package UnitTest.DatastructureTest.stackHeapQueueTest.queueTest;

import DataStructure.stackHeapQueue.queue.Queuelj;
import DataStructure.stackHeapQueue.queue.StackQueue;
import org.junit.Test;

/**
 * @author liujun
 * @version 1.0
 * @date 2020/7/23
 * @author—Email liujunfirst@outlook.com
 * @blogURL https://blog.csdn.net/ljfirst
 * @description 使用栈实现队列的功能 测试用例
 */
public class StackQueueTest {

    Queuelj queue = new StackQueue(5);

    ArrayQueueTest aqt = new ArrayQueueTest();

    @Test
    public void testStackQueue(){
        aqt.methodTest(queue);
    }

    @Test
    public void testqueue() {
        for (int i = 1; i <= 9; i++) {
            queue.offer(i);
        }
        assert 1 == queue.peek();
        assert 1 == queue.poll();
        for (int i = 1; i <= 5; i++) {
            queue.poll();
        }
        assert 7 == queue.peek();
        assert 7 == queue.poll();
    }
}
