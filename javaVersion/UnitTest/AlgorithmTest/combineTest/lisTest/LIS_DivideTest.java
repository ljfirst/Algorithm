package UnitTest.AlgorithmTest.combineTest.lisTest;

import Algorithm.comprehensive.lis.LIS_Divide;
import org.junit.Test;

/**
 * @author liujun
 * @version 1.0
 * @date 2020/6/7
 * @author—Email liujunfirst@outlook.com
 * @blogURL https://blog.csdn.net/ljfirst
 * @description 最长递增子序列 分治法测试案例
 */
public class LIS_DivideTest extends LISTestDemo {

    LIS_Divide lis = new LIS_Divide();

    @Test
    public void testLIS_Divide() {
        int length = lis.longestIncreasingSubsequence(demo01);
        assert length == 8;
        length = lis.longestIncreasingSubsequence(demo02);
        assert length == 6;
        length = lis.longestIncreasingSubsequence(demo03);
        assert length == 4;
        length = lis.longestIncreasingSubsequence(demo04);
        assert length == 0;
        length = lis.longestIncreasingSubsequence(demo05);
        assert length == 8;
    }

    String demo01 = "8765123456786543";
    String demo02 = "8765456789234";
    String demo03 = "17891";
    String demo04 = "";
    String demo05 = "123456234567891234567";
}