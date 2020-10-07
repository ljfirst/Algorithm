package UnitTest.DatastructureTest.stackHeapQueueTest.stackTest;

import DataStructure.stackHeapQueue.stack.MinValueStack;
import org.junit.Test;

/**
 * @author liujun
 * @version 1.0
 * @date 2019-11-09 12:52
 * @authorEmail liujunfirst@outlook.com
 * @description 
 */
public class MinValueStackTest {

    MinValueStack minValueStack = new MinValueStack();

    @Test
    public void getMinValueTest(){
        minValueStack.push(7);
        minValueStack.push(9);
        minValueStack.push(8);
        int value = minValueStack.getMinValue();
        assert value == 7;

        minValueStack.push(5);
        minValueStack.push(3);
        minValueStack.peek();
        minValueStack.push(4);
        value = minValueStack.getMinValue();
        assert value == 3;

        for (int i = 1; i <= 4; i++) {
            minValueStack.pop();
        }

        value = minValueStack.getMinValue();
        assert value == 7;

        minValueStack.push(21);
        value = minValueStack.getMinValue();
        assert value == 7;

        minValueStack.push(1);
        value = minValueStack.getMinValue();
        assert value == 1;
    }
}
