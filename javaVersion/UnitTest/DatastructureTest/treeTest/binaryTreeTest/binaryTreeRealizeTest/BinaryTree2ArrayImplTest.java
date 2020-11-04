package UnitTest.DatastructureTest.treeTest.binaryTreeTest.binaryTreeRealizeTest;

import DataStructure.tree.binaryTree.BinaryTree2Array;
import DataStructure.tree.binaryTree.binaryTreeRealize.BinaryTree2ArrayImpl;
import UnitTest.DatastructureTest.treeTest.BinaryTreeTestDemo;
import org.junit.Test;

import java.util.Arrays;

/**
 * @author liujun
 * @date 2020-02-18 18:47
 * @description
 * 按层：
 *  1、按层遍历二叉树 输出数组
 * S形：
 *  1、S形遍历二叉树 输出数组
 * 按序：
 *  1、先序遍历二叉树 输出数组
 *  2、中序遍历二叉树 输出数组
 *  3、后序遍历二叉树 输出数组
 */

public class BinaryTree2ArrayImplTest extends BinaryTreeTestDemo {

    BinaryTree2Array binaryTree2Array = new BinaryTree2ArrayImpl();
    int[] array;

    @Test
    public void testBinary2ArrayLevel() {
        array = binaryTree2Array.Binary2ArrayLevel(gettreeDemo03());
        assert Arrays.equals(array, treeArray03);
        //�ж�����ֵ��ȵĴ���д����
        //assert array.equals(treeDemo03);
        //Assert.assertEquals(array,treeDemo03);
        array = binaryTree2Array.Binary2ArrayLevel(gettreeDemo04());
        treeArray04 = Arrays.stream(treeArray04).filter(x -> x != -1).toArray();
        assert Arrays.equals(array, treeArray04);

        array = binaryTree2Array.Binary2ArrayLevel(gettreeDemo05());
        treeArray05 = Arrays.stream(treeArray05).filter(x -> x != -1).toArray();
        assert Arrays.equals(array, treeArray05);
    }

    @Test
    public void testBinary2ArrayS() {
        array = binaryTree2Array.Binary2ArrayS(binaryTreeImplDemo1);
        assert Arrays.equals(array, treeArray01s);
        array = binaryTree2Array.Binary2ArrayS(binaryTreeImplDemo2);
        assert Arrays.equals(array, treeArray02s);
        array = binaryTree2Array.Binary2ArrayS(gettreeDemo03());
        assert Arrays.equals(array, treeArray03s);
        array = binaryTree2Array.Binary2ArrayS(gettreeDemo04());
        treeArray04s = Arrays.stream(treeArray04s).filter(x -> x != -1).toArray();
        assert Arrays.equals(array, treeArray04s);
        array = binaryTree2Array.Binary2ArrayS(gettreeDemo05());
        treeArray05s = Arrays.stream(treeArray05s).filter(x -> x != -1).toArray();
        assert Arrays.equals(array, treeArray05s);
    }



}
