package UnitTest.DatastructureTest.arrayANDlistTest.arrayApplyTest;

import DataStructure.arrayANDlist.arrayApply.HoldWater1;
import org.junit.Test;

/**
 * @author liujun
 * @version 1.0
 * @date 2020/7/1
 * @author—Email liujunfirst@outlook.com
 * @blogURL https://blog.csdn.net/ljfirst
 * @description 盛水问题 测试用例
 */
public class HoldWater1Test {

    HoldWater1 h = new HoldWater1();

    @Test
    public void testcalculate() {
        int value = h.calculate(demo01);
        assert value == 0;
        value = h.calculate(demo02);
        assert value == 0;
        value = h.calculate(demo03);
        assert value == 49;
    }

    int[] demo01 = null;
    int[] demo02 = {};
    int[] demo03 = {3,8,6,2,5,4,8,3,7};

}
