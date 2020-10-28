package Algorithm.dynamic.lcs;

/**
 * @author liujun
 * @version 1.0
 * @date 2018-7-19 Time：上午10:15:35
 * @author—Email @mail.ustc.edu.cn
 * @description longest common Sequence 最长公共子序列
 * LCS算法，找出两个字符串最大匹配子串。
 */

public interface LCS_Interface {

    //获取LCS的长度
    public int getCommondLength();

    //获取LCS的最长字串
    public String getCommondString();

    //计算方法
    public LCS_Interface count(String source, String pattern);

    default boolean check(String source, String pattern) {
        if (source == null || pattern == null || source.length() == 0 || pattern.length() == 0) {
            return false;
        }
        return true;
    }
}
