package UnitTest.DatastructureTest.treeTest.binaryTreeTest.binaryTreeApplyTest;

import DataStructure.tree.binaryTree.binaryTreeApply.JudgeMirrorBinaryTree;
import DataStructure.tree.binaryTree.binaryTreeRealize.BinaryTreeImpl;
import UnitTest.DatastructureTest.treeTest.BinaryTreeTestDemo;
import org.junit.Test;

/**
 * @author liujun
 * @version 1.0
 * @date 2020/12/21
 * @author—Email liujunfirst@outlook.com
 * @blogURL https://blog.csdn.net/ljfirst
 * @description 测试案例 判断镜像二叉树
 */
public class JudgeMirrorBinaryTreeTest extends BinaryTreeTestDemo {

    JudgeMirrorBinaryTree jmbt = new JudgeMirrorBinaryTree();

    @Test
    public void testjudge() {
        BinaryTreeImpl root = gettreeMirrorDemo01();
        assert jmbt.judge(root);
        assert jmbt.judge_Queue(root);

        root = gettreeMirrorDemo02();
        assert jmbt.judge(root);
        assert jmbt.judge_Queue(root);
        root = gettreeMirrorDemo03();
        assert !jmbt.judge(root);
        assert !jmbt.judge_Queue(root);

        assert jmbt.judge(null);
        assert jmbt.judge_Queue(null);
        root = gettreeMirrorDemo04();
        assert jmbt.judge(root);
        assert jmbt.judge_Queue(root);
    }

    public BinaryTreeImpl gettreeMirrorDemo01() {
        BinaryTreeImpl binaryTree1 = new BinaryTreeImpl(1);
        BinaryTreeImpl binaryTree2 = new BinaryTreeImpl(2);
        BinaryTreeImpl binaryTree3 = new BinaryTreeImpl(2);
        BinaryTreeImpl binaryTree4 = new BinaryTreeImpl(4);
        BinaryTreeImpl binaryTree5 = new BinaryTreeImpl(5);
        BinaryTreeImpl binaryTree6 = new BinaryTreeImpl(5);
        BinaryTreeImpl binaryTree7 = new BinaryTreeImpl(4);

        binaryTree1.left = binaryTree3;
        binaryTree1.right = binaryTree2;
        binaryTree2.left = binaryTree5;
        binaryTree2.right = binaryTree4;
        binaryTree3.left = binaryTree7;
        binaryTree3.right = binaryTree6;
        return binaryTree1;
    }

    public BinaryTreeImpl gettreeMirrorDemo02() {
        BinaryTreeImpl binaryTree1 = new BinaryTreeImpl(1);
        BinaryTreeImpl binaryTree2 = new BinaryTreeImpl(2);
        BinaryTreeImpl binaryTree3 = new BinaryTreeImpl(2);

        binaryTree1.left = binaryTree3;
        binaryTree1.right = binaryTree2;
        return binaryTree1;
    }

    public BinaryTreeImpl gettreeMirrorDemo03() {
        BinaryTreeImpl binaryTree1 = new BinaryTreeImpl(1);
        BinaryTreeImpl binaryTree2 = new BinaryTreeImpl(2);
        BinaryTreeImpl binaryTree3 = new BinaryTreeImpl(3);
        BinaryTreeImpl binaryTree4 = new BinaryTreeImpl(4);
        BinaryTreeImpl binaryTree5 = new BinaryTreeImpl(5);
        BinaryTreeImpl binaryTree6 = new BinaryTreeImpl(4);
        BinaryTreeImpl binaryTree7 = new BinaryTreeImpl(5);

        binaryTree1.left = binaryTree3;
        binaryTree1.right = binaryTree2;
        binaryTree2.left = binaryTree5;
        binaryTree2.right = binaryTree4;
        binaryTree3.left = binaryTree7;
        binaryTree3.right = binaryTree6;
        return binaryTree1;
    }

    public BinaryTreeImpl gettreeMirrorDemo04() {
        BinaryTreeImpl binaryTree1 = new BinaryTreeImpl(1);
        return binaryTree1;
    }
}
