package DataStructure.stringANDline.slidingWindow;

import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;

/**
 * @author liujun
 * @version 1.0
 * @date 2018-12-17 下午02:14:33
 * @author—Email liujunfirst@outlook.com
 * @description 最长无重复子串
 * LongestnoRepeatSubstring
 * 给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。
 * @URL https: //leetcode-cn.com/explore/interview/card/bytedance/242/string/1012/
 */

public class LNRSubstring {

    //桶排序
    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        //用于记录的桶
        int[] bottle = new int[128];
        int count = 0;
        for (int begin = 0, j = 0; j < s.length(); j++) {
            //找出子串起始位置，通过重复值来判断
            begin = Math.max(bottle[s.charAt(j)], begin);
            //更新记录值
            count = Math.max(count, j - begin + 1);
            //更新桶序号对应的子串起始位置
            bottle[s.charAt(j)] = j + 1;
        }
        return count;
    }

    public int lengthOfLongestSubstring2(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        int left = 0;
        int right = 0;
        //记录元素及其坐标
        Map<Character, Integer> windows = new TreeMap<>();
        int count = windows.size();
        while (right < s.length()) {
            char c = s.charAt(right);
            if (!windows.containsKey(c)) {
                windows.put(c, right);
                count = Math.max(windows.size(), count);
            } else {
                int temp = windows.get(c);
                while (left <= temp) {
                    windows.remove(s.charAt(left));
                    left++;
                }
                windows.put(c, right);
            }
            right++;
        }
        return count;
    }

    //use map
    public int lengthOfLongestSubstring3(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        int left = 0;
        int right = 0;
        int count = 0;
        //记录元素及其坐标
        Map<Character, Integer> windows = new TreeMap<>();
        while (right < s.length()) {
            Character c = s.charAt(right);
            if (!windows.containsKey(c)) {
                windows.put(c, right);
                count = Math.max(windows.size(), count);
            } else {
                while (left < right && windows.containsKey(c)) {
                    windows.remove(s.charAt(left));
                    left++;
                }
                windows.put(c, right);
            }
            right++;
        }
        return count;
    }

    //use queue
    public int lengthOfLongestSubstring4(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        int right = 0;
        //记录元素及其坐标
        Queue<Character> windows = new LinkedList<>();
        int count = windows.size();
        while (right < s.length()) {
            char c = s.charAt(right);
            if (!windows.contains(c)) {
                windows.add(c);
                count = Math.max(windows.size(), count);
            } else {
                while (windows.contains(c)) {
                    windows.poll();
                }
                windows.add(c);
            }
            right++;
        }
        return count;
    }
}
