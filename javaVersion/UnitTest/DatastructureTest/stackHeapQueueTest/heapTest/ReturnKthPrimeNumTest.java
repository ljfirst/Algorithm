package UnitTest.DatastructureTest.stackHeapQueueTest.heapTest;

import DataStructure.stackHeapQueue.heap.ReturnKthPrimeNum;
import org.junit.Test;

/**
 * @author liujun
 * @version 1.0
 * @date 2020/11/30
 * @author—Email liujunfirst@outlook.com
 * @blogURL https://blog.csdn.net/ljfirst
 * @description 在输入的数组中找出第k大的素数 测试案例
 */
public class ReturnKthPrimeNumTest {

    ReturnKthPrimeNum r = new ReturnKthPrimeNum();

    @Test
    public void getKthPrimeNum() {
        int target = r.getKthPrimeNum(Demo01, k);
        assert target == -1;
        target = r.getKthPrimeNum(Demo02, k);
        assert target == -1;
        target = r.getKthPrimeNum(Demo03, k);
        assert target == 7;
        target = r.getKthPrimeNum(Demo04, k);
        assert target == 7;
        target = r.getKthPrimeNum(Demo05, k);
        assert target == 7;
        target = r.getKthPrimeNum(Demo06, k);
        assert target == 7;
        target = r.getKthPrimeNum(Demo07, k);
        assert target == -1;
        target = r.getKthPrimeNum(Demo08, k);
        assert target == -1;
        target = r.getKthPrimeNum(Demo09, k);
        assert target == 7;
    }

    int k = 3;
    int[] Demo01 = null;
    int[] Demo02 = {};
    int[] Demo03 = {3, 5, 7, 9, 11, 13, 17, 19, 21, 23, 27};
    int[] Demo04 = {12, 34, 56, 78, 90, 3, 5, 7, 9, 11, 13, 17, 19, 21, 23, 27};
    int[] Demo05 = {12, 34, 56, 78, 90, 3, 5, 7, 9, 11, 13, 17, 9, 11, 13, 17, 19, 21, 19, 21, 23, 27};
    int[] Demo06 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
    int[] Demo07 = {1, 2};
    int[] Demo08 = {1, 2, 3, 4, 5};
    int[] Demo09 = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
}
