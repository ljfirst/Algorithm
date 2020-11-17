package Algorithm.dynamic;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author liujun
 * @version 1.0
 * @date 2020/6/29
 * @author—Email liujunfirst@outlook.com
 * @blogURL https://blog.csdn.net/ljfirst
 * @description 字符组成判断
 * 给定一个非空的字符串s和一个字典wordDict
 * 判断 s 是否可以由 wordDict 里面的词组成
 * s = "leetcode",
 * dict = ["leet", "code"]
 */
public class StringInDic {

    public boolean findWord(String s, String[] wordDict) {
        if (!check(s, wordDict)) {
            return false;
        }
        //位置0是起始点，真正对比是在1号位开始，所以总体长度是s.length() + 1
        boolean[] flagArray = new boolean[s.length() + 1];
        //启动项，一定要置为true
        flagArray[0] = true;

        for (int i = 1; i <= s.length(); i++) {
            for (int j = i - 1; j >= 0; j--) {
                String temp = s.substring(j, i);
                if (flagArray[j] && findWordinwordDict(temp, wordDict)) {
                    flagArray[i] = true;
                    break;//防止 被改写
                }
            }
        }
        return flagArray[s.length()];
    }

    public boolean findWordinwordDict(String s1, String[] wordDict) {

        List l = Arrays.stream(wordDict).filter(x -> x.equals(s1)).collect(Collectors.toList());
        return l.size() != 0;
        /*for (String ss : wordDict) {
            if (ss.equals(s1)) {
                return true;
            }
        }
        return false;*/
    }

    private boolean check(String s, String[] wordDict) {
        //字符串不是空串，字典部位空
        if (s == null || s.length() == 0 || wordDict == null || wordDict.length == 0) {
            return false;
        }
        //stream 写法
        if (wordDict.length != Arrays.stream(wordDict).filter(s1 -> (s1 != null || s1.length() != 0)).count()) {
            return false;
        }
        return true;
    }
}
