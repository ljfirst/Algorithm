package DataStructure.sort.innerSort.innerSortApply;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author liujun
 * @version 1.0
 * @date 2020/8/25
 * @author—Email liujunfirst@outlook.com
 * @blogURL https://blog.csdn.net/ljfirst
 * @description 统计字符串中字符的数量
 */
public class StatisticCharNum {


    public static Map statistic(String s) {

        Map<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            map.merge(c, 1, Integer::sum);
        }
        System.out.println(map);
        return null;
    }

    public static void main(String[] args) {
        String s = "rtyuijhubhvgcfftgyuhki9u8y7tfcgvu8y5re4rftgvhbjn";
        statistic(s);
    }
}
