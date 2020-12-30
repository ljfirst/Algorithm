package Algorithm.comprehensive.choir;

import java.util.ArrayList;
import java.util.List;

/**
 * @author liujun
 * @version 1.0
 * @date 2020-02-12 09:37
 * @author—Email liujunfirst@outlook.com
 * @description 合唱团 回溯法
 * * 有 n 个学生站成一排，每个学生有一个能力值，牛牛想从这 n 个学生中按照顺序选取 k 名学生，
 * *要求相邻两个学生的位置编号的差不超过 d，使得这 k 个学生的能力值的乘积最大，你能返回最大的乘积吗？
 * @blogURL
 */
public class Choir_Backtrack implements Choir {

    //选择的数量
    int choseNum;
    int intervald;
    int[] array;
    int arrayNum;

    //定义乘积最优解
    int bestValue;
    int tempValue;

    //记录选择的学生编号
    List<Integer> list_temp;
    List<Integer> list_final;

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
        //需要每次刷新
        this.bestValue = 1;
        this.list_final = new ArrayList<>();

        for (int i = 0; i < arrayNum - intervald; i++) {
            this.tempValue = 1;
            this.list_temp = new ArrayList<>();
            countMax(0, i);
        }
        return bestValue;
    }

    //回溯函数
    private int countMax(int depth, int start) {
        if (depth == choseNum) {
            if (tempValue > bestValue) {
                bestValue = tempValue;
                list_final = new ArrayList<>(list_temp);
            }
            return bestValue;
        }

        //因为此处是顺序选人，所有i不用从 0 开始，而是从递归的深度（遍历到当前的这个人）
        int bound = Math.min(start + intervald, arrayNum);
        for (int i = start; i < bound; i++) {
            //异常情况，特殊处理
            if (array[i] == 0) {
                continue;
            }
            tempValue *= array[i];
            list_temp.add(i);
            countMax(depth + 1, i + 1);
            tempValue /= array[i];
            list_temp.remove(list_temp.size() - 1);
        }
        return bestValue;
    }
}
