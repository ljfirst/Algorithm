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

    /**
     * 出栈操作
     * @return 栈顶元素
     */
    public int pop();

    /**
     * 入栈操作
     * @param value 入栈值
     * @return 入栈是否成功
     */
    public boolean push(int value);

    /**
     * 获取栈顶元素
     * @return 栈顶元素
     */
    public int peek();

    /**
     * 判空操作
     * @return 栈是否为空
     */
    public boolean empty();

    /**
     * 查找某元素
     * @param value 查找值
     * @return 查找是否成功
     */
    public boolean search(int value);

    /**
     * 获取栈中实际的元素数量
     * @return 栈中实际的元素数量
     */
    public int getRealsize();

    /**
     * 获取栈的最大元素数量
     * @return 栈的最大元素数量
     */
    public int getMaxsize();

    /**
     * 扩容操作
     */
    public void resize();
}
