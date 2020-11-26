package DataStructure.stringANDline.array.doublePoint;

import java.util.Arrays;
import java.util.List;

/**
 * @author liujun
 * @version 1.0
 * @date 2020/7/20
 * @author—Email liujunfirst@outlook.com
 * @blogURL https://blog.csdn.net/ljfirst
 * @description 3数之和
 * 给定一个数 target，在一维数组中，找出某 3 个数相加得 target。
 * 要求一：如果存在这个 3 个数，返回true，反则返回false。
 * 要求二：返回存在的这 3 个值
 * 要求三：返回存在的这 3 个值在数组中的原位置
 * 要求四：返回所有的 3 数之和的组合
 * 要求五：返回所有的 3 数之和在数组中原位置的组合
 */
public class Find3ValueinArray implements FindValueinArray{

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

    @Override
    public int[] getValue(int[] array, int target) {
        return new int[0];
    }

    @Override
    public int[] getPosition(int[] array, int target) {
        return new int[0];
    }

    @Override
    public List getValues(int[] array, int target) {
        return null;
    }

    @Override
    public List getPositions(int[] array, int target) {
        return null;
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
