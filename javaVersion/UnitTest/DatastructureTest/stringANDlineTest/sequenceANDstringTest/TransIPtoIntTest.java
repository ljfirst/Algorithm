package UnitTest.DatastructureTest.stringANDlineTest.sequenceANDstringTest;

import DataStructure.stringANDline.sequenceANDstring.TransIPtoInt;
import org.junit.Test;

/**
 * @author liujun
 * @version 1.0
 * @date 2020/3/16
 * @author—Email liujunfirst@outlook.com
 * @blogURL https://blog.csdn.net/ljfirst
 * @description 将string类型的IP地址转化成int
 */
public class TransIPtoIntTest {

    TransIPtoInt transIPtoInt = new TransIPtoInt();

    @Test
    public void iPToInttest() {
        long value = transIPtoInt.iPToInt(demoIPString01);
        assert value == demoIPint01;
        value = transIPtoInt.iPToInt(demoIPString02);
        assert value == demoIPint02;
        value = transIPtoInt.iPToInt(demoIPString03);
        assert value == demoIPint03;
        value = transIPtoInt.iPToInt(demoIPString04);
        assert value == demoIPint04;
        value = transIPtoInt.iPToInt(demoIPString05);
        assert value == demoIPint05;
        value = transIPtoInt.iPToInt(demoIPString06);
        assert value == demoIPint06;
        value = transIPtoInt.iPToInt(demoIPString07);
        assert value == demoIPint07;
        value = transIPtoInt.iPToInt(demoIPString08);
        assert value == demoIPint08;
        //反案例
        value = transIPtoInt.iPToInt(demoIPString101);
        long demoIPint101 = -1;
        assert value == demoIPint101;
        value = transIPtoInt.iPToInt(demoIPString102);
        long demoIPint102 = -1;
        assert value == demoIPint102;
        value = transIPtoInt.iPToInt(demoIPString103);
        long demoIPint103 = -1;
        assert value == demoIPint103;
    }

    @Test
    public void intToIPtest() {
        String value = transIPtoInt.intToIP(demoIPint01);
        assert value.equals(demoIPString01);
        value = transIPtoInt.intToIP(demoIPint02);
        assert value.equals(demoIPString02);
        value = transIPtoInt.intToIP(demoIPint03);
        assert value.equals(demoIPString03);
        value = transIPtoInt.intToIP(demoIPint04);
        assert value.equals(demoIPString04);
        value = transIPtoInt.intToIP(demoIPint05);
        assert value.equals(demoIPString05);
        value = transIPtoInt.intToIP(demoIPint06);
        assert value.equals(demoIPString06);
        value = transIPtoInt.intToIP(demoIPint07);
        assert value.equals(demoIPString07);
        value = transIPtoInt.intToIP(demoIPint08);
        assert value.equals(demoIPString08);
    }

    //正案例
    //full表示255.255.255.255，计算结果为：4294967295L;
    long full = 255L * 256L * 256L * 256L + 255L * 256L * 256L + 255L * 256L + 255L;
    long half_full = 255L * 256L * 256L + 255L * 256L + 255L;

    private String demoIPString01 = "0.0.0.0";
    private long demoIPint01 = 0;
    private String demoIPString02 = "255.255.255.255";
    private long demoIPint02 = full;
    private String demoIPString03 = "255.0.0.255";
    private long demoIPint03 = full - half_full + 255L;
    private String demoIPString04 = "0.0.0.1";
    private long demoIPint04 = 1;
    private String demoIPString05 = "255.255.255.254";
    private long demoIPint05 = full - 1;
    private String demoIPString06 = "0.0.0.255";
    private long demoIPint06 = 255;
    private String demoIPString07 = "0.0.1.0";
    private long demoIPint07 = 256;
    private String demoIPString08 = "25.36.15.15";
    private long demoIPint08 = 421793551;

    //反案例
    private String demoIPString101 = "256.0.0.0";
    private String demoIPString102 = "1.2.255.256";
    private String demoIPString103 = "256.0.k.0";
}
