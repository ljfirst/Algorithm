package UnitTest.DatastructureTest.stackHeapQueueTest.heapTest;

import DataStructure.stackHeapQueue.heap.ReturnKMin;
import org.junit.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
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

    @Test
    public void testkMinHeap_K() throws ClassNotFoundException, InvocationTargetException, IllegalAccessException {
        Class c = Class.forName("DataStructure.stackHeapQueue.heap.ReturnKMin");
        Method[] m = c.getMethods();
        for (Method m1 : m) {
            if (m1.getName().contains("kMin")) {

                pattern = (int[]) m1.invoke(returnKMin, Demo01, k);
                assert Arrays.equals(pattern, target1);
                pattern = (int[]) m1.invoke(returnKMin, Demo02, k);
                assert Arrays.equals(pattern, target1);
                pattern = (int[]) m1.invoke(returnKMin, Demo03, k);
                assert Arrays.equals(pattern, target1);

                pattern = (int[]) m1.invoke(returnKMin, Demo04, k);
                assert Arrays.equals(pattern, target2);
                pattern = (int[]) m1.invoke(returnKMin, Demo05, k);
                assert Arrays.equals(pattern, target2);
                pattern = (int[]) m1.invoke(returnKMin, Demo06, k);
                assert Arrays.equals(pattern, target2);
                pattern = (int[])m1.invoke(returnKMin,Demo08,k);
                assert Arrays.equals(pattern, target2);

                pattern = (int[])m1.invoke(returnKMin,Demo07,1);
                assert Arrays.equals(pattern, target3);
            }
        }


    }

    int k = 3;
    int[] pattern;
    //测试用例
    int[] Demo01 = null;
    int[] Demo02 = {};
    int[] Demo03 = {1, 2};
    int[] target1 = null;

    //Demo04~6,k=3,返回{1,2,3}
    int[] Demo04 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
    int[] Demo05 = {58, 25, 36, 335, 48, 9, 12, 12, 12, 6, 59, 1, 36, 951, 75, 26, 2, 36, 45, 7, 59, 45, 3, 48, 62, 351, 21, 39};
    int[] Demo06 = {58, 48, 9, 2, 36, 351, 21, 39, 12, 25, 12, 6, 59, 1, 36, 36, 145, 12, 45, 7, 59, 45, 3, 48, 62, 951, 75, 26};
    int[] Demo08 = {3, 2, 1, 8, 4, 6, 9};
    int[] target2 = new int[]{1, 2, 3};

    int[] Demo07 = {1, 2};
    int[] target3 = new int[]{1};
    ;
}