package DataStructure.tree.binaryTree;

import DataStructure.arrayANDlist.list.Listlj;
import DataStructure.tree.binaryTree.binaryTreeRealize.BinaryTreeImpl;

/**
 * @author liujun
 * @version 1.0
 * @date 2020/11/4
 * @author—Email liujunfirst@outlook.com
 * @blogURL https://blog.csdn.net/ljfirst
 * @description 二叉树转链表
 */
public interface BinaryTree2LinkedList {

    /**
     *
     * @param binaryTree 二叉树
     * @return 单链表
     * 二叉树转链表：所有的右孩子转到左孩子上
     */
    public Listlj BinaryTree2LinkedList(BinaryTreeImpl binaryTree);
}
