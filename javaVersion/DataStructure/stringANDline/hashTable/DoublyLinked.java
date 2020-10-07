package DataStructure.stringANDline.hashTable;

/**
 * @author liujun
 * @version 1.0
 * @date 2020/7/28
 * @author—Email liujunfirst@outlook.com
 * @blogURL https://blog.csdn.net/ljfirst
 * @description 双向链表
 */
public class DoublyLinked {

    //链表头尾指针，链表的实际长度
    Node4DoublyLinked head;
    Node4DoublyLinked tail;
    int linkedSize;

    //初始化 双向链表
    public DoublyLinked() {
        head = new Node4DoublyLinked();
        tail = new Node4DoublyLinked();
        head.next = tail;
        tail.pre = head;
    }

    //增加元素（链表尾部）
    public boolean insertLast(Node4DoublyLinked node) {
        //空链表的处理方法
        if (head.next == tail) {
            head.next = node;
            node.pre = head;
        } else {
            tail.pre.next = node;
            node.pre = tail.pre;
        }
        linkedSize++;
        node.next = tail;
        tail.pre = node;
        return true;
    }

    //删除元素
    public boolean delete(Node4DoublyLinked node) {
        node.next.pre = node.pre;
        node.pre.next = node.next;
        linkedSize--;
        return true;
    }

    //删除并返回 首元素
    public Node4DoublyLinked deleteFirst() {
        if (head.next == tail) {
            return null;
        }
        Node4DoublyLinked first = head.next;
        delete(first);
        return first;
    }

    //获取双向链表的长度
    public int getsize() {
        return linkedSize;
    }
}
