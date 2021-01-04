package DataStructure.arrayANDlist.hashTable;

/**
 * @author liujun
 * @version 1.0
 * @date 2020/7/28
 * @author—Email liujunfirst@outlook.com
 * @blogURL https://blog.csdn.net/ljfirst
 * @description 双向链表的 Node 节点
 */
public class Node4Cache {

    int key;
    String value;
    Node4Cache pre;
    Node4Cache next;

    public Node4Cache() {
        key = Integer.MIN_VALUE;
        value = null;
        pre = null;
        next = null;
    }

    public Node4Cache(int key, String value) {
        this.key = key;
        this.value = value;
        pre = null;
        next = null;
    }
}
