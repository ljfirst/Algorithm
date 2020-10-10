package UnitTest.DatastructureTest.stringANDlineTest.arrayTest.doublePointTest;

import DataStructure.stringANDline.array.doublePoint.ReduceNum;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author liujun
 * @version 1.0
 * @date 2020/10/10
 * @author—Email liujunfirst@outlook.com
 * @blogURL https://blog.csdn.net/ljfirst
 * @description 去除指定元素 测试用例
 */
public class ReduceNumTest {

    ReduceNum r = new ReduceNum();

    @Test
    public void test() {
        int[] target = r.method(demo01, 6);
        Assert.assertArrayEquals(target, ans01);
        assert r.head == ans_01;
    }

    int[] demo01 = {1, 2, 3, 4, 5, 6, 7, 6, 8, 69, 6, 10, 6};
    int[] ans01 = {1, 2, 3, 4, 5, 7, 8, 69, 10};
    int ans_01 = 9;
}
