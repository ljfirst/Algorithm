package DataStructure.stringANDline.sequenceANDstring;

import DataStructure.stringANDline.StringCompare;

/**
 * @author liujun
 * @version 1.0
 * @date 2020-02-05 21:08
 * @author—Email  liujunfirst@outlook.com
 * @description 序列匹配
 * 在 源串序列 中是否含有 目标串的 序列
 * @blogURL
 */
public class SequenceExist implements StringCompare {

    @Override
    public boolean compare(String source, String target) {
        return check(source, target) ? exist(source, target) : false;
    }

    //子串匹配
    public boolean exist(String source, String target){

        char[] sourcechar = source.toCharArray();
        char[] targetchar = target.toCharArray();

        int targetlength = 0;
        int sourcelength = 0;
        while (sourcelength < source.length() && targetlength < target.length()){
            if(targetchar[targetlength] == sourcechar[sourcelength]){
                targetlength++;
            }
            sourcelength++;
        }
        return targetlength == target.length();
    }
}
