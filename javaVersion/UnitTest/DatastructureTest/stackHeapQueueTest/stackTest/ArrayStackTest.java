package UnitTest.DatastructureTest.stackHeapQueueTest.stackTest;

import DataStructure.stackHeapQueue.stack.ArrayStacklj;
import DataStructure.stackHeapQueue.stack.Stacklj;
import org.junit.Test;

/**
 * @author liujun
 * @version 1.0
 * @date 2019-11-09 12:53
 * @author-Email liujunfirst@outlook.com
 * @description 数组栈 测试案例
 */
public class ArrayStackTest extends StackljTest{

    @Test
    public void methodTest() {
        super.testStack(new ArrayStacklj());
    }
}
