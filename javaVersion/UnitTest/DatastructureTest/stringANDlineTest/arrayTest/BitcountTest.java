package UnitTest.DatastructureTest.stringANDlineTest.arrayTest;

import DataStructure.stringANDline.array.arrayApply.Bitcount;
import org.junit.Test;

/**
 * @author liujun
 * @version 1.0
 * @date 2020/11/30
 * @author—Email liujunfirst@outlook.com
 * @blogURL https://blog.csdn.net/ljfirst
 * @description
 */
public class BitcountTest {

    Bitcount bitcount = new Bitcount();

    @Test
    public void testmethod() {
        //-1 包括符号位，一个32个1
        int i = -1;
        bitcount.byteCountComplementMethod1(i);
        bitcount.byteCountComplementMethod2(i);
        bitcount.byteCountComplementMethod3(i);

        System.out.println((1 >>> 1));
        System.out.println((15 >>> 1));
        System.out.println((3 >>> 1));
        System.out.println((5 >>> 1));
        System.out.println((9 >>> 1));
    }
}
