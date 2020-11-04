package UnitTest.DatastructureTest.treeTest.binaryTreeTest.binaryTreeApplyTest;

import DataStructure.tree.binaryTree.binaryTreeRealize.BinaryTreeImpl;
import DataStructure.tree.binaryTree.binaryTreeApply.SubTreeJudge;
import UnitTest.DatastructureTest.treeTest.BinaryTreeTestDemo;
import org.junit.Test;

/**
 * @author liujun
 * @version 1.0
 * @date 2020/11/4
 * @author—Email liujunfirst@outlook.com
 * @blogURL https://blog.csdn.net/ljfirst
 * @description 二叉树子树判断 测试案例
 */
public class SubTreeJudgeTest extends BinaryTreeTestDemo {

    SubTreeJudge sj = new SubTreeJudge();

    @Test
    public void testjudgeTree() {
        boolean flag = sj.judgeTree(gettreeDemo03(), getsubtreeDemo03());
        assert flag;
        flag = sj.judgeTree(gettreeDemo05(), getsubtreeDemo05_1());
        assert flag;
        flag = sj.judgeTree(gettreeDemo05(), getsubtreeDemo05_2());
        assert flag;
        flag = sj.judgeTree(gettreeDemo05(), getsubtreeDemo05_3());
        assert flag;
        flag = sj.judgeTree(gettreeDemo05(), getsubtreeDemo03());
        assert !flag;
    }


    public BinaryTreeImpl getsubtreeDemo05_1() {
        BinaryTreeImpl binaryTree8 = new BinaryTreeImpl(8);
        BinaryTreeImpl binaryTree5 = new BinaryTreeImpl(5);
        BinaryTreeImpl binaryTree12 = new BinaryTreeImpl(12);
        BinaryTreeImpl binaryTree20 = new BinaryTreeImpl(20);
        binaryTree8.left = binaryTree12;
        binaryTree12.left = binaryTree5;
        binaryTree5.right = binaryTree20;
        return binaryTree8;
    }

    public BinaryTreeImpl getsubtreeDemo05_2() {
        BinaryTreeImpl binaryTree2 = new BinaryTreeImpl(2);
        BinaryTreeImpl binaryTree4 = new BinaryTreeImpl(4);
        BinaryTreeImpl binaryTree6 = new BinaryTreeImpl(6);
        BinaryTreeImpl binaryTree9 = new BinaryTreeImpl(9);
        BinaryTreeImpl binaryTree13 = new BinaryTreeImpl(13);
        BinaryTreeImpl binaryTree14 = new BinaryTreeImpl(14);
        binaryTree2.left = binaryTree4;
        binaryTree2.right = binaryTree6;
        binaryTree4.left = binaryTree9;
        binaryTree9.left = binaryTree13;
        binaryTree13.left = binaryTree14;
        return binaryTree2;
    }

    public BinaryTreeImpl getsubtreeDemo05_3() {
        BinaryTreeImpl binaryTree7 = new BinaryTreeImpl(7);
        BinaryTreeImpl binaryTree10 = new BinaryTreeImpl(10);
        BinaryTreeImpl binaryTree11 = new BinaryTreeImpl(11);
        BinaryTreeImpl binaryTree15 = new BinaryTreeImpl(15);
        BinaryTreeImpl binaryTree16 = new BinaryTreeImpl(16);
        BinaryTreeImpl binaryTree17 = new BinaryTreeImpl(17);
        BinaryTreeImpl binaryTree18 = new BinaryTreeImpl(18);
        BinaryTreeImpl binaryTree19 = new BinaryTreeImpl(19);
        binaryTree7.left = binaryTree10;
        binaryTree7.right = binaryTree11;
        binaryTree10.left = binaryTree15;
        binaryTree10.right = binaryTree16;
        binaryTree16.left = binaryTree17;
        binaryTree17.right = binaryTree18;
        binaryTree18.left = binaryTree19;
        return binaryTree7;
    }
}
