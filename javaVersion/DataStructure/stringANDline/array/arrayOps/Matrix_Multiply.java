package DataStructure.stringANDline.array.arrayOps;

import DataStructure.stringANDline.array.arrayApply.MatrixCheck;

/**
 * @author liujun
 * @version 1.0
 * @date 2018-7-19 下午03:07:41
 * @author—Email liujunfirst@outlook.com
 * @description 矩阵相乘。
 */
public class Matrix_Multiply {

    public int[][] MatrixMultiply(int[][] materix_a, int[][] materix_b) {

        if(!MatrixCheck.judgeisRectangle(materix_a)|| !MatrixCheck.judgeisRectangle(materix_b)){
            return null;
        }

        //定义相乘后的矩阵
        int row = materix_a.length;//获取矩阵的行
        int column = materix_b[0].length;//获取矩阵的列
        int[][] materix_c = new int[row][column];
        int k = materix_b.length;//矩阵相乘的中间元素个数

        if (k != materix_a[0].length) {
            return null;
        }
        //矩阵相乘
        //首先循环A矩阵的行,时间复杂度：O(materix_a.length)
        for (int i = 0; i < row; i++) {
            //再循环B矩阵的列,时间复杂度：O(materix_b[0].length)
            for (int j = 0; j < column; j++) {
                //A矩阵的行元素和B矩阵列元素逐个相乘,
                //注意materix_b.length=materix_a[0].length != materix_c的任何值
                for (int h = 0; h < k; h++) {
                    materix_c[i][j] += materix_a[i][h] * materix_b[h][j];
                }
            }
        }
        return materix_c;
    }

    public void printMatrix(int[][] materix_c) {
        int row = materix_c.length;//获取矩阵的行
        int column = materix_c[0].length;//获取矩阵的列
        //打印输出c矩阵
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(materix_c[i][j] + " ");
            }
            System.out.println();
        }
    }
}