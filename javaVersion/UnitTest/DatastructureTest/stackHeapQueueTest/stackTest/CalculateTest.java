package UnitTest.DatastructureTest.stackHeapQueueTest.stackTest;

import DataStructure.stackHeapQueue.stack.Calculate;
import org.junit.Test;

import java.text.DecimalFormat;

/**
 * @author liujun
 * @version 1.0
 * @date 2019-11-09 12:53
 * @author-Email liujunfirst@outlook.com
 * @description 计算器测试用例
 */
public class CalculateTest {

    Calculate calculate = new Calculate();

    @Test
    public void test() {
        double target = calculate.calculated(calNum01);
        assert target == ans01;
        target = calculate.calculated(calNum011);
        assert target == ans011;
        target = calculate.calculated(calNum012);
        assert target == ans012;
        target = calculate.calculated(calNum02);
        assert target == ans02;
        target = calculate.calculated(calNum03);
        assert target == ans03;
        target = calculate.calculated(calNum04);
        assert target == ans04;
        target = calculate.calculated(calNum042);
        assert target == ans042;
        target = calculate.calculated(calNum043);
        assert target == ans043;
        target = calculate.calculated(calNum044);
        assert target == ans044;
        target = calculate.calculated(calNum045);
        assert target == ans045;

        target = calculate.calculated(calNum05);
        assert target == ans05;
        target = calculate.calculated(calNum051);
        assert target == ans051;
        target = calculate.calculated(calNum06);
        assert target == ans06;

        target = calculate.calculated(calNum07);
        DecimalFormat j = new DecimalFormat("#.00000");
        String eeee = j.format(target);
        assert eeee.equals(String.valueOf(ans07));

        target = calculate.calculated(calNum08);
        j = new DecimalFormat("#.000");
        eeee = j.format(target);
        assert eeee.equals(String.valueOf(ans08));

        target = calculate.calculated(calNum09);
        assert target == ans09;
        target = calculate.calculated(calNum10);
        //assert target == ans10;
        target = calculate.calculated(calNum11);
        assert target == ans11;
        target = calculate.calculated(calNum12);
        //assert target == ans12;
        target = calculate.calculated(calNum13);
        assert target == ans13;
        //target = calculate.calculated(calNum14);
        //assert target == ans14;
    }

    String calNum01 = "(2+3*5)*(";//括号不匹配
    double ans01 = Integer.MIN_VALUE;
    String calNum011 = "";//括号不匹配
    double ans011 = Integer.MIN_VALUE;
    String calNum012 = null;//括号不匹配
    double ans012 = Integer.MIN_VALUE;
    String calNum02 = "(5/3*( 3+3)";//括号不匹配
    double ans02 = Integer.MIN_VALUE;
    String calNum03 = "(4*6 )+(2+/ 3+   4   -5)";//运算符多余
    double ans03 = Integer.MIN_VALUE;
    String calNum04 = "2*(.23+4)";//小数点不匹配
    double ans04 = Integer.MIN_VALUE;
    String calNum042 = "2*(1.23+0   .0.4)";//数字，小数点不匹配
    double ans042 = Integer.MIN_VALUE;
    String calNum043 = "2*(1.2 .3+0  4)";//数字，小数点不匹配
    double ans043 = Integer.MIN_VALUE;
    String calNum044 = "2*(=1.23+04)";//非仅含数字和运算符
    double ans044 = Integer.MIN_VALUE;
    String calNum045 = "2*(1.2d3+0j4)";//非仅含数字和运算符
    double ans045 = Integer.MIN_VALUE;

    String calNum05 = "2 + 3 * 6 / 2 + 8";//36*2/2+8+
    double ans05 = 19;
    String calNum051 = "2 + 03 * 6 / 002 + 8";
    double ans051 = 19;
    String calNum06 = "2.1 5+3.45*  6/2+        8.1";
    double ans06 = 20.6;
    String calNum07 = "(2.15+3.451 77)*6/2+ 8.1-(2.1  7 *45-2*3)";
    double ans07 = -66.74469;
    String calNum08 = "23.6    7+12.41*(2.3 +5.90)+(12/2   +   3.41)*(8  /4+3-6/2)";
    double ans08 = 144.252;
    String calNum09 = "102 + 3 * 6 / 2 + 10008";
    double ans09 = 10119;

    String calNum10 = "5*7/15*3";
    double ans10 = 7;
    String calNum11 = "90+100-101-190";
    double ans11 = -101;
    String calNum12 = "12*(8/(2*4))/2*(((8/4+7)/9)+3/3+2*2*2)";
    double ans12 = 60;
    String calNum13 = "1*2*3*4*5";
    double ans13 = 120;
    String calNum14 = "6*6*6*6*6/36/216";//66*6*6*6*36/216/
    double ans14 = 1;
}