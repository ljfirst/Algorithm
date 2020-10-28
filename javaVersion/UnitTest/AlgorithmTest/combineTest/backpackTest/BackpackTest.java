package UnitTest.AlgorithmTest.combineTest.backpackTest;

import Algorithm.comprehensive.backpack.Backpack;

/**
 * @author liujun
 * @version 1.0
 * @date 2020/10/29
 * @author—Email liujunfirst@outlook.com
 * @blogURL https://blog.csdn.net/ljfirst
 * @description 背包问题 基础案例
 */
public class BackpackTest {

    public void testBackpack(Backpack backpack) {
        int value = backpack.Backpack(goodsvalue01, weight01, packageweight01);
        assert value == targetValue01;
        value = backpack.Backpack(goodsvalue02, weight02, packageweight02);
        assert value == targetValue02;
        value = backpack.Backpack(goodsvalue03, weight03, packageweight03);
        assert value == targetValue03;
        value = backpack.Backpack(goodsvalue04, weight04, packageweight04);
        assert value == targetValue04;
        value = backpack.Backpack(goodsvalue041, weight041, packageweight041);
        assert value == targetValue041;
    }

    //物品价值、物品重量、背包的重量
    Integer[] goodsvalue01 = {};
    Integer[] weight01 = {3, 8, 3, 9, 4, 6, 6, 3, 9, 2, 9, 8, 1, 9, 7};
    int packageweight01 = -9;
    int targetValue01 = -1;

    Integer[] goodsvalue02 = {3, 8, 3, 9, 4, 6, 6, 3, 9, 2, 9, 8, 1, 9, 7};
    Integer[] weight02 = {};
    int packageweight02 = 90;
    int targetValue02 = -1;

    Integer[] goodsvalue03 = null;
    Integer[] weight03 = null;
    int packageweight03 = -9;
    int targetValue03 = -1;

    Integer[] goodsvalue04 = {3, 8, 3, 9, 4, 6, 6, 3, 9, 2, 9, 8, 1, 9, 7};
    Integer[] weight04 = {3, 8, 3, 9, 4, 6, 6, 3, 9, 2, 9, 8, 1, 9, 7};
    int packageweight04 = 1;
    int targetValue04 = 1;

    Integer[] goodsvalue041 = {3, 8, 3, 9, 4, 6, 6, 3, 9, 2, 9, 8, 1, 9, 7};
    Integer[] weight041 = {3, 8, 3, 9, 4, 6, 6, 3, 9, 8, 1, 9, 7};
    int packageweight041 = 1;
    int targetValue041 = -1;
}
