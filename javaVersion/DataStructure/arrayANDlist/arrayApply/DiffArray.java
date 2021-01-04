package DataStructure.arrayANDlist.arrayApply;

/**
 * @author liujun
 * @version 1.0
 * @date 2020/9/8
 * @author—Email liujunfirst@outlook.com
 * @blogURL https://blog.csdn.net/ljfirst
 * @description 前缀和/差分数组
 * 链接：https://mp.weixin.qq.com/s/9L6lz0XDZ9gi-d_iPrSs8Q
 */
public class DiffArray {

    int[] answer;

    //前缀和:返回闭区间[i,j]之间的累加和
    public int[] prefixSum(int[] array) {
        if (array != null && array.length != 0) {
        }
        answer = new int[array.length];
        answer[0] = array[0];
        for (int i = 1; i < array.length; i++) {
            answer[i] = answer[i - 1] + array[i];
        }
        return array;
    }

    public int prefixSumCount(int i, int j) {
        j = Math.min(j, (answer.length - 1));
        i = Math.max(i, 0);
        return i == 0 ? answer[j] : answer[j] - answer[i - 1];
    }

    //差分数组:数组前后两者之差
    public int[] diff_init(int[] array) {
        if (array != null && array.length != 0) {
        }
        answer = new int[array.length];
        answer[0] = array[0];
        for (int i = 1; i < array.length; i++) {
            answer[i] = array[i] - array[i - 1];
        }
        return answer;
    }

    public void diffINC(int begin, int end, int value) {
        answer[begin] += value;
        if (end < answer.length) {
            answer[end] -= value;
        }
    }

    //差分数组:通过差分数组获取原数组
    public int[] diffGetOrigin() {
        int[] target = new int[answer.length];
        target[0] = answer[0];
        for (int i = 1; i < answer.length; i++) {
            target[i] = answer[i] + target[i - 1];
        }
        return target;
    }
}
