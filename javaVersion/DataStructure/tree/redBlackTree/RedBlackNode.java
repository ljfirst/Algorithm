package DataStructure.tree.redBlackTree;

/**
 * @author liujun
 * @version 1.0
 * @date 2020/11/18
 * @author—Email liujunfirst@outlook.com
 * @blogURL https://blog.csdn.net/ljfirst
 * @description 红黑树的节点
 */
public class RedBlackNode {

    int key;
    int value;
    RedBlackNode left;
    RedBlackNode right;
    RedBlackNode parent;
    String color;
    static final int initValue = Integer.MIN_VALUE;
    static final String RED = "RED";

    public RedBlackNode() {
        this.key = initValue;
        this.value = initValue;
        this.left = null;
        this.right = null;
        this.parent = null;
        this.color = RED;
    }

    public RedBlackNode(int key, int value) {
        this.key = key;
        this.value = value;
        this.left = null;
        this.right = null;
        this.parent = null;
        this.color = RED;
    }
}
