package UnitTest.DatastructureTest.stackHeapQueueTest.stackTest;

import DataStructure.stackHeapQueue.stack.LinkedStacklj;
import org.junit.Test;

/**
 * @author liujun
 * @version 1.0
 * @date 2019-11-09 12:53
 * @authorEmail liujunfirst@outlook.com
 * @description 
 */

public class LinkedStackTest {

    LinkedStacklj LinkedStack = new LinkedStacklj(10);

    @Test
    public void methodTest(){
        //peek��������
        int value = LinkedStack.peek();
        assert value == -1;
        value = LinkedStack.pop();
        assert value == -1;
        //empty��������
        boolean flag = LinkedStack.empty();
        assert flag;
        //size��������
        value = LinkedStack.getRealsize();
        assert value == 0;
        flag = LinkedStack.push(0);
        assert flag;
        //push��������
        for (int i = 1; i <= 9; i++) {
            flag = LinkedStack.push(i);
        }
        assert flag;
        flag = LinkedStack.empty();
        assert !flag;
        value = LinkedStack.getRealsize();
        assert value == 10;
        flag = LinkedStack.push(10);
        assert !flag;
        value = LinkedStack.pop();
        assert value == 9;
        value = LinkedStack.peek();
        assert value == 8;
        //search ��������
        flag = LinkedStack.search(8);
        assert flag;
        flag = LinkedStack.search(10);
        assert !flag;
        //pop��������
        for (int i = 1; i <= 9; i++) {
            LinkedStack.pop();
        }
        flag = LinkedStack.empty();
        assert flag;
        value = LinkedStack.pop();
        assert value == -1;
        value = LinkedStack.peek();
        assert value == -1;
        value = LinkedStack.getRealsize();
        assert value == 0;
    }
}
