package DesignPattern.template;

/**
 * @author liujun
 * @version 1.0
 * @date 2020/4/10
 * @author—Email liujunfirst@outlook.com
 * @blogURL https://blog.csdn.net/ljfirst
 * @description 模板设计模式的本质就是固定算法框架
 * 父类固定模板，但是开放模板的具体实现步骤，允许子类重写
 */
public abstract class TemplateDemo {

    public final void template() {
        method1();
        method2();
        method3();
    }

    public void method1() {
        System.out.println("father class first stop");
    }

    public void method2() {
        System.out.println("father class second stop");
    }

    public void method3() {
        System.out.println("father class third stop");
    }
}
