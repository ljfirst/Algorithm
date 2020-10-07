package DataStructure.stringANDline.array.findValue;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author liujun
 * @version 1.0
 * @date 2020/9/1
 * @author—Email liujunfirst@outlook.com
 * @blogURL https://blog.csdn.net/ljfirst
 * @description 找数字
 * 在一组数中，其他每个数都只出现一次，仅有一个数，出现了两次，找出这个数。
 */
public class FindSingleValueOpsss {
    public int get(int[] array) {
        if (array == null || array.length == 0) {
            return Integer.MIN_VALUE;
        }
        return method(array);
    }

    public int method(int[] array) {
        int num = Integer.MIN_VALUE;
        Map<Integer, Integer> map = new LinkedHashMap<>();
        int count = 0;
        for (int x : array) {
            count = map.get(x) == null ? 1 : map.get(x) + 1;
            map.put(x, count);
            num = count == 2 ? x : num;
        }
        return num;
    }

    /*public int method1(int[] array) {
        int one = 0, two = 0, three = 0;
        for (int x : array) {
            two ^= (x & one);
            one ^= x;
            three = one & two;
            //刷新 one 和 two
            one &= ~three;
            two &= ~three;
        }
        return two;
    }*/
}
