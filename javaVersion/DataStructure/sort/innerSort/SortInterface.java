package DataStructure.sort.innerSort;

/**
 * @author liujun
 * @version 1.0
 * @date 2019-11-14 21:27
 * @author—Email liujunfirst@outlook.com
 * @description
 */
public interface SortInterface {

    //所有排序算法的接口
    //输入一个无序数组，输出一个有序的数组
    public void sortMethod(int[] array);

    default boolean check(int[] array) {
        if (array == null || array.length <= 1) {
            return false;
        }
        return true;
    }
}
