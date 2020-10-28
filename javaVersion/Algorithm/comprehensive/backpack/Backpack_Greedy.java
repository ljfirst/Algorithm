package Algorithm.comprehensive.backpack;

import DataStructure.sort.innerSort.innerSortRealize.InsertSort;

/**
 * @author liujun
 * @version 1.0
 * @date 2018-7-19 上午11:56:07
 * @author—Email liujunfirst@outlook.com
 * @description 贪心算法
 */
public class Backpack_Greedy implements Backpack {

    /**
     * Goods[] goods;     物品数组
     * int BackpackValue; 背包整体最佳价值
     * int BackpackRealValue;背包实际重量
     */
    Goods[] goods;
    int BackpackValue;
    int BackpackRealWeight;

    @Override
    public int Backpack(Integer[] goodsvalue, Integer[] weight, int packageweight) {
        if (!check(goodsvalue, weight, packageweight)) {
            return -1;
        }
        BackpackValue = 0;
        BackpackRealWeight = packageweight;
        goods = getGoods(goodsvalue, weight);
        InsertSort.sortMethodT(goods);
        for (int i = goodsvalue.length - 1; i >= 0; i--) {
            if (packageweight >= goods[i].weight) {
                BackpackValue += goods[i].prices;
                packageweight -= goods[i].weight;
            }
        }
        BackpackRealWeight = BackpackRealWeight - packageweight;
        return BackpackValue;
    }

}
