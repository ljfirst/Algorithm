package UnitTest.DatastructureTest.treeTest.binaryTreeTest;

import DataStructure.tree.binaryTree.Array2BinaryTree;
import DataStructure.tree.binaryTree.Array2BinaryTreeImpl;
import DataStructure.tree.binaryTree.BinaryTree;
import DataStructure.tree.binaryTree.BinaryTreeImpl;
import UnitTest.DatastructureTest.treeTest.BinaryTreeTestDemo;
import org.junit.Test;

/**
 * @author liujun
 * @date 2020-02-18 18:02
 * @description
 * 单序创建：
 * 1、将按层次遍历的方式输入的数组  构造成一个二叉树
 * 2、将按先序遍历的方式输入的数组  构造成一个二叉树
 * 3、将按中序遍历的方式输入的数组  构造成一个二叉树
 * 4、将按后序遍历的方式输入的数组  构造成一个二叉树
 * 多序创建：
 * 5、已知前序遍历序列和中序遍历序列，构建唯一一棵确定的二叉树。
 * 6、已知后序遍历序列和中序遍历序列，构建唯一一棵确定的二叉树。
 */
public class Array2BinaryTreeImplTest extends BinaryTreeTestDemo {

    Array2BinaryTree binaryTreeCreate = new Array2BinaryTreeImpl();
    BinaryTreeImpl binaryTree = new BinaryTreeImpl();

    //按层构建二叉树
    @Test
    public void testCreateBinaryTreeLevel() {

        binaryTreeImplDemo1 = binaryTreeCreate.createBinaryTreeLevel(treeArray01);
        assert binaryTreeImplDemo1 == null;

        binaryTreeImplDemo1 = binaryTreeCreate.createBinaryTreeLevel(treeArray02);
        assert binaryTreeImplDemo1 == null;

        binaryTreeImplDemo1 = binaryTreeCreate.createBinaryTreeLevel(treeArray03);
        binaryTreeImplDemo3 = gettreeDemo03();
        assert binaryTree.equals(binaryTreeImplDemo1, binaryTreeImplDemo3);

        binaryTreeImplDemo1 = binaryTreeCreate.createBinaryTreeLevel(treeArray04);
        binaryTreeImplDemo4 = gettreeDemo04();
        assert binaryTree.equals(binaryTreeImplDemo1, binaryTreeImplDemo4);

        binaryTreeImplDemo1 = binaryTreeCreate.createBinaryTreeLevel(treeArray05);
        binaryTreeImplDemo4 = gettreeDemo05();
        assert binaryTree.equals(binaryTreeImplDemo1, binaryTreeImplDemo4);
    }

    //6、按照后序遍历序列和中序遍历序列，构建唯一一棵确定的二叉树。
    @Test
    public void testcreateTreePre_InOrder() {
        binaryTreeImplDemo1 = binaryTreeCreate.createTreePre_InOrder(treeArray01, treeArray01);
        assert binaryTree.equals(binaryTreeImplDemo1, null);

        binaryTreeImplDemo1 = binaryTreeCreate.createTreePre_InOrder(treeArray02, treeArray02);
        assert binaryTree.equals(binaryTreeImplDemo1, null);

        binaryTreeImplDemo1 = binaryTreeCreate.createTreePre_InOrder(treeArray03Preorder, treeArray03Inorder);
        binaryTreeImplDemo3 = gettreeDemo03();
        assert binaryTree.equals(binaryTreeImplDemo1, binaryTreeImplDemo3);

        binaryTreeImplDemo1 = binaryTreeCreate.createTreePre_InOrder(treeArray04Preorder, treeArray04Inorder);
        binaryTreeImplDemo4 = gettreeDemo04();
        assert binaryTree.equals(binaryTreeImplDemo1, binaryTreeImplDemo4);

        binaryTreeImplDemo1 = binaryTreeCreate.createTreePre_InOrder(treeArray05Preorder, treeArray05Inorder);
        binaryTreeImplDemo2 = gettreeDemo05();
        assert binaryTree.equals(binaryTreeImplDemo1, binaryTreeImplDemo2);
    }

    //5、已知前序遍历序列和中序遍历序列，构建唯一一棵确定的二叉树。
    @Test
    public void testcreateTreePost_InOrder() {
        binaryTreeImplDemo1 = binaryTreeCreate.createTreePost_InOrder(treeArray01, treeArray01);
        assert binaryTree.equals(binaryTreeImplDemo1, null);

        binaryTreeImplDemo1 = binaryTreeCreate.createTreePost_InOrder(treeArray02, treeArray02);
        assert binaryTree.equals(binaryTreeImplDemo1, null);

        binaryTreeImplDemo1 = binaryTreeCreate.createTreePost_InOrder(treeArray03Postorder, treeArray03Inorder);
        binaryTreeImplDemo3 = gettreeDemo03();
        assert binaryTree.equals(binaryTreeImplDemo1, binaryTreeImplDemo3);

        binaryTreeImplDemo1 = binaryTreeCreate.createTreePost_InOrder(treeArray04Postorder, treeArray04Inorder);
        binaryTreeImplDemo4 = gettreeDemo04();
        assert binaryTree.equals(binaryTreeImplDemo1, binaryTreeImplDemo4);

        binaryTreeImplDemo1 = binaryTreeCreate.createTreePost_InOrder(treeArray05Postorder, treeArray05Inorder);
        binaryTreeImplDemo2 = gettreeDemo05();
        assert binaryTree.equals(binaryTreeImplDemo1, binaryTreeImplDemo2);
    }
}
