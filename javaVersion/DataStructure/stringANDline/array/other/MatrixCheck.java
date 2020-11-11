package DataStructure.stringANDline.array.other;

import java.util.Arrays;

/**
 * @author liujun
 * @version 1.0
 * @date 2019-12-25 22:44
 * @author—Email  liujunfirst@outlook.com
 * @description 
 * @blogURL
 */
//矩阵检测
public class MatrixCheck {

    //检测是否为空矩阵
    public static boolean judgeisNull(int[][] matrix){
        if(matrix == null || matrix.length == 0 || matrix[0].length == 0){
            return true;
        }
        return false;
    }

    //检测是否为正方形
    public static boolean judgeisSquare(int[][] matrix){

        if(judgeisNull(matrix)){
            return false;
        }
        //检查矩阵是否为正方形
        int matrixLength = matrix.length;
        long p = Arrays.stream(matrix).filter(x -> x.length == matrixLength).count();
        return matrixLength == p;
    }

    //检测是否为长方形
    public static boolean judgeisRectangle(int[][] matrix){
        if(judgeisNull(matrix)){
            return false;
        }
        //检查矩阵是否为长方形
        int length = matrix[0].length;
        long p = Arrays.stream(matrix).filter(x -> x.length == length).count();
        return matrix.length == p;
    }

    //检测是否为三角形
    public static boolean judgeisTriangle(int[][] matrix){
        if(judgeisNull(matrix)){
            return false;
        }
        //检查数组是否为三角形
        for (int i = 0; i < matrix.length; i++) {
            if(matrix[i].length != i + 1){
                return false;
            }
        }
        return true;
    }
}