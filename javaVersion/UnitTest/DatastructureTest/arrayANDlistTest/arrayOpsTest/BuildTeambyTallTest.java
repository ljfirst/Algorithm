package UnitTest.DatastructureTest.arrayANDlistTest.arrayOpsTest;

import DataStructure.arrayANDlist.arrayOps.BuildTeambyTall;
import org.junit.Test;

import java.util.Arrays;

/**
 * @author liujun
 * @version 1.0
 * @date 2020/7/28
 * @author—Email liujunfirst@outlook.com
 * @blogURL https://blog.csdn.net/ljfirst
 * @description 根据身高重建队列 测试案例
 */
public class BuildTeambyTallTest {

    BuildTeambyTall bt = new BuildTeambyTall();

    @Test
    public void testsolution() {
        int[][] answer = bt.solution(demo01);
        Arrays.equals(answer, target01);
        answer = bt.solution(demo02);
        Arrays.equals(answer, target02);
        answer = bt.solution(demo03);
        Arrays.equals(answer, target03);
        answer = bt.solution(demo04);
        Arrays.equals(answer, target04);
    }

    int[][] demo01 = {{7, 0}, {4, 4}, {7, 1}, {5, 0}, {6, 1}, {5, 2}};
    int[][] target01 = {{5, 0}, {7, 0}, {5, 2}, {6, 1}, {4, 4}, {7, 1}};
    int[][] demo02 = null;
    int[][] target02 = {};
    int[][] demo03 = {};
    int[][] target03 = {};
    int[][] demo04 = {{9, 1}, {34, 0}, {7, 0}, {72, 0}, {22, 2}, {2, 1}, {11, 4}, {4, 0}, {12, 0}, {3, 4}};
    int[][] target04 = {{4, 0}, {2, 1}, {7, 0}, {12, 0}, {3, 4}, {9, 1}, {34, 0}, {72, 0}, {22, 2}, {11, 4}};
}