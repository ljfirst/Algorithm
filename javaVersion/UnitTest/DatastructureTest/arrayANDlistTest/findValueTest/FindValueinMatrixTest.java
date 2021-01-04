package UnitTest.DatastructureTest.arrayANDlistTest.findValueTest;

import DataStructure.arrayANDlist.findValue.FindValueinMatrix;
import org.junit.Test;

import java.util.Arrays;

/**
 * @author liujun
 * @version 1.0
 * @date 2020/6/29
 * @author—Email liujunfirst@outlook.com
 * @blogURL https://blog.csdn.net/ljfirst
 * @description 在矩阵中查找给定值 测试案例
 */
public class FindValueinMatrixTest {
    FindValueinMatrix f = new FindValueinMatrix();

    @Test
    public void testfind() {
        int[] ans = f.find(demo01, 12);
        assert Arrays.equals(ans, ansdemo01);
        ans = f.find(demo01, 16);
        assert Arrays.equals(ans, ansdemo02);
        ans = f.find(demo01, 6);
        assert Arrays.equals(ans, ansdemo03);
        ans = f.find(demo01, 7);
        assert Arrays.equals(ans, ansdemo04);

        //反案例
        ans = f.find(demo01, 116);
        assert Arrays.equals(ans, ansdemoFalse);
        ans = f.find(demo01, 216);
        assert Arrays.equals(ans, ansdemoFalse);
        ans = f.find(demo02, 16);
        assert Arrays.equals(ans, ansdemoFalse);
    }

    int[][] demo01 = {
            {1, 2, 3, 4, 5},
            {2, 4, 6, 8, 9},
            {3, 6, 9, 11, 12},
            {5, 7, 10, 13, 15},
            {7, 8, 11, 16, 18}};

    int[] ansdemo01 = {2, 4};
    int[] ansdemo02 = {4, 3};
    int[] ansdemo03 = {1, 2};
    int[] ansdemo04 = {3, 1};
    int[] ansdemoFalse = {-1, -1};

    int[][] demo02 = {
            {1, 2, 4, 3, 5},
            {2, 4, 6, 8, 9},
            {3, 6, 9, 11, 12},
            {5, 7, 10, 13, 15},
            {7, 8, 11, 16, 18}};
}
