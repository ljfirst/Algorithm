package DataStructure.stackHeapQueue.stack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

/**
 * @author liujun
 * @version 1.0
 * @date 2018-5-13 10:29:49
 * @authorEmail liujunfirst@outlook.com
 * @description Calculate 计算器
 * 代码第一部分，处理输入的计算式，处理完输出list: 具体见 JudgeExpress
 * 代码第二部分，中缀表达式转化为后缀表达式
 * 代码第三部分，计算后缀表达式，并返回运算结果
 * <p>
 * 参考博客：https://blog.csdn.net/u010177752/article/details/84743407?utm_medium=distribute.pc_relevant.none-task-blog-BlogCommendFromMachineLearnPai2-7.channel_param&depth_1-utm_source=distribute.pc_relevant.none-task-blog-BlogCommendFromMachineLearnPai2-7.channel_param
 */
public class Calculate {

    JudgeExpress judgeExpress = new JudgeExpress();

    //主要业务代码
    public double calculated(String arabic) {
        if (judgeExpress.check(arabic)) {
            //转换成便于处理的list
            arabic = arabic.replaceAll("\\s*", "");
            List<String> list = string2list(arabic);
            //中缀表达式转化为后缀表达式
            list = infix2suffix(list);
            double value = count(list);
            //计算后缀表达式，并返回运算结果
            //数字不合规的情况下，输出 Integer.MIN_VALUE
            return value;
        }
        return Integer.MIN_VALUE;
    }

    //处理输入的计算式
    public List<String> string2list(String s) {
        List<String> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (isDigital(c)) {
                sb.append(c);
            }
            if (isOption(c)) {
                if (sb.length() != 0) {
                    list.add(sb.toString());
                    sb.delete(0, sb.length());
                }
                list.add(String.valueOf(c));
            }
        }
        if (sb.length() != 0) {
            list.add(sb.toString());
            sb.delete(0, sb.length());
        }
        return list;
    }

    //中缀表达式转化为后缀表达式
    private List<String> infix2suffix(List<String> infixList) {
        List<String> suffixList = new ArrayList<>();
        Stack<String> stackTemp = new Stack<>();
        for (String s : infixList) {
            if ("(".equals(s) || "*".equals(s) || "/".equals(s)) {
                stackTemp.push(s);
            } else if ("+".equals(s) || "-".equals(s)) {
                if (!stackTemp.empty()) {
                    while (!stackTemp.peek().equals("(")) {
                        suffixList.add(stackTemp.pop());
                        if (stackTemp.empty()) {
                            break;
                        }
                    }
                }
                stackTemp.push(s);
            } else if (")".equals(s)) {//右括号出栈
                //如果数据可信，不需要加 !stackTemp.empty()
                while (!stackTemp.empty() && !stackTemp.peek().equals("(")) {
                    suffixList.add(stackTemp.pop());
                }
                stackTemp.pop();
            } else {
                //纯数字 加入
                suffixList.add(s);
            }
        }
        //注意：兜底stack中的数据:需要按照运算优先级加入list中
        if (!stackTemp.empty()) {
            if ((!stackTemp.contains("*") && !stackTemp.contains("/")) ||
                    (!stackTemp.contains("+") && !stackTemp.contains("-"))) {
                Stack<String> s = new Stack();
                while (!stackTemp.empty()) {
                    s.push(stackTemp.pop());
                }
                while (!s.empty()) {
                    suffixList.add(s.pop());
                }
            } else {
                while (!stackTemp.empty()) {
                    suffixList.add(stackTemp.pop());
                }
            }
        }
        return suffixList;
    }

    //计算后缀表达式，并返回运算结果
    private double count(List<String> suffixList) {
        Stack<Double> stack = new Stack();
        for (String temp : suffixList) {
            double value;
            if (!isOption(temp)) {
                if (temp.contains(".")) {//小数转换
                    String[] de = temp.split("\\.");
                    //数字不合规
                    if (de.length > 2 || de[0] == null || de[0].length() == 0) {
                        return Integer.MIN_VALUE;
                    }
                    int v1 = Integer.parseInt(de[0]);
                    value = v1 + Double.parseDouble(de[1]) / Math.pow(10, de[1].length());
                } else {
                    value = Integer.parseInt(temp);
                }
                stack.push(value);
            } else {
                double a1 = stack.pop();
                double a2 = stack.pop();
                double value1 = 0;
                switch (temp) {
                    case "+":
                        value1 = a1 + a2;
                        break;
                    case "-":
                        value1 = a2 - a1;
                        break;
                    case "*":
                        value1 = a1 * a2;
                        break;
                    case "/":
                        value1 = a2 / a1;
                        break;
                }
                stack.push(value1);
            }

        }
        return stack.pop();
    }

    //判断是否为数字，需要考虑到小数点
    private boolean isDigital(char c) {
        return (c >= '0' && c <= '9' || c == '.');
    }

    Character[] c1 = {'+', '-', '*', '/', '(', ')'};
    String[] s1 = {"+", "-", "*", "/", "(", ")"};

    //判断是否为操作符
    private boolean isOption(char c) {
        long count = Arrays.stream(c1).filter(x -> (x == c)).count();
        return count != 0;
    }

    //判断是否为操作符
    private boolean isOption(String c) {
        long count = Arrays.stream(s1).filter(x -> x.equals(c)).count();
        return count != 0;
    }
}