package UnitTest.DatastructureTest.treeTest.binaryTreeTest.binaryTreeApplyTest;

import DataStructure.tree.binaryTree.binaryTreeApply.MirrorBinaryTree;
import DataStructure.tree.binaryTree.binaryTreeRealize.BinaryTreeImpl;
import UnitTest.DatastructureTest.treeTest.BinaryTreeTestDemo;
import org.junit.Test;

/**
 * @author liujun
 * @date 2020-02-20 10:17
 * @description  镜像二叉树 测试案例
 * Test of Mirror BinaryTree
 */
public class MirrorBinaryTreeTest extends BinaryTreeTestDemo {

    MirrorBinaryTree mirrorBinaryTree = new MirrorBinaryTree();

    @Test
    public void testMirror() {
        //null
        assert mirrorBinaryTree.equals(binaryTreeImplDemo1, mirrorBinaryTree.Mirror(binaryTreeImplDemo1));
        //empty BinaryTreeImpl
        assert mirrorBinaryTree.equals(new BinaryTreeImpl(), mirrorBinaryTree.Mirror(new BinaryTreeImpl()));

        binaryTreeImplDemo3 = gettreeDemo03();
        assert mirrorBinaryTree.equals(gettreeDemo03_Mirror(), mirrorBinaryTree.Mirror(binaryTreeImplDemo3));
        binaryTreeImplDemo4 = gettreeDemo04();
        assert mirrorBinaryTree.equals(gettreeDemo04_Mirror(), mirrorBinaryTree.Mirror(binaryTreeImplDemo4));
    }

    public BinaryTreeImpl gettreeDemo03_Mirror() {
        BinaryTreeImpl binaryTree1 = new BinaryTreeImpl(1);
        BinaryTreeImpl binaryTree2 = new BinaryTreeImpl(2);
        BinaryTreeImpl binaryTree3 = new BinaryTreeImpl(3);
        BinaryTreeImpl binaryTree4 = new BinaryTreeImpl(4);
        BinaryTreeImpl binaryTree5 = new BinaryTreeImpl(5);
        BinaryTreeImpl binaryTree6 = new BinaryTreeImpl(6);
        BinaryTreeImpl binaryTree7 = new BinaryTreeImpl(7);

        binaryTree1.left = binaryTree3;
        binaryTree1.right = binaryTree2;
        binaryTree2.left = binaryTree5;
        binaryTree2.right = binaryTree4;
        binaryTree3.left = binaryTree7;
        binaryTree3.right = binaryTree6;
        return binaryTree1;
    }

    public BinaryTreeImpl gettreeDemo04_Mirror() {
        BinaryTreeImpl binaryTree1 = new BinaryTreeImpl(1);
        BinaryTreeImpl binaryTree2 = new BinaryTreeImpl(2);
        BinaryTreeImpl binaryTree3 = new BinaryTreeImpl(3);
        BinaryTreeImpl binaryTree4 = new BinaryTreeImpl(4);
        BinaryTreeImpl binaryTree7 = new BinaryTreeImpl(7);

        binaryTree1.left = binaryTree3;
        binaryTree1.right = binaryTree2;
        binaryTree2.left = null;
        binaryTree2.right = binaryTree4;
        binaryTree3.left = binaryTree7;
        binaryTree3.right = null;
        return binaryTree1;
    }
}
