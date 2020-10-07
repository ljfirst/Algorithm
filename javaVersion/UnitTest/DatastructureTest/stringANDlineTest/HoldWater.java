package UnitTest.DatastructureTest.stringANDlineTest;

/**
 * @author liujun
 * @version 1.0
 * @date 2020/7/1
 * @author—Email liujunfirst@outlook.com
 * @blogURL https://blog.csdn.net/ljfirst
 * @description
 */
public interface HoldWater {
    public int calculate(int[] array);

    default boolean check(int[] array) {
        if (array == null || array.length == 0) {
            return false;
        }
        return true;
    }
}
