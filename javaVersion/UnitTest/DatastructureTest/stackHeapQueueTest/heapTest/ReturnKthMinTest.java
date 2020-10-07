package UnitTest.DatastructureTest.stackHeapQueueTest.heapTest;

import DataStructure.stackHeapQueue.heap.ReturnKthMin;
import org.junit.Test;

/**
 * @author liujun
 * @version 1.0
 * @date 2019-12-10 09:51
 * @authorEmail liujunfirst@outlook.com
 * @description 返回最小的 第K个 元素
 * @blogURL
 */
public class ReturnKthMinTest {

    ReturnKthMin returnKthMin = new ReturnKthMin();
    
    @Test
    public void testreturnKthMinbyheap(){
        int k = 3;
        int value = returnKthMin.returnKthMinbyheap(Demo01,k);
        assert value == -1;
        value = returnKthMin.returnKthMinbyheap(Demo02,k);
        assert value == -1;
        value = returnKthMin.returnKthMinbyheap(Demo03,k);
        assert value == -1;

        value = returnKthMin.returnKthMinbyheap(Demo04,k);
        assert value == 3;
        value = returnKthMin.returnKthMinbyheap(Demo05,k);
        assert value == 3;
        value = returnKthMin.returnKthMinbyheap(Demo06,k);
        assert value == 3;
        value = returnKthMin.returnKthMinbyquicksort(Demo08,k);
        assert value == 3;
        k = 2;
        value = returnKthMin.returnKthMinbyheap(Demo07,k);
        assert value == 2;
    }
    
    @Test
    public void testreturnKthMinbyquicksort(){

        int k = 3;
        int value = returnKthMin.returnKthMinbyquicksort(Demo01,k);
        assert value == -1;
        value = returnKthMin.returnKthMinbyquicksort(Demo02,k);
        assert value == -1;
        value = returnKthMin.returnKthMinbyquicksort(Demo03,k);
        assert value == -1;

        value = returnKthMin.returnKthMinbyquicksort(Demo04,k);
        assert value == 3;
        value = returnKthMin.returnKthMinbyquicksort(Demo05,k);
        assert value == 3;
        value = returnKthMin.returnKthMinbyquicksort(Demo06,k);
        assert value == 3;
        value = returnKthMin.returnKthMinbyquicksort(Demo08,k);
        assert value == 3;
        k = 2;
        value = returnKthMin.returnKthMinbyquicksort(Demo07,k);
        assert value == 2;
    }

    //测试用例
    int[] Demo01 = null;
    int[] Demo02 = {};
    int[] Demo03 = {1,2};
    //Demo04~6,k=3,返回{1,2,3}
    int[] Demo04 = {1,2,3,4,5,6,7,8,9};
    int[] Demo05 = {58,25,36,335,48,9,12,12,12,6,59,1,36,951,75,26,2,36,45,7,59,45,3,48,62,351,21,39};
    int[] Demo06 = {58,48,9,2,36,351,21,39,12,25,12,6,59,1,36,36,145,12,45,7,59,45,3,48,62,951,75,26};

    int[] Demo07 = {1,2};
    int[] Demo08 = {3,2,1,8,4,6,9};
}
