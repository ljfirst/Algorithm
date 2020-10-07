package Algorithm.comprehensive.lis;

/**
 * @author liujun
 * @version 1.0
 * @date 2020/6/7
 * @author—Email liujunfirst@outlook.com
 * @blogURL https://blog.csdn.net/ljfirst
 * @description 最长递增子序列 暴力法
 */
public class LIS_Violence implements LisInterface {
    int best_length = 0;
    StringBuffer sb;

    @Override
    public int longestIncreasingSubsequence(String sequence) {
        if (!check(sequence)) {
            return 0;
        }
        //只要他不是空串，那么最小长度一定是 1
        best_length = 1;
        //外循环是字符串的起始位置
        for (int beginLocation = 0; beginLocation < sequence.length() - 1; beginLocation++) {
            //内部循环是暴力字符串的长度增长空间
            for (int subLength = 1; subLength < sequence.length() - beginLocation; subLength++) {
                sb = new StringBuffer();
                sb.append(sequence.charAt(beginLocation));
                dealString(sb, sequence, beginLocation, subLength);
            }
        }
        return best_length;
    }

    //生成字符串，其中beginLocation的字符是必须包含的
    public void dealString(StringBuffer sb, String s, int beginPosition, int strdepth) {

        if (strdepth == 0 && judge(sb.toString())) {
            if (sb.length() > best_length) {
                best_length = sb.length();
            }
            return;
        }
        for (int i = beginPosition + 1; i < s.length(); i++) {
            sb.append(s.charAt(i));
            dealString(sb, s, i, strdepth - 1);
            sb.deleteCharAt(sb.length() - 1);
        }
    }

    //判断字符串是否是递增
    public boolean judge(String s) {
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) - s.charAt(i + 1) >= 0) {
                return false;
            }
        }
        return true;
    }
}
