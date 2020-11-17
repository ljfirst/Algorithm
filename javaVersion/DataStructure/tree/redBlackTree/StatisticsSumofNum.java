package DataStructure.tree.redBlackTree;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @author liujun
 * @version 1.0
 * @date 2018-8-27 下午09:37:31
 * @author—Email liujunfirst@outlook.com
 * @description 统计给定字符串中出现做多的 数字 和 其次数的 乘积
 */

public class StatisticsSumofNum {

    public int count(String target) {
        String match = "[0-9a-zA-Z]+";
        if (target == null || target.length() == 0 || !target.matches(match)) {
            return 0;
        }
        //String[] s1 = target.split("[a-zA-Z]");
        //String[] s1 = target.split("[\\D]{1,}");
        String[] s1 = target.split("[^0-9]");
        //return calculate(s1);
        return calculate1(s1);
    }

    private int calculate(String[] s1) {
        Map<String, Long> map = Arrays.stream(s1).filter(x -> !x.equals("")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        int bigger = 0;
        long num = 0;
        for (String s : map.keySet()) {
            if (num < map.get(s)) {
                num = map.get(s);
                bigger = Integer.parseInt(s);
            }
        }
        return (int) (bigger * num);
    }

    private int calculate1(String[] s1) {
        int statistics = 0;
        int num = 0;
        HashMap<String, Integer> count_map = new HashMap<String, Integer>();
        for (String string : s1) {
            if (!(string.equals(" ") || string.equals(""))) {
                if (count_map.containsKey(string)) {
                    count_map.put(string, count_map.get(string) + 1);
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
