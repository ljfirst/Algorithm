package DataStructure.tree.binaryTree.binaryTreeApply;

import DataStructure.tree.binaryTree.binaryTreeRealize.BinaryTreeImpl;

/**
 * @author liujun
 * @date 2020-02-20 10:17
 * @description 反转二叉树
 * 将二叉树 进行镜像操作
 */

//BinaryTreeReversal
public class MirrorBinaryTree extends BinaryTreeImpl{

    public BinaryTreeImpl Mirror(BinaryTreeImpl root){
        if(root == null){
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
}
