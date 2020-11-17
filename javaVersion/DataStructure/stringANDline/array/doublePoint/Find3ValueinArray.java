package DataStructure.stringANDline.array.doublePoint;

import DataStructure.stringANDline.array.doublePoint.Find2ValueinArray;

import java.util.Arrays;

/**
 * @author liujun
 * @version 1.0
 * @date 2020/7/20
 * @author—Email liujunfirst@outlook.com
 * @blogURL https://blog.csdn.net/ljfirst
 * @description 给定一个数 a，在一维数组中，找出某两个数相加得 a。
 * 要求一：判断是否存在这样的三个数，存在返回true，否则返回false。
 * 要求二：返回这三个数在数组中的位置
 */
public class Find3ValueinArray {

    Find2ValueinArray f = new Find2ValueinArray();

    //要求一：判断是否存在这样的三个数，存在返回true，否则返回false。
    public boolean exist(int[] array, int value) {
        if (array == null || array.length == 0) {
            return false;
        }
        for (int i = 0; i < array.length; i++) {
            int target = value - array[i];
            if (f.exist(array, target)) {
                return true;
            }
        }
        return false;
    }

    //要求二：返回这三个数在数组中的位置
    public int[] getValuePosition(int[] array, int value) {
        if (array == null || array.length <= 2) {
            return new int[]{};
        }
        int[] a = {-1, -1, -1};
        int[] b;
        int[] sd;
        for (int i = 0; i < array.length; i++) {
            a[0] = i;
            sd = Arrays.copyOf(array, array.length);
            //防重复选值
            sd[i] = Integer.MIN_VALUE;
            if (f.exist(array, value - array[i])) {
                b = f.getValuePosition(sd, value - array[i]);
                a[1] = b[0];
                a[2] = b[1];
                return a;
            }
        }
        //查找失败
        a[0] = -1;
        return a;
    }
}
