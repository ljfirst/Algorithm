package UnitTest.AlgorithmTest.backtrackTest;

import Algorithm.backtrack.OptimalSchedule;
import Algorithm.backtrack.OptimalSchedule_Backtrack;
import Algorithm.backtrack.OptimalSchedule_Dynamic;
import Algorithm.backtrack.OptimalSchedule_Greed;
import org.junit.Test;

/**
 * @author liujun
 * @version 1.0
 * @date 2019-12-06 22:06
 * @author-Email liujunfirst@outlook.com
 * @description
 * @blogURL
 */

public class OptimalSchedule_Test {


    //测试 最佳调度问题 （动态规划）
    //@Test
    public void OptimalSchedule_Dynamic_Test(){
        OptimalSchedule_Test(new OptimalSchedule_Dynamic());
    }

    //测试 最佳调度问题 （贪心算法）
    @Test
    public void OptimalSchedule_Greed_Test(){
        OptimalSchedule optimalSchedule = new OptimalSchedule_Greed();
        OptimalSchedule_Test(optimalSchedule);
        int time = optimalSchedule.schedule(Demo03,k1);
        assert time == 14;
        time = optimalSchedule.schedule(Demo03,k4);
        assert time == 10;
        time = optimalSchedule.schedule(Demo03,k5);
        assert time == 10;
    }

    //测试 最佳调度问题 （分支限界、剪枝法、回溯法）
    @Test
    public void OptimalSchedule_Backtrack_Test(){
        OptimalSchedule optimalSchedule = new OptimalSchedule_Backtrack();
        OptimalSchedule_Test(optimalSchedule);
        int time = optimalSchedule.schedule(Demo03,k1);
        assert time == 11;
        time = optimalSchedule.schedule(Demo03,k4);
        assert time == 8;
        time = optimalSchedule.schedule(Demo03,k5);
        assert time == 8;
    }

    public void OptimalSchedule_Test(OptimalSchedule optimalScheduleBacktrack){
        int time = optimalScheduleBacktrack.schedule(Demo01,k1);
        assert time == 5;
        time = optimalScheduleBacktrack.schedule(Demo01,k2);
        assert time == -1;
        time = optimalScheduleBacktrack.schedule(Demo01,k3);
        assert time == 5;
        time = optimalScheduleBacktrack.schedule(Demo01,k4);
        assert time == 5;

        time = optimalScheduleBacktrack.schedule(Demo02,k1);
        assert time == -1;
        time = optimalScheduleBacktrack.schedule(Demo02,k2);
        assert time == -1;
        time = optimalScheduleBacktrack.schedule(Demo02,k3);
        assert time == -1;
        time = optimalScheduleBacktrack.schedule(Demo02,k4);
        assert time == -1;

        time = optimalScheduleBacktrack.schedule(Demo03,k2);
        assert time == -1;
        time = optimalScheduleBacktrack.schedule(Demo03,k3);
        assert time == 8;

        time = optimalScheduleBacktrack.schedule(Demo04,k1);
        assert time == -1;
        time = optimalScheduleBacktrack.schedule(Demo04,k2);
        assert time == -1;
        time = optimalScheduleBacktrack.schedule(Demo04,k3);
        assert time == -1;
        time = optimalScheduleBacktrack.schedule(Demo04,k4);
        assert time == -1;
    }

    //任务时间数组
    int[] Demo01 = {1,5,3};
    int[] Demo02 = null;
    int[] Demo03 = {3,2,1,2,5,4,8,7};
    int[] Demo04 = {};

    //k 是机器数量
    int k1 = 3;
    int k2 = -7;
    int k3 = 9;
    int k4 = 5;
    int k5 = 4;
}
