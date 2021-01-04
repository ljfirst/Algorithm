package UnitTest.LogicTest.mathtest;

import DataStructure.arrayANDlist.arrayApply.Poolpig;
import org.junit.Test;

/**
 * @author liujun
 * @version 1.0
 * @date 2019-12-03 20:09
 * @author��Email  liujunfirst@outlook.com
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

    int bucketNum01 = 5;//��Ͱ
    int alivetime01 = 15;//����ʱ��
    int givenTime01 = 60;//�����Ĳ���ʱ��

    int bucketNum02 = 25;//��Ͱ
    int alivetime02 = 15;//����ʱ��
    int givenTime02 = 60;//�����Ĳ���ʱ��

    int bucketNum03 = 1000;//��Ͱ
    int alivetime03 = 15;//����ʱ��
    int givenTime03 = 60;//�����Ĳ���ʱ��

    //������
    int bucketNum04 = 1000;//�ж�Ͱ
    int alivetime04 = 60;//����ʱ��
    int givenTime04 = 10;//�����Ĳ���ʱ��

    int bucketNum05 = 1000;//�ж�Ͱ
    int alivetime05 = -1;//����ʱ��
    int givenTime05 = 10;//�����Ĳ���ʱ��

    //������
    int bucketNum06 = 1000;//�ж�Ͱ
    int alivetime06 = 11;//����ʱ��
    int givenTime06 = 20;//�����Ĳ���ʱ��

    int bucketNum07 = 1;//�ж�Ͱ
    int alivetime07 = 11;//����ʱ��
    int givenTime07 = 20;//�����Ĳ���ʱ��

    int bucketNum08 = 2;//�ж�Ͱ
    int alivetime08 = 1;//����ʱ��
    int givenTime08 = 20;//�����Ĳ���ʱ��
}
