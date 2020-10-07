package DataStructure.stringANDline.hashTable;

/**
 * @author liujun
 * @version 1.0
 * @date 2020/7/28
 * @author—Email liujunfirst@outlook.com
 * @blogURL https://blog.csdn.net/ljfirst
 * @description 双向链表的 Node 节点
 */
public class Node4DoublyLinked {

    int key;
    String value;
    Node4DoublyLinked pre;
    Node4DoublyLinked next;

    public Node4DoublyLinked() {
        key = Integer.MIN_VALUE;
        value = null;
        pre = null;
        next = null;
    }

    public Node4DoublyLinked(int key, String value) {
        this.key = key;
        this.value = value;
        pre = null;
        next = null;
    }
}
