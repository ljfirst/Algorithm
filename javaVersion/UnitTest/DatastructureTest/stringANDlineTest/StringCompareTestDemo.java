package UnitTest.DatastructureTest.stringANDlineTest;

import DataStructure.stringANDline.stringCompare.StringCompare;

/**
 * @author liujun
 * @version 1.0
 * @date 2020-01-31 23:11
 * @author��Email liujunfirst@outlook.com
 * @description
 * @blogURL
 */
public class StringCompareTestDemo {

    public void testCompare(StringCompare stringCompare) {
        //正案例
        boolean flag = stringCompare.compare(source01, pattern01);
        assert flag;
        flag = stringCompare.compare(source02, pattern02);
        assert flag;
        flag = stringCompare.compare(source03, pattern03);
        assert flag;
        flag = stringCompare.compare(source04, pattern04);
        assert flag;
        flag = stringCompare.compare(source05, pattern05);
        assert flag;
        flag = stringCompare.compare(source06, pattern06);
        assert flag;
        flag = stringCompare.compare(source07, pattern07);
        assert flag;
        //反案例
        flag = stringCompare.compare(source01f, pattern01f);
        assert !flag;
        flag = stringCompare.compare(source02f, pattern02f);
        assert !flag;
        flag = stringCompare.compare(source03f, pattern03f);
        assert !flag;
        flag = stringCompare.compare(source04f, pattern04f);
        assert !flag;
        flag = stringCompare.compare(source05f, pattern05f);
        assert !flag;
        flag = stringCompare.compare(source06f, pattern06f);
        assert !flag;
    }


    //正案例
    String source01 = "12345ui6789";
    String pattern01 = "ui";
    String source02 = "12345uri67we89";
    String pattern02 = "we";
    String source03 = "123rt45uri6789";
    String pattern03 = "rt";
    String source04 = "dthggvjff==1vyugbuiy1==ufxewzqaszdxcvbpo";
    String pattern04 = "==1vyugbuiy1==";
    String source05 = "dthggvjff==1vyugbuiy1==ufxewzqaszdxcvbpo";
    String pattern05 = "1vyugbuiy1";
    String source06 = "dthggvjfxewzqaszdxcp5765pvbpo";
    String pattern06 = "p5765p";
    String source07 = "dthggvjfxewzqaspp737pzdxcp5765pvbpopp37p";
    String pattern07 = "pp37p";

    //反案例
    String source01f = "12uw3wi345uri6789";
    String pattern01f = "uir";
    String source02f = "12345uri6u4i789";
    String pattern02f = "ui";
    String source03f = "12345uri67f34g3b5n689";
    String pattern03f = "f34gb5n6";
    String source04f = "dthggvjff==1vyugbuiy1==ufxewzqaszdxcvbpo";
    String pattern04f = "=1=1vyugbuiy1==";
    String source05f = "20413";
    String pattern05f = "12340202411322";
    String source06f = "20413";
    String pattern06f = null;
}
