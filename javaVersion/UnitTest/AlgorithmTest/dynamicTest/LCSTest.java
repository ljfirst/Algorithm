package UnitTest.AlgorithmTest.dynamicTest;

import Algorithm.dynamic.lcs.LCS_Dynamic;
import Algorithm.dynamic.lcs.LCS_Interface;
import Algorithm.dynamic.lcs.LCS_optimize;
import org.junit.Test;

/**
 * @author liujun
 * @version 1.0
 * @date 2019-11-25 16:38
 * @author—Email liujunfirst@outlook.com
 * @description 最长公共子序列
 * @blogURL
 */
public class LCSTest {

    @Test
    public void testLCS(){
        testCount(new LCS_Dynamic());
    }

    @Test
    public void testLCS_optimize(){
        testCount(new LCS_optimize());
    }


    public void testCount(LCS_Interface lcs_interface) {

        lcs_interface.count(demo01, demo01_comp);
        String result = lcs_interface.getCommondString();
        int length = lcs_interface.getCommondLength();
        assert result.equals("");
        assert length == 0;

        lcs_interface.count(demo02, demo02_comp);
        result = lcs_interface.getCommondString();
        length = lcs_interface.getCommondLength();
        assert result.equals("");
        assert length == 0;

        lcs_interface.count(demo03, demo03_comp);
        result = lcs_interface.getCommondString();
        length = lcs_interface.getCommondLength();
        assert result.equals("");
        assert length == 0;

        lcs_interface.count(demo04, demo04_comp);
        result = lcs_interface.getCommondString();
        length = lcs_interface.getCommondLength();
        assert result.equals("");
        assert length == 0;

        lcs_interface.count(demo05, demo05_comp);
        result = lcs_interface.getCommondString();
        length = lcs_interface.getCommondLength();
        assert result.equals("abcdefg");
        assert length == 7;

        lcs_interface.count(demo06, demo06_comp);
        result = lcs_interface.getCommondString();
        length = lcs_interface.getCommondLength();
        assert result.equals("sdfhhhkl");
        assert length == 8;
    }

    //测试用例
    String demo01 = "aaa";
    String demo01_comp = "bbb";//无相似部分，测试结果为空串：“”

    String demo02 = "";
    String demo02_comp = "bbb";//无相似部分，测试结果为空串：“”

    String demo03 = "aaa";
    String demo03_comp = "";//无相似部分，测试结果为空串：“”

    String demo04 = null;
    String demo04_comp = "";//无相似部分，测试结果为空串：“”

    String demo05 = "1a2b3c4d5e6f7g8";
    String demo05_comp = "9a9b9c9d9e9f9g9";//测试结果为：“abcdefg”

    String demo06 = "1sd3445fh677hhk898777l";
    String demo06_comp = "2sd2b22fhzbzzhzhkblb";//测试结果为：“sdfhhhkl”
}
