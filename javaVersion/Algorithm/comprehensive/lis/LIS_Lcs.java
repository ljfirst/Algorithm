package Algorithm.comprehensive.lis;

import Algorithm.dynamic.lcs.LCS_Dynamic;
import DataStructure.sort.innerSort.innerSortRealize.QuickSortDuplexing;

import java.util.HashMap;
import java.util.Map;

/**
 * @author liujun
 * @version 1.0
 * @date 2020/6/6
 * @author—Email liujunfirst@outlook.com
 * @blogURL https://blog.csdn.net/ljfirst
 * @description 最长递增子序列
 * 对字符串进行排序，去重，再利用最长公共子序列，本质是动态规划
 */
public class LIS_Lcs implements LIS {

    @Override
    public int longestIncreasingSubsequence(String sequence) {
        if (!check(sequence)) {
            return 0;
        }
        int[] ints = sequence2intArray(sequence);
        //进行快速排序
        /*QuickSortDuplexing q = new QuickSortDuplexing();
        q.sortMethod(ints);*/
        //因为是递增序列，所以要去重，HashMap自带排序
        Map<Integer, Integer> hashMap = new HashMap();
        for (int i = 0; i < sequence.length(); i++) {
            hashMap.putIfAbsent(ints[i], 1);
        }
        String temp;
        /*String temp = hashMap.keySet().toString()
                .replace(",", "")
                .replace("[", "")
                .replace("]", "")
                .replace(" ", "");*/
        StringBuffer sb = new StringBuffer();
        for (int h : hashMap.keySet()) {
            sb.append(h);
        }
        temp = sb.toString();
        //再进行最长子序列比较
        LCS_Dynamic lcs = new LCS_Dynamic();
        int length = lcs.count(temp, sequence).getCommondLength();
        return length;
    }
}
