package UnitTest.DatastructureTest.stringANDlineTest.slidingWindowTest;

import DataStructure.stringANDline.slidingWindow.MinCoverSubstring1;
import org.junit.Test;

import java.util.Scanner;

/**
 * @author liujun
 * @version 1.0
 * @date 2020/12/21
 * @author—Email liujunfirst@outlook.com
 * @blogURL https://blog.csdn.net/ljfirst
 * @description 测试用例： 最小覆盖子串
 */
public class MinCoverSubstring1Test {

    MinCoverSubstring1 mc = new MinCoverSubstring1();

    @Test
    public void test() {
        int target = mc.deal(demo01);
        assert target == 3;
        target = mc.deal(demo02);
        assert target == 0;
        target = mc.deal(demo03);
        assert target == 0;
        target = mc.deal(demo04);
        assert target == 1;
        target = mc.deal(demo05);
        assert target == 5;
        target = mc.deal(demo06);
        assert target == 2;
        target = mc.deal(demo07);
        assert target == 11;
    }

    String demo01 = "dcv2jigb3oiuyg4bouy55wertyuioplkjhgfd";
    String demo02 = "";
    String demo03 = "123";
    String demo04 = "asdf";
    String demo05 = "12d34";
    String demo06 = "as2df";
    String demo07 = "1234567890s098765d432f3456g789";

}
