package DataStructure.tree.binaryTree.binaryTreeApply;

import DataStructure.tree.binaryTree.binaryTreeRealize.BinaryTreeImpl;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @author liujun
 * @date 2020-02-20 10:17
 * @description 反转二叉树
 * 将二叉树 进行镜像操作
 */

//BinaryTreeReversal
public class MirrorBinaryTree extends BinaryTreeImpl {

    //递归
    public BinaryTreeImpl Mirror(BinaryTreeImpl root) {
        if (root == null) {
            return root;
        }
        //exchange left child and right child
        BinaryTreeImpl binaryTree = root.left;
        root.left = root.right;
        root.right = binaryTree;
        //miror left child and rght child
        Mirror(root.left);
        Mirror(root.right);
        return root;
    }

    //非递归
    public BinaryTreeImpl Mirror1(BinaryTreeImpl root) {
        if (root == null) {
            return root;
        }
        Queue<BinaryTreeImpl> q = new LinkedList();
        q.add(root);
        while (!q.isEmpty()) {
            BinaryTreeImpl node = q.poll();
            BinaryTreeImpl binaryTree = node.left;
            node.left = node.right;
            node.right = binaryTree;
            if (node.left != null) {
                q.add(node.left);
            }
            if (node.right != null) {
                q.add(node.right);
            }
        }
        return root;
    }
}
