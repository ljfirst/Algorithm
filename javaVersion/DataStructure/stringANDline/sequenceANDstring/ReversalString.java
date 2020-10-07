package DataStructure.stringANDline.sequenceANDstring;

/**
 * @author liujun
 * @version 1.0
 * @date 2020/8/25
 * @author—Email liujunfirst@outlook.com
 * @blogURL https://blog.csdn.net/ljfirst
 * @description 反转字符串
 * 例如：从$开始反转字符串："123$456789" -> "456789$123"
 */
public class ReversalString {

    public String method(String s, char c1) {
        if (s == null || s.length() == 0) {
            return null;
        }
        char[] c = s.toCharArray();
        int num = s.indexOf(c1);
        if (num == -1) {
            return s;
        }
        int length = s.length();
        //需要注意此处的i <= (num - 1) / 2，而不是i <= num / 2
        for (int i = 0; i <= (num - 1) / 2; i++) {
            char temp = c[i];
            c[i] = c[num - 1 - i];
            c[num - 1 - i] = temp;
        }
        for (int i = 0; i < (length - num) / 2; i++) {
            char temp = c[num + 1 + i];
            c[num + 1 + i] = c[length - 1 - i];
            c[length - 1 - i] = temp;
        }
        for (int i = 0; i < length / 2; i++) {
            char temp = c[i];
            c[i] = c[length - 1 - i];
            c[length - 1 - i] = temp;
        }
        String target = String.valueOf(c);
        return target;
    }
}
