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

    public int findMinSubString(String s) {
        int alphaNum = 0;
        int num = 0;
        Character point = null;
        Queue<Character> queue = new LinkedList();
        for (int i = 0; i < s.length(); i++) {
            Character c = s.charAt(i);
            if ((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z')) {
                if (point!=null && !queue.contains(point)) {
                    alphaNum = 0;
                }
                alphaNum++;
                if (alphaNum > 1) {
                    num = Math.max(num, queue.size());
                    sub(queue, point, false);
                    alphaNum--;
                }
                point = c;
                queue.offer(c);
                num = Math.max(num, queue.size());
                continue;
            }
            if (!queue.contains(c)) {
                queue.offer(c);
                num = Math.max(num, queue.size());
            } else {
                sub(queue, c, true);
            }
        }
        return num;
    }


    private void sub(Queue<Character> queue, Character c, boolean flag) {
        while (queue.peek() != c) {
            queue.poll();
        }
        queue.poll();
        if (flag) {
            queue.offer(c);
        }
    }
}
