package DataStructure.stringANDline.hashTable;

/**
 * @author liujun
 * @version 1.0
 * @date 2019-12-25 22:22
 * @authorEmail liujunfirst@outlook.com
 * @description 单向链表的 Node 节点
 * @blogURL
 */
public class Node4Simplex {

    public int value;
    public Node4Simplex next;

    public Node4Simplex() {
        this.value = Integer.MIN_VALUE;
        next = null;
    }

    public Node4Simplex(int value) {
        this.value = value;
        next = null;
    }
}
