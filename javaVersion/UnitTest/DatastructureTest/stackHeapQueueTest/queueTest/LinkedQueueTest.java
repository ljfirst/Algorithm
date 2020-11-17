package UnitTest.DatastructureTest.stackHeapQueueTest.queueTest;

import DataStructure.stackHeapQueue.queue.LinkedQueuelj;
import org.junit.Test;

/**
 * @author liujun
 * @version 1.0
 * @date 2019-11-09 22:57
 * @author-Email liujunfirst@outlook.com
 * @description
 */
public class LinkedQueueTest {

    LinkedQueuelj linkedQueue = new LinkedQueuelj(10);

    @Test
    public void methodTest() {
        boolean flag = linkedQueue.empty();
        assert flag;
        int value = linkedQueue.poll();
        assert value == -1;
        value = linkedQueue.peek();
        assert value == -1;
        value = linkedQueue.getRealsize();
        assert value == 0;
        flag = linkedQueue.offer(0);
        assert flag;
        //��Ӳ���
        for (int i = 1; i <= 9; i++) {
            linkedQueue.offer(i);
            if (i == 5) {
                flag = linkedQueue.empty();
                assert !flag;
                value = linkedQueue.poll();
                assert value == 0;
                value = linkedQueue.peek();
                assert value == 1;
                value = linkedQueue.getRealsize();
                assert value == 5;
            }
        }
        flag = linkedQueue.offer(10);
        assert flag;
        flag = linkedQueue.offer(11);
        assert flag;
        //目前队内的值 [1,2,3,4,5,6,7,8,9,10,11]
        for (int i = 1; i <= 9; i++) {
            linkedQueue.poll();
            if (i == 5) {
                flag = linkedQueue.empty();
                assert !flag;
                value = linkedQueue.poll();
                assert value == 6;
                value = linkedQueue.peek();
                assert value == 7;
                value = linkedQueue.getRealsize();
                assert value == 5;
            }
        }
        value = linkedQueue.poll();
        assert value == 11;
        flag = linkedQueue.empty();
        assert flag;
        value = linkedQueue.poll();
        assert value == -1;
        value = linkedQueue.peek();
        assert value == -1;
        value = linkedQueue.getRealsize();
        assert value == 0;
    }
}