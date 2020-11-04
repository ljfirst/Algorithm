package DataStructure.stringANDline.list;

import DataStructure.stringANDline.list.listRealize.SinglyLinkedList;

/**
 * @author liujun
 * @version 1.0
 * @date 2020/11/1
 * @author—Email liujunfirst@outlook.com
 * @blogURL https://blog.csdn.net/ljfirst
 * @description 链表
 * 1、链表输出为数组
 * 2、链表的插入
 * 3、链表清除函数
 */
public interface Listlj {

    /**
     * 链表输出为数组
     */
    public int[] toArray();

    /**
     * 链表的插入
     * 1、允许插入单个值
     * 2、允许插入数组
     * 3、使用头插法或者尾插法
     * 4、对本list进行操作
     *
     * @param arr
     * @param flag true表示头插法，tail表示尾插法
     */
    public void insert(boolean flag, int... arr);

    /**
     * 链表清除函数
     */
    public void clear();

    /**
     * 链表删除特定值的函数
     */
    public boolean deletex(int x);

    /**
     * 链表删除特定索引的函数
     */
    public boolean deleteindex(int index);

    /**
     * 链表查找函数
     * 查找成功，返回该元素下标
     * 查找失败，返回 -1
     */
    public int searchx(int x);

    /**
     * 链表查找函数
     * 查找成功，返回该坐标的值
     * 查找失败，返回 Integer.MIN_VALUE
     */
    public int searchindex(int index);

    /**
     *
     * @param l1 单链表
     * @param l2 单链表
     * @return l1和l2进行对比
     */
    public boolean equals(SinglyLinkedList l1, SinglyLinkedList l2);

    /**
     *
     * @param l1
     * @return l1和链表自身进行对比
     */
    public boolean equals(SinglyLinkedList l1);
}
