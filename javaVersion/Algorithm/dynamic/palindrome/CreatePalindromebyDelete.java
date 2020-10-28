package Algorithm.dynamic.palindrome;

/** 
 *@author liujun
 *@date 2018-8-16 下午11:19:38
 *@author—Email liujunfirst@outlook.com
 *@description  删除构造回文串
 * 给定一个字符串s，你可以从中删除一些字符，使得剩下的串是一个回文串。
 * 如何删除才能使得回文串最长呢？输出需要删除的字符个数。
 *@version 1.0
 */

//CreatePalindromebyDelete
public class CreatePalindromebyDelete {

	//构造回文串
	public int useLcs(String testString) {
		if(testString == null || testString.length() == 0){
			return -1;
		}
		//得到反转字符串s2
		String s2 = new StringBuffer(testString).reverse().toString();
		//得到数组长度
		int length = testString.length();
		//记录的数组
		int a[][] = new int[length+1][length+1];
		//最长公共子序列匹配
		for(int i = 1; i < length+1; i++){
			for(int j = 1; j < length+1; j++){
				if(testString.charAt(i - 1) == s2.charAt(j - 1)) {
					a[i][j] = a[i-1][j-1] + 1;
				}
				else{
					if(a[i][j-1] > a[i-1][j]){
						a[i][j] = a[i][j-1];
					}else{
						a[i][j] = a[i-1][j];
					}
				}
			}
		}
		//匹配的最大长度
		int match = a[length][length];
		//需要删除掉的长度
		match = length - match;
		return match;
	}
}
