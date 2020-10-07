package Algorithm.comprehensive.lis;

import Algorithm.dynamic.lcs.LCS;
import DataStructure.sort.innerSort.innerSortRealize.QuickSortDuplexing;

import java.util.HashMap;

/**
 * @author liujun
 * @version 1.0
 * @date 2020/6/6
 * @author—Email liujunfirst@outlook.com
 * @blogURL https://blog.csdn.net/ljfirst
 * @description 最长递增子序列 字符串对比法，利用最长公共子序列，本质是动态规划
 */
public class LIS_Lcs implements LisInterface {

    @Override
    public int longestIncreasingSubsequence(String sequence) {
        if (!check(sequence)) {
            return 0;
        }
       /* ArrayList l = (ArrayList) Arrays.asList(sequence.toCharArray());
        int[] arrayValue = l.stream().mapToInt(x -> (int) x).toArray();*/

        char[] c = sequence.toCharArray();
        int[] ints = new int[c.length];
        for (int i = 0; i < c.length; i++) {
            ints[i] = Integer.parseInt(String.valueOf(c[i]));
        }
        //进行快速排序
        QuickSortDuplexing q = new QuickSortDuplexing();
        q.sortMethod(ints);
        //因为是递增序列，所以要去重
        HashMap hashMap = new HashMap();
        for (int i = 0; i < c.length; i++) {
            hashMap.put(ints[i], 1);
        }
        String temp = hashMap.keySet().toString().replace(",", "").replace("[", "").replace("]", "").replace(" ", "");
        //再进行最长子序列比较
        LCS lcs = new LCS();
        int length = lcs.count(temp, sequence).getCommondLength();
        return length;
    }
}
