package DataStructure.tree.binaryTree.binaryTreeApply;

import DataStructure.tree.binaryTree.binaryTreeRealize.BinaryTreeImpl;

/**
 * @author liujun
 * @version 1.0
 * @date 2019-3-23 ����02:54:10
 * @author-Email liujunfirst@outlook.com
 * @description 查找最近公共父节点
 * 思路一
 * 思路二
 * @URL
 */
public class NearestCommonParent {


    //思路一
    public BinaryTreeImpl findNCP(BinaryTreeImpl root, int x1, int x2) {
        if (root == null) {
            return null;
        }
        if (root.value == x1 || root.value == x2) {
            return root;
        }
        BinaryTreeImpl left = findNCP(root.left, x1, x2);
        BinaryTreeImpl right = findNCP(root.right, x1, x2);
        if (left == null && right == null) {
            return null;
        }
        if (left != null && right != null) {
            return root;
        }
        return left == null ? right : left;
    }

    //思路二：效率低下
    public BinaryTreeImpl findxandy(BinaryTreeImpl root, int x, int y) {

        if (findx(root.left, x) && findx(root.left, y)) {
            BinaryTreeImpl v = findxandy(root.left, x, y);
            return v == null ? root.left : v;
        } else if (findx(root.right, x) && findx(root.right, y)) {
            BinaryTreeImpl v = findxandy(root.right, x, y);
            return v == null ? root.right : v;
        } else if (findx(root.left, x) && findx(root.right, y)
                || findx(root.right, x) && findx(root.left, y)) {
            return root;
        }
        return null;
    }

    //单节点查找值
    public boolean findx(BinaryTreeImpl root, int x) {
        if (null == root) {
            return false;
        }
        if (root.value == x) {
            return true;
        }
        return findx(root.left, x) || findx(root.right, x);
    }
}
