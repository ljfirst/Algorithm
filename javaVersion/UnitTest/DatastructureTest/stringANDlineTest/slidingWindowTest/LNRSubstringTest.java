package UnitTest.DatastructureTest.stringANDlineTest.slidingWindowTest;

import DataStructure.stringANDline.slidingWindow.LNRSubstring;
import org.junit.Test;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author liujun
 * @author Email liujunfirst@outlook.com
 * @version 1.0
 * @date 2019-11-06 00:06
 * @description 测试用例： 最长无重复子串
 */
public class LNRSubstringTest {

    LNRSubstring lnrSubstring = new LNRSubstring();
    @Test
    public void testLNRSubstring() throws ClassNotFoundException, InvocationTargetException, IllegalAccessException {
        Class c = Class.forName("DataStructure.stringANDline.slidingWindow.LNRSubstring");
        Method[] m = c.getMethods();
        for (Method m1 : m) {
            if (m1.getName().contains("lengthOfLongestSubstring")) {
                int length = (int) m1.invoke(lnrSubstring, demo01);
                assert length == 3;
                length = (int) m1.invoke(lnrSubstring, demo02);
                assert length == 2;
                length = (int) m1.invoke(lnrSubstring, demo03);
                assert length == 9;

                length = (int) m1.invoke(lnrSubstring, demo04);
                assert length == 0;
                length = (int) m1.invoke(lnrSubstring, demo05);
                assert length == 0;
                length = (int) m1.invoke(lnrSubstring, demo06);
                assert length == 10;
                length = (int) m1.invoke(lnrSubstring, demo07);
                assert length == 8;
                length = (int) m1.invoke(lnrSubstring, demo08);
                assert length == 36;
                length = (int) m1.invoke(lnrSubstring, demo09);
                assert length == 1;
                length = (int) m1.invoke(lnrSubstring, demo10);
                assert length == 3;
                length = (int) m1.invoke(lnrSubstring, demo11);
                assert length == 16;
            }
        }
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
    String demo10 = "aabaab!bb";
    String demo11 = "12345678912345678abcdefg";

}
