package UnitTest.AlgorithmTest.combineTest.lisTest;

import Algorithm.comprehensive.lis.LIS_Poker;
import org.junit.Test;

/**
 * @author liujun
 * @version 1.0
 * @date 2020/6/7
 * @author—Email liujunfirst@outlook.com
 * @blogURL https://blog.csdn.net/ljfirst
 * @description 最长递增子序列 分治法 扑克法 测试案例
 */
public class LIS_PokerTest extends LISTestDemo {

    @Test
    public void testLIS_Poker(){
        super.TestDemo(new LIS_Poker());
    }
}
