package UnitTest.DatastructureTest.treeTest.binaryTreeTest.binaryTreeApplyTest;

import DataStructure.tree.binaryTree.binaryTreeApply.JudgeBalanceBinaryTree;
import UnitTest.DatastructureTest.treeTest.BinaryTreeTestDemo;
import org.junit.Test;

/**
 * @author liujun
 * @version 1.0
 * @date 2020/11/4
 * @author—Email liujunfirst@outlook.com
 * @blogURL https://blog.csdn.net/ljfirst
 * @description 判断平衡二叉树 测试案例
 */
public class JudgeBalanceBinaryTreeTest extends BinaryTreeTestDemo {

    JudgeBalanceBinaryTree jbb = new JudgeBalanceBinaryTree();

    @Test
    public void testgetBigestDepth() {
        int depth = jbb.getBigestDepth(binaryTreeImplDemo1);
        assert depth == 0;
        depth = jbb.getBigestDepth(gettreeDemo03());
        assert depth == 3;
        depth = jbb.getBigestDepth(gettreeDemo04());
        assert depth == 3;
        depth = jbb.getBigestDepth(gettreeDemo05());
        assert depth == 8;
    }

    @Test
    public void testjudge() {
        boolean flag = jbb.judge(binaryTreeImplDemo1);
        assert flag;
        flag = jbb.judge(gettreeDemo03());
        assert flag;
        flag = jbb.judge(gettreeDemo04());
        assert flag;
        flag = jbb.judge(gettreeDemo05());
        assert !flag;
    }
}
