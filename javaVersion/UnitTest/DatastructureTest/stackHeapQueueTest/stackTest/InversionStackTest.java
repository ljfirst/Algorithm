package UnitTest.DatastructureTest.stackHeapQueueTest.stackTest;

import DataStructure.stackHeapQueue.stack.InversionStack;
import org.junit.Test;
import java.util.Stack;

/**
 * @author liujun
 * @version 1.0
 * @date 2020/8/3
 * @author—Email liujunfirst@outlook.com
 * @blogURL https://blog.csdn.net/ljfirst
 * @description 逆置栈中元素 测试用例
 */
public class InversionStackTest {

    InversionStack stack = new InversionStack();

    @Test
    public void testInversion() {
        Stack<Integer> demo01 = new Stack<>();
        for (int i = 0; i < 10; i++) {
            demo01.push(i);
        }
        stack.inversion(demo01);
        for (int i = 0; i < 10; i++) {
            assert i == demo01.pop();
        }
    }



}
