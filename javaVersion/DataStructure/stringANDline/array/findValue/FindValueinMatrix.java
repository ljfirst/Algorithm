package DataStructure.stringANDline.array.findValue;

import DataStructure.stringANDline.array.other.FindValue;

/**
 * @author liujun
 * @version 1.0
 * @date 2020/6/29
 * @author—Email liujunfirst@outlook.com
 * @blogURL https://blog.csdn.net/ljfirst
 * @description 在矩阵中查找给定值，并返回其坐标
 * 解题思路：首先选定矩阵的右上角元素：A，
 * 如果A小于给定值，则排除了A所在的行，
 * 如果A大于给定值，则排除了A所在的列，
 * 时间复杂度为max{m,n}
 */
public class FindValueinMatrix implements FindValue {

    int[] position = {-1, -1};

    public int[] find(int[][] matrix, int target) {
        if (check(matrix)) {
            int row = matrix.length;
            int column = matrix[0].length;
            int row1 = 0;
            int column1 = column - 1;
            while (row1 < row && column1 >= 0) {
                if (matrix[row1][column1] < target) {
                    row1++;
                } else if (matrix[row1][column1] > target) {
                    column1--;
                } else if (matrix[row1][column1] == target) {
                    return new int[]{row1, column1};
                }
            }
        }
        return position;
    }
}
