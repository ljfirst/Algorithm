package DataStructure.tree.binaryTree;

import DataStructure.tree.binaryTree.dede.BinaryTree1;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author liujun
 * @date 2020-02-18 16:42
 * @description 二叉树的实现
 * 1、将按层次遍历的方式输入的数组  构造成一个二叉树
 * 单序创建：
 * 2、将按先序遍历的方式输入的数组  构造成一个二叉树
 * 3、将按中序遍历的方式输入的数组  构造成一个二叉树
 * 4、将按后序遍历的方式输入的数组  构造成一个二叉树
 * 多序创建：
 * 5、已知前序遍历序列和中序遍历序列，构建唯一一棵确定的二叉树。
 * 6、已知后序遍历序列和中序遍历序列，构建唯一一棵确定的二叉树。
 */
public class Array2BinaryTreeImpl implements Array2BinaryTree {

    //1、将按层次遍历的方式输入的数组  构造成一个二叉树(写法一：非递归，堆栈)
    @Override
    public BinaryTreeImpl createBinaryTreeLevel(int[] array) {

        if (!check(array)) {
            return null;
        }
        BinaryTreeImpl root = null;
        //借助队列实现
        Queue<BinaryTreeImpl> queue = new LinkedList();
        int depth = 0;
        root = new BinaryTreeImpl(array[depth]);
        queue.offer(root);
        while (!queue.isEmpty()) {
            BinaryTreeImpl binaryTree = queue.poll();
            //left child exist
            if (++depth < array.length && array[depth] != -1) {
                binaryTree.left = new BinaryTreeImpl(array[depth]);
                queue.offer(binaryTree.left);
            }
            //right child exist
            if (++depth < array.length && array[depth] != -1) {
                binaryTree.right = new BinaryTreeImpl(array[depth]);
                queue.offer(binaryTree.right);
            }
        }
        return root;
    }

    //1、将按层次遍历的方式输入的数组  构造成一个二叉树(写法二:递归)
    private volatile int count;

    public BinaryTreeImpl createBinaryTreeLevel(BinaryTreeImpl root, int [] tree_num , int i){
        if(i < tree_num.length){
            if(tree_num[i] == -1){
                return null;
            }else{
                //new root's lchild and rchild
                BinaryTreeImpl lchild = new BinaryTreeImpl();
                BinaryTreeImpl rchild = new BinaryTreeImpl();
                //preOrder
                root.value = tree_num[i];
                root.left = createBinaryTreeLevel(lchild, tree_num, ++count);
                root.right = createBinaryTreeLevel(rchild, tree_num, ++count);
            }
        }
        return root;
    }

    //2、将按先序遍历的方式输入的数组  构造成一个二叉树
    public BinaryTreeImpl createPreOrder(int[] array) {

        count = 0;
        return null;
    }


    //3、将按中序遍历的方式输入的数组  构造成一个二叉树
    public BinaryTreeImpl createInOrder(BinaryTree root, int[] array) {
        return null;
    }

    //4、将按后序遍历的方式输入的数组  构造成一个二叉树
    public BinaryTreeImpl createPostOrder(BinaryTree root, int[] array) {
        return null;
    }

    //5、已知前序遍历序列和中序遍历序列，构建唯一一棵确定的二叉树。
    public BinaryTree createTreePre_InOrder(BinaryTree root, int[] PreOrderarray, int[] InOrderarray) {
        return null;
    }

    //6、已知后序遍历序列和中序遍历序列，构建唯一一棵确定的二叉树。
    public BinaryTree createTreePost_InOrder(BinaryTree root, int[] PostOrderarray, int[] InOrderarray) {
        return null;
    }

}
