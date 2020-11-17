package DataStructure.tree.binaryTree.binaryTreeRealize;

import DataStructure.tree.binaryTree.BinaryTree2Array;

import java.util.*;

/**
 * @author liujun
 * @date 2020-02-18 18:46
 * @description 按层：
 * 1、按层遍历二叉树 输出数组（队列）
 * S形：
 * 1、S形遍历二叉树 输出数组（栈）
 * 按序：
 * 1、先序遍历二叉树 输出数组
 * 2、中序遍历二叉树 输出数组
 * 3、后序遍历二叉树 输出数组
 * 1-1、先序遍历二叉树 输出数组(特殊符号)
 * 2-1、中序遍历二叉树 输出数组(特殊符号)
 * 3-1、后序遍历二叉树 输出数组(特殊符号)
 */
public class BinaryTree2ArrayImpl implements BinaryTree2Array {

    int Symbol = Integer.MIN_VALUE;

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

    //按行打印二叉树
    public void Binary2ArrayLevel_print(BinaryTreeImpl root) {
        if (check(root)) {
            return;
        }
        Queue<BinaryTreeImpl> queue = new LinkedList<>();
        queue.offer(root);
        BinaryTreeImpl front = root;
        BinaryTreeImpl tail = root;
        while (!queue.isEmpty()) {
            BinaryTreeImpl binaryTree = queue.poll();
            System.out.print(binaryTree.value + " ");
            if (binaryTree.left != null) {
                queue.offer(binaryTree.left);
                tail = binaryTree.left;
            }
            if (binaryTree.right != null) {
                queue.offer(binaryTree.right);
                tail = binaryTree.right;
            }
            if (binaryTree == front) {
                front = tail;
                System.out.println();
            }
        }
    }

    //S形遍历二叉树 输出数组（栈）
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

    List<Integer> listPreOrder;

    //先序遍历二叉树 输出数组
    @Override
    public int[] Binary2ArrayPreOrder(BinaryTreeImpl root) {
        if (check(root)) {
            return new int[0];
        }
        listPreOrder = new ArrayList<>();
        //PreOrder_recursion(root);
        PreOrder_stack(root);
        int[] arrayPreOrder = listPreOrder.stream().mapToInt(x -> x).toArray();
        return arrayPreOrder;
    }

    List<Integer> listPreOrder_Symbol;

    //先序遍历二叉树 输出数组(特殊符号)
    @Override
    public int[] Binary2ArrayPreOrder_Symbol(BinaryTreeImpl root) {
        if (check(root)) {
            return new int[]{};
        }
        listPreOrder_Symbol = new ArrayList<>();
        PreOrder_Symbol(root);
        return listPreOrder_Symbol.stream().mapToInt(x -> x).toArray();
    }

    private void PreOrder_Symbol(BinaryTreeImpl root) {
        if (root == null) {
            listPreOrder_Symbol.add(Symbol);
            return;
        }
        listPreOrder_Symbol.add(root.value);
        PreOrder_Symbol(root.left);
        PreOrder_Symbol(root.right);
    }

    //先序递归
    public void PreOrder_recursion(BinaryTreeImpl root) {
        if (root == null) {
            return;
        }
        listPreOrder.add(root.value);
        if (root.left != null) {
            PreOrder_recursion(root.left);
        }
        if (root.right != null) {
            PreOrder_recursion(root.right);
        }
    }

    //先序非递归
    public void PreOrder_stack(BinaryTreeImpl root) {
        Stack<BinaryTreeImpl> stack = new Stack();
        while (root != null || !stack.empty()) {
            while (root != null) {
                stack.push(root);
                listPreOrder.add(root.value);
                root = root.left;
            }
            root = stack.pop().right;
        }
    }

    List<Integer> listInOrder;

    //中序遍历二叉树 输出数组
    @Override
    public int[] Binary2ArrayInOrder(BinaryTreeImpl root) {
        if (check(root)) {
            return new int[0];
        }
        listInOrder = new ArrayList<>();
        //InOrder_recursion(root);
        InOrder_stack(root);
        int[] arrayInorder = listInOrder.stream().mapToInt(x -> x).toArray();
        return arrayInorder;
    }

