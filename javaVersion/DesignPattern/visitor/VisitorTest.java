package DesignPattern.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * @author liujun
 * @version 1.0
 * @date�� 2019-1-6 ����04:32:16
 * @author��Email:ljfirst@mail.ustc.edu.cn
 * @description:
 * @URL:
 */
public class VisitorTest {

    public static void main(String[] args) {
        List<Accept> Plist = new ArrayList<Accept>();

        Plist.add(new PositionWaiter("服务员", 2000));
        Plist.add(new PositionManager("经理", 10000, 20));
        Plist.add(new PositionWorker("工人", 5000, 30.56));

        ServiceProvider sp = new ServiceProvider();
        for (Accept p : Plist) {
            p.acceptable(sp);
        }
    }
}
