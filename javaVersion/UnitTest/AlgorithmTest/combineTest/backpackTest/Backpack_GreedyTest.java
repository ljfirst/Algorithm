package UnitTest.AlgorithmTest.combineTest.backpackTest;

import Algorithm.comprehensive.backpack.Backpack;
import Algorithm.comprehensive.backpack.Backpack_Greedy;
import org.junit.Test;

/**
 * @author liujun
 * @version 1.0
 * @date 2020/10/29
 * @author—Email liujunfirst@outlook.com
 * @blogURL https://blog.csdn.net/ljfirst
 * @description 背包问题的贪心算法的测试案例
 */
public class Backpack_GreedyTest extends BackpackTest {

    Backpack backpack = new Backpack_Greedy();

    @Test
    public void testBackpack() {
        int value = backpack.Backpack(goodsvalue05, weight05, packageweight05);
        assert value == targetValue05;
        value = backpack.Backpack(goodsvalue051, weight051, packageweight051);
        assert value == targetValue051;
        value = backpack.Backpack(goodsvalue052, weight052, packageweight052);
        assert value == targetValue052;
        value = backpack.Backpack(goodsvalue053, weight053, packageweight053);
        assert value == targetValue053;
    }

    Integer[] goodsvalue05 = {6, 6, 1, 5, 2, 1, 1, 9, 4, 9, 9, 5, 4, 5, 2};
    Integer[] weight05 = {3, 8, 3, 9, 4, 6, 6, 3, 9, 2, 9, 8, 1, 9, 7};
    int packageweight05 = 40;
    int targetValue05 = 50;

    Integer[] goodsvalue051 = {6, 6, 1, 5, 4, 5, 2};
    Integer[] weight051 = {3, 8, 3, 9, 1, 9, 7};
    int packageweight051 = 20;
    int targetValue051 = 17;

    Integer[] goodsvalue052 = {6, 6, 1, 5, 2, 1, 1, 9, 4, 9, 9, 5, 4, 5, 2};
    Integer[] weight052 = {3, 8, 3, 9, 4, 6, 6, 3, 9, 2, 9, 8, 1, 9, 7};
    int packageweight052 = 45;
    int targetValue052 = 53;

    Integer[] goodsvalue053 = {6, 6, 1, 5, 8, 5, 2};
    Integer[] weight053 = {3, 8, 3, 8, 1, 9, 7};
    int packageweight053 = 13;
    int targetValue053 = 20;
}
