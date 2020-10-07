package UnitTest.AlgorithmTest.dynamicTest;

import Algorithm.dynamic.NumReduceMaxMulti;
import org.junit.Test;

public class NumReduceMaxMultiTest {

    NumReduceMaxMulti numReduceMaxMulti = new NumReduceMaxMulti();

    @Test
    public void testreduce() {
        int value = numReduceMaxMulti.reduce(Demonum01);
        assert value == Answer01;
        value = numReduceMaxMulti.reduce(Demonum02);
        assert value == Answer02;
        value = numReduceMaxMulti.reduce(Demonum03);
        assert value == Answer03;
        value = numReduceMaxMulti.reduce(Demonum04);
        assert value == Answer04;
        value = numReduceMaxMulti.reduce(Demonum05);
        assert value == Answer05;
        value = numReduceMaxMulti.reduce(Demonum06);
        assert value == Answer06;
        value = numReduceMaxMulti.reduce(Demonum07);
        assert value == Answer07;
        value = numReduceMaxMulti.reduce(Demonum08);
        assert value == Answer08;
        value = numReduceMaxMulti.reduce(Demonum09);
        assert value == Answer09;
        value = numReduceMaxMulti.reduce(Demonum10);
        assert value == Answer10;
        value = numReduceMaxMulti.reduce(Demonum011);
        assert value == Answer011;
        value = numReduceMaxMulti.reduce(Demonum022);
        assert value == Answer022;
    }
    @Test
    public void testreduceMath() {
        int value = numReduceMaxMulti.reduceMath(Demonum01);
        assert value == Answer01;
        value = numReduceMaxMulti.reduceMath(Demonum02);
        assert value == Answer02;
        value = numReduceMaxMulti.reduceMath(Demonum03);
        assert value == Answer03;
        value = numReduceMaxMulti.reduceMath(Demonum04);
        assert value == Answer04;
        value = numReduceMaxMulti.reduceMath(Demonum05);
        assert value == Answer05;
        value = numReduceMaxMulti.reduceMath(Demonum06);
        assert value == Answer06;
        value = numReduceMaxMulti.reduceMath(Demonum07);
        assert value == Answer07;
        value = numReduceMaxMulti.reduceMath(Demonum08);
        assert value == Answer08;
        value = numReduceMaxMulti.reduceMath(Demonum09);
        assert value == Answer09;
        value = numReduceMaxMulti.reduceMath(Demonum10);
        assert value == Answer10;
        value = numReduceMaxMulti.reduceMath(Demonum011);
        assert value == Answer011;
        value = numReduceMaxMulti.reduceMath(Demonum022);
        assert value == Answer022;
    }
    int Demonum011 = 0;
    int Answer011 = 0;
    int Demonum022 = -1;
    int Answer022 = -1;

    int Demonum01 = 1;
    int Answer01 = 1;
    int Demonum02 = 2;
    int Answer02 = 1;
    int Demonum03 = 3;
    int Answer03 = 2;
    int Demonum04 = 4;
    int Answer04 = 4;
    int Demonum05 = 5;
    int Answer05 = 6;
    int Demonum06 = 6;
    int Answer06 = 9;
    int Demonum07 = 7;
    int Answer07 = 12;
    int Demonum08 = 8;
    int Answer08 = 18;
    int Demonum09 = 9;
    int Answer09 = 27;
    int Demonum10 = 10;
    int Answer10 = 36;
}
