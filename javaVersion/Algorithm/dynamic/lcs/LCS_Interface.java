package Algorithm.dynamic.lcs;

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
