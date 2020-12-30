package UnitTest.DatastructureTest.stringANDlineTest.arrayTest.arrayOpsTest;

import DataStructure.stringANDline.array.arrayOps.BigIntegersMulti;
import org.junit.Test;

/**
 * @author liujun
 * @version 1.0
 * @date 2020/5/15
 * @author-Email liujunfirst@outlook.com
 * @blogURL https://blog.csdn.net/ljfirst
 * @description 大整数乘法 测试案例
 */
public class BigIntegersMultiTest {

    BigIntegersMulti bigIntegersMulti = new BigIntegersMulti();

    @Test
    public void testmulti() {

        //12345679 * 12345679 = 152415789971041
        String s1 = "-12345679", s2 = "-12345679";
        String s3 = bigIntegersMulti.multi(s1, s2);
        assert s3.equals("152415789971041");
        //12345679 * -12345679 = -152415789971041
        s1 = "12345679";
        s2 = "-12345679";
        s3 = bigIntegersMulti.multi(s1, s2);
        assert s3.equals("-152415789971041");
        //以9结尾的数相乘，有特殊规律
        StringBuffer sb = new StringBuffer();
        StringBuffer sb1 = new StringBuffer();
        sb.append(9);
        for (int i = 1; i < 20; i++) {
            sb.append(9);
            s3 = bigIntegersMulti.multi(sb.toString(), sb.toString());

            //规律
            for (int j = 0; j < i; j++) {
                sb1.append(9);
            }
            sb1.append(8);
            for (int j = 0; j < i; j++) {
                sb1.append(0);
            }
            sb1.append(1);

            assert s3.equals(sb1.toString());
            sb1 = new StringBuffer();
        }
    }
}
