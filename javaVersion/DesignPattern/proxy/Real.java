package DesignPattern.proxy;

/**
 * @author liujun
 * @version 1.0
 * @date 2018-7-28 ����08:47:26
 * @Email ljfirst@mail.ustc.edu.cn
 * @description ����ģʽ�����壺real
 */
public class Real implements ProxyInterface {

    @Override
    public void work() {
        // TODO Auto-generated method stub
        System.out.println("i am real, i am doing work");
    }
}
