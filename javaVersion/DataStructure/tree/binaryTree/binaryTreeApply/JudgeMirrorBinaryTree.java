package DataStructure.tree.binaryTree.binaryTreeApply;

import DataStructure.tree.binaryTree.binaryTreeRealize.BinaryTreeImpl;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * @author liujun
 * @version 1.0
 * @date 2020/12/21
 * @author—Email liujunfirst@outlook.com
 * @blogURL https://blog.csdn.net/ljfirst
 * @description 判断镜像二叉树
 * 即节点的左孩子值等于右孩子值，是否是一个完全对称的镜像二叉树
 */

public class JudgeMirrorBinaryTree {

    public boolean judge(BinaryTreeImpl root) {
        if (root == null) {
            return true;
        }
        return compareTree(root.left, root.right);
    }

    private boolean compareTree(BinaryTreeImpl left, BinaryTreeImpl right) {
        if (left == null && right == null) {
            return true;
        }
        if (left == null || right == null || left.value != right.value) {
            return false;
        }
        return compareTree(left.left, right.right) && compareTree(left.right, right.left);
    }

    public boolean judge_Queue(BinaryTreeImpl root) {
        if (root == null) {
            return true;
        }
        Queue<BinaryTreeImpl> queue = new ArrayDeque<>();
        if (root.left == null && root.right == null) {
            return true;
        }
        if (root.left == null || root.right == null || root.left.value != root.right.value) {
            return false;
        }
        queue.offer(root.left);
        queue.offer(root.right);
        boolean lflag;
        boolean rflag;
        while (!queue.isEmpty()) {
            lflag = false;
            rflag = false;
            BinaryTreeImpl left = queue.poll();
            BinaryTreeImpl right = queue.poll();
            if (left.left == null && right.right == null) {
                lflag = true;
            }
            if (!lflag && (left.left == null || right.right == null ||
                    left.left.value != right.right.value)) {
                return false;
            }
            //注意入队顺序
            if (!lflag) {
                queue.offer(left.left);
                queue.offer(right.right);
            }
            if (left.right == null && right.left == null) {
                rflag = true;
            }
            if (!rflag && (left.right == null || right.left == null ||
                    left.right.value != right.left.value)) {
                return false;
            }
            //入队的节点会两两对比
            if (!rflag) {
                queue.offer(left.right);
                queue.offer(right.left);
            }
        }
        return true;
    }

}
