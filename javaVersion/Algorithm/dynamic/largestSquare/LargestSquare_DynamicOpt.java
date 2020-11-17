package Algorithm.dynamic.largestSquare;

/**
 * @author liujun
 * @version 1.0
 * @date 2020/6/3
 * @author—Email liujunfirst@outlook.com
 * @blogURL https://blog.csdn.net/ljfirst
 * @description 动态规划优化 ： 一维矩阵
 */
public class LargestSquare_DynamicOpt implements LargestSquare {
    @Override
    public int Solution(int[][] Matrix) {
        if (check(Matrix)) {
            int MaxSideLength = 0;
            //状态矩阵
            int raw_bound = Matrix.length;
            int column_bound = Matrix[0].length;
            int[] statusMatrix = new int[column_bound + 1];
            int pre = 0;
            int now;

            for (int i = 1; i <= raw_bound; i++) {
                for (int j = 1; j <= column_bound; j++) {
                    now = statusMatrix[j];
                    if (Matrix[i - 1][j - 1] == 1) {
                        statusMatrix[j] = Math.min(Math.min(now, pre), statusMatrix[j - 1]) + 1;
                        MaxSideLength = Math.max(MaxSideLength, statusMatrix[j]);
                    } else {
                        statusMatrix[j] = 0;
                    }
                    pre = now;
                }
            }
            return MaxSideLength * MaxSideLength;
        }
        return -1;
    }
}
