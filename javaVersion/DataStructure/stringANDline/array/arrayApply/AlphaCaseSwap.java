package DataStructure.stringANDline.array.arrayApply;


/**
 * @author liujun
 * @version 1.0
 * @date 2018-8-8 下午07:03:55
 * @author—Email liujunfirst@outlook.com
 * @description 大小写互换
 * 将输入字符串的大小写互换，输出时小写字母按序排在前，大写在后。
 */
public class AlphaCaseSwap {

    public String trans(String s) {
        if (s == null || s.length() == 0) {
            return "";
        }
        String[] c1 = s.split("[a-z]");
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < c1.length; i++) {
            sb.append(c1[i].toLowerCase());
        }
        String[] c2 = s.replaceAll("[0-9]", "").split("[A-Z]");
        for (int j = 0; j < c2.length; j++) {
            sb.append(c2[j].toUpperCase());
        }
        return sb.toString();
    }

    public String trans1(String s) {
        if (s == null || s.length() == 0) {
            return "";
        }
        String s1 = s;
        String s2 = s.replaceAll("[a-z]", "").toLowerCase();
        String s3 = s1.replaceAll("[A-Z]", "").replaceAll("[0-9]","").toUpperCase();
        return s2 + s3;
    }
}
