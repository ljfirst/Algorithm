package DataStructure.sort.innerSort.innerSortApply;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

/** 
 *@author liujun
 *@date 2018-7-30 下午05:13:23
 *@author—Email liujunfirst@outlook.com
 *@description  给定一个英文字符串,
 *请写一段代码找出这个字符串中首先出现三次的那个英文字符(需要区分大小写)。
 *解题思路：
 *1）map方法：
 *  判断字符是否在map中，在的话加一并且判断是否等于三，等于直接输出
 *  map中没有，则置一。
 *2）桶计数排序：
 *  设置26*2个桶，对应位加一。
 *注意事项：
 *1）判断是否是空串
 *2）要求是统计字母，非字母需要过滤。
 *@version 1.0
 */
//统计首次出现的三个字母
public class StatisticFirstThreeChar {

	//map的做法
	public char statisticCharbyMap(String s) {
		if(s == null || s.length() == 0){
			return ' ';
		}
		char [] ch = s.toCharArray();
		Map<Character, Integer> map_char = new HashMap<Character, Integer>();
		String s1 = "[a-zA-Z]+";
		for (int i = 0; i < ch.length; i++) {
			CharSequence cd = s.subSequence(i, i+1);
			//如果此处不用正则，可以使用if(c1-'A'>0 && c1-'z'<0)
			if(Pattern.matches(s1, cd)) {
				char c1 = s.charAt(i);
				if(map_char.containsKey(c1)){
					map_char.put(c1, map_char.get(c1)+1);
					if(map_char.get(c1) == 3){
						return c1;
					}
				}else {
					map_char.put(c1, 1);
				}
			}
		}
		return ' ';
	}

	//桶计数排序
	public char statisticCharbyBucket(String s) {
		if(s == null || s.length() == 0){
			return ' ';
		}
		int [] bucket = new int[58];
		for (int i = 0; i < s.length(); i++) {
			char c1 = s.charAt(i);
			//注意此区间有几个字符不属于字母
			if((c1-'A'>=0 && c1-'Z'<=0) || (c1-'a'>=0 && c1-'z'<=0)){
				bucket[c1-'A']++;
				if(bucket[c1-'A'] == 3){
					return c1;
				}
			}
		}
		return ' ';
	}
	

}
