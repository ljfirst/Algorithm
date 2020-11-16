package DataStructure.stringANDline.array.arrayApply;

public interface FindValue {

    public int[] find(int[][] matrix, int target);

    default boolean check(int[][] matrix) {
        int row = matrix.length;
        int column = matrix[0].length;
        //矩阵满足从左到右递增，从上到下递增
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column - 1; j++) {
                if (matrix[i][j] > matrix[i][j + 1]) {
                    return false;
                }
            }
        }
        for (int i = 0; i < column; i++) {
            for (int j = 0; j < row - 1; j++) {
                if (matrix[j][i] > matrix[j + 1][i]) {
                    return false;
                }
            }
        }
        return true;
    }
}
