package DataStructure.stringANDline.array.findValue;

/**
 * @author liujun
 * @version 1.0
 * @date 2020/8/31
 * @author—Email liujunfirst@outlook.com
 * @blogURL https://blog.csdn.net/ljfirst
 * @description 找数字
 * 在一组数中，每个数都出现了两次，但是出现了唯独一个数，仅出现一次，找出这个数
 */
public class FindSingleValue {

    public int get(int[] array) {
        if (array == null || array.length == 0) {
            return Integer.MIN_VALUE;
        }
        int value = 0;
        for (int i = 0; i < array.length; i++) {
            value ^= array[i];
        }
        return value;
    }
}
