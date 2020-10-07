package DataStructure.stackHeapQueue.stack;

import java.util.Stack;

/**
 * @author liujun
 * @version 1.0
 * @date 2019-11-30 01:13
 * @authorEmail  liujunfirst@outlook.com
 * @description  判断有效括号
 * @blogURL
 */
public class EffectBrackets {

    //入栈判断法
    public boolean EffectBracketsbyStack(String pattern){
        if(pattern == null || pattern.length() == 0){
            return false;
        }
        Stack stack = new Stack();
        char[] charArray = pattern.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            if(charArray[i] == '('){
                stack.push(charArray[i]);
            }
            if(charArray[i] == ')'){
                if(!stack.empty()){
                    stack.pop();
                }else {
                    return false;
                }
            }
        }
        return stack.empty();
    }

    //数字法
    public boolean EffectBracketsbyTotalNum(String pattern){
        if(pattern == null || pattern.length() == 0){
            return false;
        }
        int TotalNum = 0;
        for (int i = 0; i < pattern.length(); i++) {
            if(pattern.charAt(i) == '('){
                TotalNum++;
            }
            if(pattern.charAt(i) == ')'){
                TotalNum--;
                if(TotalNum < 0){
                    return false;
                }
            }
        }
        return TotalNum == 0;
    }
}