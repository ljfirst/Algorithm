package Algorithm.comprehensive.backpack.imply;

import java.util.*;

/**
 * @author liujun
 * @version 1.0
 * @date 2020/7/21
 * @author—Email liujunfirst@outlook.com
 * @blogURL https://blog.csdn.net/ljfirst
 * @description 零食购买分配
 */
public class Backpack_foodImpl implements Backpack_food {
    /**
     * target：选取的零食的种类及实际花费
     *
     * @params foodName 零食名称
     * @params prices   零食价格
     * @params sumMoney 总预算
     */
    public List<String> foodList_method_dynamic;
    public double realMoney_method_dynamic;

    public void method_dynamic(String[] foodName, double[] prices, int sumMoney) {
        realMoney_method_dynamic = 0;
        foodList_method_dynamic = new ArrayList<>();
        //价值矩阵，列:背包的重量，行:加入的物品
        int[][] bestvalue = new int[sumMoney + 1][prices.length + 1];

        //逐层规划,外层循环表示背包重量增加
        for (int i = 1; i <= sumMoney; i++) {
            //内层循环,遍历物品
            for (int j = 1; j <= prices.length; j++) {

                //如果放入值比背包总重量还大，放弃
                if (prices[j - 1] > i) {
                    bestvalue[i][j] = bestvalue[i][j - 1];
                } else {
                    bestvalue[i][j] =
                            bestvalue[i][j - 1] > bestvalue[(int) Math.floor(i - prices[j - 1])][j - 1] + prices[j - 1] ?
                                    bestvalue[i][j - 1] : (int) (bestvalue[(int) Math.floor(i - prices[j - 1])][j - 1] + prices[j - 1]);
                }
            }
        }

        //存放选择的物品
        int x[] = new int[foodName.length];
        //找出所选物品
        int i = sumMoney;
        int j = foodName.length;

        while (j >= 1 && i >= 1) {
            if (bestvalue[i][j] != bestvalue[i][j - 1]) {
                x[j - 1] = 1;//装入第i个物品
                i -= prices[j - 1];
                realMoney_method_dynamic += prices[j - 1];
                j--;
            } else {
                x[j - 1] = 0;//不装入第i个物品
                j--;
            }
        }

        //输出选择的物品
        for (int y = 0; y < x.length; y++) {
            if (x[y] != 0) {
                //System.out.print(foodName[y] + " ");
                foodList_method_dynamic.add(foodName[y]);
            }
        }
    }

    public void method_greed(String[] foodName, double[] prices, int sumMoney) {

    }

    /**
     * target：选取的零食的种类、数量及实际花费
     *
     * @params foodName 零食名称
     * @params prices   零食价格
     * @params sumMoney 总预算
     */
    public void method2(String[] foodName, double[] prices, int sumMoney) {
        double realMoney = 0;
        System.out.println("实际花费:" + realMoney);
        System.out.println("选取的零食种类:");
    }

    /**
     * target：在照顾到总额和零食偏好度的情况下，输出选取的零食的种类及实际花费。
     *
     * @params foodName 零食名称
     * @params prices   零食价格
     * @params lover    零食喜好度
     * @params sumMoney 总预算
     */
    public List<String> foodList_method3;
    public double realMoney_method3;
    public int times;

