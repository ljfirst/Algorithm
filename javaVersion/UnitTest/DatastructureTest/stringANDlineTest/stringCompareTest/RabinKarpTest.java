package UnitTest.DatastructureTest.stringANDlineTest.stringCompareTest;

import DataStructure.stringANDline.stringCompare.RabinKarp;
import UnitTest.DatastructureTest.stringANDlineTest.StringCompareTestDemo;
import org.junit.Test;

/**
 * @author liujun
 * @version 1.0
 * @date 2019-12-06 22:54
 * @author��Email  liujunfirst@outlook.com
 * @description 
 * @blogURL
 */
public class RabinKarpTest extends StringCompareTestDemo {

    @Test//�����ƺ�������ѡ���й�ϵ
    public void testCompare(){
        super.testCompare(new RabinKarp());
    }



    public void testcomparemethod(){//δ����
        RabinKarp rabinKarp = new RabinKarp();
        //rabinKarp.compare(String source, String target, int prime, int HEX);
    }
}
