package Algorithm.dynamic.palindrome;
/** 
 *@author liujun
 *@date 2018-8-19 上午01:34:47
 *@author—Email liujunfirst@outlook.com
 *@description  给定一个字符串s，你可以从中 添加 一个 字符，使得剩下的串是一个回文串，
 * 如果通过添加一个字符得到回文，则返回添加元素的位置(起始地址：1)，否则返回 -1，
 * 如果本身是回文，返回中间的位置；
 *
 *方法一：设置两个指针，头指针指向字符串首部，尾指针指向字符串尾部。若头尾指针相等，
 *     头指针加加，尾指针减减，向中间靠拢，若不相等，则进一步判断（头指针++，尾指针）
 *     和（头指针，尾指针--）中是否存在回文，运用递归完成。
 *方法二：既然可以通过添加构造回文，那么也可以通过删除一个构造回文。
 *方法三：判断原字符串和翻转字符串的最长公共子序列长度是否比原字符串长度小1或相等
 *注意：单独写一个回文判断函数。
 *
 * 验证：如果通过添加一个字符得到回文，则返回删除元素的位置(起始地址：0)，否则返回 -1.
 *@version 1.0
 */
public class CreatePalindromebyAdd {

	//方法一：首位对比
	public int headAndTailCompare(String testString) {
		if(testString == null || testString.length() == 0){
			return -1;
		}
		if(PalindromeJudge(testString)){
			return testString.length()/2;
		}
		int length = testString.length();
		for (int head = 0, tail = length - 1; head < tail; head++, tail--) {
			if(testString.charAt(head) != testString.charAt(tail)){
				//如果是头指针不相等
				if(PalindromeJudge(testString.substring(head, tail))){
					return tail;
				}else if(PalindromeJudge(testString.substring(head + 1, tail+ 1))){
					return head;
				}else {
					return -1;
				}
			}
		}
		return -1;
	}
	
	//方法二：删除构造
	public int useDelete(String testString) {

		if(testString == null || testString.length() == 0){
			return -1;
		}
		if(PalindromeJudge(testString)){
			return testString.length()/2;
		}
		for (int i = 0; i < testString.length(); i++) {
			String SourceString = testString.replaceFirst(String.valueOf(testString.charAt(i)),"");
			if(PalindromeJudge(SourceString)){
				return i;
			}
		}
		return -1;
	}
	
	//方法三：LCS思想
	public int useLCS(String testString) {

		if(testString == null || testString.length() == 0){
			return -1;
		}
		if(PalindromeJudge(testString)){
			return testString.length()/2;
		}
		//首先获取字符串长度和反转字符串
		int length = testString.length();
		String test2 = new StringBuffer(testString).reverse().toString();
		//进行LCS匹配
		int[][] matrix = new int[length + 1][length + 1];
		for (int i = 1; i < length + 1; i++) {
			for (int j = 1; j < length + 1; j++) {
				if(testString.charAt(i - 1) == test2.charAt(j - 1)){
					matrix[i][j] = matrix[i - 1][j - 1] + 1;
				}else {
					matrix[i][j] = matrix[i - 1][j] > matrix[i][j - 1] ? 
							matrix[i - 1][j] : matrix[i][j - 1];
				}
			}
		}
		int flag = 0;
		for (int i = 1, j = 1; j < length; i++, j++) {
			if(matrix[i][j] == matrix[i+1][j+1]){
				flag = i + 1;
				break;
			}
		}
		//判断匹配书是否等于长度或者长度减一
		if(matrix[length][length] == length - 1){
			return flag;
		}
		return -1;
	}
	
	//回文判断
	public boolean PalindromeJudge(String testString) {
		if(testString == null || testString.length() == 0){
			return false;
		}
		boolean flag = new StringBuffer(testString).reverse().toString().equals(testString);
	    return flag;
	}
}
