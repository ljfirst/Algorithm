package DataStructure.stringANDline.stringCompare;

import DataStructure.stringANDline.StringCompare;

/**
 *@author liujun
 *@date 2019-8-26 ����07:32:21
 *@author��Email liujunfirst@outlook.com
 *@CSDN Blog URL:
 *@description  Sunday算法匹配字符串
 *@version 1.0
 */
public class Sunday implements StringCompare {
	@Override
	public boolean compare(String source, String target) {
		return check(source, target) ? SundaySolution(source, target) : false;
	}

	//�ַ���ƥ�䴮ƥ��
	public boolean SundaySolution(String source, String pattern) {
		
		int sourceIndex = 0;
		int patternIndex = 0;

		while(sourceIndex < source.length()){
			int temp = sourceIndex + pattern.length();
			while (sourceIndex < source.length() && patternIndex < pattern.length()) {
				if(source.charAt(sourceIndex) == pattern.charAt(patternIndex)){
					sourceIndex++;
					patternIndex++;
				}else{
					if(temp < source.length() && pattern.lastIndexOf(source.charAt(temp)) != -1){
						//����ָ��������λ��
						sourceIndex = temp - pattern.lastIndexOf(source.charAt(temp));
					}else{
						sourceIndex = temp +1;
					}
					patternIndex = 0;
					break;
				}
			}
			if(patternIndex == pattern.length()){
				return true;
			}
		}
		return false;
	}
}
