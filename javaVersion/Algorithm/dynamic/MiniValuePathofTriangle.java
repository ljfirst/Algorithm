package Algorithm.dynamic;

import Logic.check.MatrixCheck;

/**
 * @author liujun
 * @version 1.0
 * @date 2019-11-25 16:44
 * @author—Email  liujunfirst@outlook.com
 * @description  给定一个二维数组，其保存了一个数字三角形 triangleMatrix[] []，
 * 求从数字三角形顶端到底端各数字和最小的路径之和，
 * 每次可以向下走相邻的两个位置
 * @blogURL
 */
public class MiniValuePathofTriangle {

    public int method(int[][] matrix){
        //检查数组是否为null,是否为三角形
        if(!MatrixCheck.judgeisTriangle(matrix)){
            return -1;
        }

        //检查是否仅含有一个数组
        if(matrix.length == 1 && matrix[0].length == 1){
            return matrix[0][0];
        }
        int[][] bestMatrix = new int[matrix.length][matrix[matrix.length-1].length];
        //底部数据
        for (int i = 0; i < matrix.length; i++) {
            bestMatrix[matrix.length - 1][i] = matrix[matrix.length - 1][i];
        }
        for (int i = matrix.length - 2; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                bestMatrix[i][j] = Math.min(bestMatrix[i+1][j+1],bestMatrix[i+1][j]) + matrix[i][j];
            }
        }
        return bestMatrix[0][0];
    }
}
