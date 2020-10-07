package DesignPattern.strategy.strategyPractice;

/**
 * @author liujun
 * @version 1.0
 * @date 2020/8/21
 * @author—Email liujunfirst@outlook.com
 * @blogURL https://blog.csdn.net/ljfirst
 * @description 当我们接收到一些数据需要对其进行处理时，
 * 由于它们来自于不同的渠道（如：腾讯，头条，阿里），不同渠道所需的处理方式不同，
 * 下面我们写一个简单Demo来实现该的场景。
 */
public interface Process {

    public void deal() throws InterruptedException;
}
