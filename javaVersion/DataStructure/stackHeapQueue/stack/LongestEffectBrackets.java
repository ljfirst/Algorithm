package DataStructure.stackHeapQueue.stack;

/**
 * @author liujun
 * @version 1.0
 * @date 2019-12-01 17:48
 * @authorEmail  liujunfirst@outlook.com
 * @description  判断最长有效括号
 * @blogURL
 */
public class LongestEffectBrackets {

    EffectBrackets effectBrackets = new EffectBrackets();
    //??????????Ч?????????????
    public int LongestEffectBracketsNum_violence(String pattern){
        if(pattern == null || pattern.length() == 0){
            return 0;
        }
        int sum = 0;
        for (int i = 0; i < pattern.length() - 1; i++) {
            for (int j = i + 1; j < pattern.length(); j++) {
                if(effectBrackets.EffectBracketsbyTotalNum(pattern.substring(i, j + 1))) {
                    sum = j - i + 1 > sum ? j - i + 1 : sum;
                }
            }
        }
        return sum;
    }

    //??????????Ч????
    public int LongestEffectBracketsNum_(String pattern){
        if(pattern == null || pattern.length() == 0){
            return 0;
        }
        int sum = 0;

        return sum;
    }
}
