package DesignPattern.proxy;

/**
 * @author liujun
 * @version 1.0
 * @date 2018-8-17 ����02:12:54
 * @Email ljfirst@mail.ustc.edu.cn
 * @description �����࣬����Ҫʵ�������Ǳ�������ķ�����
 */
public class Proxy implements ProxyInterface {

    ProxyInterface p;

    public Proxy(ProxyInterface r) {
        // TODO Auto-generated constructor stub
        p = r;
    }

    @Override
    public void work() {
        // TODO Auto-generated method stub
        System.out.println("i am Proxy, i am help real's work,work begin");
        p.work();
        System.out.println("i am Proxy, work end");
    }
}
