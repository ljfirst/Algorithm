package Algorithm.dynamic.largestSquare;

/**
 * @author liujun
 * @version 1.0
 * @date 2020/6/3
 * @author—Email liujunfirst@outlook.com
 * @blogURL https://blog.csdn.net/ljfirst
 * @description 暴力求解法
 */
public class LargestSquare_Violence implements LargestSquare {

    @Override
    public int Solution(int[][] Matrix) {
        if (check(Matrix)) {
            int MaxSideLength = 0;
            for (int i = 0; i < Matrix.length; i++) {
                for (int j = 0; j < Matrix[0].length; j++) {
                    if (Matrix[i][j] != 0) {
                        //逐层扫描法
                        int num = getMaxSideLengthScanner(Matrix, i, j);
                        MaxSideLength = Math.max(MaxSideLength, num);
                    }
                }
            }
            return MaxSideLength * MaxSideLength;
        }

        return -1;
    }

    //暴力循环扫描法（含冗余扫描）
    public int getMaxSideLengthViolence(int[][] Matrix, int rawposition, int columnposition) {

        //空值问题
        if (Matrix == null) {
            return -1;
        }
        int MaxLength = 0;
        boolean flag = true;
        int raw_bound = Matrix.length;
        int column_bound = Matrix[0].length;
        //越界问题
        if (rawposition >= raw_bound || columnposition >= column_bound) {
            return -2;
        }
        while (flag && ((rawposition + MaxLength) < raw_bound) && ((columnposition + MaxLength) < column_bound)) {
            MaxLength++;
            for (int i = 0; i <= MaxLength; i++) {
                for (int j = 0; j <= MaxLength; j++) {
                    if (Matrix[rawposition + i][columnposition + j] == 0) {
                        flag = false;
                        break;
                    }
                }
                if (flag == false) {
                    break;
                }
            }
        }
        return MaxLength--;
    }

    //逐层扫描法
    public int getMaxSideLengthScanner(int[][] Matrix, int rawposition, int columnposition) {

        //空值问题
        if (Matrix == null) {
            return -1;
        }
        int MaxLength = 1;
        int raw_bound = Matrix.length;
        int column_bound = Matrix[0].length;
        //越界问题
        if (rawposition >= raw_bound || columnposition >= column_bound) {
            return -2;
        }
        while ((MaxLength + rawposition < raw_bound) && (MaxLength + columnposition < column_bound)) {
            //扫描列
            for (int i = columnposition; i <= columnposition + MaxLength; i++) {
                if (Matrix[rawposition + MaxLength][i] == 0) {
                    return MaxLength--;
                }
            }
            //扫描行
            for (int j = rawposition; j <= rawposition + MaxLength; j++) {
                if (Matrix[j][columnposition + MaxLength] == 0) {
                    return MaxLength--;
                }
            }
            MaxLength++;
        }
        return MaxLength--;
    }

    //最大长度限制法
    public int getMaxSideLengthLimit(int[][] Matrix, int rawposition, int columnposition) {

        //空值问题
        if (Matrix == null) {
            return -1;
        }
        int raw_bound = Matrix.length;
        int column_bound = Matrix[0].length;
        //最大增长长度,选择最小值
        int MaxColumnLength = column_bound - columnposition;
        int MaxRawLength = raw_bound - rawposition;
        int MaxLength = MaxColumnLength > MaxRawLength ? MaxRawLength : MaxColumnLength;
        //越界问题
        if (rawposition >= raw_bound || columnposition >= column_bound) {
            return -2;
        }

        //逐层扫描行
        for (int i = rawposition; i < MaxLength + rawposition; i++) {
            //行不变，扫描列
            for (int j = columnposition; j < MaxLength + columnposition; j++) {
                if (Matrix[i][j] == 0) {
                    MaxColumnLength = j - columnposition;
                    break;
                }
            }
            //如果出现行增量 大于等于 列增量 说明正方形结束
            MaxRawLength = i - rawposition;
            if (MaxRawLength >= MaxColumnLength) {
                return MaxRawLength;
            }
        }
        return MaxLength;
    }
}
