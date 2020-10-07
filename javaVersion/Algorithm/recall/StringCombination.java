package Algorithm.recall;

import java.util.ArrayList;
import java.util.List;

/**
 * @author liujun
 * @version 1.0
 * @date 2018-8-23 上午09:56:39
 * @author—Email liujunfirst@outlook.com
 * @description 将输入字符串按照全排列的方式打印输出
 * @attation 1.Java字符数组如何输出:2种方式。
 * 2.循环处i = depth
 */
public class StringCombination {

    List<String> list;
    String[] answer;

    public String[] print(String s) {
        if (s == null || s.length() == 0) {
            return new String[0];
        }
        char[] c = s.toCharArray();
        list = new ArrayList<>();
        Permutation(c, 0);
        answer = list.toArray(new String[list.size()]);
        return answer;
    }


    public void Permutation(char[] c, int depth) {

        //边界值判断
        if (depth == c.length - 1) {
            //System.out.println(c);
            list.add(String.valueOf(c));
            return;
        }
        //注意：此处i = depth。i之前的元素已经有序，只对后续元素进行全排列
        for (int i = depth + 1; i < c.length; i++) {
            //数组元素交换
            char ch_temp = c[i];
            c[i] = c[depth];
            c[depth] = ch_temp;
            Permutation(c, depth + 1);
        }
    }


}
