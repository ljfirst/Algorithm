package Algorithm.comprehensive.lis;

import java.util.Arrays;

/**
 * @author liujun
 * @version 1.0
 * @date 2019-10-27 22:04
 * @author—Email liujunfirst@outlook.com
 * @description  最长递增子序列 动态规划法
 * 在一个给定的数值序列中，找到一个子序列，使得这个子序列元素的数值依次递增，并且这个子序列的长度尽可能地大。最长递增子序列中的元素在原序列中不一定是连续的
 */
//LongestIncreasingSubsequence
public class LIS_Dynamic implements LisInterface{

    public int longestIncreasingSubsequence(String sequence) {

        if (!check(sequence)) {
            return 0;
        }
        int length = sequence.length();
        char[] c = sequence.toCharArray();
        //原始无序值的数组
        int[] intArray = new int[length];
        int count = 0;
        for (char c1 : c) {
            int i = Integer.parseInt(String.valueOf(c1));
            intArray[count++] = i;
        }
        //记录当前最大值的数组
        int[] longest = new int[length];
        int best = 0;
        //point用于记录值
        int point = 0;
        Arrays.fill(longest, 1);
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < i; j++) {
                if ((intArray[j] < intArray[i])) {
                    longest[i] = (longest[j] + 1) > longest[i] ? (longest[j] + 1) : longest[i];
                }
            }
            if (longest[i] > best) {
                best = longest[i];
                point = i;
            }
        }
        //寻找值
        StringBuffer sb = new StringBuffer();
        sb.append(intArray[point]);
        for (int i = point - 1; i >= 0; i--) {
            if (longest[i] == longest[point] - 1) {
                sb.append(intArray[i]);
                point = i;
            }
        }
        //System.out.println("longest num:"+best);
        //System.out.println("longest数组："+Arrays.toString(longest));
        //System.out.println("LongestIncreasingSubsequence:"+sb.reverse().toString());
        //return sb.reverse().toString();
        return best;
    }
}
