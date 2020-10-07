package DataStructure.stackHeapQueue.stack;

/**
 * @author liujun
 * @version 1.0
 * @date 2020-01-13 22:01
 * @author—Email liujunfirst@outlook.com
 * @description 栈
 * @blogURL
 */
public interface Stacklj {

    //出栈
    public int pop();

    //入栈
    public boolean push(int value);

    //获取栈定元素
    public int peek();

    //判空
    public boolean empty();

    //查找某元素
    public boolean search(int value);

    //获取栈中实际的元素数量
    public int getRealsize();

    //获取栈的最大元素数量
    public int getMaxsize();

    //扩容
    public void resize();
}
