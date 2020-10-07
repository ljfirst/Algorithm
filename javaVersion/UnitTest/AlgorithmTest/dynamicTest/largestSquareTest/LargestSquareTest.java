package UnitTest.AlgorithmTest.dynamicTest.largestSquareTest;

import Algorithm.dynamic.largestSquare.LargestSquare;
import org.junit.Test;

/**
 * @author liujun
 * @version 1.0
 * @date 2020/6/3
 * @author—Email liujunfirst@outlook.com
 * @blogURL https://blog.csdn.net/ljfirst
 * @description
 */
public class LargestSquareTest {

    //测试最大正方形算法
    public void testSolution(LargestSquare largestSquare) {
        //测试用例01，实际最大面积：9
        int maxValue = largestSquare.Solution(Square_Test01);
        assert maxValue == 9;
        //测试用例02，实际最大面积：9
        maxValue = largestSquare.Solution(Square_Test02);
        assert maxValue == 9;
        //测试用例03，实际最大面积：-1
        maxValue = largestSquare.Solution(Square_Test03);
        assert maxValue == -1;
        //测试用例04，实际最大面积：9
        maxValue = largestSquare.Solution(Square_Test04);
        assert maxValue == 9;
        //测试用例05，实际最大面积：9
        maxValue = largestSquare.Solution(Square_Test05);
        assert maxValue == 9;
        //测试用例06，实际最大面积：4
        maxValue = largestSquare.Solution(Square_Test06);
        assert maxValue == 4;
        //测试用例07，实际最大面积：4
        maxValue = largestSquare.Solution(Square_Test07);
        assert maxValue == 4;
        //测试用例08，实际最大面积：-1
        maxValue = largestSquare.Solution(Square_Test08);
        assert maxValue == -1;
        maxValue = largestSquare.Solution(Square_Test09);
        assert maxValue == -1;
    }

    //正案例：测试用例01：起始点（0，0），最大边长：2，起始点最大面积：4，实际最大面积：9
    int[][] Square_Test01 = new int[][]{
            {1, 1, 0, 0, 0},
            {1, 1, 0, 0, 0},
            {0, 0, 1, 1, 1},
            {0, 0, 1, 1, 1},
            {0, 0, 1, 1, 1}
    };

    //正案例：测试用例02：起始点（1，1），最大边长：3，起始点最大面积：9，实际最大面积：9
    int[][] Square_Test02 = new int[][]{
            {0, 0, 0, 0, 0},
            {0, 1, 1, 1, 0},
            {0, 1, 1, 1, 0},
            {0, 1, 1, 1, 0},
            {0, 0, 0, 0, 0}
    };

    //反案例：测试用例03：起始点无，最大边长：0，起始点最大面积：0，实际最大面积：0
    int[][] Square_Test03 = null;

    //反案例：测试用例04：起始点（5，5），越界，起始点最大面积：0，实际最大面积：0
    int[][] Square_Test04 = new int[][]{
            {0, 0, 0, 0, 0},
            {0, 1, 1, 1, 1},
            {0, 1, 1, 1, 1},
            {0, 1, 1, 1, 1},
            {0, 1, 1, 0, 1}
    };

    //正案例：测试用例05：起始点（2，1），最大边长：2，起始点最大面积：4，实际最大面积：9
    int[][] Square_Test05 = new int[][]{
            {0, 0, 0, 0, 0},
            {0, 1, 1, 1, 0},
            {0, 1, 1, 1, 0},
            {0, 1, 1, 1, 0},
            {0, 0, 1, 0, 0}
    };

    //正案例：测试用例06：起始点（1，1），最大边长：2，起始点最大面积：4，实际最大面积：4
    int[][] Square_Test06 = new int[][]{
            {0, 0, 0, 1, 0},
            {1, 1, 1, 1, 1},
            {0, 1, 1, 1, 1},
            {0, 1, 0, 1, 1},
            {0, 1, 0, 1, 0}
    };

    //正案例：测试用例07：起始点（1，1），最大边长：2，起始点最大面积：4，实际最大面积：4
    int[][] Square_Test07 = new int[][]{
            {0, 0, 0, 1, 0, 0, 1},
            {1, 1, 1, 1, 1, 0, 1},
            {0, 1, 1, 1, 1, 0, 1},
            {0, 1, 0, 1, 1, 0, 1},
            {0, 1, 0, 1, 0, 0, 1}
    };

    //反案例：测试用例08：起始点（0，0），非常规矩阵，含有非0，1参数，输出-1；
    int[][] Square_Test08 = new int[][]{
            {0, 0, 0, 1, 0, 7, 1},
            {1, 1, 2, 1, 1, 0, 1},
            {0, 1, 1, 1, 1, 0, 1},
            {0, 1, 0, 1, 4, 0, 1},
            {0, 1, 0, 1, 0, 0, 1}
    };

    int[][] Square_Test09 = new int[][]{};
}
