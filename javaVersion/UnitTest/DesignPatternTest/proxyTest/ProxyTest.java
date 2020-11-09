package UnitTest.DesignPatternTest.proxyTest;

import DesignPattern.proxy.Proxy;
import DesignPattern.proxy.ProxyInterface;
import DesignPattern.proxy.Real;
import org.junit.Test;

/**
 * @author liujun
 * @version 1.0
 * @date 2020/5/17
 * @author—Email liujunfirst@outlook.com
 * @blogURL https://blog.csdn.net/ljfirst
 * @description
 */
public class ProxyTest {

    @Test
    public void testProxy(){
        ProxyInterface r = new Real();
        ProxyInterface p = new Proxy(r);
        p.work();
    }
}
