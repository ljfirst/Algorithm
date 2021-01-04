package UnitTest.DatastructureTest.arrayANDlistTest.findValueTest;

import DataStructure.arrayANDlist.findValue.Find2ValueinMatrix;

import java.util.Arrays;

/**
 * @author liujun
 * @version 1.0
 * @date 2020/6/29
 * @author—Email liujunfirst@outlook.com
 * @blogURL https://blog.csdn.net/ljfirst
 * @description 在矩阵中查找某两个值等于给定值 测试案例
 */
public class Find2ValueinMatrixTest {

    Find2ValueinMatrix f = new Find2ValueinMatrix();

    public void ff() {
        int[] ans = f.find(demo01, 17);
        assert Arrays.equals(ans, ansdemo01);
        ans = f.find(demo01, 28);
        assert Arrays.equals(ans, ansdemo02);
        ans = f.find(demo01, 20);
        assert Arrays.equals(ans, ansdemo03);
        ans = f.find(demo01, 31);
        assert Arrays.equals(ans, ansdemo04);

        //反案例
        ans = f.find(demo01, 116);
        assert !Arrays.equals(ans, ansdemo05);
        ans = f.find(demo01, 216);
        assert !Arrays.equals(ans, ansdemo06);
    }

    int[][] demo01 = {
            {1, 2, 3, 4, 5},
            {2, 4, 6, 8, 9},
            {3, 6, 9, 11, 12},
            {5, 7, 10, 13, 15},
            {7, 8, 11, 16, 18}};
    int[] ansdemo01 = {1, 3, 1, 4};
    int[] ansdemo02 = {3, 3, 3, 4};
    int[] ansdemo03 = {3, 1, 3, 3};
    int[] ansdemo04 = {3, 4, 4, 3};
    int[] ansdemo05 = {-1, -1, -1, -1};
    int[] ansdemo06 = {-1, -1, -1, -1};

}
