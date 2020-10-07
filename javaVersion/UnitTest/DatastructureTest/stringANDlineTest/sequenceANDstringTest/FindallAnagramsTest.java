package UnitTest.DatastructureTest.stringANDlineTest.sequenceANDstringTest;

import DataStructure.stringANDline.sequenceANDstring.FindallAnagrams;
import org.junit.Test;

import java.util.Arrays;

/**
 * @author liujun
 * @version 1.0
 * @date 2020/6/23
 * @author—Email liujunfirst@outlook.com
 * @blogURL https://blog.csdn.net/ljfirst
 * @description 测试用例 ： 找所有字母异位词
 * 输入一个串S，一个串T，找到S中所有T的排列，返回它们的起始索引
 */
public class FindallAnagramsTest extends StringData4Test {

    FindallAnagrams f = new FindallAnagrams();

    @Test
    public void testprint() {
        int[] a = f.print(source01, target01);
        assert Arrays.equals(a, demo01);
        a = f.print(source02, target02);
        assert Arrays.equals(a, demo01);
        a = f.print(source03, target345);
        assert Arrays.equals(a, demo01);
        a = f.print(source04, target345);
        assert Arrays.equals(a, demo01);
        a = f.print(source05, target345);
        assert Arrays.equals(a, demo01);

        a = f.print(source06, target678);
        assert Arrays.equals(a, demo01);
        a = f.print(source07, target678);
        assert Arrays.equals(a, demo01);
        a = f.print(source08, target678);
        assert Arrays.equals(a, demo01);
        a = f.print(source09, target09);
        assert Arrays.equals(a, demo01);
        a = f.print(source10, target10);
        assert Arrays.equals(a, demo01);

        a = f.print(source11, target11);
        assert Arrays.equals(a, demo11);
        a = f.print(source12, target12);
        assert Arrays.equals(a, demo12);
        a = f.print(source13, target13);
        assert Arrays.equals(a, demo13);

        a = f.print(source14, target14);
        assert Arrays.equals(a, demo14);
        a = f.print(source15, target15);
        assert Arrays.equals(a, demo15);
    }

    int[] demo01 = {};
    int[] demo11 = {14};
    int[] demo12 = {28};
    int[] demo13 = {31};
    int[] demo14 = {6, 20, 30, 40, 50, 60};
    int[] demo15 = {0, 10, 20, 30, 40};

}
