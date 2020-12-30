package UnitTest.DatastructureTest.stringANDlineTest.arrayTest.arrayOpsTest;

import DataStructure.stringANDline.array.arrayOps.Bitcount;
import org.junit.Test;

/**
 * @author liujun
 * @version 1.0
 * @date 2020/11/30
 * @author—Email liujunfirst@outlook.com
 * @blogURL https://blog.csdn.net/ljfirst
 * @description 计算bit位 测试案例
 */
public class BitcountTest {

    Bitcount bitcount = new Bitcount();

    @Test
    public void testmethod() {
        //-1 包括符号位，一共32个1
        int i = -1;
        int count = bitcount.byteCountComplementMethod1(i);
        assert  count == 32;
        count = bitcount.byteCountComplementMethod2(i);
        assert count == 32;
        count = bitcount.byteCountComplementMethod3(i);
        assert count == 32;

        //7，一共3个1
        i = 7;
        count = bitcount.byteCountComplementMethod1(i);
        assert  count == 3;
        count = bitcount.byteCountComplementMethod2(i);
        assert count == 3;
        count = bitcount.byteCountComplementMethod3(i);
        assert count == 3;


    }
}
