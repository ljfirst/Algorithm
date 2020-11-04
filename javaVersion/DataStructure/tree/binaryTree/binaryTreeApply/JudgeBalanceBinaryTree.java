package DataStructure.tree.binaryTree.binaryTreeApply;

import DataStructure.tree.binaryTree.binaryTreeRealize.BinaryTreeImpl;

/**
 * @author liujun
 * @version 1.0
 * @date 2020/8/19
 * @author—Email liujunfirst@outlook.com
 * @blogURL https://blog.csdn.net/ljfirst
 * @description 判断平衡二叉树
 */
public class JudgeBalanceBinaryTree {

    //判断二叉树的左右孩子 深度差是否为 1
    public boolean judge(BinaryTreeImpl root) {
        if (root == null) {
            //注意此处为true，不是false
            return true;
        }
        int left = getBigestDepth(root.left);
        int right = getBigestDepth(root.right);
        int gap = Math.abs(left - right);
        if (gap <= 1) {
            if (root.left != null && root.right != null) {
                return judge(root.left) && judge(root.right);
            }
            return true;
        }
        return false;
    }

    //获取树的最大深度
    public int getBigestDepth(BinaryTreeImpl root) {
        if (root == null) {
            return 0;
        }
        int left = getBigestDepth(root.left);
        int right = getBigestDepth(root.right);
        int tall = Math.max(left, right);
        return tall + 1;
    }
}
