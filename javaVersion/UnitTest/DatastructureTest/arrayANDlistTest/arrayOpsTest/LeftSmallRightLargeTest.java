package UnitTest.DatastructureTest.arrayANDlistTest.arrayOpsTest;

import DataStructure.arrayANDlist.arrayOps.LeftSmallRightLarge;
import org.junit.Test;

import java.util.Arrays;

/**
 * @author liujun
 * @version 1.0
 * @date 2020/12/8
 * @author—Email liujunfirst@outlook.com
 * @blogURL https://blog.csdn.net/ljfirst
 * @description 左小右大的数 测试案例
 */
public class LeftSmallRightLargeTest {

    LeftSmallRightLarge sp = new LeftSmallRightLarge();

    @Test
    public void testfindSpecialNum() {
        int[] target = sp.findSpecialNum(demo01);
        assert Arrays.equals(target, answers01);
        target = sp.findSpecialNum(demo02);
        assert Arrays.equals(target, answers02);
        target = sp.findSpecialNum(demo03);
        assert Arrays.equals(target, answers03);
        target = sp.findSpecialNum(demo04);
        assert Arrays.equals(target, answers04);
        target = sp.findSpecialNum(demo05);
        assert Arrays.equals(target, answers05);
    }

    int[] demo01 = {};
    int[] answers01 = new int[]{};
    int[] demo02 = null;
    int[] answers02 = new int[]{};
    //期望输出1,8,9
    int[] demo03 = {1, 7, 3, 4, 5, 6, 2, 8, 9};
    int[] answers03 = {1, 8, 9};
    int[] demo04 = {2, 8, 6, 5, 4, 9, 4, 4, 5, 6};
    int[] answers04 = {2};
    int[] demo05 = {69, 9, 8, 3, 38, 65, 4, 34, 56, 78, 909, 876, 85, 169, 147};
    int[] answers05 = new int[]{78};
}
