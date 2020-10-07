package DataStructure.stringANDline.sequenceANDstring;

/**
 * @author liujun
 * @version 1.0
 * @date 2020/8/21
 * @author—Email liujunfirst@outlook.com
 * @blogURL https://blog.csdn.net/ljfirst
 * @description 在给定字符串中找出最小循环的字符串
 * 输入：abcdabcdabcd  输出：abcd
 * 考虑到最后的末尾允许添加补齐来凑齐字符串，那么存在
 * 输入：abcdabcda     输出：abcd
 * 对于未发现循环的字符串，输出其本身
 *
 * 解题思路：
 * （1）暴力法：从头开始阻隔字符串增加，并进行比对。
 * （2）前缀字符串匹配法
 */
public class FindShortString {

    public String comp(String source){
        if(source==null||source.length()==0){
            return null;
        }
        return "";
    }
}
