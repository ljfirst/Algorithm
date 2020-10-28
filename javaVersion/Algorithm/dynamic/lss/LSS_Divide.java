package Algorithm.dynamic.lss;

/**
 * @author liujun
 * @version 1.0
 * @date 2019-11-30 00:08
 * @author—Email  liujunfirst@outlook.com
 * @description  最大字段和 分治法
 * 给定一个数组，求这个数组的连续子数组中，最大的那一段的和
 * @blogURL
 */
//LargestSumofSubSequence by divide
public class LSS_Divide {

    public int LargestSumofSubSequence(int[] Sequence) {
        if(Sequence == null || Sequence.length == 0){
            return 0;
        }
        int sum = divide(Sequence, 0, Sequence.length - 1);
        return sum;
    }

    public int divide(int[] Sequence, int left, int right) {
        if (left < right) {//判断终止条件是left == right
            int mid = (left + right) / 2;
            int leftValue = divide(Sequence, left, mid);
            int rightValue = divide(Sequence, mid + 1, right);
            int midValue = mid(Sequence, left, right);
            return Math.max(Math.max(leftValue,rightValue),midValue);
        }
        return Sequence[left];
    }

    public int mid(int[] Sequence, int left, int right) {

        int sum_temp = 0;
        int sum_best = Sequence[left];
        int mid = (left + right) / 2;
        int leftpoint = mid;
        int rightpoint = mid + 1;
        while(leftpoint >= left){
            sum_temp += Sequence[leftpoint];
            sum_best = sum_best > sum_temp ? sum_best : sum_temp;
            leftpoint--;
        }
        sum_temp = sum_best;
        while(rightpoint <= right){
            sum_temp += Sequence[rightpoint];
            sum_best = sum_best > sum_temp ? sum_best : sum_temp;
            rightpoint++;
        }
        return sum_best;
    }
}
