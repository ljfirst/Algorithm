package Algorithm.comprehensive.backpack;

/**
 * @author liujun
 * @version 1.0
 * @date 2018-7-19 上午11:55:33
 * @author—Email liujunfirst@outlook.com
 * @description 动态规划法
 * 1.状态转换方程
 * 2.如何找出所选物品
 */
public class Backpack_Dynamic implements Backpack {

    /**
     * int[][] bestvalue; 价值矩阵
     * Goods[] goods;     物品数组
     * int BackpackValue; 背包整体最佳价值
     * int BackpackRealValue;背包实际重量
     */
    int[][] bestvalue;
    Goods[] goods;
    int BackpackValue;
    int BackpackRealWeight;

    @Override
    public int Backpack(Integer[] goodsvalue, Integer[] weight, int packageweight) {
        if (!check(goodsvalue, weight, packageweight)) {
            return -1;
        }
        goods = getGoods(goodsvalue, weight);
        BackpackValue = count(goods, packageweight);
        //print(goods, packageweight);
        //printBackpackGoods(goods, packageweight);
        return BackpackValue;
    }

    private int count(Goods[] goods, int packageweight) {
        //价值矩阵，列:背包的重量，行:加入的物品
        bestvalue = new int[packageweight + 1][goods.length + 1];
        //逐层规划,外层循环表示背包重量增加
        for (int i = 1; i <= packageweight; i++) {
            //内层循环,遍历物品
            for (int j = 1; j <= goods.length; j++) {
                //如果放入值比背包总重量还大，放弃
                if (goods[j - 1].weight > i) {
                    bestvalue[i][j] = bestvalue[i][j - 1];
                } else {
                    bestvalue[i][j] = Math.max(
                            bestvalue[i][j - 1],
                            bestvalue[i - goods[j - 1].weight][j - 1] + goods[j - 1].prices
                    );
                }
            }
        }
        return bestvalue[packageweight][goods.length];
    }

    public void print(Goods[] goods, int packageweight) {
        //打印矩阵值
        for (int i = 1; i <= packageweight; i++) {
            for (int j = 1; j <= goods.length; j++) {
                //调整输出格式
                if (bestvalue[i][j] < 10) {
                    System.out.print(" " + bestvalue[i][j] + " ");
                } else {
                    System.out.print(bestvalue[i][j] + " ");
                }
            }
            System.out.println();
        }
    }

    public void printBackpackGoods(Goods[] goods, int packageweight) {
        //存放选择的物品
        int x[] = new int[goods.length];
        //找出所选物品
        int i = packageweight;
        int j = x.length;

        while (j >= 1 && i >= 1) {
            if (bestvalue[i][j] != bestvalue[i][j - 1]) {
                x[j - 1] = 1;//装入第i个物品
                i -= goods[j - 1].weight;
                BackpackRealWeight += goods[j - 1].weight;
                j--;
            } else {
                x[j - 1] = 0;//不装入第i个物品
                j--;
            }
        }

        System.out.println("背包实际转载重量为：" + BackpackRealWeight);
        System.out.println("背包最大价值为：\n" + BackpackValue);
        System.out.println("背包包含物品为：");

        //输出选择的物品
        for (int y = 0; y < x.length; y++) {
            if (x[y] != 0) {
                System.out.print(y + " ");
            }
        }
    }
}
