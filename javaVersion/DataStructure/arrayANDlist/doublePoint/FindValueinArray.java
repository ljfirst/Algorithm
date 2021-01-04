package DataStructure.arrayANDlist.doublePoint;


import java.util.List;

/**
 * @author liujun
 * @version 1.0
 * @date 2020/12/1
 * @author—Email liujunfirst@outlook.com
 * @blogURL https://blog.csdn.net/ljfirst
 * @description n数之和
 * 给定一个数 target，在一维数组中，找出某 n 个数相加得 target。
 * 要求一：如果存在这个 n 个数，返回true，反则返回false。
 * 要求二：返回所有的 n 数之和的组合
 * 要求三：返回所有的 n 数之和在数组中原位置的组合
 */

public interface FindValueinArray {

    /**
     * @param array
     * @param target 给定的查找值
     * @return 如果存在这个 n 个数，返回true，反则返回false。
     */
    boolean exist(int[] array, int target);

    /**
     * @return 返回所有的 n 数之和的组合
     */
    List getValues(int[] array, int target);

    /**
     * @return 返回所有的 n 数之和在数组中原位置的组合
     */
    List getPositions(int[] array, int target);

}
