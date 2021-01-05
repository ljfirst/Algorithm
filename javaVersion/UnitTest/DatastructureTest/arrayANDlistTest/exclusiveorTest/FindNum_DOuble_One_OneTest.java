package UnitTest.DatastructureTest.arrayANDlistTest.exclusiveorTest;

import DataStructure.arrayANDlist.xor.FindNum_DOuble_One_One;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author liujun
 * @version 1.0
 * @date 2020/8/31
 * @author—Email liujunfirst@outlook.com
 * @blogURL https://blog.csdn.net/ljfirst
 * @description 找数字 测试案例
 * 一个整型数组里除了两个数字之外，其他的数字都出现了两次。请写程序找出这两个只出现一次的数字
 */
public class FindNum_DOuble_One_OneTest {

    FindNum_DOuble_One_One fvops = new FindNum_DOuble_One_One();

    @Test
    public void testget() {
        int[] target = fvops.get(array01);
        Assert.assertArrayEquals(target, value01);
        target = fvops.get(array02);
        Assert.assertArrayEquals(target, value02);
        target = fvops.get(array03);
        Assert.assertArrayEquals(target, value03);
        target = fvops.get(array04);
        Assert.assertArrayEquals(target, value04);
        target = fvops.get(array05);
        Assert.assertArrayEquals(target, value05);
        target = fvops.get(array06);
        Assert.assertArrayEquals(target, value06);
        target = fvops.get(array07);
        Assert.assertArrayEquals(target, value07);
        target = fvops.get(array08);
        Assert.assertArrayEquals(target, value08);
    }

    int[] array01 = {};
    int[] value01 = {};
    int[] array02 = null;
    int[] value02 = {};
    int[] array03 = {5, 5, 1, 2, 6, 9, 3, 2, 6, 7, 8, 1, 4, 3, 8, 4};
    int[] value03 = {7, 9};
    int[] array04 = {5, 5, 1, 2, 6, 3, 2, 6, 7, 8, 17, 1, 4, 3, 8, 4, 5, 5, 1, 11, 2, 6, 3, 2, 6, 7, 8, 1, 4, 3, 8, 4};
    int[] value04 = {11, 17};
    int[] array05 = {3879, 700, 15, 5009, 13, 15, 455, 3, 4, 3879, 700, 222, 5, 222, 11, 455, 5009, 666, 666, 818, 818, 3, 4, 5};
    int[] value05 = {11, 13};
    int[] array06 = {11, 12, 13, 14, 14, 15, 16, 17, 18, 19, 20, 20, 19, 18, 17, 16, 15, 14, 13, 12, 11, 90};
    int[] value06 = {14, 90};
    int[] array07 = {11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 20, 19, 18, 17, 16, 15, 14, 13, 12, 11, 90};
    int[] value07 = {};
    int[] array08 = {5, 5, 1, 2, 6, 9, 3, 2, 6, -45678, 8, 1, 4, 3, 8, 4};
    int[] value08 = {-45678, 9};
}
