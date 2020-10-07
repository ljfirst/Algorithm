package UnitTest.DatastructureTest.sortTest.innerSortTest.innerSortRealizeTest.quickSortTest;


import org.junit.Test;

/**
 * @author liujun
 * @version 1.0
 * @date 2020/9/11
 * @author—Email liujunfirst@outlook.com
 * @blogURL https://blog.csdn.net/ljfirst
 * @description
 */
public class fycge implements Runnable {

    @Test
    public void yy() {
        fycge f = new fycge();
        fycge f2 = new fycge();

        for (int i = 0; i < 15; i++) {
            Thread t = new Thread(f);
            t.setName(i + "f");
            t.start();

            Thread t1 = new Thread(f2);
            t1.setName(i + "f2");
            t1.start();
        }
    }

    @Override
    public void run() {
        de();
    }

    public void de() {
        synchronized (fycge.class){
            System.out.println(Thread.currentThread().getName() + "    ooooooooooo");
            System.out.println(Thread.currentThread().getName() + "    eeeeeeeee");
            System.out.println(Thread.currentThread().getName() + "    rrrrrrrrr");
            System.out.println(Thread.currentThread().getName() + "    tttttttttt");
        }
    }
}
