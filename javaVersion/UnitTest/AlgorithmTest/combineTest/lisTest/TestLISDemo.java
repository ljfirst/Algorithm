package UnitTest.AlgorithmTest.combineTest.lisTest;

import Algorithm.comprehensive.lis.LisInterface;

/**
 * @author liujun
 * @version 1.0
 * @date 2020/6/7
 * @author—Email liujunfirst@outlook.com
 * @blogURL https://blog.csdn.net/ljfirst
 * @description
 */
public class TestLISDemo {

    public void TestDemo(LisInterface lisImpl) {
        int result = lisImpl.longestIncreasingSubsequence(demo01);
        assert result == 9;
        result = lisImpl.longestIncreasingSubsequence(demo02);
        assert result == 0;
        result = lisImpl.longestIncreasingSubsequence(demo03);
        assert result == 0;
        result = lisImpl.longestIncreasingSubsequence(demo04);
        assert result == 5;
        result = lisImpl.longestIncreasingSubsequence(demo05);
        assert result == 9;
        result = lisImpl.longestIncreasingSubsequence(demo06);
        assert result == 5;
        result = lisImpl.longestIncreasingSubsequence(demo07);
        assert result == 4;
        result = lisImpl.longestIncreasingSubsequence(demo08);
        assert result == 1;
        result = lisImpl.longestIncreasingSubsequence(demo09);
        assert result == 1;
    }

    //测试数据
    String demo01 = "1528334656789123456";//123456789
    String demo02 = "";
    String demo03 = null;
    String demo04 = "18386873921";//13679
    String demo05 = "1234567823456789";//123456789
    String demo06 = "13572468";//12468
    String demo07 = "24681357";//2468
    String demo08 = "987654321";//123456789
    String demo09 = "1";//123456789
}
