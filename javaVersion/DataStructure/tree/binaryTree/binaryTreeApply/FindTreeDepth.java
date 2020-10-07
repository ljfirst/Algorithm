package DataStructure.tree.binaryTree.binaryTreeApply;

import DataStructure.tree.binaryTree.BinaryTree;
import DataStructure.tree.binaryTree.BinaryTreeImpl;

/**
 * @author liujun
 * @version 1.0
 * @date 2020/8/19
 * @author—Email liujunfirst@outlook.com
 * @blogURL https://blog.csdn.net/ljfirst
 * @description 查找树的最大深度
 */
public class FindTreeDepth {

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