    List<Integer> listInOrder_Symbol;
    //中序遍历二叉树 输出数组(特殊符号)
    @Override
    public int[] Binary2ArrayInOrder_Symbol(BinaryTreeImpl root) {
        if(check(root)){
            return new int[]{};
        }
        listInOrder_Symbol = new ArrayList<>();
        InOrder_Symbol(root);
        return  listInOrder_Symbol.stream().mapToInt(Integer::intValue).toArray();
    }

    private void InOrder_Symbol(BinaryTreeImpl root){
        if(root == null){
            listInOrder_Symbol.add(Symbol);
            return;
        }
        InOrder_Symbol(root.left);
        listInOrder_Symbol.add(root.value);
        InOrder_Symbol(root.right);
    }

    //中序递归
    private void InOrder_recursion(BinaryTreeImpl root) {
        if (root == null) {
            return;
        }
        InOrder_recursion(root.left);
        listInOrder.add(root.value);
        InOrder_recursion(root.right);
    }

    //中序非递归
    private void InOrder_stack(BinaryTreeImpl root) {
        Stack<BinaryTreeImpl> stack = new Stack<>();
        while (root != null || !stack.empty()) {
            while (root != null) {
                stack.push(root);
                root = root.left;
            }
            root = stack.pop();
            listInOrder.add(root.value);
            root = root.right;
        }
    }

    List<Integer> listPostOrder;

    //后序遍历二叉树 输出数组
    @Override
    public int[] Binary2ArrayPostOrder(BinaryTreeImpl root) {
        if (check(root)) {
            return new int[0];
        }
        listPostOrder = new ArrayList<>();
        //PostOrder_recursion(root);
        PostOrder_stack1(root);
        //PostOrder_stack2(root);
        int[] arrayPostOrder = listPostOrder.stream().mapToInt(x -> x).toArray();
        return arrayPostOrder;
    }

    List<Integer> listPostOrder_Symbol;
    //后序遍历二叉树 输出数组(特殊符号)
    @Override
    public int[] Binary2ArrayPostOrder_Symbol(BinaryTreeImpl root) {
        if(check(root)){
            return new int[]{};
        }
        listPostOrder_Symbol = new ArrayList<>();
        PostOrder_Symbol(root);
        return listPostOrder_Symbol.stream().mapToInt(Integer::intValue).toArray();
    }

    private void PostOrder_Symbol(BinaryTreeImpl root){
        if(root==null){
            listPostOrder_Symbol.add(Symbol);
            return;
        }
        PostOrder_Symbol(root.left);
        PostOrder_Symbol(root.right);
        listPostOrder_Symbol.add(root.value);
    }

    //后续遍历 递归
    private void PostOrder_recursion(BinaryTreeImpl root) {
        if (check(root)) {
            return;
        }
        PostOrder_recursion(root.left);
        PostOrder_recursion(root.right);
        listPostOrder.add(root.value);
    }

    //后续遍历 双栈法
    private void PostOrder_stack2(BinaryTreeImpl root) {
        Stack<BinaryTreeImpl> stack1 = new Stack<>();
        Stack<BinaryTreeImpl> stack2 = new Stack<>();
        stack1.push(root);
        while (!stack1.empty()) {
            root = stack1.pop();
            stack2.push(root);
            if (root.left != null) {
                stack1.push(root.left);
            }
            if (root.right != null) {
                stack1.push(root.right);
            }
        }
        while (!stack2.empty()) {
            listPostOrder.add(stack2.pop().value);
        }
    }

    //后续遍历 单栈法
    public void PostOrder_stack1(BinaryTreeImpl h) {
        Stack<BinaryTreeImpl> stack = new Stack<>();
        stack.push(h);
        BinaryTreeImpl c = null;
        while (!stack.isEmpty()) {
            c = stack.peek();
            if (c.left != null && h != c.left && h != c.right) {
                stack.push(c.left);
            } else if (c.right != null && h != c.right) {
                stack.push(c.right);
            } else {
                listPostOrder.add(stack.pop().value);
                h = c;
            }
        }
    }

}
