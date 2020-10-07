package Algorithm.dynamic.largestSquare;

/**
 * @author liujun
 * @version 1.0
 * @date 2020/6/3
 * @author—Email liujunfirst@outlook.com
 * @blogURL https://blog.csdn.net/ljfirst
 * @description 动态规划法
 */
public class LargestSquareDynamic implements LargestSquare {

    @Override
    public int Solution(int[][] Matrix) {
        if (check(Matrix)) {
            int MaxSideLength = 0;
            //状态矩阵
            int raw_bound = Matrix.length;
            int column_bound = Matrix[0].length;
            int[][] statusMatrix = new int[raw_bound + 1][column_bound + 1];

            for (int i = 1; i <= raw_bound; i++) {
                for (int j = 1; j <= column_bound; j++) {
                    if (Matrix[i - 1][j - 1] == 1) {
                        statusMatrix[i][j] = Math.min(Math.min(statusMatrix[i - 1][j - 1], statusMatrix[i - 1][j]), statusMatrix[i][j - 1]) + 1;
                        MaxSideLength = MaxSideLength > statusMatrix[i][j] ? MaxSideLength : statusMatrix[i][j];
                    }
                }
            }
            return MaxSideLength * MaxSideLength;
        }
        return -1;
    }
}
