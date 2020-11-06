package DataStructure.tree.binaryTree.binaryTreeRealize;

import DataStructure.stringANDline.list.Listlj;
import DataStructure.tree.binaryTree.Array2BinaryTree;
import DataStructure.tree.binaryTree.BinaryTree;
import com.sun.org.apache.xpath.internal.operations.Lt;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author liujun
 * @date 2020-02-18 16:42
 * @description 二叉树的实现
 * 单序创建：
 * 1、将按层次遍历的方式输入的数组  构造成一个二叉树
 * 2、将按先序遍历的方式输入的数组  构造成一个二叉树
 * 3、将按中序遍历的方式输入的数组  构造成一个二叉树
 * 4、将按后序遍历的方式输入的数组  构造成一个二叉树
 * 5、将一个完全二叉树的数组 构造成一个二叉树
 * 多序创建：
 * 6、已知前序遍历序列和中序遍历序列，构建唯一一棵确定的二叉树。
 * 7、已知后序遍历序列和中序遍历序列，构建唯一一棵确定的二叉树。
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

    public BinaryTreeImpl createBinaryTreeLevel(BinaryTreeImpl root, int[] tree_num, int i) {
        if (i < tree_num.length) {
            if (tree_num[i] == -1) {
                return null;
            } else {
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

    @Override
    public BinaryTreeImpl createfulltree(int[] array) {
        if (array == null || array.length == 0) {
            return null;
        }
        int length = array.length;
        int base = 2;
        //判断一个数是否为 2的n次方-1
        int indexlength = String.valueOf(Math.log(length + 1) / Math.log(base)).length();
        //double型 整数 数字转字符串长度，长度为3
        if (indexlength > 3) {
            return null;
        }
        List<BinaryTreeImpl> btlist = new ArrayList<>();
        for (int i = 0; i < length; i++) {
            btlist.add(new BinaryTreeImpl(array[i]));
        }
        //注意此处的i < (length - 1) / 2，而不是i < (length + 1) / 2
        for (int i = 0; i < (length - 1) / 2; i++) {
            btlist.get(i).left = btlist.get(2 * i + 1);
            btlist.get(i).right = btlist.get(2 * i + 2);
        }
        return btlist.get(0);
    }

    //5、已知前序遍历序列和中序遍历序列，构建唯一一棵确定的二叉树。
    @Override
    public BinaryTreeImpl createTreePre_InOrder(int[] PreOrderarray, int[] InOrderarray) {
        if (check(PreOrderarray) && check(InOrderarray)) {
            int preStart = 0;
            int preEnd = PreOrderarray.length - 1;
            int inStart = 0;
            int inEnd = InOrderarray.length - 1;
            if (preEnd == inEnd) {
                return createTreePre_InOrder(PreOrderarray, preStart, preEnd,
                        InOrderarray, inStart, inEnd);
            }
        }
        return null;
    }

    public BinaryTreeImpl createTreePre_InOrder(int[] PreOrderarray, int preStart, int preEnd,
                                                int[] InOrderarray, int inStart, int inEnd) {
        if (preStart <= preEnd) {
            //此处是PreOrderarray[preStart]，不是PreOrderarray[0]
            int value = PreOrderarray[preStart];
            BinaryTreeImpl node = new BinaryTreeImpl(value);
            int index = 0;
            //循环不是从0 到 InOrderarray.length
            for (int i = inStart; i <= inEnd; i++) {
                if (value == InOrderarray[i]) {
                    index = i;
                    break;
                }
            }
            //此处length = index - inStart，而不是length = index - preStart
            int length = index - inStart;
            node.left = createTreePre_InOrder(PreOrderarray, preStart + 1, preStart + length,
                    InOrderarray, inStart, index - 1);
            node.right = createTreePre_InOrder(PreOrderarray, preStart + length + 1, preEnd,
                    InOrderarray, index + 1, inEnd);
            return node;
        }
        return null;
    }

    //6、已知后序遍历序列和中序遍历序列，构建唯一一棵确定的二叉树。
    @Override
    public BinaryTreeImpl createTreePost_InOrder(int[] PostOrderarray, int[] InOrderarray) {
        if (check(PostOrderarray) && check(InOrderarray)) {
            int postStart = 0;
            int postEnd = PostOrderarray.length - 1;
            int inStart = 0;
            int inEnd = InOrderarray.length - 1;
            if (postEnd == inEnd) {
                return createTreePost_InOrder(PostOrderarray, postStart, postEnd,
                        InOrderarray, inStart, inEnd);
            }
        }
        return null;
    }

    public BinaryTreeImpl createTreePost_InOrder(int[] PostOrderarray, int postStart, int postEnd,
                                                 int[] InOrderarray, int inStart, int inEnd) {
        if (postStart <= postEnd) {
            //此处是PreOrderarray[preStart]，不是PreOrderarray[0]
            int value = PostOrderarray[postEnd];
            BinaryTreeImpl node = new BinaryTreeImpl(value);
            int index = 0;
            //循环不是从0 到 InOrderarray.length
            for (int i = inStart; i <= inEnd; i++) {
                if (value == InOrderarray[i]) {
                    index = i;
                    break;
                }
            }
            //此处length = index - inStart，而不是length = index - preStart
            int length = index - inStart;
            node.left = createTreePost_InOrder(PostOrderarray, postStart, postStart + length - 1,
                    InOrderarray, inStart, index - 1);
            node.right = createTreePost_InOrder(PostOrderarray, postStart + length, postEnd - 1,
                    InOrderarray, index + 1, inEnd);
            return node;
        }
        return null;
    }
}
