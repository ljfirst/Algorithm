package UnitTest.AlgorithmTest.combineTest.lisTest;

import Algorithm.comprehensive.lis.LIS;

/**
 * @author liujun
 * @version 1.0
 * @date 2020/6/7
 * @author—Email liujunfirst@outlook.com
 * @blogURL https://blog.csdn.net/ljfirst
 * @description
 */
public class LISTestDemo {

    public void TestDemo(LIS LISImpl) {
        int result = LISImpl.longestIncreasingSubsequence(demo01);
        assert result == 9;
        result = LISImpl.longestIncreasingSubsequence(demo02);
        assert result == 0;
        result = LISImpl.longestIncreasingSubsequence(demo03);
        assert result == 0;
        result = LISImpl.longestIncreasingSubsequence(demo04);
        assert result == 5;
        result = LISImpl.longestIncreasingSubsequence(demo05);
        assert result == 9;
        result = LISImpl.longestIncreasingSubsequence(demo06);
        assert result == 5;
        result = LISImpl.longestIncreasingSubsequence(demo07);
        assert result == 4;
        result = LISImpl.longestIncreasingSubsequence(demo08);
        assert result == 1;
        result = LISImpl.longestIncreasingSubsequence(demo09);
        assert result == 1;
        result = LISImpl.longestIncreasingSubsequence(demo10);
        assert result == 9;
    }

    //测试数据
    public String demo01 = "1528334656789123456";//123456789
    String demo02 = "";
    String demo03 = null;
    String demo04 = "18386873921";//13679
    String demo05 = "1234567823456789";//123456789
    String demo06 = "13572468";//12468
    String demo07 = "24681357";//2468
    String demo08 = "987654321";//1
    String demo09 = "1";//1
    String demo10 = "12834615526431378242287536564437529688";//123456789
}
