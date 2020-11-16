package DataStructure.stringANDline.slidingWindow;

import java.util.Map;
import java.util.TreeMap;

/**
 * @author liujun
 * @version 1.0
 * @date 2020/6/23
 * @author—Email liujunfirst@outlook.com
 * @blogURL https://blog.csdn.net/ljfirst
 * @description 字符串子串包含检测
 * 一个S和一个T，请问你S中是否存在一个子串，包含T中所有字符且不包含其他字符
 * <p>
 * 注意：这道题要注意区别是字符串，不是序列，因此最好是用滑动窗口，而不是仅仅map之间的对比
 */
public class PermutationinString {

    Map<Character, Integer> windowsMap;
    Map<Character, Integer> targetMap;

    public boolean check(String source, String target) {
        if (source == null || target == null || source.length() == 0 || target.length() == 0) {
            return false;
        }
        int left = 0;
        int right = 0;
        int count = 0;
        windowsMap = new TreeMap();
        targetMap = new TreeMap();

        for (char c : target.toCharArray()) {
            targetMap.put(c, targetMap.containsKey(c) ? targetMap.get(c) + 1 : 1);
        }
        //滑动窗口开始
        while (right < source.length()) {
            char cright = source.charAt(right);
            right++;
            if (targetMap.containsKey(cright)) {
                int num = windowsMap.containsKey(cright) ? windowsMap.get(cright) + 1 : 1;
                windowsMap.put(cright, num);
                if (windowsMap.get(cright) == targetMap.get(cright)) {
                    count++;
                }
            } else {
                left = right;
                count = 0;
                windowsMap.clear();
                continue;
            }
            if (right - left == target.length()) {
                if (count == targetMap.size()) {
                    return true;
                }
                char cleft = source.charAt(left);
                if(windowsMap.containsKey(cleft)){
                    windowsMap.put(cleft, windowsMap.get(cleft) - 1);
                    count--;
                }
                left++;
            }
        }
        return false;
    }
}
