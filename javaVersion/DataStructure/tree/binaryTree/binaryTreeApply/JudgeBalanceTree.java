package DataStructure.tree.binaryTree.binaryTreeApply;

import DataStructure.tree.binaryTree.BinaryTreeImpl;

/**
 * @author liujun
 * @version 1.0
 * @date 2020/8/19
 * @author—Email liujunfirst@outlook.com
 * @blogURL https://blog.csdn.net/ljfirst
 * @description 二叉树是否为平衡二叉树
 */
public class JudgeBalanceTree {

    FindTreeDepth ftd = new FindTreeDepth();

    public boolean judge(BinaryTreeImpl root) {
        if (root == null) {
            return false;
        }
        int left = ftd.getBigestDepth(root.left);
        int right = ftd.getBigestDepth(root.right);
        int gap = Math.abs(left - right);
        if (gap <= 1) {
            if (root.left != null && root.right != null) {
                return judge(root.left) && judge(root.right);
            }
            return true;
        }
        return false;
    }
}
