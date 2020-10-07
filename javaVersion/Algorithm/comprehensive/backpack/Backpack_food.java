package Algorithm.comprehensive.backpack;

import java.util.List;

/**
 * @author liujun
 * @version 1.0
 * @date 2020/7/21
 * @author—Email liujunfirst@outlook.com
 * @blogURL https://blog.csdn.net/ljfirst
 * @description 零食购买分配
 * 基本：
 * 输入：零食名称的数组，以及对应的单价，还有总额。
 * 输出：选取的零食的种类及实际花费
 *
 * 进阶：
 * 输入：零食名称的数组，以及对应的单价，还有总额。
 * 输出：选取的零食的种类、数量及实际花费
 *
 * 高阶：
 * 输入：零食名称的数组，以及对应的单价，以及一个零食偏好度的数组，还有总额。
 * 输出：在照顾到总额和零食偏好度的情况下，输出选取的零食的种类及实际花费。
 */
public interface Backpack_food {

    /**
    target：选取的零食的种类及实际花费
    @params foodName 零食名称
    @params prices   零食价格
    @params sumMoney 总预算
     */
    public void method_dynamic(String[] foodName, double[] prices, int sumMoney);

    public void method_greed(String[] foodName, double[] prices, int sumMoney);

    /**
    target：选取的零食的种类、数量及实际花费
    @params foodName 零食名称
    @params prices   零食价格
    @params sumMoney 总预算
     */
    public void method2(String[] foodName, double[] prices, int sumMoney);

    /**
    target：在照顾到总额和零食偏好度的情况下，输出选取的零食的种类及实际花费。
    @params foodName 零食名称
    @params prices   零食价格
    @params lover    零食喜好度
    @params sumMoney 总预算
     */
    public void method3(String[] foodName, double[] prices, double[] lover, int sumMoney);
}
