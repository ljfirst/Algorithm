package DataStructure.stringANDline.list.listRealize;

import DataStructure.stringANDline.list.Listlj;
import DataStructure.stringANDline.list.Nodelj;

/**
 * @author liujun
 * @version 1.0
 * @date 2019-12-07 18:17
 * @author-Email liujunfirst@outlook.com
 * @description 双向链表
 * @blogURL
 */
public class DoubleLinkedList implements Listlj {

    Nodelj headpoint;
    Nodelj tailpoint;
    int size;

    public DoubleLinkedList() {
        this.headpoint = null;
        this.tailpoint = null;
        this.size = 0;
    }

    /**
     * @param HeadTail 头插法或者尾插法(true:头插法，false:尾插法)
     * @param array    输入待插入数据
     * @return
     */
    @Override
    public boolean insert(boolean HeadTail, int... array) {
        if (array == null || array.length == 0) {
            return false;
        }
        int begin = 0;
        if (this.size == 0) {
            Nodelj nodefirst = new Nodelj(array[0]);
            this.headpoint = nodefirst;
            this.tailpoint = nodefirst;
            nodefirst.front = nodefirst;
            nodefirst.next = nodefirst;
            this.size++;
            begin++;
        }
        for (int i = begin; i < array.length; i++) {
            Nodelj node1 = new Nodelj(array[i]);
            node1.front = this.tailpoint;
            node1.next = this.headpoint;
            if (HeadTail) {//头插法
                node1.next.front = node1;
                this.headpoint = node1;
                this.tailpoint.next = node1;
            } else {//尾插法
                node1.front.next = node1;
                this.tailpoint = node1;
                this.headpoint.front = node1;
            }
            this.size++;
        }
        return true;
    }

    /**
     * @param index 索引位置
     * @param args  待插入元素
     * @return
     */
    @Override
    public boolean insert(int index, int... args) {
        return false;
    }

    @Override
    public boolean delete_value(int value) {
        if(this.size==0){
            return false;
        }
        if (this.size == 1) {
            if (this.headpoint.value == value) {
                clear();
                return true;
            }
            return false;
        }
        Nodelj nodelj = this.headpoint;
        do {
            if (nodelj.value == value) {
                nodelj.front.next = nodelj.next;
                nodelj.next.front = nodelj.front;
                this.size--;
                return true;
            }
            nodelj = nodelj.next;
        } while (nodelj != this.headpoint);
        return false;
    }

    @Override
    public boolean delete_index(int index) {
        if (index <= this.size) {
            Nodelj nodelj = this.headpoint;
            int count = 0;
            while (count < index) {
                nodelj = nodelj.next;
                count++;
            }
            nodelj.next.front = nodelj.front;
            nodelj.front.next = nodelj.next;
            this.size--;
            return true;
        }
        return false;
    }

    /**
     * @param value
     * @return 查找指定元素，返回该元素的索引位置
     */
    @Override
    public int search_value(int value) {
        if (this.size != 0) {
            Nodelj nodelj = this.headpoint;
            int count = 0;
            do {
                if (nodelj.value == value) {
                    return count;
                }
                count++;
                nodelj = nodelj.next;
            } while (nodelj != this.headpoint);
        }
        return -1;
    }

    /**
     * @param index
     * @return
     */
    @Override
    public int search_index(int index) {
        if (index > this.size) {
            return Integer.MIN_VALUE;
        }
        Nodelj nodelj = this.headpoint;
        int count = 0;
        do {
            nodelj = nodelj.next;
            count++;
        } while (count < index && nodelj != this.headpoint);
        return nodelj != this.headpoint ? nodelj.value : Integer.MIN_VALUE;
    }

    @Override
    public int[] toarray() {
        if (this.size == 0) {
            return new int[]{};
        } else {
            int count = 0;
            int[] arr = new int[this.size];
            Nodelj nodelj = this.headpoint;
            do {
                arr[count] = nodelj.value;
                nodelj = nodelj.next;
                count++;
            } while (nodelj != this.headpoint);
            return arr;
        }
    }

    @Override
    public void clear() {
        this.headpoint = null;
        this.tailpoint = null;
        this.size = 0;
    }

    public boolean equals(DoubleLinkedList l1) {
        if (l1 == this) {
            return true;
        }
        return equals(this, l1);
    }

    public boolean equals(DoubleLinkedList l1, DoubleLinkedList l2) {
        if (l1 == l2) {
            return true;
        }
        if (l1 != null && l2 != null && l1.headpoint.value == l2.headpoint.value) {
            Nodelj l1node = l1.headpoint.next;
            Nodelj l2node = l2.headpoint.next;
            while (l1node != l1.headpoint) {
                if (l1node.value != l2node.value) {
                    return false;
                }
                l1node = l1node.next;
                l2node = l2node.next;
            }
            return true;
        }
        return false;
    }
}
