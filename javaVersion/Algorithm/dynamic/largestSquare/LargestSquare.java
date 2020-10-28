package Algorithm.dynamic.largestSquare;

/**
 * @author liujun
 * @version 1.0
 * @date 2019-11-05 02:12
 * @author—Email liujunfirst@outlook.com
 * @description 最大正方形
 *  在一个由 0 和 1 组成的二维矩阵内，找到只包含 1 的最大正方形，并返回其面积。
 * 解法一：暴力法
 *       1.1）暴力循环扫描法（含冗余扫描）
 *       1.2）逐层扫描法
 *       1.3）最大长度限制法
 * 解法二：动态规划法
 * 解法三：动态规划优化
 */

public interface LargestSquare {

    public int Solution(int[][] Matrix);

    default boolean check(int[][] Matrix) {
        //校验矩阵：空值问题
        if (null == Matrix || Matrix.length == 0 || Matrix[0].length == 0) {
            return false;
        }

        //校验矩阵：仅含0,1,否则输出-3
        for (int i = 0; i < Matrix.length; i++) {
            for (int j = 0; j < Matrix[0].length; j++) {
                if (Matrix[i][j] != 0 && Matrix[i][j] != 1) {
                    return false;
                }
            }
        }
        return true;
    }
}
