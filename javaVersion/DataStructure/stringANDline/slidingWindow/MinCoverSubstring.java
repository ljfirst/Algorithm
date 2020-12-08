package DataStructure.stringANDline.slidingWindow;

import java.util.*;

/**
 * @author liujun
 * @version 1.0
 * @date 2020/6/23
 * @author—Email liujunfirst@outlook.com
 * @blogURL https://blog.csdn.net/ljfirst
 * @description 最小覆盖子串
 * 在S(source) 中找到包含T(target) 中全部字母的一个子串，且这个子串一定是所有可能子串中最短的
 * 允许T(target)子串中包含多个相同的字符
 * 比如在 sx65ytguhuihuba9d08cuygf4e5f3wsedc89faojinbfre43wedcfgv
 * 中查找 abcdeff 的 最小覆盖子串 是 edc89faojinbf
 */
public class MinCoverSubstring {

    Map<Character, Integer> windowsMap;
    Map<Character, Integer> targetMap;
    //记录下 最小覆盖子串 的起始地址和 长度
    int begin;
    int subLength;

    public String findMinSubString(String source, String target) {
        if (source == null || target == null || source.length() == 0 || target.length() == 0) {
            return "";
        }
        int left = 0;
        int right = 0;
        int count = 0;
        windowsMap = new TreeMap();
        targetMap = new TreeMap();

        for (char c : target.toCharArray()) {
            targetMap.put(c, targetMap.containsKey(c) ? targetMap.get(c) + 1 : 1);
        }
        //记录下 最小覆盖子串 的起始地址和 长度
        begin = 0;
        subLength = Integer.MAX_VALUE;

        //右侧窗口扩张
        while (right < source.length()) {
            char cright = source.charAt(right);
            right++;
            if (targetMap.containsKey(cright)) {
                int num = windowsMap.containsKey(cright) ? windowsMap.get(cright) + 1 : 1;
                windowsMap.put(cright, num);
                if (windowsMap.get(cright) == targetMap.get(cright)) {
                    count++;
                }
            }
            //判断左侧窗口是否进行收缩，注意此处是个循环，不是if
            while (count == targetMap.size()) {
                //更新数据
                if (right - left < subLength) {
                    begin = left;
                    subLength = right - left;
                }
                char cleft = source.charAt(left);
                left++;
                if (targetMap.containsKey(cleft)) {
                    if (windowsMap.get(cleft) == targetMap.get(cleft)) {
                        count--;
                    }
                    windowsMap.put(cleft, windowsMap.get(cleft) - 1);
                }
            }
        }
        return subLength == Integer.MAX_VALUE ? "" : source.substring(begin, begin + subLength);
    }
}
