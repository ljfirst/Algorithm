package DesignPattern.factory.simplefactory;


import DesignPattern.factory.Factory;

/**
 * @author liujun
 * @version 1.0
 * @date�� 2019-3-31 ����03:53:12
 * @author��Email:ljfirst@mail.ustc.edu.cn
 * @description:
 * @URL:
 */
public class CT1 implements Factory {

    String s = "i am CT1 implements ClassTest";

    public void method() {

        System.out.println(s);
    }
}
