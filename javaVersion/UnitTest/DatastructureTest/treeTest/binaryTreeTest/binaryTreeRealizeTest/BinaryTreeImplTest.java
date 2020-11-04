package UnitTest.DatastructureTest.treeTest.binaryTreeTest.binaryTreeRealizeTest;

import DataStructure.tree.binaryTree.binaryTreeRealize.BinaryTreeImpl;
import UnitTest.DatastructureTest.treeTest.BinaryTreeTestDemo;
import org.junit.Test;

/**
 * @author liujun
 * @date 2020-02-18 18:47
 * @description  二叉树 ： 判断两个二叉树相等
 */
public class BinaryTreeImplTest extends BinaryTreeTestDemo {

    BinaryTreeImpl binaryTreeDemo = new BinaryTreeImpl();

    @Test
    public void testequals() {

        binaryTreeImplDemo1 = null;
        binaryTreeImplDemo2 = null;
        binaryTreeImplDemo3 = gettreeDemo03();
        binaryTreeImplDemo4 = gettreeDemo03();

        assert binaryTreeDemo.equals(binaryTreeImplDemo1, binaryTreeImplDemo2);
        assert !binaryTreeDemo.equals(binaryTreeImplDemo1, binaryTreeImplDemo3);
        assert !binaryTreeDemo.equals(binaryTreeImplDemo1, binaryTreeImplDemo4);
        assert !binaryTreeDemo.equals(binaryTreeImplDemo2, binaryTreeImplDemo3);
        assert !binaryTreeDemo.equals(binaryTreeImplDemo2, binaryTreeImplDemo4);
        assert binaryTreeDemo.equals(binaryTreeImplDemo3, binaryTreeImplDemo4);
    }
}