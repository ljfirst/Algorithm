package DataStructure.tree.binaryTree;

import DataStructure.tree.Tree;
import DataStructure.tree.binaryTree.binaryTreeRealize.BinaryTreeImpl;

/**
 * @author liujun
 * @date 2020-02-18 16:13
 * @description
 * 二叉树 ： 判断两个二叉树相等
 */
public interface BinaryTree extends Tree {

    //判断两个二叉树相等
    public boolean equals(BinaryTreeImpl source, BinaryTreeImpl target);
}
