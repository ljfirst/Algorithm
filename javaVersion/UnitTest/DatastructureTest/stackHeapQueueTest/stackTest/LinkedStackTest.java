package UnitTest.DatastructureTest.stackHeapQueueTest.stackTest;

import DataStructure.stackHeapQueue.stack.LinkedStacklj;
import org.junit.Test;

/**
 * @author liujun
 * @version 1.0
 * @date 2019-11-09 12:53
 * @author-Email liujunfirst@outlook.com
 * @description 链式栈 测试案例
 */

public class LinkedStackTest extends StackljTest{

    @Test
    public void methodTest(){
        super.testStack(new LinkedStacklj());
    }
}
