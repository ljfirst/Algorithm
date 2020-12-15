package UnitTest.DatastructureTest.stackHeapQueueTest.heapTest;

import DataStructure.stackHeapQueue.heap.PriorityQueuelj;
import DataStructure.stackHeapQueue.queue.ArrayQueuelj;
import UnitTest.DatastructureTest.stackHeapQueueTest.queueTest.QueueljTest;
import org.junit.Test;

/**
 * @author liujun
 * @version 1.0
 * @date 2020/7/23
 * @author—Email liujunfirst@outlook.com
 * @blogURL https://blog.csdn.net/ljfirst
 * @description
 */
public class PriorityQueueljTest extends QueueljTest {


    @Test
    public void testArrayQueue(){
        super.testQueue(new PriorityQueuelj());
        //methodTest(new PriorityQueuelj(10));
    }

    public void methodTest(PriorityQueuelj p) {
        //测试队列基本功能
        assert p.empty();
        assert 5 == p.getMaxsize();
        assert 0 == p.getRealsize();
        p.offer(6);
        assert !p.empty();
        assert 6 == p.peek();
        assert 6 == p.poll();
        p.resize();
        assert 10 == p.getMaxsize();

        //测试优先队列
        p.offer(8);
        p.offer(17);
        p.offer(9);
        p.offer(12);
        p.offer(16);
        p.offer(4);

        assert 17 == p.peek();
        assert 17 == p.poll();
        assert 16 == p.poll();
        assert 12 == p.poll();
        assert 9 == p.poll();

        //此时还剩下4，8
        p.offer(1);
        p.offer(6);
        p.offer(11);
        assert 11 == p.peek();
        assert 11 == p.poll();
        assert 8 == p.poll();
    }
}
