package UnitTest.DatastructureTest.stringANDlineTest.sequenceANDstringTest;

import DataStructure.stringANDline.slidingWindow.LNRSubstring;
import org.junit.Test;

/**
 * @author liujun
 * @version 1.0
 * @date 2019-11-06 00:06
 * @author Email liujunfirst@outlook.com
 * @description  测试用例： 最长无重复子串
 */
public class LNRSubstringTest {

    LNRSubstring lnrSubstring = new LNRSubstring();

    @Test
    public void testLNRSubstring() {
        int length = lnrSubstring.lengthOfLongestSubstring(demo01);
        assert length == 3;
        length = lnrSubstring.lengthOfLongestSubstring(demo02);
        assert length == 2;
        length = lnrSubstring.lengthOfLongestSubstring(demo03);
        assert length == 9;

        length = lnrSubstring.lengthOfLongestSubstring(demo04);
        assert length == 0;
        length = lnrSubstring.lengthOfLongestSubstring(demo05);
        assert length == 0;
        length = lnrSubstring.lengthOfLongestSubstring(demo06);
        assert length == 10;
        length = lnrSubstring.lengthOfLongestSubstring(demo07);
        assert length == 8;
        length = lnrSubstring.lengthOfLongestSubstring(demo08);
        assert length == 36;
        length = lnrSubstring.lengthOfLongestSubstring(demo09);
        assert length == 1;
    }

    @Test
    public void testLNRSubstring2(){
        int length = lnrSubstring.lengthOfLongestSubstring2(demo01);
        assert length == 3;
        length = lnrSubstring.lengthOfLongestSubstring2(demo02);
        assert length == 2;
        length = lnrSubstring.lengthOfLongestSubstring2(demo03);
        assert length == 9;

        length = lnrSubstring.lengthOfLongestSubstring2(demo04);
        assert length == 0;
        length = lnrSubstring.lengthOfLongestSubstring2(demo05);
        assert length == 0;
        length = lnrSubstring.lengthOfLongestSubstring2(demo06);
        assert length == 10;
        length = lnrSubstring.lengthOfLongestSubstring2(demo07);
        assert length == 8;
        length = lnrSubstring.lengthOfLongestSubstring2(demo08);
        assert length == 36;
        length = lnrSubstring.lengthOfLongestSubstring2(demo09);
        assert length == 1;
    }

    @Test
    public void testLNRSubstring3(){
        int length = lnrSubstring.lengthOfLongestSubstring3(demo01);
        assert length == 3;
        length = lnrSubstring.lengthOfLongestSubstring3(demo02);
        assert length == 2;
        length = lnrSubstring.lengthOfLongestSubstring3(demo03);
        assert length == 9;

        length = lnrSubstring.lengthOfLongestSubstring3(demo04);
        assert length == 0;
        length = lnrSubstring.lengthOfLongestSubstring3(demo05);
        assert length == 0;
        length = lnrSubstring.lengthOfLongestSubstring3(demo06);
        assert length == 10;
        length = lnrSubstring.lengthOfLongestSubstring3(demo07);
        assert length == 8;
        length = lnrSubstring.lengthOfLongestSubstring3(demo08);
        assert length == 36;
        length = lnrSubstring.lengthOfLongestSubstring3(demo09);
        assert length == 1;
    }
    String demo01 = "pwwkew";
    String demo02 = "aassddffgghh";
    String demo03 = "aasdfghjkll";
    String demo04 = "";
    String demo05 = null;
    String demo06 = "abcdefggggff1123456789011aa2s3d4f5";
    String demo07 = "yhbnhyuhbn1123456788aasdfghjkk890890";
    String demo08 = "1234567890azsxdcfvgbhnjmklpoiuytrewq";
    String demo09 = "1111111111111111111";

}
