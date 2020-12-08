package UnitTest.DatastructureTest.stringANDlineTest.arrayTest.arrayApplyTest;

import DataStructure.stringANDline.array.arrayApply.AlphaCaseSwap;
import org.junit.Test;

/**
 * @author liujun
 * @version 1.0
 * @date 2020/12/8
 * @author—Email liujunfirst@outlook.com
 * @blogURL https://blog.csdn.net/ljfirst
 * @description 大小写互换 测试案例
 */
public class AlphaCaseSwapTest {

    AlphaCaseSwap alphaCaseSwap = new AlphaCaseSwap();

    @Test
    public void testtrans() {
        String s = alphaCaseSwap.trans(demo01);
        assert target01.equals(s);
        s = alphaCaseSwap.trans(demo02);
        assert target02.equals(s);
        s = alphaCaseSwap.trans(demo03);
        assert s.equals(target03);
        s = alphaCaseSwap.trans(demo04);
        assert s.equals(target04);
        s = alphaCaseSwap.trans(demo05);
        assert s.equals(target05);
        s = alphaCaseSwap.trans(demo06);
        assert s.equals(target06);
    }

    @Test
    public void testtrans1() {
        String s = alphaCaseSwap.trans1(demo01);
        assert target01.equals(s);
        s = alphaCaseSwap.trans1(demo02);
        assert target02.equals(s);
        s = alphaCaseSwap.trans1(demo03);
        assert s.equals(target03);
        s = alphaCaseSwap.trans1(demo04);
        assert s.equals(target04);
        s = alphaCaseSwap.trans1(demo05);
        assert s.equals(target05);
        s = alphaCaseSwap.trans1(demo06);
        assert s.equals(target06);
    }

    public String demo01 = "";
    public String target01 = "";
    public String demo02 = null;
    public String target02 = "";
    public String demo03 = "qATFxwwGHJffftIUG";
    public String target03 = "atfghjiugQXWWFFFT";
    public String demo04 = "TFGHUJKfvjml9876";
    public String target04 = "tfghujk9876FVJML";
    public String demo05 = "bcdA";
    public String target05 = "aBCD";
    public String demo06 = "CGYVHBJEFDBJNVFDUkigflhgfyufvjk";
    public String target06 = "cgyvhbjefdbjnvfduKIGFLHGFYUFVJK";
}
