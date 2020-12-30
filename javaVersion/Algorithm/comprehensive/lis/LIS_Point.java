package Algorithm.comprehensive.lis;

/**
 * @author liujun
 * @version 1.0
 * @date 2020/12/31
 * @author—Email liujunfirst@outlook.com
 * @blogURL https://blog.csdn.net/ljfirst
 * @description 最长递增子序列 双指针
 */
public class LIS_Point implements LIS {

    @Override
    public int longestIncreasingSubsequence(String sequence) {

        if (!check(sequence)) {
            return 0;
        }
        int[] StringArray = sequence2intArray(sequence);
        if (StringArray.length == 1) {
            return 1;
        }
        int left = 0;
        int right = 1;
        int countNum = 0;
        while (right < StringArray.length) {
            while (right < StringArray.length && StringArray[right] > StringArray[right - 1]) {
                right++;
            }
            countNum = Math.max(countNum, right - left);
            left = right;
            right++;
        }
        return countNum;
    }
}
