package Algorithm.comprehensive.lis;

import java.util.ArrayList;
import java.util.List;

/**
 * @author liujun
 * @version 1.0
 * @date 2020/6/7
 * @author—Email liujunfirst@outlook.com
 * @blogURL https://blog.csdn.net/ljfirst
 * @description 最长递增子序列
 * 分支限界法
 */
public class LIS_Branch implements LIS {

    //用于存放数据
    public List<Integer> list_temp;
    public List<Integer> list_best;
    int length;
    int count_temp;
    int count_best;
    int[] StringArray;

    @Override
    public int longestIncreasingSubsequence(String sequence) {
        if (!check(sequence)) {
            return 0;
        }
        length = sequence.length();
        count_best = 0;
        StringArray = sequence2intArray(sequence);
        //剩下的待遍历距离小于当前的最优解，就没有必要再继续下去了。
        for (int i = 1; count_best <= length - i; i++) {
            list_temp = new ArrayList();
            list_temp.add(StringArray[i - 1]);
            count_temp = 1;
            count(i);
        }
        return count_best;
    }

    public void count(int depth) {
        //剪枝条件：当前temp的值加上剩下待遍历的距离，小于等于最优值的时候，就没有必要再继续下去了。
        if ((length - 1) - depth + (count_temp + 1) <= count_best) {
            return;
        }
        if (count_temp > count_best || depth == length - 1) {
            //更新最优解，并继续下去
            if (count_temp > count_best) {
                list_best = new ArrayList<>(list_temp);
                count_best = count_temp;
            }
            //达到终点，停止递归
            if (depth == length - 1) {
                return;
            }
        }
        //分支递归
        for (int i = depth; i < length; i++) {
            if (list_temp.get(count_temp - 1) < StringArray[i]) {
                count_temp++;
                list_temp.add(StringArray[i]);
                count(i + 1);
                list_temp.remove(list_temp.get(--count_temp));
            }
        }
    }
}