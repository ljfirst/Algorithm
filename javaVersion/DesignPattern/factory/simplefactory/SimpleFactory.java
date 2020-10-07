package DesignPattern.factory.simplefactory;


/**
 * @author liujun
 * @version 1.0
 * @date 2019-3-31 ����03:51:33
 * @authorEmail ljfirst@mail.ustc.edu.cn
 * @description
 * @blogURL
 */
public class SimpleFactory {

    public static CT1 createClass() {

        System.out.print("SimpleFactory:");
        return new CT1();
    }
}


