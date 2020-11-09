package DataStructure.tree.binaryTree;

import DataStructure.tree.Tree;
import DataStructure.tree.binaryTree.binaryTreeRealize.BinaryTreeImpl;

/**
 * @author liujun
 * @date 2020-02-18 18:44
 * @description 根据二叉树 创建（二叉树序列化）
 * 按层：
 * 1、按层遍历二叉树 输出数组
 * S形：
 * 1、S形遍历二叉树 输出数组
 * 按序：
 * 1、先序遍历二叉树 输出数组
 * 2、中序遍历二叉树 输出数组
 * 3、后序遍历二叉树 输出数组
 */
public interface BinaryTree2Array extends Tree {
    //按层遍历二叉树 输出数组
    public int[] Binary2ArrayLevel(BinaryTreeImpl root);

    //S形遍历二叉树 输出数组
    public int[] Binary2ArrayS(BinaryTreeImpl root);

    //先序遍历二叉树 输出数组
    public int[] Binary2ArrayPreOrder(BinaryTreeImpl root);

    //先序遍历二叉树 输出数组（特殊符号）
    public int[] Binary2ArrayPreOrder_Symbol(BinaryTreeImpl root);

    //中序遍历二叉树 输出数组
    public int[] Binary2ArrayInOrder(BinaryTreeImpl root);

    //中序遍历二叉树 输出数组（特殊符号）
    public int[] Binary2ArrayInOrder_Symbol(BinaryTreeImpl root);

    //后序遍历二叉树 输出数组
    public int[] Binary2ArrayPostOrder(BinaryTreeImpl root);

    //后序遍历二叉树 输出数组（特殊符号）
    public int[] Binary2ArrayPostOrder_Symbol(BinaryTreeImpl root);

    default boolean check(BinaryTreeImpl root) {
        return root == null;
    }
}

