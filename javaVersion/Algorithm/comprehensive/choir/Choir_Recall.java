package Algorithm.comprehensive.choir;

/**
 * @author liujun
 * @version 1.0
 * @date 2020-02-12 09:37
 * @author—Email  liujunfirst@outlook.com
 * @description  合唱团 回溯法
 * * 有 n 个学生站成一排，每个学生有一个能力值，牛牛想从这 n 个学生中按照顺序选取 k 名学生，
 * *要求相邻两个学生的位置编号的差不超过 d，使得这 k 个学生的能力值的乘积最大，你能返回最大的乘积吗？
 * @blogURL
 */
public class Choir_Recall implements Choir {

    //选择的数量
    int choseNum;
    int intervald;
    int[] array;
    int arrayNum;

    //定义乘积最优解
    int bestValue;
    int tempValue;

    @Override
    public int getMaxValue(int[] array, int choseNum, int intervald) {
        return check(array, choseNum, intervald) ? countMaxValue(array, choseNum, intervald) : -1;
    }

    public int countMaxValue(int[] array, int choseNum, int intervald) {
        //initial
        this.choseNum = choseNum;
        this.intervald = intervald;
        this.array = array;
        this.arrayNum = array.length;
        bestValue = 1;
        tempValue = 1;

        countMax(0, 0);
        return bestValue;
    }

    //回溯函数
    public void countMax(int depth, int start) {
        if (depth == choseNum) {
            bestValue = tempValue > bestValue ? tempValue : bestValue;
            return;
        }

        //因为此处是顺序选人，所有i不用从 0 开始，而是从递归的深度（遍历到当前的这个人）
        int bound = Math.min(start + intervald, arrayNum);
        for (int i = start; i < bound; i++) {
            //异常情况，特殊处理
            if (array[i] == 0) {
                continue;
            }
            tempValue *= array[i];
            countMax(depth + 1, i + 1);
            tempValue /= array[i];
        }
    }
}
