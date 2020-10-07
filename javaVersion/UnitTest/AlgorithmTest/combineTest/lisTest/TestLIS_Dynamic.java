package UnitTest.AlgorithmTest.combineTest.lisTest;

import Algorithm.comprehensive.lis.LIS_Dynamic;
import org.junit.Test;

/**
 * @author liujun
 * @version 1.0
 * @date 2020/6/7
 * @author—Email liujunfirst@outlook.com
 * @blogURL https://blog.csdn.net/ljfirst
 * @description 最长递增子序列 动态规划法测试案例
 */
public class TestLIS_Dynamic extends TestLISDemo{

    @Test
    public void testLIS_Dynamic(){
        super.TestDemo(new LIS_Dynamic());
    }
}
