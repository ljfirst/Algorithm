package UnitTest.DatastructureTest.stackHeapQueueTest.stackTest;

import DataStructure.stackHeapQueue.stack.QueueStacklj;
import org.junit.Test;

/**
 * @author liujun
 * @version 1.0
 * @date 2020/7/23
 * @author—Email liujunfirst@outlook.com
 * @blogURL https://blog.csdn.net/ljfirst
 * @description 队列栈 测试案例
 */
public class QueueStackljTest extends StackljTest {

    @Test
    public void test() {
        super.testStack(new QueueStacklj());
    }

}
