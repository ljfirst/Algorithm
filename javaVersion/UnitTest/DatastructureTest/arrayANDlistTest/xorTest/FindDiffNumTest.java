package UnitTest.DatastructureTest.arrayANDlistTest.xorTest;

import DataStructure.arrayANDlist.xor.FindDiffNum;
import org.junit.Test;

/**
 * @author liujun
 * @version 1.0
 * @date 2020/12/25
 * @author—Email liujunfirst@outlook.com
 * @blogURL https://blog.csdn.net/ljfirst
 * @description 找出不同的数 测试案例
 * 1、一个长度为99的数组，数据范围是1-100，数组内数据均不重复，找出丢失的那个数
 * 2、一个长度为100的数组，共100个数，99个不同，找出那个相同的数
 */
public class FindDiffNumTest {

    FindDiffNum findDiffNum = new FindDiffNum();

    @Test
    public void testfindLostNum() {
        int target = findDiffNum.findLostNum(demoLost_01, 1, 100);
        assert target == Integer.MIN_VALUE;
        target = findDiffNum.findLostNum(demoLost_02, 1, 100);
        assert target == Integer.MIN_VALUE;
        target = findDiffNum.findLostNum(demoLost_03, 1, 20);
        assert target == 20;
        target = findDiffNum.findLostNum(demoLost_04, 1, 10);
        assert target == 10;
        target = findDiffNum.findLostNum(demoLost_05, 1, 20);
        assert target == 12;
        target = findDiffNum.findLostNum(demoLost_06, 1, 10);
        assert target == 7;
    }

    @Test
    public void testfindRepertNum() {
        int target = findDiffNum.findRepertNum(demoRepert_01);
        assert target == Integer.MIN_VALUE;
        target = findDiffNum.findRepertNum(demoRepert_02);
        assert target == Integer.MIN_VALUE;
        target = findDiffNum.findRepertNum(demoRepert_03);
        assert target == 0;
        target = findDiffNum.findRepertNum(demoRepert_04);
        assert target == 10;
        target = findDiffNum.findRepertNum(demoRepert_05);
        assert target == 11;
        target = findDiffNum.findRepertNum(demoRepert_06);
        assert target == 9;
    }

    int[] demoLost_01 = {};
    int[] demoLost_02 = null;
    int[] demoLost_03 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19};//20
    int[] demoLost_04 = {1, 2, 3, 4, 5, 6, 7, 8, 9};//10
    int[] demoLost_05 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 20, 13, 14, 15, 16, 17, 18, 19};//12
    int[] demoLost_06 = {1, 2, 3, 4, 5, 6, 8, 9, 10};//7

    int[] demoRepert_01 = {};
    int[] demoRepert_02 = null;
    int[] demoRepert_03 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0, 0};//0
    int[] demoRepert_04 = {10, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};//10
    int[] demoRepert_05 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};//11
    int[] demoRepert_06 = {1, 9, 4, 5, 2, 3, 7, 8, 9, 10, 6};//9
}
