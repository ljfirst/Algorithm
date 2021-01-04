package UnitTest.DatastructureTest.arrayANDlistTest.arrayTransformationTest;

import DataStructure.arrayANDlist.arrayTransformation.OddLeftEvenRight;
import org.junit.Test;

import java.util.Arrays;

/**
 * @author liujun
 * @version 1.0
 * @date 2020/12/9
 * @author—Email liujunfirst@outlook.com
 * @blogURL https://blog.csdn.net/ljfirst
 * @description 奇数左边偶数右边 测试案例
 */
public class OddLeftEvenRightTest {

    OddLeftEvenRight oe = new OddLeftEvenRight();

    @Test
    public void test() {
        oe.sort(demo01);
        assert Arrays.equals(demo01, target01);
        oe.sort(demo02);
        assert demo02== target02;
        oe.sort(demo03);
        assert Arrays.equals(demo03, target03);
        oe.sort(demo04);
        assert Arrays.equals(demo04, target04);
        oe.sort(demo05);
        assert Arrays.equals(demo05, target05);
        oe.sort(demo06);
        assert Arrays.equals(demo06, target06);
    }

    int[] demo01 = {7, 6, 4, 9, 3, 6, 7, 9, 6, 4, 3};
    int[] target01 = {7, 9, 3, 7, 9, 3, 6, 4, 6, 6, 4};
    int[] demo02 = null;
    int[] target02 = null;
    int[] demo03 = {};
    int[] target03 = new int[]{};
    int[] demo04 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
    int[] target04 = {1, 3, 5, 7, 9, 2, 4, 6, 8, 0};
    int[] demo05 = {1};
    int[] target05 = {1};
    int[] demo06 = {4, 3};
    int[] target06 = {3, 4};
}
