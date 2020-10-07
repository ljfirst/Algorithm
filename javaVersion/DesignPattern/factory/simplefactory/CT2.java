package DesignPattern.factory.simplefactory;


import DesignPattern.factory.Factory;

/**
 * @author liujun
 * @version 1.0
 * @date 2019-3-31 ����03:59:35
 * @authorEmail ljfirst@mail.ustc.edu.cn
 * @description
 * @blogURL
 */
public class CT2 implements Factory {

    String s = "i am CT2 implements ClassTest";

    @Override
    public void method() {
        System.out.println(s);
    }

}
