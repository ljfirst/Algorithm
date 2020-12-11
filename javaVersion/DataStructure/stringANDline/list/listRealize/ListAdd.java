package DataStructure.stringANDline.list.listRealize;

import DataStructure.stringANDline.list.Nodelj;

/**
 * @author liujun
 * @version 1.0
 * @date 2020/12/11
 * @author—Email liujunfirst@outlook.com
 * @blogURL https://blog.csdn.net/ljfirst
 * @description 链表相加
 * 两个数倒叙存放于链表中：7642+654
 * 输入： 链表A：2->4->6->7,链表B：4->5->6
 * 输出： 8296
 */
public class ListAdd {

    public int add(SinglyLinkedList a, SinglyLinkedList b) {

        if (a == null || a.head.value == 0 || b == null || b.head.value == 0) {
            return listtoInt(a) + listtoInt(b);
        }
        if (a.head.value < b.head.value) {
            SinglyLinkedList temp = b;
            b = a;
            a = temp;
        }
        Nodelj n1 = a.head.next;
        Nodelj n2 = b.head.next;
        Nodelj n1_pre = n1;
        int carry = 0;
        while (n2 != null) {
            int temp = n1.value + n2.value + carry;
            n1.value = temp % 10;
            carry = temp / 10;
            n1_pre = n1;
            n1 = n1.next;
            n2 = n2.next;
        }
        if (carry != 0) {
            if (n1 == null) {
                n1_pre.next = new Nodelj(carry);
            } else {
                n1.value += carry;
            }
        }
        int sum = listtoInt(a);
        return sum;
    }

    private int listtoInt(SinglyLinkedList a) {
        if (a == null || a.head.value == 0) {
            return 0;
        }
        Nodelj node = a.head.next;
        StringBuffer sb = new StringBuffer();
        while (node != null) {
            sb.append(node.value);
            node = node.next;
        }
        int value = Integer.parseInt(sb.reverse().toString());
        return value;
    }
}
