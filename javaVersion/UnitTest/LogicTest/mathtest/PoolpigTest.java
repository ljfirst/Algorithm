package UnitTest.LogicTest.mathtest;

import Logic.math.Poolpig;
import org.junit.Test;

/**
 * @author liujun
 * @version 1.0
 * @date 2019-12-03 20:09
 * @author—Email  liujunfirst@outlook.com
 * @description 
 * @blogURL
 */
public class PoolpigTest {

    Poolpig poolpig = new Poolpig();
    @Test
    public void testneedNum(){
        int needNum = poolpig.needNum(bucketNum01, alivetime01, givenTime01);
        assert needNum == 1;
        needNum = poolpig.needNum(bucketNum02, alivetime02, givenTime02);
        assert needNum == 2;
        needNum = poolpig.needNum(bucketNum03, alivetime03, givenTime03);
        assert needNum == 5;

        needNum = poolpig.needNum(bucketNum04, alivetime04, givenTime04);
        assert needNum == 0;
        needNum = poolpig.needNum(bucketNum05, alivetime05, givenTime05);
        assert needNum == 0;
        needNum = poolpig.needNum(bucketNum06, alivetime06, givenTime06);
        assert needNum == 10;
        needNum = poolpig.needNum(bucketNum07, alivetime07, givenTime07);
        assert needNum == 1;
        needNum = poolpig.needNum(bucketNum08, alivetime08, givenTime08);
        assert needNum == 1;
    }

    int bucketNum01 = 5;//毒桶
    int alivetime01 = 15;//毒发时间
    int givenTime01 = 60;//给定的测试时间

    int bucketNum02 = 25;//毒桶
    int alivetime02 = 15;//毒发时间
    int givenTime02 = 60;//给定的测试时间

    int bucketNum03 = 1000;//毒桶
    int alivetime03 = 15;//毒发时间
    int givenTime03 = 60;//给定的测试时间

    //反案例
    int bucketNum04 = 1000;//有毒桶
    int alivetime04 = 60;//毒发时间
    int givenTime04 = 10;//给定的测试时间

    int bucketNum05 = 1000;//有毒桶
    int alivetime05 = -1;//毒发时间
    int givenTime05 = 10;//给定的测试时间

    //正案例
    int bucketNum06 = 1000;//有毒桶
    int alivetime06 = 11;//毒发时间
    int givenTime06 = 20;//给定的测试时间

    int bucketNum07 = 1;//有毒桶
    int alivetime07 = 11;//毒发时间
    int givenTime07 = 20;//给定的测试时间

    int bucketNum08 = 2;//有毒桶
    int alivetime08 = 1;//毒发时间
    int givenTime08 = 20;//给定的测试时间
}
