package UnitTest.AlgorithmTest.combineTest.lisTest;

import Algorithm.comprehensive.lis.LIS_Branch;
import org.junit.Test;

/**
 * @author liujun
 * @version 1.0
 * @date 2020/6/7
 * @author—Email liujunfirst@outlook.com
 * @blogURL https://blog.csdn.net/ljfirst
 * @description 最长递增子序列 分支限界法测试案例
 */
public class TestLIS_Branch extends TestLISDemo{

    @Test
    public void testLIS_Branch(){
        super.TestDemo(new LIS_Branch());
    }
}
