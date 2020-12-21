package DataStructure.tree.binaryTree.binaryTreeRealize;

import DataStructure.tree.binaryTree.BinaryTree;

/**
 * @author liujun
 * @date 2020-02-18 16:09
 * 二叉树 ： 判断两个二叉树相等
 */

public class BinaryTreeImpl implements BinaryTree {

    public BinaryTreeImpl left;    //左孩子
    public BinaryTreeImpl right;   //右孩子
    public BinaryTreeImpl parent;  //父节点
    public int value = 0;          //值
    public static int count = 0;   //层计数值

    public BinaryTreeImpl() {
        this.left = null;
        this.right = null;
        this.parent = null;
        this.value = 0;
    }

    public BinaryTreeImpl(int value) {
        this.left = null;
        this.right = null;
        this.parent = null;
        this.value = value;
    }

    //判断两个二叉树相等
    @Override
    public boolean equals(BinaryTreeImpl source, BinaryTreeImpl target) {
        return source == null ? target == null : same(source, target);
    }

    @Override
    public boolean equals(BinaryTreeImpl target) {
        return equals(this, target);
    }

    private boolean same(BinaryTreeImpl source, BinaryTreeImpl target) {
        if (target == null) {
            return false;
        }
        if (source.value != target.value) {
            return false;
        } else {
            return equals(source.left, target.left) && equals(source.right, target.right);
        }
    }
}
