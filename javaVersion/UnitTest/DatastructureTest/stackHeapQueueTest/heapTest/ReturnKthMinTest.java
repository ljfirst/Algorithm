package UnitTest.DatastructureTest.stackHeapQueueTest.heapTest;

import DataStructure.stackHeapQueue.heap.ReturnKthMin;
import org.junit.Test;

/**
 * @author liujun
 * @version 1.0
 * @date 2019-12-10 09:51
 * @author-Email liujunfirst@outlook.com
 * @description 返回最小的 第K个 元素 测试案例
 * @blogURL
 */
public class ReturnKthMinTest extends ReturnKMinTest {

    ReturnKthMin returnKthMin = new ReturnKthMin();

    @Test
    public void testreturnKthMinbyheap() {
        int value = returnKthMin.returnKthMinbyheap(Demo01, k);
        assert value == -1;
        value = returnKthMin.returnKthMinbyheap(Demo02, k);
        assert value == -1;
        value = returnKthMin.returnKthMinbyheap(Demo03, k);
        assert value == -1;

        value = returnKthMin.returnKthMinbyheap(Demo04, k);
        assert value == 3;
        value = returnKthMin.returnKthMinbyheap(Demo05, k);
        assert value == 3;
        value = returnKthMin.returnKthMinbyheap(Demo06, k);
        assert value == 3;
        value = returnKthMin.returnKthMinbyheap(Demo08, k);
        assert value == 3;
        value = returnKthMin.returnKthMinbyheap(Demo07, 2);
        assert value == 2;
    }

    @Test
    public void testreturnKthMinbyheap2() {
        int value = returnKthMin.returnKthMinbyheap2(Demo01, k);
        assert value == -1;
        value = returnKthMin.returnKthMinbyheap2(Demo02, k);
        assert value == -1;
        value = returnKthMin.returnKthMinbyheap2(Demo03, k);
        assert value == -1;

        value = returnKthMin.returnKthMinbyheap2(Demo04, k);
        assert value == 3;
        value = returnKthMin.returnKthMinbyheap2(Demo05, k);
        assert value == 3;
        value = returnKthMin.returnKthMinbyheap2(Demo06, k);
        assert value == 3;
        value = returnKthMin.returnKthMinbyheap2(Demo08, k);
        assert value == 3;
        value = returnKthMin.returnKthMinbyheap2(Demo07, 2);
        assert value == 2;
    }

    @Test
    public void testreturnKthMinbyquicksort() {
        int value = returnKthMin.returnKthMinbyquicksort(Demo01, k);
        assert value == -1;
        value = returnKthMin.returnKthMinbyquicksort(Demo02, k);
        assert value == -1;
        value = returnKthMin.returnKthMinbyquicksort(Demo03, k);
        assert value == -1;

        value = returnKthMin.returnKthMinbyquicksort(Demo04, k);
        assert value == 3;
        value = returnKthMin.returnKthMinbyquicksort(Demo05, k);
        assert value == 3;
        value = returnKthMin.returnKthMinbyquicksort(Demo06, k);
        assert value == 3;
        value = returnKthMin.returnKthMinbyquicksort(Demo08, k);
        assert value == 3;
        value = returnKthMin.returnKthMinbyquicksort(Demo07, 2);
        assert value == 2;
    }
}
