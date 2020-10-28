package Algorithm.comprehensive.backpack;

/**
 * @author liujun
 * @version 1.0
 * @date 2018-7-19 上午11:56:26
 * @author-Email liujunfirst@outlook.com
 * @description 回溯法、分支限界法、剪枝法
 */
public class Backpack_Branch implements Backpack {

    /**
     * Goods[] goods;     物品数组
     * int BackpackValue; 背包整体最佳价值
     * int BackpackRealValue;背包实际重量
     */
    Goods[] goods;
    int BackpackValue;
    int tempValue;
    int BackpackRealWeight;
    int BackpackWeight;

    @Override
    public int Backpack(Integer[] goodsvalue, Integer[] weight, int packageweight) {
        if (!check(goodsvalue, weight, packageweight)) {
            return -1;
        }
        BackpackValue = 0;
        tempValue = 0;
        BackpackRealWeight = 0;
        BackpackWeight = packageweight;
        goods = getGoods(goodsvalue, weight);
        count(0);
        return BackpackValue;
    }

    public void count(int depth) {
        if (BackpackRealWeight > BackpackWeight) {
            return;
        }
        BackpackValue = Math.max(BackpackValue, tempValue);
        for (int i = depth; i < goods.length; i++) {
            tempValue += goods[i].prices;
            BackpackRealWeight += goods[i].weight;
            //注意此处是i+1，不是depth+1
            count(i + 1);
            tempValue -= goods[i].prices;
            BackpackRealWeight -= goods[i].weight;
        }
    }
}
