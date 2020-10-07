package UnitTest.AlgorithmTest.combineTest.lisTest;

import Algorithm.comprehensive.lis.LIS_Dynamic;
import Algorithm.comprehensive.lis.LIS_Lcs;
import org.junit.Test;

/**
 * @author liujun
 * @version 1.0
 * @date 2020/6/7
 * @author—Email liujunfirst@outlook.com
 * @blogURL https://blog.csdn.net/ljfirst
 * @description 最长递增子序列 字符串对比法测试案例
 */
public class TestLIS_Lcs extends TestLISDemo{

    @Test
    public void testLIS_Lcs(){
        super.TestDemo(new LIS_Lcs());
    }
}
