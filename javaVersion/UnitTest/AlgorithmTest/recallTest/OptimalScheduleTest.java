package UnitTest.AlgorithmTest.recallTest;

import Algorithm.recall.OptimalSchedule;
import org.junit.Test;

/**
 * @author liujun
 * @version 1.0
 * @date 2019-12-06 22:06
 * @author¡ªEmail liujunfirst@outlook.com
 * @description 
 * @blogURL
 */
public class OptimalScheduleTest {

    OptimalSchedule optimalSchedule = new OptimalSchedule();

    @Test
    public void testOptimalSchedule(){
        int time = optimalSchedule.schedule(Demo01,k1);
        assert time == 5;
        time = optimalSchedule.schedule(Demo01,k2);
        assert time == -1;
        time = optimalSchedule.schedule(Demo01,k3);
        assert time == 5;
        time = optimalSchedule.schedule(Demo01,k4);
        assert time == 5;

        time = optimalSchedule.schedule(Demo02,k1);
        assert time == -1;
        time = optimalSchedule.schedule(Demo02,k2);
        assert time == -1;
        time = optimalSchedule.schedule(Demo02,k3);
        assert time == -1;
        time = optimalSchedule.schedule(Demo02,k4);
        assert time == -1;

        time = optimalSchedule.schedule(Demo03,k1);
        assert time == 11;
        time = optimalSchedule.schedule(Demo03,k2);
        assert time == -1;
        time = optimalSchedule.schedule(Demo03,k3);
        assert time == 8;
        time = optimalSchedule.schedule(Demo03,k4);
        assert time == 8;

        time = optimalSchedule.schedule(Demo04,k1);
        assert time == -1;
        time = optimalSchedule.schedule(Demo04,k2);
        assert time == -1;
        time = optimalSchedule.schedule(Demo04,k3);
        assert time == -1;
        time = optimalSchedule.schedule(Demo04,k4);
        assert time == -1;
    }

    //UT
    int[] Demo01 = {1,5,3};
    int[] Demo02 = null;
    int[] Demo03 = {3,2,1,2,5,4,8,7};
    int[] Demo04 = {};

    int k1 = 3;
    int k2 = -7;
    int k3 = 9;
    int k4 = 5;

}
