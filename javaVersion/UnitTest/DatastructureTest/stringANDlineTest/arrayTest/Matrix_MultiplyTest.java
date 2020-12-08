package UnitTest.DatastructureTest.stringANDlineTest.arrayTest;

import DataStructure.stringANDline.array.arrayApply.Matrix_Multiply;
import org.junit.Test;

import java.util.Arrays;

/**
 * @author liujun
 * @version 1.0
 * @date 2020-01-08 21:40
 * @author-Email liujunfirst@outlook.com
 * @description 矩阵相乘 测试用例
 * @blogURL
 */
public class Matrix_MultiplyTest {

    Matrix_Multiply matrix_multiply = new Matrix_Multiply();

    @Test
    public void TestMatrixMultiply() {
        int[][] target = matrix_multiply.MatrixMultiply(Demo01Materix_a1, Demo01Materix_b1);
        assert Arrays.deepEquals(target, Assert01Materix_c1);

        target = matrix_multiply.MatrixMultiply(Demo01Materix_a2, Demo01Materix_b2);
        assert Arrays.deepEquals(target, Assert01Materix_c2);

        target = matrix_multiply.MatrixMultiply(Demo01Materix_a3, Demo01Materix_b3);
        assert Arrays.deepEquals(target, Assert01Materix_c3);

        target = matrix_multiply.MatrixMultiply(Demo01Materix_a4, Demo01Materix_b4);
        assert Arrays.deepEquals(target, Assert01Materix_c4);
    }

    //矩阵相乘:a矩阵3*5  b矩阵5*4  相乘的结果c矩阵3*4
    int[][] Demo01Materix_a1 = {
            {1, 5, 7, 6, 9},
            {5, 7, 8, 3, 1},
            {2, 4, 8, 6, 1}};
    int[][] Demo01Materix_b1 = {
            {5, 7, 6, 3},
            {5, 3, 1, 5},
            {2, 4, 1, 3},
            {5, 6, 8, 2},
            {8, 3, 1, 1}};
    int[][] Assert01Materix_c1 = {
            {146, 113, 75, 70},
            {99, 109, 70, 81},
            {84, 97, 73, 63}};

    int[][] Demo01Materix_a2 = {
            {1, 5, 7, 6, 9},
            {5, 7, 8, 3, 1},
            {2, 4, 8, 6, 1}};
    int[][] Demo01Materix_b2 = {
            {5, 7, 6, 3},
            {5, 3, 1, 5,8},
            {2, 4, 1, 3},
            {5, 6, 8, 2},
            {8, 3, 1, 1}};
    int[][] Assert01Materix_c2 = null;


    int[][] Demo01Materix_a3 = {
            {1, 5, 7, 6, 9},
            {5, 7, 8, 3, 1},
            {2, 4, 8, 6, 1}};
    int[][] Demo01Materix_b3 = {
            {5, 7, 6, 3},
            {5, 3, 1, 5},
            {5, 6, 8, 2},
            {8, 3, 1, 1}};
    int[][] Assert01Materix_c3 = null;

    int[][] Demo01Materix_a4 = {
            {1, 5, 7, 6, 9},
            {5, 7, 8, 3, 1},
            {2, 4, 8, 6, 1}};
    int[][] Demo01Materix_b4 = {
            {5, 7, 6, 3},
            {5, 3, 1, 5},
            {2, 4, 1, 3},
            {5, 6, 8, 2},
            {8, 3, 2, 1}};
    int[][] Assert01Materix_c4 = {
            {146, 113, 84, 70},
            {99, 109, 71, 81},
            {84, 97, 74, 63}};
}