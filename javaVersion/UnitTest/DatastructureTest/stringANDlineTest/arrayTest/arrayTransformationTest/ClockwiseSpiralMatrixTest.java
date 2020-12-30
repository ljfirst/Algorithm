package UnitTest.DatastructureTest.stringANDlineTest.arrayTest.arrayTransformationTest;

import DataStructure.stringANDline.array.arrayTransformation.ClockwiseSpiralMatrix;
import org.junit.Test;

import java.util.Arrays;

/**
 * @author liujun
 * @version 1.0
 * @date 2019-11-09 22:23
 * @author-Email liujunfirst@outlook.com
 * @description 顺时针打印螺旋矩阵 测试案例
 */
public class ClockwiseSpiralMatrixTest {

    ClockwiseSpiralMatrix clockwiseSpiralMatrix = new ClockwiseSpiralMatrix();

    @Test
    public void Testprint() {
        int[] target;
        //点位计算法
        target = clockwiseSpiralMatrix.pointCount(Demo01);
        assert Arrays.equals(target, Answer01);
        target = clockwiseSpiralMatrix.pointCount(Demo02);
        assert Arrays.equals(target, Answer02);
        target = clockwiseSpiralMatrix.pointCount(Demo03);
        assert Arrays.equals(target, Answer03);
        target = clockwiseSpiralMatrix.pointCount(Demo04);
        assert Arrays.equals(target, Answer04);
        target = clockwiseSpiralMatrix.pointCount(Demo05);
        assert Arrays.equals(target, Answer05);
        target = clockwiseSpiralMatrix.pointCount(Demo06);
        assert Arrays.equals(target, Answer06);

        //转置法
        target = clockwiseSpiralMatrix.TranspositionPrint(Demo01);
        assert Arrays.equals(target, Answer01);
        target = clockwiseSpiralMatrix.TranspositionPrint(Demo02);
        assert Arrays.equals(target, Answer02);
        target = clockwiseSpiralMatrix.TranspositionPrint(Demo03);
        assert Arrays.equals(target, Answer03);
        target = clockwiseSpiralMatrix.TranspositionPrint(Demo04);
        assert Arrays.equals(target, Answer04);
        target = clockwiseSpiralMatrix.TranspositionPrint(Demo05);
        assert Arrays.equals(target, Answer05);
        target = clockwiseSpiralMatrix.TranspositionPrint(Demo06);
        assert Arrays.equals(target, Answer06);
    }

    //Demo
    int[][] Demo01 = {
            {1, 2, 3, 4},
            {12, 13, 14, 5},
            {11, 16, 15, 6},
            {10, 9, 8, 7}
    };
    int[] Answer01 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16};

    int[][] Demo02 = {
            {2, 3, 4},
            {11, 12, 5},
            {10, 13, 6},
            {9, 8, 7}
    };
    int[] Answer02 = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};

    int[][] Demo03 = {
            {2, 3, 4, 5},
            {11, 12, 13, 6},
            {10, 9, 8, 7}
    };
    int[] Answer03 = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};

    int[][] Demo04 = {};
    int[] Answer04 = null;

    int[][] Demo05 = {
            {1, 5, 7, 6, 9},
            {5, 7, 8, 3, 1},
            {2, 4, 8, 6, 1}
    };
    int[] Answer05 = {1, 5, 7, 6, 9, 1, 1, 6, 8, 4, 2, 5, 7, 8, 3};

    int[][] Demo06 = {
            {5, 7, 6, 3},
            {5, 3, 1, 5},
            {2, 4, 1, 3},
            {5, 6, 8, 2},
            {8, 3, 1, 1}
    };
    int[] Answer06 = {5, 7, 6, 3, 5, 3, 2, 1, 1, 3, 8, 5, 2, 5, 3, 1, 1, 8, 6, 4};

}
