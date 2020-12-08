package Algorithm.dynamic;

/**
 * @author liujun
 * @version 1.0
 * @date 2020/12/9
 * @author—Email liujunfirst@outlook.com
 * @blogURL https://blog.csdn.net/ljfirst
 * @description 计算路径数
 * 一个机器人位于一个 m x n 网格的左上角 （起始点在下图中标记为“Start” ）。
 * 机器人每次只能向下或者向右移动一步。机器人试图达到网格的右下角（在下图中标记为“Finish”）。
 * 问总共有多少条不同的路径？
 * 链接：https://leetcode-cn.com/problems/unique-paths
 */

public class CountPathNum {

    /**
     * @param m 列数量
     * @param n 行数量
     */
    public int count(int m, int n) {
        if (m <= 0 || n <= 0) {
            return -1;
        }
        int[][] num = new int[m][n];
        //init
        for (int i = 0; i < n; i++) {
            num[m - 1][i] = 1;
        }
        for (int i = 0; i < m; i++) {
            num[i][n - 1] = 1;
        }

        for (int i = m - 2; i >= 0; i--) {
            for (int j = n - 2; j >= 0; j--) {
                num[i][j] = num[i][j + 1] + num[i + 1][j];
            }
        }
        return num[0][0];
    }
}
