package DataStructure.arrayANDlist.list.listRealize;

import DataStructure.arrayANDlist.list.Nodelj;

/**
 * @author liujun
 * @version 1.0
 * @date 2018-8-22 02:06:33
 * @author-Email liujunfirst@outlook.com
 * @description 有环链表和相交链表
 * 1、相交
 * 1.1、构造交叉链表
 * 1.2、判读链表是否相交
 * 1.3、找出链表的交点
 * 2、有环
 * 2.1、构造有环链表
 * 2.2、判读链表是否有环
 * 2.3、找出带环单链表的入口
 */

public class RingList extends SinglyLinkedList {

    public SinglyLinkedList singlyLinkedList_a;
    public SinglyLinkedList singlyLinkedList_b;
    public SinglyLinkedList singlyLinkedList_cycle;

    public RingList() {
        this.singlyLinkedList_a = new SinglyLinkedList();
        this.singlyLinkedList_b = new SinglyLinkedList();
        this.singlyLinkedList_cycle = new SinglyLinkedList();
    }

    public void clear() {
        this.singlyLinkedList_a = new SinglyLinkedList();
        this.singlyLinkedList_b = new SinglyLinkedList();
        this.singlyLinkedList_cycle = new SinglyLinkedList();
    }

    // * 1.1、构造交叉链表
    public SinglyLinkedList createCrossLinkedList(int[] array_a, int[] array_b) {

        if (!checkArray(array_a) || !checkArray(array_b)) {
            return null;
        }
        this.singlyLinkedList_a.insert(false, array_a);
        this.singlyLinkedList_b.insert(false, array_b);
        Nodelj middle = this.singlyLinkedList_a.head;
        int mid = this.singlyLinkedList_a.head.value;
        for (int i = 0; i <= mid / 2; i++) {
            middle = middle.next;
        }
        this.singlyLinkedList_b.tail.next = middle;
        //理论上应该更新 singlyLinkedList_b 的 tail
        return this;

        /** lasted Version
         *         Nodelj tail = null;
         *         Nodelj first_a = tail;
         *         for (int i = 0; i < array_a.length; i++) {
         *             Nodelj link_a = new Nodelj(array_a[i]);
         *             if (first_a == null) {
         *                 first_a = tail = link_a;
         *             }
         *             tail.next = link_a;
         *             tail = tail.next;
         *         }
         *         Nodelj first_b = null;
         *         for (int i = 0; i < array_b.length; i++) {
         *             Nodelj link_b = new Nodelj(array_b[i]);
         *             if (i == array_b.length / 2) {
         *                 tail.next = link_b;
         *             }
         *             link_b.next = first_b;
         *             first_b = link_b;
         *         }
         *         Map<Integer, Nodelj> map = new HashMap<Integer, Nodelj>();
         *         map.put(1, first_a);
         *         map.put(2, first_b);
         *         return map;
         */
    }

    // * 1.2、判读链表是否相交: 判断尾指针是否相等
    public boolean judgeCrossLinkedList(SinglyLinkedList l1, SinglyLinkedList l2) {
        if (l1 != null && l2 != null && l1.head.value > 0 && l2.head.value > 0) {
            Nodelj p1 = l1.head.next;
            Nodelj p2 = l2.head.next;
            //其实此处可以使用 tail 直接判断
            while (p1.next != null) {
                p1 = p1.next;
            }
            while (p2.next != null) {
                p2 = p2.next;
            }
            if (p1 == p2) {
                return true;
            }
        }
        return false;
    }

    // * 1.3、找出链表的交点:根据长度，在相同处，两根指针一起走
    public Nodelj findCrossLinkedListPoint(SinglyLinkedList l1, SinglyLinkedList l2) {
        if (judgeCrossLinkedList(l1, l2)) {
            Nodelj p1 = l1.head.next;
            Nodelj p2 = l2.head.next;
            int count1 = 0;
            int count2 = 0;
            while (p1.next != null) {
                p1 = p1.next;
                count1++;
            }
            while (p2.next != null) {
                p2 = p2.next;
                count2++;
            }
            int gap = count1 > count2 ? count1 - count2 : count2 - count1;
            p1 = l1.head.next;
            p2 = l2.head.next;
            if (count1 > count2) {
                while (gap > 0) {
                    gap--;
                    p1 = p1.next;
                }
            } else {
                while (gap > 0) {
                    gap--;
                    p2 = p2.next;
                }
            }
            while (p1 != p2) {
                p1 = p1.next;
                p2 = p2.next;
            }
            return p1;
        }
        return null;
    }

    // * 2.1、构造有环链表
    public SinglyLinkedList createRingList(int[] array) {
        boolean flag = this.singlyLinkedList_cycle.insert(false, array);
        if (flag) {
            Nodelj middle = this.singlyLinkedList_cycle.head;
            int mid = this.singlyLinkedList_cycle.head.value;
            for (int i = 0; i <= mid / 2; i++) {
                middle = middle.next;
            }
            this.singlyLinkedList_cycle.tail.next = middle;
            return this.singlyLinkedList_cycle;
        }
        return null;
        /** Lasted Version
         *         Nodelj point = null;
         *         Nodelj first = point;
         *         Nodelj temp = new Nodelj();
         *         for (int i = 0; i < list.length; i++) {
         *             Nodelj link = new Nodelj(list[i]);
         *             if (first == null) {
         *                 first = point = link;
         *             }
         *             if (i == list.length / 2) {
         *                 temp = link;
         *             }
         *             point.next = link;
         *             point = point.next;
         *         }
         *         point.next = temp;
         *         return first;
         */
    }

    // * 2.2、判读链表是否有环
    public Nodelj judgeRingList(SinglyLinkedList singlyLinkedList) {
        if (singlyLinkedList != null) {
            Nodelj fast, slow;
            fast = singlyLinkedList.head.next;
            slow = singlyLinkedList.head.next;
            while (fast != null && fast.next != null) {
                fast = fast.next.next;
                slow = slow.next;
                if (fast == slow) {
                    return fast;
                }
            }
        }
        return null;
    }

    // * 2.3、找出带环单链表的入口
    public Nodelj findRingListPoint(SinglyLinkedList list) {
        if (list != null && list.head.value > 0) {
            Nodelj listHead = list.head.next;
            Nodelj crossPoint = judgeRingList(list);
            while (listHead != null && crossPoint != null) {
                if (listHead == crossPoint) {
                    return listHead;
                }
                listHead = listHead.next;
                crossPoint = crossPoint.next;
            }
        }
        return null;
    }
}
