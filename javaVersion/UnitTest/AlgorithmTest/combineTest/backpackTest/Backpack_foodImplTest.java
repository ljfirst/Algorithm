package UnitTest.AlgorithmTest.combineTest.backpackTest;

import Algorithm.comprehensive.backpack.Backpack_foodImpl;
import org.junit.Test;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/**
 * @author liujun
 * @version 1.0
 * @date 2020/7/21
 * @author—Email liujunfirst@outlook.com
 * @blogURL https://blog.csdn.net/ljfirst
 * @description 零食购买分配 的测试案例
 */
public class Backpack_foodImplTest {

    Backpack_foodImpl b = new Backpack_foodImpl();
    List<String> list = new ArrayList<>();

    @Test
    public void testmethod_dynamic() {
        method_dynamic(sumMoney01);
        method_dynamic(sumMoney02);
        method_dynamic(sumMoney03);
        method_dynamic(sumMoney04);
        method_dynamic(sumMoney05);
    }

    @Test
    public void testmethod3() {
        realMoney_method3(sumMoney01);
        realMoney_method3(sumMoney02);
        realMoney_method3(sumMoney03);
        realMoney_method3(sumMoney04);
        realMoney_method3(sumMoney05);
    }

    @Test
    public void testmethod4() {
        realMoney_method4(sumMoney01);
        realMoney_method4(sumMoney02);
        realMoney_method4(sumMoney03);
        realMoney_method4(sumMoney04);
        realMoney_method4(sumMoney05);
    }


    /**
     * @params foodName 零食名称
     * @params prices   零食价格
     * @params lover    零食喜好度
     * @params sumMoney 总预算
     */
    String[] foodName = {"小当家", "牛肉干", "饼干", "香肠", "面包", "麻花", "蛋糕", "麻薯", "桂花饼", "玉米粒", "猪肉干"};
    double[] prices = {2.2, 5.8, 1.3, 1.0, 4.7, 1.12, 5.6, 4.5, 6.6, 2.3, 5.4};
    double[] lover01 = {4.1, 7.2, 3.3, 5.4, 2.6, 1.1, 6.9, 3.8, 6.7, 4.5, 6.9};
    int sumMoney01 = 10;
    int sumMoney02 = 30;
    int sumMoney03 = 60;
    int sumMoney04 = 90;
    int sumMoney05 = 140;


    public void realMoney_method4(int sumMoney) {
        b.method4(foodName, prices, lover01, sumMoney);
        System.out.println("公司预算：" + sumMoney + "\n实际花费:" + b.realMoney_method4 + "\n选取的零食种类:");
        Set set = b.food_map.keySet(); //key装到set中
        Iterator it = set.iterator(); //返回set的迭代器 装的key值
        while (it.hasNext()) {
            String key = (String) it.next();
            Integer value = b.food_map.get(key);
            System.out.print(key + "*" + value + " ");
        }
        System.out.println("\n");
    }

    public void realMoney_method3(int sumMoney) {
        b.method3(foodName, prices, lover01, sumMoney);
        System.out.println("公司预算：" + sumMoney + "\n实际花费:" + b.realMoney_method3 + "\n选取的零食种类:");
        b.foodList_method3.forEach(x -> {
            System.out.print(x + "*" + b.times + " ");
        });
        b.foodList_method_dynamic.forEach(x -> {
            System.out.print(x + "*1 ");
        });
        System.out.println("\n");
    }

    public void method_dynamic(int sumMoney) {
        b.method_dynamic(foodName, prices, sumMoney);
        System.out.println("实际花费:" + b.realMoney_method_dynamic);
        System.out.println("选取的零食种类:");
        b.foodList_method_dynamic.forEach(x -> {
            System.out.print(x + " ");
        });
        System.out.println("\n");
    }
}
