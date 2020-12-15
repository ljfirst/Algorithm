package DataStructure.stackHeapQueue.stack;

import org.junit.Test;

import java.util.Arrays;
import java.util.Stack;

/**
 * @author liujun
 * @version 1.0
 * @date 2020/12/17
 * @author—Email liujunfirst@outlook.com
 * @blogURL https://blog.csdn.net/ljfirst
 * @description 后缀表达式
 */
public class Calculate_small {

    private String pattern;

    public int cal(String exp) {
        if (exp == null | exp.length() == 0) {
            return Integer.MIN_VALUE;
        }
        String[] s = exp.split(" ");
        Stack<String> op = new Stack<>();
        Stack<String> num = new Stack<>();
        String pattern = "[0-9]+";
        int ans = 0;
        for (int i = 0; i < s.length; i++) {
            if ("+".equals(s[i]) || "-".equals(s[i])) {
                op.push(s[i]);
            } else if("*".equals(s[i]) || "/".equals(s[i])){
                int a1 = Integer.parseInt(num.pop());
                int a2 = Integer.parseInt(num.pop());
                if("*".equals(s[i])){
                    ans = a1*a2;
                }else {
                    ans = a2/a1;
                }
                num.push(String.valueOf(ans));
            }else if (s[i].matches(pattern)) {
                num.push(s[i]);
            }else {
                return Integer.MIN_VALUE;
            }
        }

        while (num.size()!=1){
            int a1 = Integer.parseInt(num.pop());
            int a2 = Integer.parseInt(num.pop());
            String op1 = op.pop();
            if("+".equals(op1)){
                ans = a1+a2;
            }else {
                ans = a2-a1;
            }
            num.push(String.valueOf(ans));
        }

        return Integer.valueOf(num.pop());
    }


    @Test
    public void testans() {
        int target01 = cal(demo01);
        assert target01 == answer01;
        target01 = cal(demo02);
        assert target01 == answer02;
        target01 = cal(demo03);
        assert target01 == answer03;
    }

    String demo01 = "2 3 +";
    int answer01 = 5;
    String demo02 = "2 3 * 5 + 6 -";//2*3+5-6
    int answer02 = 5;
    String demo03 = "16 8 2 / -";//16-8/2=12
    int answer03 = 12;
}
