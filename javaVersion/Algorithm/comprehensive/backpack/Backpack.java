package Algorithm.comprehensive.backpack;

/**
 * @author liujun
 * @version 1.0
 * @date 2020/10/29
 * @author—Email liujunfirst@outlook.com
 * @blogURL https://blog.csdn.net/ljfirst
 * @description 背包问题
 */
public interface Backpack {

    /**
     * @param goodsvalue    物品的价值
     * @param weight        物品的重量
     * @param packageweight 背包能容纳的重量
     * @return 当前背包下，能装载的最大价值
     */
    public int Backpack(Integer[] goodsvalue, Integer[] weight, int packageweight);

    //背包问题的检查项
    default boolean check(Integer[] goodsvalue, Integer[] weight, int packageweight) {
        if (goodsvalue == null || goodsvalue.length == 0 ||
                weight == null || weight.length == 0 ||
                packageweight <= 0) {
            return false;
        }
        if (goodsvalue.length != weight.length) {
            return false;
        }
        return true;
    }

    default Goods[] getGoods(Integer[] goodsvalue, Integer[] weight) {
        int length = goodsvalue.length;
        Goods[] goods = new Goods[length];
        for (int i = 0; i < length; i++) {
            goods[i] = new Goods(goodsvalue[i], weight[i], (double) goodsvalue[i] / (double) weight[i]);
        }
        return goods;
    }
}
