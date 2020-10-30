package DataStructure.stringANDline.list.listrealize;

import DataStructure.stringANDline.list.Listlj;

/**
 * @author liujun
 * @version 1.0
 * @date 2018-8-18 ����01:08:11
 * @author-Email liujunfirst@outlook.com
 * @description 单链表
 * 单链表的插入：数组和单个元素 （头插和尾插）
 * 单链表的删除：删除特定元素和指定位置元素
 * 单链表的查找：查找特定元素和指定位置元素
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
     * 链表的插入
     * 1、允许插入单个值
     * 2、允许插入数组
     * 3、使用头插法或者尾插法
     * 4、对本list进行操作
     *
     * @param arr
     */
    @Override
    public void insert(boolean flag, int... arr) {
        if (arr == null || arr.length == 0) {
            return;
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
    }

    @Override
    public boolean deletex(int x) {
        Nodelj nodelj = this.head.next;
        Nodelj pre = this.head;
        while (nodelj != null) {
            if (nodelj.value == x) {
                pre.next = nodelj.next;
                return true;
            }
            pre = nodelj;
            nodelj = nodelj.next;
        }
        return false;
    }

    @Override
    public boolean deleteindex(int index) {
        Nodelj nodelj = this.head.next;
        Nodelj pre = this.head;
        int count = 0;
        while (count++ < index) {
            if (nodelj == null) {
                return false;
            }
            pre = nodelj;
            nodelj = nodelj.next;
        }
        pre.next = nodelj.next;
        return true;
    }

    @Override
    public int searchx(int x) {
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

    @Override
    public int searchindex(int index) {
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

    @Override
    public int[] toArray() {
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

    @Override
    public void clear() {
        this.head = new Nodelj();
        //单链表的长度存储在头节点的value中
        this.head.value = 0;
        tail = head;
    }
}
