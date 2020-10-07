package DataStructure.stackHeapQueue.stack;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author liujun
 * @version 1.0
 * @date 2020/7/30
 * @author—Email liujunfirst@outlook.com
 * @blogURL https://blog.csdn.net/ljfirst
 * @description 判断一个表达式是否为正确的 数学运算表达式
 * （1.0）字符串是否为空串，     ->样例：null 或者 ""
 * （1.1）将string数据去空格，  ->样例： 23 + 3*5 /   2
 * （1.2）是否仅含数字和字符，   ->样例： 2dd3+8/2c
 * （1.3）判断括号是否符合标准，  ->样例： (4*(2+3)
 * （1.4）判断运算符是否符合标准，->样例： 2+-3     或者  2+（*9）
 * （1.5）判断数字是否标准，     ->样例： 012*003  或者  2+（.23+7）
 */
public class JudgeExpress {

    EffectBrackets effectBrackets = new EffectBrackets();

    //检查并处理字符串
    public boolean check(String s) {
        if (s == null || s.length() == 0) {
            return false;
        }
        //1、将string数据去空格  ：s.replaceAll(" ","");
        s = s.replaceAll("\\s*", "");
        //2、是否仅含数字、字符（+、-、*、/、（、））、小数点
        String pattern = "([+\\-*/()\\d.]?)*";
        if (!s.matches(pattern)) {
            return false;
        }
        //3、判断括号是否符合标准
        if (!effectBrackets.EffectBracketsbyStack(s)) {
            return false;
        }
        //4、判断运算符是否符合标准
        /*List<Character> listChar = new ArrayList() {{
            add('+');
            add('-');
            add('*');
            add('/');
        }};*/
        List<Character> listChar = Stream.of('+','-','*','/').collect(Collectors.toList());
        boolean flagChar = false;
        for (int i = 0; i < s.length(); i++) {
            //出现 双运算符号
            if (flagChar && listChar.contains(s.charAt(i))) {
                return false;
            }
            //出现（ + 运算符，经过前面的括号匹配，所以此处的 i 不可能是最后一位，可以放心使用i+1
            if(s.charAt(i)=='(' && listChar.contains(s.charAt(i+1))){
                return false;
            }
            //出现 运算符 + ）
            if (flagChar && ")".equals(String.valueOf(s.charAt(i)))) {
                return false;
            }
            flagChar = listChar.contains(s.charAt(i));
        }

        //5、判断数字是否标准
        //在 Calculate 的 count 中做过了

        return true;
    }
}
