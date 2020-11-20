package UnitTest.AlgorithmTest.combineTest.optimalScheduleTest;

import Algorithm.comprehensive.optimalSchedule.OptimalSchedule;
import Algorithm.comprehensive.optimalSchedule.OptimalSchedule_Greed;
import org.junit.Test;

/**
 * @author liujun
 * @version 1.0
 * @date 2020/11/20
 * @author—Email liujunfirst@outlook.com
 * @blogURL https://blog.csdn.net/ljfirst
 * @description 最佳调度问题 （贪心算法） 测试案例
 */
public class OptimalSchedule_GreedTest extends OptimalScheduleTest{

    @Test
    public void optimalSchedule_GreedTest(){
        OptimalSchedule optimalSchedule = new OptimalSchedule_Greed();
        optimalSchedule_Test(optimalSchedule);
        int time = optimalSchedule.schedule(Demo03,k1);
        assert time == 14;
        time = optimalSchedule.schedule(Demo03,k4);
        assert time == 10;
        time = optimalSchedule.schedule(Demo03,k5);
        assert time == 10;
    }
}
