package DataStructure.stringANDline.array.arrayOps;

/**
 * @author liujun
 * @version 1.0
 * @date 2018-12-17 下午05:30:46
 * @author—Email liujunfirst@outlook.com
 * @description 买卖股票的最佳时机
 * 给定一个数组，它的第 i 个元素是一支给定股票第 i 天的价格。
 * 如果你最多只允许完成一笔交易（即买入和卖出一支股票），
 * 设计一个算法来计算你所能获取的最大利润。注意你不能在买入股票前卖出股票。
 * @URL https://leetcode-cn.com/explore/interview/card/bytedance/246/dynamic-programming-or-greedy/1042/
 */

public class SaleStocks {

    //只允许买卖一次股票
    public int justAllowOnce(int[] prices) {

        if (prices == null || prices.length < 2) {
            return 0;
        }
        int maxprofit = 0;
        int minfrice = prices[0];
        for (int i = 0; i < prices.length; i++) {
            if (minfrice > prices[i]) {
                minfrice = prices[i];
            } else if (prices[i] - minfrice > maxprofit) {
                maxprofit = prices[i] - minfrice;
            }
        }
        return maxprofit;
    }


    //允许买卖多次股票
    public int allowMany(int[] prices) {
        if (prices == null || prices.length < 2) {
            return 0;
        }
        int temp = 0;
        for (int i = 0; i < prices.length - 1; i++) {
            if (prices[i + 1] > prices[i]) {
                temp += prices[i + 1] - prices[i];
            }
        }
        return temp;
    }

    //允许买卖多次股票
    public int allowMany1(int[] prices) {
        if (prices == null || prices.length == 0) {
            return 0;
        }
        int peak = 0;
        int valley = prices[0];
        int count = 0;
        int flag = 0;
        while (flag < prices.length) {
            //先找波谷
            while (flag < prices.length && prices[flag] < valley) {
                valley = prices[flag];
                peak = prices[flag];//刷新波峰
                flag++;
            }
            //再找波峰
            while (flag < prices.length && prices[flag] > peak) {
                peak = prices[flag];
                flag++;
            }
            count += (peak - valley);
            //刷新波峰波谷
            peak = 0;
            //为了防止越界，此处依旧用最大值表示
            valley = Integer.MAX_VALUE;
        }
        return count;
    }
}