package DataStructure.tree.binaryTree.binaryTreeRealize;

import DataStructure.tree.binaryTree.BinaryTree2Array;

import java.util.*;

/**
 * @author liujun
 * @date 2020-02-18 18:46
 * @description
 * 按层：
 * 1、按层遍历二叉树 输出数组（队列）
 * S形：
 * 1、S形遍历二叉树 输出数组（栈）
 * 按序：
 * 1、先序遍历二叉树 输出数组
 * 2、中序遍历二叉树 输出数组
 * 3、后序遍历二叉树 输出数组
 */
public class BinaryTree2ArrayImpl implements BinaryTree2Array {

    //按层输出遍历的数组
    @Override
    public int[] Binary2ArrayLevel(BinaryTreeImpl root) {
        if (check(root)) {
            return new int[0];
        }
        List<Integer> list = new LinkedList<>();
        Queue<BinaryTreeImpl> queue = new LinkedList<>();
        queue.offer(root);
        list.add(root.value);
        while (!queue.isEmpty()) {
            BinaryTreeImpl binaryTree = queue.poll();
            if (binaryTree.left != null) {
                queue.offer(binaryTree.left);
                list.add(binaryTree.left.value);
            }
            if (binaryTree.right != null) {
                queue.offer(binaryTree.right);
                list.add(binaryTree.right.value);
            }
        }
        int[] binaryTrees = list.stream().mapToInt(Integer::intValue).toArray();
        return binaryTrees;
    }

    @Override
    public int[] Binary2ArrayS(BinaryTreeImpl root) {
        if (check(root)) {
            return new int[0];
        }
        List<Integer> list = new ArrayList<>();
        Stack<BinaryTreeImpl> stack1 = new Stack();
        Stack<BinaryTreeImpl> stack2 = new Stack();
        stack1.push(root);
        list.add(root.value);
        boolean rawflag = true;

        while (!stack1.empty() || !stack2.empty()) {
            while (!stack1.empty()) {
                BinaryTreeImpl node = stack1.pop();
                if (rawflag) {
                    if (node.left != null) {
                        stack2.push(node.left);
                        list.add(node.left.value);
                    }
                    if (node.right != null) {
                        stack2.push(node.right);
                        list.add(node.right.value);
                    }
                } else {
                    if (node.right != null) {
                        stack2.push(node.right);
                        list.add(node.right.value);
                    }
                    if (node.left != null) {
                        stack2.push(node.left);
                        list.add(node.left.value);
                    }
                }
            }
            rawflag = !rawflag;
            stack1 = stack2;
            stack2 = new Stack<>();
        }
        int[] binaryTrees = list.stream().mapToInt(Integer::intValue).toArray();
        return binaryTrees;
    }

    List<Integer> listPreOrder = new ArrayList<>();
    List<Integer> listInOrder = new ArrayList<>();
    List<Integer> listPostOrder = new ArrayList<>();

    @Override
    public int[] Binary2ArrayPreOrder(BinaryTreeImpl root) {
        if (check(root)) {
            return new int[0];
        }
        PreOrder(root);
        int[] arrayPreOrder = listPreOrder.stream().mapToInt(x -> x).toArray();
        return arrayPreOrder;
    }

    public void PreOrder(BinaryTreeImpl root) {
        if (root == null) {
            return;
        }
        listPreOrder.add(root.value);
        if (root.left != null) {
            PreOrder(root.left);
        }
        if (root.right != null) {
            PreOrder(root.right);
        }
    }

    @Override
    public int[] Binary2ArrayInOrder(BinaryTreeImpl root) {

        if (check(root)) {
            return new int[0];
        }
        InOrder(root);
        int[] arrayInorder = listInOrder.stream().mapToInt(x -> x).toArray();
        return arrayInorder;
    }

    public void InOrder(BinaryTreeImpl root) {
        if (root == null) {
            return;
        }
        InOrder(root.left);
        listInOrder.add(root.value);
        InOrder(root.right);
    }

    @Override
    public int[] Binary2ArrayPostOrder(BinaryTreeImpl root) {

        if (check(root)) {
            return new int[0];
        }
        PostOrder(root);
        int[] arrayPostOrder = listPostOrder.stream().mapToInt(x -> x).toArray();
        return arrayPostOrder;
    }

    public void PostOrder(BinaryTreeImpl root) {
        if (root == null) {
            return;
        }
        if (root.left != null) {
            PostOrder(root.left);
        }
        if (root.right != null) {
            PostOrder(root.right);
        }
        listPostOrder.add(root.value);
    }
}
