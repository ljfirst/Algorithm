package Algorithm.dynamic.palindrome;

/**
 * @author liujun
 * @version 1.0
 * @date 2019-11-07 22:42
 * @author—Email liujunfirst@outlook.com
 * @description 判定回文串
 * 判断给定字符串是否是回文，默认单个字符不够成回文
 */
public class FindPalindrome {

    //暴力法发现回文
    public String findStringViolence(String source){

        CreatePalindromebyAdd createPalindromebyAdd = new CreatePalindromebyAdd();
        if(source == null || source.length() == 0){
            return null;
        }
        if(source.length() == 1){
            return source;
        }
        String target = "";
        String pattern = null;
        int length = source.length();
        for (int i = 0; i < length; i++) {
            //因为substring(i,j)截取范围是半开区间[i,j),
            for (int j = i + 2; j <= length; j++) {
                pattern = source.substring(i,j);
                boolean flag = createPalindromebyAdd.PalindromeJudge(pattern);
                if(flag && pattern.length() > target.length()){
                    target = pattern;
                }
            }
        }
        return target.length() > 0 ?  target : null;
    }

    //采用中间开花法查找回文
    public String findString(String source){

        if(source == null || source.length() == 0){
            return null;
        }
        int PalindromeLength = 0;
        int preStringTempLength = 0;
        int PalindromeBegin = 0;
        //获取字符串预处理后的值
        String preString = preDealString(source,'#');
        if(preString != null){
            for (int i = 0; i < preString.length(); i++) {
                preStringTempLength = getPointBound(preString, i);
                if(PalindromeLength < preStringTempLength){
                    PalindromeLength = preStringTempLength;
                    PalindromeBegin = (i - PalindromeLength)/2;
                }
            }
        }
        //长度为1，即未匹配上，返回为空
        if(PalindromeLength == 1){
            return null;
        }
        String targetString = source.substring(PalindromeBegin, PalindromeBegin + PalindromeLength);
        return targetString;
    }

    //字符串预处理，所有间隔位置加#
    public String preDealString(String source, char divideChar){
        //检查字符串是否含有分隔符
        if(source.indexOf(divideChar) != -1){
            return null;
        }
        char[] SPchar = source.toCharArray();
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < source.length(); i++) {
            stringBuffer.append(divideChar);
            stringBuffer.append(SPchar[i]);
        }
        stringBuffer.append(divideChar);
        return stringBuffer.toString();
    }

    //获取以point为中心的回文字符串长度，注意该长度是单边长度
    public int getPointBound(String pattern, int point){

        int length = pattern.length() - 1;
        int leftbound = point - 1;
        int rightbound = point + 1;
        int boundlength = 0;
        while(leftbound >= 0 && rightbound <= length && pattern.charAt(leftbound) == pattern.charAt(rightbound)){
            boundlength++;
            leftbound--;
            rightbound++;
        }
        return boundlength;
    }
}
