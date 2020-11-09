package UnitTest.DesignPatternTest.observerTest;

import DesignPattern.observer.*;
import org.junit.Test;

/**
 * @author liujun
 * @version 1.0
 * @date 2020/5/17
 * @author—Email liujunfirst@outlook.com
 * @blogURL https://blog.csdn.net/ljfirst
 * @description
 */
public class ObserverTest {

    //@Test
    public void Testobserer(){
        //被观察者
        ObservableDemo observableDemo = new ObservableDemo();
        //观察者
        ObserverDemo observerDemo1 = new ObserverDemo("observerDemo1");
        ObserverDemo observerDemo2 = new ObserverDemo("observerDemo2");
        //被观察者将观察者加入自己的方法内
        observableDemo.attach(observerDemo1);
        observableDemo.attach(observerDemo2);
        //被观察者触发某个方法
        observableDemo.action();
        System.out.println("-----------------");
        observableDemo.normalaction();
    }
}
