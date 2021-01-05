package DataStructure.arrayANDlist.xor;

/**
 * @author liujun
 * @version 1.0
 * @date 2020/8/31
 * @author—Email liujunfirst@outlook.com
 * @blogURL https://blog.csdn.net/ljfirst
 * @description 找数字
 * 一个整型数组里除了两个数字之外，其他的数字都出现了两次。请写程序找出这两个只出现一次的数字
 */
public class FindNum_DOuble_One_One {

    public int[] get(int[] array) {
        if (array == null || array.length == 0) {
            return new int[]{};
        }
        int temp = 0;
        for (int i = 0; i < array.length; i++) {
            temp ^= array[i];
        }
        int point = 1;
        for (int i = 0; i < 32; i++) {
            //从低位试探出不为0的那一位
            if ((temp & point) != 0) {
                break;
            }
            point <<= 1;
        }
        int x = Integer.MIN_VALUE;
        int y = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            //根据这一位区分两堆数组，分别求独立数
            if ((array[i] & point) == 0) {
                x ^= array[i];
            } else {
                y ^= array[i];
            }
        }
        if (x == Integer.MIN_VALUE || y == Integer.MIN_VALUE) {
            return new int[]{};
        }
        x -= Integer.MIN_VALUE;
        y -= Integer.MIN_VALUE;
        if (x > y) {
            x = x + y;
            y = x - y;
            x = x - y;
        }
        int[] z = new int[]{x, y};
        return z;
    }
}
