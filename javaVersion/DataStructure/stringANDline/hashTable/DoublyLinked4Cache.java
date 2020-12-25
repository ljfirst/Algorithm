package DataStructure.stringANDline.hashTable;

/**
 * @author liujun
 * @version 1.0
 * @date 2020/7/28
 * @author—Email liujunfirst@outlook.com
 * @blogURL https://blog.csdn.net/ljfirst
 * @description cache 双向链表
 */
public class DoublyLinked4Cache {

    //链表头尾指针，链表的实际长度
    Node4Cache head;
    Node4Cache tail;
    int linkedSize;

    //初始化 双向链表
    public DoublyLinked4Cache() {
        this.head = new Node4Cache();
        this.tail = new Node4Cache();
        this.head.next = this.tail;
        this.tail.pre = this.head;
    }

    //增加元素（链表尾部）
    public boolean insertLast(Node4Cache node) {
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
    public boolean delete(Node4Cache node) {
        node.next.pre = node.pre;
        node.pre.next = node.next;
        linkedSize--;
        return true;
    }

    //删除并返回 首元素
    public Node4Cache deleteFirst() {
        if (head.next == tail) {
            return null;
        }
        Node4Cache first = head.next;
        delete(first);
        return first;
    }

    //获取双向链表的长度
    public int getsize() {
        return this.linkedSize;
    }
}
