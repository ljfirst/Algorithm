package UnitTest.LogicTest.logictest;

import DataStructure.stringANDline.array.arrayApply.SaleStocks;
import org.junit.Test;

/**
 * @author liujun
 * @version 1.0
 * @date 2020-02-08 19:41
 * @author—Email liujunfirst@outlook.com
 * @description 
 * @blogURL
 */
public class SaleStocksTest {

    SaleStocks saleStocks = new SaleStocks();

    @Test
    public void testjustAllowOnce(){
        //once
        int answer = saleStocks.justAllowOnce(demo01);
        assert answer == answerOnce01;
        answer = saleStocks.justAllowOnce(demo02);
        assert answer == answerOnce02;
        answer = saleStocks.justAllowOnce(demo03);
        assert answer == answerOnce03;
        answer = saleStocks.justAllowOnce(demo04);
        assert answer == answerOnce04;
        answer = saleStocks.justAllowOnce(demo05);
        assert answer == answerOnce05;
    }

    @Test
    public void testallowMany(){
        //many
        int answer = saleStocks.allowMany(demo01);
        assert answer == answerMany01;
        answer = saleStocks.allowMany(demo02);
        assert answer == answerMany02;
        answer = saleStocks.allowMany(demo03);
        assert answer == answerMany03;
        answer = saleStocks.allowMany(demo04);
        assert answer == answerMany04;
        answer = saleStocks.allowMany(demo05);
        assert answer == answerMany05;
    }

    //Demo
    int[] demo01 = {1,2,3,4,5,6,7};
    int answerOnce01 = 6;
    int answerMany01 =  6;

    int[] demo02 = {};
    int answerOnce02 = 0;
    int answerMany02 =  0;

    int[] demo03 = {3,4,7,5,6,9,11,19,13,11,4,5,6,8,10,12,9,7,4,5};
    int answerOnce03 = 16;
    int answerMany03 =  27;

    int[] demo04 = {20,45,5,16};
    int answerOnce04 = 25;
    int answerMany04 =  36;

    int[] demo05 = {16};
    int answerOnce05 = 0;
    int answerMany05 =  0;
}
