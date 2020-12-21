package DataStructure.stackHeapQueue.queue;

/**
 * @author liujun
 * @version 1.0
 * @date 2020-01-13 21:52
 * @author-Email liujunfirst@outlook.com
 * @description 队列的基本方法
 * 1、元素入队
 * 2、元素出队
 * 3、弹出队首元素（不删除）
 * 4、队列判空
 * 5、获取真实队列长度
 * 6、获取最大队列长度
 * 7、队列扩容
 * 8、查找函数
 * @blogURL
 */
public interface Queuelj {

    //offer = push，入队
    public boolean offer(int value);

    //出队
    public int poll();

    //弹出第一个队首元素（不删除）
    public int peek();

    //队列判空
    public boolean empty();

    //获取真实队列长度
    public int getRealsize();

    //获取最大队列长度
    public int getMaxsize();

    //队列扩容
    public void resize();

    //查找函数
    public boolean search(int x);
}
