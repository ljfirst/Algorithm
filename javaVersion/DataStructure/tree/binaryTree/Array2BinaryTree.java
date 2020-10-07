package DataStructure.tree.binaryTree;

import DataStructure.tree.Tree;

/**
 * @author liujun
 * @date  2020-02-18 16:09
 * @description 二叉树的实现
 * 1、将按层次遍历的方式输入的数组  构造成一个二叉树
 *  单序创建：
 * 2、将按先序遍历的方式输入的数组  构造成一个二叉树
 * 3、将按中序遍历的方式输入的数组  构造成一个二叉树
 * 4、将按后序遍历的方式输入的数组  构造成一个二叉树
 *  多序创建：
 * 5、已知前序遍历序列和中序遍历序列，构建唯一一棵确定的二叉树。
 * 6、已知后序遍历序列和中序遍历序列，构建唯一一棵确定的二叉树。
 */
public interface Array2BinaryTree extends Tree {

    //1、将按层次遍历的方式输入的数组  构造成一个二叉树
    public BinaryTreeImpl createBinaryTreeLevel(int[] array);

    //2、将按先序遍历的方式输入的数组  构造成一个二叉树
    public BinaryTreeImpl createPreOrder(int[] array);

    //3、将按中序遍历的方式输入的数组  构造成一个二叉树
    public BinaryTreeImpl createInOrder(BinaryTree root, int[] array);

    //4、将按后序遍历的方式输入的数组  构造成一个二叉树
    public BinaryTreeImpl createPostOrder(BinaryTree root, int[] array);

    //5、已知前序遍历序列和中序遍历序列，构建唯一一棵确定的二叉树。
    public BinaryTree createTreePre_InOrder(BinaryTree root, int[] PreOrderarray, int[] InOrderarray);

    //6、已知后序遍历序列和中序遍历序列，构建唯一一棵确定的二叉树。
    public BinaryTree createTreePost_InOrder(BinaryTree root, int[] PostOrderarray, int[] InOrderarray);

    default boolean check(int[] array) {
        return array == null ? false : array.length != 0;
    }
}
