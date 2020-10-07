package DesignPattern.strategy.strategyPractice;

/**
 * @author liujun
 * @version 1.0
 * @date 2020/8/21
 * @author—Email liujunfirst@outlook.com
 * @blogURL https://blog.csdn.net/ljfirst
 * @description
 */
public class RealDeal {

    public static void main(String[] args) throws InterruptedException {
        String target = "toutiao";

        /*if (Company.Tecent_C.name.equals(target)) {
            process = new TecentProcess();
        } else {
            process = new AlibabaProcess();
        }*/

        print(target);
    }

    static void print(String name) throws InterruptedException {
        Company c = Company.match(name);
        c.process.deal();
    }


}
