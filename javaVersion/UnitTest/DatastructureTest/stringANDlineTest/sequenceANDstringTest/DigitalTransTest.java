package UnitTest.DatastructureTest.stringANDlineTest.sequenceANDstringTest;

import DataStructure.stringANDline.sequenceANDstring.DigitalTrans;
import org.junit.Test;

/**
 * @author liujun
 * @date 2020-02-26 09:21
 * @description 人民币大小写转换 测试案例
 */
public class DigitalTransTest {

    DigitalTrans digitalTrans = new DigitalTrans();

    @Test
    public void Testtrans() throws Exception {
        String ans = digitalTrans.trans(Demo01);
        assert ans.equals("壹仟圆零壹分");
        ans = digitalTrans.trans(Demo011);
        assert ans.equals("壹仟圆零壹分");
        ans = digitalTrans.trans(Demo02);
        assert ans.equals("零圆");
        ans = digitalTrans.trans(Demo021);
        assert ans.equals("ERROR");
        ans = digitalTrans.trans(Demo022);
        assert ans.equals("ERROR");
        ans = digitalTrans.trans(Demo023);
        assert ans.equals("贰毫");
        ans = digitalTrans.trans(Demo03);
        assert ans.equals("伍万零壹圆零壹毫");
        ans = digitalTrans.trans(Demo04);
        assert ans.equals("壹圆");
        ans = digitalTrans.trans(Demo05);
        assert ans.equals("叁拾肆万玖仟柒佰陆拾圆零贰分壹毫");
        ans = digitalTrans.trans(Demo06);
        assert ans.equals("伍亿零伍拾万零捌佰肆拾陆圆零贰分叁毫");
        ans = digitalTrans.trans(Demo061);
        assert ans.equals("壹仟零贰亿叁仟万零肆佰伍拾陆圆零叁厘");
        ans = digitalTrans.trans(Demo07);
        assert ans.equals("ERROR");
        ans = digitalTrans.trans(Demo08);
        assert ans.equals("ERROR");
        ans = digitalTrans.trans(Demo09);
        assert ans.equals("ERROR");
    }

    String Demo01 = "1000.0100 ";
    String Demo011 = "10  00.0  1  00 ";
    String Demo02 = "0";
    String Demo021 = "000000";
    String Demo022 = "000001";
    String Demo023 = "0.0020";
    String Demo03 = " 50001.0010";
    String Demo04 = "1";
    String Demo05 = " 349760.021 ";
    String Demo06 = "500500846.023";
    String Demo061 = "100230 000456.0003";

    String Demo07 = "15mkl6";
    String Demo08 = "005469.16";
    String Demo09 = "-1";
}