    public void method3(String[] foodName, double[] prices, double[] lover, int sumMoney) {
        foodList_method3 = new ArrayList<>();
        realMoney_method3 = 0;
        times = 0;
        int gap = 5;

        int length = foodName.length;

        //冒泡排序：筛选贪心位置
        double[] proportion = new double[length];
        for (int i = 0; i < length; i++) {
            proportion[i] = lover[i] / prices[i];
        }
        boolean flag = false;

        for (int i = 0; i < length - 1; i++) {
            for (int j = 0; j < length - 1 - i; j++) {
                if (proportion[j] > proportion[j + 1]) {
                    flag = true;
                    //贪心比
                    double temp = proportion[j];
                    proportion[j] = proportion[j + 1];
                    proportion[j + 1] = temp;
                    //食品名
                    String name = foodName[j];
                    foodName[j] = foodName[j + 1];
                    foodName[j + 1] = name;
                    //食品价格
                    temp = prices[j];
                    prices[j] = prices[j + 1];
                    prices[j + 1] = temp;
                }
            }
            if (!flag) {
                break;
            }
            flag = false;
        }
        int point = length - 1;
        double sumMoney_temp = 0;
        double sumMoney_4temp = sumMoney;
        //贪心装载
        while (sumMoney_4temp > prices[point]) {
            sumMoney_temp += prices[point];
            sumMoney_4temp -= prices[point];
            foodList_method3.add(foodName[point]);
            point--;
            //对于特别好吃的，最多只能选5种
            if (length - point >= gap) {
                break;
            }
        }
        //u：所选产品的倍数，uu：所选产品后，剩余的钱，y:剩余food种类
        times = (int) Math.floor(sumMoney / sumMoney_temp);
        if (times > 4) {
            times -= 4;
        }
        double remain_money = sumMoney - times * sumMoney_temp;

        String[] remain_food = new String[point + 1];
        double[] remain_prices = new double[point + 1];

        for (int i = point; i >= 0; i--) {
            remain_food[i] = foodName[i];
            remain_prices[i] = prices[i];
        }
        //剩余价值进行动态规划
        method_dynamic(remain_food, remain_prices, (int) Math.floor(remain_money));
        realMoney_method3 = times * sumMoney_temp + realMoney_method_dynamic;
    }

    public Map<String, Integer> food_map = new TreeMap<>();
    public double realMoney_method4;
    public int times4;

    public void method4(String[] foodName, double[] prices, double[] lover, int sumMoney) {
        //gap表示限制选取的贪心比最高的food的数量
        int gap = 5;
        method4_gap(foodName, prices, lover, sumMoney, gap);
    }

    public void method4_gap(String[] foodName, double[] prices, double[] lover, int sumMoney, int gap) {
        realMoney_method4 = 0;
        times4 = 0;

        int length = foodName.length;
        //冒泡排序：筛选贪心位置
        double[] proportion = new double[length];
        for (int i = 0; i < length; i++) {
            proportion[i] = lover[i] / prices[i];
        }
        boolean flag = false;
        for (int i = 0; i < length - 1; i++) {
            for (int j = 0; j < length - 1 - i; j++) {
                if (proportion[j] > proportion[j + 1]) {
                    flag = true;
                    //贪心比
                    double temp = proportion[j];
                    proportion[j] = proportion[j + 1];
                    proportion[j + 1] = temp;
                    //食品名
                    String name = foodName[j];
                    foodName[j] = foodName[j + 1];
                    foodName[j + 1] = name;
                    //食品价格
                    temp = prices[j];
                    prices[j] = prices[j + 1];
                    prices[j + 1] = temp;
                }
            }
            if (!flag) {
                break;
            }
            flag = false;
        }

        int point = length - 1;
        double sumMoney_4temp = sumMoney;
        //贪心装载
        while (sumMoney_4temp > prices[point]) {
            sumMoney_4temp -= prices[point];
            food_map.put(foodName[point], 1);
            point--;
            //对于特别好吃的，最多只能选5种
            if (length - point >= gap) {
                break;
            }
        }
        double countMoney = sumMoney - sumMoney_4temp;
        times4 = (int) Math.floor(sumMoney / countMoney);
        if (times4 > 4) {
            times4 -= 4;
        }
        Set set = food_map.keySet(); //key装到set中
        Iterator it = set.iterator(); //返回set的迭代器 装的key值
        while (it.hasNext()) {
            String key = (String) it.next();
            food_map.put(key, times4);
        }

        double remain_money = sumMoney - times4 * countMoney;

        //剩余价值进行动态规划
        method_dynamic(foodName, prices, (int) Math.ceil(remain_money));
        realMoney_method4 = times4 * countMoney + realMoney_method_dynamic;
        for (int i = 0; i < foodList_method_dynamic.size(); i++) {
            if (food_map.containsKey(foodList_method_dynamic.get(i))) {
                int m = food_map.get(foodList_method_dynamic.get(i));
                food_map.put(foodList_method_dynamic.get(i), m + 1);
            } else {
                food_map.put(foodList_method_dynamic.get(i), 1);
            }
        }
    }
}
