package Algorithm.dynamic;

import DataStructure.stringANDline.array.arrayApply.MatrixCheck;

/**
 * @author liujun
 * @version 1.0
 * @date 2019-11-25 17:00
 * @author—Email  liujunfirst@outlook.com
 * @description
 * 已知一个二维数组，其中存储了非负整数，
 * 找到从左上角到右下角的一条路径，使得路径上的和最小。(移动过程中只能向下或向右)
 * @blogURL
 */
public class MiniValuePathofMatrix {

    public int method(int[][] matrix){
        //检查数组是否为null，检查数组是否为矩形
        if(!MatrixCheck.judgeisRectangle(matrix)){
            return -1;
        }

        int matrixLength = matrix.length;
        //检查是否仅含有一个数组
        if(matrixLength == 1 && matrix[0].length == 1){
            return matrix[0][0];
        }
        //initial
        int[][] bestMatrix = new int[matrixLength][matrixLength];
        bestMatrix[0][0] = matrix[0][0];
        for (int i = 1; i < matrixLength; i++) {
            bestMatrix[0][i] = bestMatrix[0][i-1] + matrix[0][i];
            bestMatrix[i][0] = bestMatrix[i-1][0] + matrix[i][0];
        }
        for (int i = 1; i < matrixLength; i++) {
            for (int j = 1; j < matrixLength; j++) {
                bestMatrix[i][j] = Math.min(bestMatrix[i][j-1],bestMatrix[i-1][j])+matrix[i][j];
            }
        }
        return bestMatrix[matrixLength-1][matrixLength-1];
    }
}
