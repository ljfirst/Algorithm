package UnitTest.DatastructureTest.stringANDlineTest.sequenceANDstringTest;

import DataStructure.stringANDline.sequenceANDstring.FindShortString;

/**
 * @author liujun
 * @version 1.0
 * @date 2020/8/21
 * @author—Email liujunfirst@outlook.com
 * @blogURL https://blog.csdn.net/ljfirst
 * @description 测试用例
 * 在给定字符串中找出最小循环的字符串
 */
public class FindShortStringTest {

    FindShortString fs = new FindShortString();

    public void testcomp() {
        String s = fs.comp(source01);
        assert target01.equals(s);
        s = fs.comp(source02);
        assert target02.equals(s);
        s = fs.comp(source03);
        assert target03.equals(s);
        s = fs.comp(source04);
        assert target04.equals(s);
        s = fs.comp(source05);
        assert target05.equals(s);
        s = fs.comp(source06);
        assert target06.equals(s);
        s = fs.comp(source07);
        assert target07.equals(s);
        s = fs.comp(source08);
        assert target08.equals(s);
    }

    String source01 = "123412341234123412341234";
    String target01 = "1234";
    String source02 = "123412341234123412341";
    String target02 = "1234";
    String source03 = "45678iuhgfse456yhjmklo8uyt";
    String target03 = "45678iuhgfse456yhjmklo8uyt";
    String source04 = "45678iuhgfse456yhjmklo8uyt45678iuhgfse456yhjmklo8uyt";
    String target04 = "45678iuhgfse456yhjmklo8uyt";
    String source05 = "45678iuhgfse456yhjmklo8uyt45678iuhgfse456yhjmklo8uyt45678iuhgfse456";
    String target05 = "45678iuhgfse456yhjmklo8uyt";
    String source06 = "45678iuhgfse456yhjmklo8uyt45678iuhgfse4";
    String target06 = "45678iuhgfse456yhjmklo8uyt";

    String source07 = null;
    String target07 = null;
    String source08 = "";
    String target08 = null;
}
