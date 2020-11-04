package DataStructure.tree.binaryTree.binaryTreeApply;

import DataStructure.tree.binaryTree.binaryTreeRealize.BinaryTreeImpl;

/**
 * @author liujun
 * @version 1.0
 * @date 2018-7-21 ����10:57:09
 * @author-Email liujunfirst@outlook.com
 * @description 二叉树子树判断
 */
public class SubTreeJudge {

    //二叉树子树判断
    public boolean judgeTree(BinaryTreeImpl tree, BinaryTreeImpl subtree) {

        boolean flag = false;
        if (tree == null && subtree == null) {
            return true;
        }
        if (tree == null || subtree == null) {
            return false;
        }
        //跟节点相同，且子树完全匹配
        if (tree.value == subtree.value && compare_sub(tree, subtree)) {
            flag = true;
        } else {
            //判断左孩子和右孩子的 子树关系
            if (judgeTree(tree.left, subtree) ||
                    judgeTree(tree.right, subtree)) {
                flag = true;
            }
        }
        return flag;
    }

    //子树部分匹配
    public boolean compare_sub(BinaryTreeImpl tree, BinaryTreeImpl subtree) {

        //默认null是任意树的子树
        if (subtree == null) {
            return true;
        }
        if (tree == null && subtree != null) {
            return false;
        }
        //值相同的情况下，判断左子树和右子树 完全相等
        if (tree.value == subtree.value) {
            return compare_sub(tree.left, subtree.left)
                    && compare_total(tree.right, subtree.right);
        }
        return false;
    }

    //子树完全匹配
    public boolean compare_total(BinaryTreeImpl tree, BinaryTreeImpl subtree) {
        if (tree == null && subtree == null) {
            return true;
        }
        if ((tree == null && subtree != null) || (tree != null && subtree == null)) {
            return false;
        }
        //值相同的情况下，判断左子树和右子树 完全相等
        if (tree.value == subtree.value) {
            return compare_total(tree.left, subtree.left)
                    && compare_total(tree.right, subtree.right);
        }
        return false;
    }
}