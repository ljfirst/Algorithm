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
public class StackQueueTest extends QueueljTest{

    Queuelj queue = new StackQueue(5);
    ArrayQueueTest aqt = new ArrayQueueTest();

    @Test
    public void testStackQueue(){
        super.testQueue(new StackQueue());
        aqt.methodTest(queue);
    }
}
