package Algorithm.dynamic.lss;

/**
 * @author liujun
 * @version 1.0
 * @date 2019-11-25 16:36
 * @author—Email  liujunfirst@outlook.com
 * @description  最大子段和 LargestSumofSubSequence by dynamic
 * 给定一个数组，求这个数组的连续子数组中，最大的那一段的和
 * @blogURL
 */

public class LSS {

    public int LargestSumofSubSequence(int [] Sequence){
        int sum = 0;
        if(Sequence == null || Sequence.length == 0){
            return 0;
        }
        int length = Sequence.length;
        int[] LargestSum = new int[length];
        sum = LargestSum[0] = Sequence[0];
        if(length == 1){
            return sum;
        }
        for (int i = 1; i < length; i++) {
            LargestSum[i] = Math.max(LargestSum[i-1] + Sequence[i], Sequence[i]);
            if(LargestSum[i] > sum){
                sum = LargestSum[i];
            }
        }
        return sum;
    }
}
