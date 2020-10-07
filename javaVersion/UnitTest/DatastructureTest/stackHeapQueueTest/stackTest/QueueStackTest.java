package UnitTest.DatastructureTest.stackHeapQueueTest.stackTest;

import DataStructure.stackHeapQueue.stack.QueueStack;
import DataStructure.stackHeapQueue.stack.Stacklj;
import org.junit.Test;

/**
 * @author liujun
 * @version 1.0
 * @date 2020/7/23
 * @author—Email liujunfirst@outlook.com
 * @blogURL https://blog.csdn.net/ljfirst
 * @description
 */
public class QueueStackTest {

    Stacklj stack = new QueueStack(5);

    @Test
    public void test() {
        ArrayStackTest test = new ArrayStackTest();
        test.methodTest(stack);
    }


}
