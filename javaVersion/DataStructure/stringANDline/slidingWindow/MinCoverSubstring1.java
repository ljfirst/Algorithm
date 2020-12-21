package DataStructure.stringANDline.slidingWindow;

import java.util.*;

/**
 * @author liujun
 * @version 1.0
 * @date 2020/12/21
 * @author—Email liujunfirst@outlook.com
 * @blogURL https://blog.csdn.net/ljfirst
 * @description 最小覆盖字串
 * 1、要求 最小覆盖字串 中仅仅含有一个字符：[a-z]、[A-Z]
 * 2、要求 最小覆盖字串 中所以符号不能重复
 */
public class MinCoverSubstring1 {

    public int deal(String s) {
        int alphaNum = 0;
        int num = 0;
        Character point = null;
        Queue queue = new LinkedList();
        for (int i = 0; i < s.length(); i++) {
            Character c = s.charAt(i);
            if ((c > 'A' && c < 'Z') || (c > 'a' && c < 'z')) {
                alphaNum++;
                point = c;
                queue.offer(c);
            }
            if (alphaNum <= 1 && !queue.contains(c)) {
                queue.offer(c);
                num = Math.max(num, queue.size());
            } else if (alphaNum > 1) {
                while (queue.peek() != point) {
                    queue.poll();
                }
                queue.poll();
            } else {
                while (queue.peek() != c) {
                    queue.poll();
                }
                queue.poll();
                queue.offer(c);
            }
        }
        return num;
    }
}
