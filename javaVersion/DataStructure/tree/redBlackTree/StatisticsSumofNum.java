package DataStructure.tree.redBlackTree;

import java.util.Arrays;
import java.util.HashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @author liujun
 * @version 1.0
 * @date 2018-4-24 Time������12:01:35
 * @authorEmail liujunfirst@outlook.com
 * @description  д�δ��룬����һ���ַ����������ַ�����ֻ�д�Сд��ĸ��������
 * ����ַ����еĳ����������ֵĺͣ�
 * ���� �� 9fil3dj11P0jAsf11j �� �г���������11���Σ����22.
 */
//ͳ���ַ����г��������֮��
public class StatisticsSumofNum {

    /*�����գ�
     * 1.����������ʽ
     * 2.�ַ��������ıȽϷ���
     * 3.hashmap �� stream ���÷�
     */
    public int count(String target) {
		String match = "[0-9a-zA-Z]+";
    	if(target ==null || target.length()==0||!target.matches(match)){
    		return 0;
		}
		String[] s1 = target.split("[a-zA-Z]");

		Arrays.stream(s1).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));


        int statistics = 0;
        int num = 0;
        HashMap<String, Integer> count_map = new HashMap<String, Integer>();
        //����������ʽ
        //String[] s1 = target.split("[\\D]{1,}");
        //String[] s1 = target.split("[^0-9]");
        for (String string : s1) {
            //ע�ⲻ���� ==
            if (!(string.equals(" ") || string.equals(""))) {
                if (count_map.containsKey(string)) {
                    //�˴������map
                    count_map.put(string, count_map.get(string) + 1);
                    //���������Сֵ
                    if (statistics < count_map.get(string)) {
                        statistics = count_map.get(string);
                        num = Integer.parseInt(string);
                    }
                } else {
                    count_map.put(string, 1);
                }
            }
        }
        return statistics * num;
    }
}
