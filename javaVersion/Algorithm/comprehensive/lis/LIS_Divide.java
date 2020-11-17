package Algorithm.comprehensive.lis;

/**
 * @author liujun
 * @version 1.0
 * @date 2020/6/7
 * @author—Email liujunfirst@outlook.com
 * @blogURL https://blog.csdn.net/ljfirst
 * @description 最长递增子序列
 * 分治法，但是局限于测试连续的递增子串
 */
public class LIS_Divide implements LIS {

    int length;
    int count_best;

    @Override
    public int longestIncreasingSubsequence(String sequence) {
        if (!check(sequence)) {
            return 0;
        }
        length = sequence.length();
        count_best = 0;
        int[] StringArray = sequence2intArray(sequence);
        int bestLength = divide(StringArray, 0, sequence.length() - 1);
        return bestLength;
    }

    //分治
    private int divide(int[] stringArr, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            int leftValue = divide(stringArr, left, mid);
            int rightValue = divide(stringArr, mid + 1, right);
            int midValue = middleHandle(stringArr, left, right);
            return Math.max(Math.max(leftValue, rightValue), midValue);
        }
        return 0;
    }

    private int middleHandle(int[] stringArr, int left, int right) {
        int midd = (left + right) / 2;
        int leftPoint = midd;
        int rightPoint = midd;
        int count = 1;
        //向左扩展
        while (leftPoint - 1 >= left && stringArr[leftPoint] > stringArr[leftPoint - 1]) {
            count++;
            leftPoint--;
        }
        //向右扩展
        while (rightPoint + 1 <= right && stringArr[rightPoint] < stringArr[rightPoint + 1]) {
            count++;
            rightPoint++;
        }
        return count;
    }

}
