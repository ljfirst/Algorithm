package UnitTest.DatastructureTest.stringANDlineTest.arrayTest;

import DataStructure.stringANDline.array.DiffArray;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author liujun
 * @version 1.0
 * @date 2020/9/8
 * @author—Email liujunfirst@outlook.com
 * @blogURL https://blog.csdn.net/ljfirst
 * @description
 */
public class DiffArrayTest {
    DiffArray diffArray = new DiffArray();

    @Test
    public void testprefixSum() {
        diffArray.prefixSum(source01);

        int ans = diffArray.prefixSumCount(1, 3);
        assert ans == target01;
        ans = diffArray.prefixSumCount(1, 6);
        assert ans == target02;
        ans = diffArray.prefixSumCount(6, 7);
        assert ans == target03;
        ans = diffArray.prefixSumCount(3, 5);
        assert ans == target04;
        ans = diffArray.prefixSumCount(-1, 80);
        assert ans == target05;
    }

    @Test
    public void test() {
        int[] ans = diffArray.diff_init(source01);
        Assert.assertArrayEquals(ans, diffTarget01);
    }

    int[] source01 = {1, 2, 3, 4, -5, 6, 7, 8, 9};
    int target01 = 9;
    int target02 = 17;
    int target03 = 15;
    int target04 = 5;
    int target05 = 35;

    int[] diffTarget01 = {1, 1, 1, 1, -9, 11, 1, 1, 1};
}
