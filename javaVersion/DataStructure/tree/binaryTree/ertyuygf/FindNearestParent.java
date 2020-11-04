package DataStructure.tree.binaryTree.ertyuygf;

import DataStructure.tree.binaryTree.binaryTreeRealize.BinaryTreeImpl;

/**
 * @author liujun
 * @version 1.0
 * @date 2019-3-23 ����02:54:10
 * @authorEmail liujunfirst@outlook.com
 * @description 查找最小公共父节点
 * @URL
 */
public class FindNearestParent {

    public BinaryTreeImpl findxandy(BinaryTreeImpl root, int x, int y) {

        if (findx(root.left, x) && findx(root.left, y)) {
            return findxandy(root.left, x, y);

        } else if (findx(root.right, x) && findx(root.right, y)) {
            return findxandy(root.right, x, y);

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
