package UnitTest.DatastructureTest.stackHeapQueueTest.queueTest;

import DataStructure.stackHeapQueue.queue.Queuelj;

/**
 * @author liujun
 * @version 1.0
 * @date 2020/11/17
 * @author—Email liujunfirst@outlook.com
 * @blogURL https://blog.csdn.net/ljfirst
 * @description Queuelj 测试案例
 */
public class QueueljTest {

    public void testQueue(Queuelj queuelj) {
        //init
        assert queuelj.getRealsize() == 0;
        assert queuelj.getMaxsize() == 32;
        assert queuelj.empty();
        assert queuelj.peek() == Integer.MIN_VALUE;
        assert !queuelj.search(3);
        assert queuelj.poll() == Integer.MIN_VALUE;
        //insert
        for (int i = 0; i < 33; i++) {
            queuelj.offer(i);
            if (i == 9) {
                assert queuelj.getRealsize() == 10;
                assert queuelj.getMaxsize() == 32;
                assert !queuelj.empty();
                assert queuelj.peek() == 0;
                assert queuelj.search(3);
            }
        }
        assert queuelj.getRealsize() == 33;
        assert queuelj.getMaxsize() == 64;
        assert !queuelj.empty();
        assert queuelj.peek() == 0;
        assert queuelj.search(3);
        assert queuelj.poll() == 0;
        //final
        assert queuelj.offer(1234);
        assert queuelj.getRealsize() == 33;
        assert queuelj.peek() == 1;
        assert queuelj.poll() == 1;

        for (int i = 2; i <= 20; i++) {
            queuelj.poll();
        }
        for (int i = 33; i <= 63 + 15; i++) {
            queuelj.offer(i);
        }
        assert queuelj.getRealsize() == 59;
        assert queuelj.getMaxsize() == 64;
        assert !queuelj.search(3);
        assert queuelj.search(33);
        assert !queuelj.empty();
        assert queuelj.peek() == 21;
        assert queuelj.poll() == 21;

        for (int i = 79; i <= 79+20; i++) {
            queuelj.offer(i);
        }
        assert queuelj.getRealsize() == 79;
        assert queuelj.getMaxsize() == 128;
        assert !queuelj.search(3);
        assert queuelj.search(33);
        assert !queuelj.empty();
        assert queuelj.peek() == 22;
        assert queuelj.poll() == 22;
    }
}
