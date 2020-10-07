package UnitTest.DatastructureTest.stackHeapQueueTest.stackTest;

import DataStructure.stackHeapQueue.stack.ArrayStacklj;
import DataStructure.stackHeapQueue.stack.Stacklj;
import org.junit.Test;

/**
 * @author liujun
 * @version 1.0
 * @date 2019-11-09 12:53
 * @authorEmail liujunfirst@outlook.com
 * @description
 */
public class ArrayStackTest {

    @Test
    public void methodTest(Stacklj arrayStack) {
        //peek��������
        int value = arrayStack.peek();
        assert value == -1;
        value = arrayStack.pop();
        assert value == -1;
        //empty��������
        boolean flag = arrayStack.empty();
        assert flag;
        //size��������
        value = arrayStack.getRealsize();
        assert value == 0;
        flag = arrayStack.push(0);
        assert flag;
        //push��������
        for (int i = 1; i <= 9; i++) {
            flag = arrayStack.push(i);
        }
        assert flag;
        flag = arrayStack.empty();
        assert !flag;
        value = arrayStack.getRealsize();
        assert value == 10;
        flag = arrayStack.push(10);
        assert flag;
        value = arrayStack.pop();
        assert value == 10;
        value = arrayStack.peek();
        assert value == 9;
        //search ��������
        flag = arrayStack.search(8);
        assert flag;
        flag = arrayStack.search(10);
        assert !flag;
        //pop��������
        for (int i = 1; i <= 9; i++) {
            arrayStack.pop();
        }
        flag = arrayStack.empty();
        assert !flag;
        value = arrayStack.pop();
        assert value == 0;
        value = arrayStack.peek();
        assert value == -1;
        value = arrayStack.getRealsize();
        assert value == 0;

        //测试扩容
        arrayStack = new ArrayStacklj(4);
        arrayStack.push(1);
        arrayStack.push(2);
        arrayStack.push(3);
        arrayStack.push(4);
        arrayStack.push(5);
        arrayStack.push(6);
        arrayStack.push(7);
        arrayStack.push(8);
        assert 8 == arrayStack.getRealsize();
    }
}
