package UnitTest.AlgorithmTest.combineTest.choirTest;

import Algorithm.comprehensive.choir.Choir;

/**
 * @author liujun
 * @version 1.0
 * @date 2020-02-12 09:38
 * @author—Email  liujunfirst@outlook.com
 * @description 
 * @blogURL
 */
public class ChoirTestDemo {

    public void TestgetMaxValue(Choir choir) {
        int value = choir.getMaxValue(PowerDemo01, ChoseNum, intervald);
        assert value == BestValueDemo01;
        value = choir.getMaxValue(PowerDemo02, ChoseNum, intervald);
        assert value == BestValueDemo02;
        value = choir.getMaxValue(PowerDemo03, ChoseNum, intervald);
        assert value == BestValueDemo03;
        value = choir.getMaxValue(PowerDemo04, ChoseNum, intervald);
        assert value == BestValueDemo04;
        value = choir.getMaxValue(PowerDemo05, ChoseNum, intervald);
        assert value == BestValueDemo05;
        value = choir.getMaxValue(PowerDemo06, ChoseNum, intervald);
        assert value == BestValueDemo06;
        value = choir.getMaxValue(PowerDemo07, ChoseNum, intervald);
        assert value == BestValueDemo07;
    }

    //设置学生数量：K 和间距：D
    int ChoseNum = 5;
    int intervald = 5;
    //能力值
    int[] PowerDemo01 = {};
    int[] PowerDemo02 = null;
    int[] PowerDemo03 = {1, 5, 9, 7, 5, 3, 2, 8, 4, 6};
    int[] PowerDemo04 = {1, 5, -9, 7, 5, -3, 2, 8, 4, 6};
    int[] PowerDemo05 = {1, 5, -9, 7, 5, -3, 2, -8, 4, 6};
    int[] PowerDemo06 = {1, 5, -9, 7, 0, -3, 2, -8, 0, 4, 6, 5};
    int[] PowerDemo07 = {9,1,1,1,1,1,9,1,1,9,1,1,9,9};

    int BestValueDemo01 = -1;
    int BestValueDemo02 = -1;
    int BestValueDemo03 = 15120;
    int BestValueDemo04 = 9072;
    int BestValueDemo05 = 15120;
    int BestValueDemo06 = 15120;
    int BestValueDemo07 = 6561;
}
