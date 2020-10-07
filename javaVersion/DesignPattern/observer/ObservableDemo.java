package DesignPattern.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author liujun
 * @version 1.0
 * @date 2020/5/17
 * @author—Email liujunfirst@outlook.com
 * @blogURL https://blog.csdn.net/ljfirst
 * @description
 */
public class ObservableDemo {

    List<ObserverDemo> list = new ArrayList<>();

    public void attach(ObserverDemo observerDemo) {
        list.add(observerDemo);
    }

    public void normalaction() {
        System.out.println("ObservableDemo normalaction:普通方法不会引起观察 ");
    }

    public void action() {
        System.out.println("ObservableDemo action：特殊方法会引起观察");
        notification();
    }

    public void notification() {
        for (ObserverDemo o : list) {
            o.lister();
        }
    }
}
