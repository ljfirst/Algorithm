package DataStructure.tree.binaryTree.binaryTreeRealize;

import DataStructure.stringANDline.list.Listlj;
import DataStructure.stringANDline.list.listRealize.Nodelj;
import DataStructure.stringANDline.list.listRealize.SinglyLinkedList;
import DataStructure.tree.binaryTree.BinaryTree2LinkedList;

/**
 * @author liujun
 * @version 1.0
 * @date 2020/11/4
 * @author—Email liujunfirst@outlook.com
 * @blogURL https://blog.csdn.net/ljfirst
 * @description 二叉树转链表
 */
public class BinaryTree2LinkedListImpl implements BinaryTree2LinkedList {

    /**
     * @param binaryTree 二叉树
     * @return 单链表链表
     */
    @Override
    public Listlj BinaryTree2LinkedList(BinaryTreeImpl binaryTree) {

        binaryTree = BinaryTree2LinkedList_Right(binaryTree);
        //binaryTree = BinaryTree2LinkedList_Left(binaryTree);
        SinglyLinkedList list = print(binaryTree);
        return list;
    }

    //将右孩子并至左孩子叶子结点，形成链表
    private BinaryTreeImpl BinaryTree2LinkedList_Left(BinaryTreeImpl binaryTree) {
        if (binaryTree == null) {
            return null;
        }
        /**
         * 取出节点的左右孩子，右孩子置空
         * 循环左孩子（之前的）至叶子节点，
         * 将右孩子（之前的）复制给该叶子节点的左孩子
         */
        BinaryTree2LinkedList_Left(binaryTree.left);
        BinaryTree2LinkedList_Left(binaryTree.right);
        BinaryTreeImpl nodeleft = binaryTree.left;
        BinaryTreeImpl noderight = binaryTree.right;
        binaryTree.right = null;
        BinaryTreeImpl p = binaryTree;
        //注意此处的写法是p.left 而不是p，因为存在判空问题
        while (p.left != null) {
            p = p.left;
        }
        p.left = noderight;
        return binaryTree;
    }

    private BinaryTreeImpl BinaryTree2LinkedList_Right(BinaryTreeImpl binaryTree) {
        if (binaryTree == null) {
            return null;
        }
        /**
         * 取出节点的左右孩子，直接把左孩子复制给跟节点的右孩子，左孩子置空
         * 循环右孩子（之前的左孩子）至叶子节点，
         * 将右孩子（之前的）复制给该叶子节点的右孩子
         */
        BinaryTree2LinkedList_Right(binaryTree.left);
        BinaryTree2LinkedList_Right(binaryTree.right);
        BinaryTreeImpl nodeleft = binaryTree.left;
        BinaryTreeImpl noderight = binaryTree.right;
        binaryTree.left = null;
        binaryTree.right = nodeleft;
        BinaryTreeImpl p = binaryTree;
        //注意此处的写法是p.left 而不是p，因为存在判空问题
        while (p.right != null) {
            p = p.right;
        }
        p.right = noderight;
        return binaryTree;
    }

    //将二叉树 直转 链表
    private SinglyLinkedList print(BinaryTreeImpl binaryTree) {
        if (binaryTree == null) {
            return null;
        }
        SinglyLinkedList list = new SinglyLinkedList();
        Nodelj nodehead = list.head;
        while (binaryTree != null) {
            nodehead.next = new Nodelj(binaryTree.value);
            nodehead = nodehead.next;
            //不区分左右孩子的取法
            binaryTree = binaryTree.left == null ? binaryTree.right : binaryTree.left;
            list.head.value++;
        }
        return list;
    }
}
