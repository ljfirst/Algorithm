package UnitTest.DatastructureTest.stringANDlineTest.slidingWindowTest;

import DataStructure.stringANDline.slidingWindow.MinCoverSubstring;
import UnitTest.DatastructureTest.stringANDlineTest.StringData4Test;
import org.junit.Test;

/**
 * @author liujun
 * @version 1.0
 * @date 2020/6/23
 * @author—Email liujunfirst@outlook.com
 * @blogURL https://blog.csdn.net/ljfirst
 * @description 测试用例： 最小覆盖子串
 */
public class MinCoverSubstringTest extends StringData4Test {

    MinCoverSubstring m = new MinCoverSubstring();

    @Test
    public void testfindMinSubString(){
        String s = m.findMinSubString(source01,target01);
        assert s.equals(pattern012);
        s = m.findMinSubString(source02,target02);
        assert s.equals(pattern012);
        s = m.findMinSubString(source022,target022);
        assert s.equals(pattern0122);

        s = m.findMinSubString(source03,target345);
        assert s.equals(pattern0345);
        s = m.findMinSubString(source04,target345);
        assert s.equals(pattern0345);
        s = m.findMinSubString(source05,target345);
        assert s.equals(pattern0345);

        s = m.findMinSubString(source06,target678);
        assert s.equals(pattern0678);
        s = m.findMinSubString(source07,target678);
        assert s.equals(pattern0678);
        s = m.findMinSubString(source08,target678);
        assert s.equals(pattern0678);

        s = m.findMinSubString(source09,target09);
        assert s.equals(pattern09);

        s = m.findMinSubString(source10,target10);
        assert s.equals(pattern10);
    }
}
