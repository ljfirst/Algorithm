package UnitTest.AlgorithmTest.dynamicTest;

import Algorithm.dynamic.ClimbStairs;
import org.junit.Test;

/**
 * @author liujun
 * @version 1.0
 * @date�� 2019-11-25 16:40
 * @author��Email liujunfirst@outlook.com
 * @description 
 * @blogURL
 */
public class ClimbStairsTest {

    ClimbStairs climbStairs = new ClimbStairs();
    @Test
    public void Testmethod(){
        int result = climbStairs.method(demo01);
        assert result == 0;
        result = climbStairs.method(demo02);
        assert result == 0;
        result = climbStairs.method(demo03);
        assert result == 1;
        result = climbStairs.method(demo04);
        assert result == 2;
        result = climbStairs.method(demo05);
        assert result == 3;
        result = climbStairs.method(demo06);
        assert result == 89;
        result = climbStairs.method(demo07);
        assert result == 10946;
    }

    //��������
    int demo01 = -1;
    int demo02 = 0;//0
    int demo03 = 1;//1
    int demo04 = 2;//2
    int demo05 = 3;//3
    int demo06 = 10;//89
    int demo07 = 20;//10946
}
