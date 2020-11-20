package UnitTest.AlgorithmTest.combineTest.optimalScheduleTest;

import Algorithm.comprehensive.optimalSchedule.OptimalSchedule;
import Algorithm.comprehensive.optimalSchedule.OptimalSchedule_Backtrack;
import org.junit.Test;

/**
 * @author liujun
 * @version 1.0
 * @date 2020/11/20
 * @author—Email liujunfirst@outlook.com
 * @blogURL https://blog.csdn.net/ljfirst
 * @description 测试 最佳调度问题
 */
public class OptimalSchedule_BacktrackTest extends OptimalScheduleTest{

    //测试 最佳调度问题 （分支限界、剪枝法、回溯法）
    @Test
    public void optimalSchedule_BacktrackTest(){
        OptimalSchedule optimalSchedule = new OptimalSchedule_Backtrack();
        super.optimalSchedule_Test(optimalSchedule);
        int time = optimalSchedule.schedule(Demo03,k1);
        assert time == 11;
        time = optimalSchedule.schedule(Demo03,k4);
        assert time == 8;
        time = optimalSchedule.schedule(Demo03,k5);
        assert time == 8;
    }
}
