package UnitTest.DatastructureTest.stackHeapQueueTest.heapTest;

import DataStructure.stackHeapQueue.heap.ReturnKMin;
import org.junit.Test;

import java.util.Arrays;

/**
 * @author liujun
 * @version 1.0
 * @date 2019-11-25 02:48
 * @author—Email liujunfirst@outlook.com
 * @description 返回最小的 K 个元素
 * @blogURL
 */
public class ReturnKMinTest {

    ReturnKMin returnKMin = new ReturnKMin();
    int k = 3;
    int[] target;
    int[] pattern;

    @Test
    public void testkMinHeap_K(){

        target = null;
        pattern = returnKMin.kMinHeap_K(Demo01,k);
        assert Arrays.equals(pattern, target);
        pattern = returnKMin.kMinHeap_K(Demo02,k);
        assert Arrays.equals(pattern, target);
        pattern = returnKMin.kMinHeap_K(Demo03,k);
        assert Arrays.equals(pattern, target);

        target = new int[]{1,2,3};
        pattern = returnKMin.kMinHeap_K(Demo04,k);
        assert Arrays.equals(pattern, target);
        pattern = returnKMin.kMinHeap_K(Demo05,k);
        assert Arrays.equals(pattern, target);
        pattern = returnKMin.kMinHeap_K(Demo06,k);
        assert Arrays.equals(pattern, target);
        pattern = returnKMin.kMinQuickSort(Demo08,k);
        assert Arrays.equals(pattern, target);

        target = new int[]{1};
        pattern = returnKMin.kMinHeap_K(Demo07,1);
        assert Arrays.equals(pattern, target);
    }

    @Test
    public void testkMinHeap_length(){

        target = null;
        pattern = returnKMin.kMinHeap_length(Demo01,k);
        assert Arrays.equals(pattern, target);
        pattern = returnKMin.kMinHeap_length(Demo02,k);
        assert Arrays.equals(pattern, target);
        pattern = returnKMin.kMinHeap_length(Demo03,k);
        assert Arrays.equals(pattern, target);

        target = new int[]{1,2,3};
        pattern = returnKMin.kMinHeap_length(Demo04,k);
        assert Arrays.equals(pattern, target);
        pattern = returnKMin.kMinHeap_length(Demo05,k);
        assert Arrays.equals(pattern, target);
        pattern = returnKMin.kMinHeap_length(Demo06,k);
        assert Arrays.equals(pattern, target);
        pattern = returnKMin.kMinQuickSort(Demo08,k);
        assert Arrays.equals(pattern, target);

        target = new int[]{1};
        pattern = returnKMin.kMinHeap_length(Demo07,1);
        assert Arrays.equals(pattern, target);
    }

    @Test
    public void testkMinQuickSort(){

        target = null;
        pattern = returnKMin.kMinQuickSort(Demo01,k);
        assert Arrays.equals(pattern, target);
        pattern = returnKMin.kMinQuickSort(Demo02,k);
        assert Arrays.equals(pattern, target);
        pattern = returnKMin.kMinQuickSort(Demo03,k);
        assert Arrays.equals(pattern, target);

        target = new int[]{1,2,3};
        pattern = returnKMin.kMinQuickSort(Demo04,k);
        assert Arrays.equals(pattern, target);
        pattern = returnKMin.kMinQuickSort(Demo05,k);
        assert Arrays.equals(pattern, target);
        pattern = returnKMin.kMinQuickSort(Demo06,k);
        assert Arrays.equals(pattern, target);
        pattern = returnKMin.kMinQuickSort(Demo08,k);
        assert Arrays.equals(pattern, target);

        target = new int[]{1};
        pattern = returnKMin.kMinQuickSort(Demo07,1);
        assert Arrays.equals(pattern, target);
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