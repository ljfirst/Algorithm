package DataStructure.stringANDline.list.listRealize;

import DataStructure.stringANDline.list.Listlj;
import DataStructure.stringANDline.list.Nodelj;

/**
 * @author liujun
 * @version 1.0
 * @date 2018-8-18 ����01:08:11
 * @author-Email liujunfirst@outlook.com
 * @description 单链表
 * 单链表的插入：数组和单个元素 （头插和尾插）
 * 单链表的删除：删除特定元素和指定位置元素
 * 单链表的查找：查找特定元素和指定位置元素
 * 单链表的相等：判断两个链表是否相等、自身对比
 * 单链表的清除：置空单链表
 */
public class SinglyLinkedList implements Listlj {

    //头节点、尾节点，头节点的值为单链表的长度
    public Nodelj head;
    public Nodelj tail;

    public SinglyLinkedList() {
        this.head = new Nodelj();
        //单链表的长度存储在头节点的value中
        this.head.value = 0;
        tail = head;
    }

    /**
     * 链表输出为数组
     */
    public int[] toarray() {
        if (head.next == null) {
            return new int[]{};
        }
        int[] array = new int[head.value];
        Nodelj nodelj = this.head.next;
        int count = 0;
        while (nodelj != null) {
            array[count++] = nodelj.value;
            nodelj = nodelj.next;
        }
        return array;
    }

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
    public boolean insert(boolean flag, int... arr) {
        if (arr == null || arr.length == 0) {
            return false;
        }
        Nodelj nodehead = this.head;
        for (int i : arr) {
            Nodelj node = new Nodelj(i);
            head.value++;
            if (flag) {//头插法
                node.next = nodehead.next;
                nodehead.next = node;
            } else {//尾插法
                tail.next = node;
            }
            tail = node;
        }
        return true;
    }

    /**
     * @param index 索引位置
     * @param args  待插入元素
     * @return 支持在某点批量插入、单值插入
     */
    @Override
    public boolean insert(int index, int... args) {
        if (index > this.head.value) {
            return false;
        }
        Nodelj pre = this.head;
        for (int i = 0; i < index; i++) {
            pre = pre.next;
        }
        for (int arg : args) {
            Nodelj nodelj1 = new Nodelj(arg);
            nodelj1.next = pre.next;
            pre.next = nodelj1;
            this.head.value++;//这一步总是会遗忘
        }
        return true;
    }

    /**
     * 链表删除特定值的函数
     */
    @Override
    public boolean delete_value(int value) {
        Nodelj nodelj = this.head.next;
        Nodelj pre = this.head;
        while (nodelj != null) {
            if (nodelj.value == value) {
                pre.next = nodelj.next;
                this.head.value--;
                return true;
            }
            pre = nodelj;
            nodelj = nodelj.next;
        }
        return false;
    }

    /**
     * 链表删除特定索引的函数
     */
    @Override
    public boolean delete_index(int index) {
        if (this.head.value < index) {
            return false;
        }
        Nodelj nodelj = this.head;
        Nodelj pre = this.head;
        int count = 0;
        while (count <= index) {
            if (nodelj == null) {
                return false;
            }
            pre = nodelj;
            nodelj = nodelj.next;
            count++;
        }
        pre.next = nodelj.next;
        this.head.value--;
        return true;
    }

    /**
     * 链表清除函数
     */
    public void clear() {
        this.head = new Nodelj();
        //单链表的长度存储在头节点的value中
        this.head.value = 0;
        tail = head;
    }


    /**
     * 链表查找函数
     * 查找成功，返回该元素下标
     * 查找失败，返回 -1
     */
    public int search_value(int x) {
        Nodelj nodelj = this.head.next;
        int count = 0;
        while (nodelj != null) {
            if (nodelj.value == x) {
                return count;
            }
            nodelj = nodelj.next;
            count++;
        }
        return -1;
    }

    /**
     * 链表查找函数
     * 查找成功，返回该坐标的值
     * 查找失败，返回 Integer.MIN_VALUE
     */
    public int search_index(int index) {
        Nodelj nodelj = this.head.next;
        int count = 0;
        while (count++ < index) {
            if (nodelj == null) {
                return Integer.MIN_VALUE;
            }
            nodelj = nodelj.next;
        }
        return nodelj.value;
    }

    /**
     * @return l1和链表自身进行对比
     */
    public boolean listequals(Listlj l2) {
        SinglyLinkedList l1 = (SinglyLinkedList) l2;
        if (l1 == this) {
            return true;
        }
        return listequals(this, l1);
    }

    /**
     * @return l1和l2进行对比
     */
    public boolean listequals(Listlj l3, Listlj l4) {
        SinglyLinkedList l1 = (SinglyLinkedList) l3;
        SinglyLinkedList l2 = (SinglyLinkedList) l4;
        if (l1 == l2) {
            return true;
        }
        if (l1 != null && l2 != null && l1.head.value == l2.head.value) {
            Nodelj p1 = l1.head.next;
            Nodelj p2 = l2.head.next;
            while (p1 != null && p2 != null) {
                if (p1.value != p2.value) {
                    return false;
                }
                p1 = p1.next;
                p2 = p2.next;
            }
            return true;
        }
        return false;
    }

}
