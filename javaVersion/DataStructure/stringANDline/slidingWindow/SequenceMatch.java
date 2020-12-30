package DataStructure.stringANDline.slidingWindow;

import DataStructure.stringANDline.stringCompare.StringCompare;

/**
 * @author liujun
 * @version 1.0
 * @date 2020-02-05 21:08
 * @author—Email liujunfirst@outlook.com
 * @description 序列匹配
 * 在 源串序列(source) 中是否含有 目标串的(target) 序列
 * @blogURL
 */
public class SequenceMatch implements StringCompare {

    @Override
    public boolean compare(String source, String target) {
        return check(source, target) && match(source, target);
    }

    //子串匹配
    private boolean match(String source, String target) {
        char[] sourcechar = source.toCharArray();
        char[] targetchar = target.toCharArray();

        int targetlength = 0;
        int sourcelength = 0;
        while (sourcelength < source.length() && targetlength < target.length()) {
            if (targetchar[targetlength] == sourcechar[sourcelength]) {
                targetlength++;
            }
            sourcelength++;
        }
        return targetlength == target.length();
    }

}
