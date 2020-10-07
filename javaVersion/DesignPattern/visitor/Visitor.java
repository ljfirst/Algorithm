package DesignPattern.visitor;

/**
 * @author liujun
 * @version 1.0
 * @date 2019-1-6 ����04:32:39
 * @authorEmail ljfirst@mail.ustc.edu.cn
 * @description
 * @URL
 */
public interface Visitor {

    //����Ա�ķ��ʷ���
    void visit(PositionWaiter pw);

    //����ķ��ʷ���
    void visit(PositionManager pm);

    //���˵ķ��ʷ���
    void visit(PositionWorker pworker);
}

class ServiceProvider implements Visitor {

    @Override
    public void visit(PositionWaiter pw) {
        System.out.println("i am PositionWaiter");
        System.out.println(pw.PName);
    }

    @Override
    public void visit(PositionManager pm) {
        System.out.println("i am PositionManager");
        System.out.println(pm.stock);
    }

    @Override
    public void visit(PositionWorker pworker) {
        System.out.println("i am PositionWorker");
        System.out.println(pworker.subsidy);
    }
}
