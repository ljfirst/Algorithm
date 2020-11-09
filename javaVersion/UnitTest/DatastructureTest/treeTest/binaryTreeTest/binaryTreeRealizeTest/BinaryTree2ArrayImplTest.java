package UnitTest.DatastructureTest.treeTest.binaryTreeTest.binaryTreeRealizeTest;

import DataStructure.tree.binaryTree.Array2BinaryTree;
import DataStructure.tree.binaryTree.BinaryTree2Array;
import DataStructure.tree.binaryTree.binaryTreeRealize.Array2BinaryTreeImpl;
import DataStructure.tree.binaryTree.binaryTreeRealize.BinaryTree2ArrayImpl;
import DataStructure.tree.binaryTree.binaryTreeRealize.BinaryTreeImpl;
import UnitTest.DatastructureTest.treeTest.BinaryTreeTestDemo;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

/**
 * @author liujun
 * @date 2020-02-18 18:47
 * @description 按层：
 * 1、按层遍历二叉树 输出数组
 * S形：
 * 1、S形遍历二叉树 输出数组
 * 按序：
 * 1、先序遍历二叉树 输出数组
 * 2、中序遍历二叉树 输出数组
 * 3、后序遍历二叉树 输出数组
 */

public class BinaryTree2ArrayImplTest extends BinaryTreeTestDemo {

    BinaryTree2Array binaryTree2Array = new BinaryTree2ArrayImpl();
    Array2BinaryTree array2BinaryTree = new Array2BinaryTreeImpl();
    int[] array;

    @Test
    public void testBinary2ArrayLevel() {
        array = binaryTree2Array.Binary2ArrayLevel(gettreeDemo03());
        assert Arrays.equals(array, treeArray03);
        //assert array.equals(treeDemo03);
        //Assert.assertEquals(array,treeDemo03);
        array = binaryTree2Array.Binary2ArrayLevel(gettreeDemo04());
        treeArray04 = Arrays.stream(treeArray04).filter(x -> x != -1).toArray();
        assert Arrays.equals(array, treeArray04);
        array = binaryTree2Array.Binary2ArrayLevel(gettreeDemo05());
        treeArray05 = Arrays.stream(treeArray05).filter(x -> x != -1).toArray();
        assert Arrays.equals(array, treeArray05);
    }

    //@Test
    public void testBinary2ArrayLevel_print() {
        BinaryTree2ArrayImpl i = new BinaryTree2ArrayImpl();
        i.Binary2ArrayLevel_print(gettreeDemo03());
        System.out.println("\n");
        i.Binary2ArrayLevel_print(gettreeDemo04());
        System.out.println("\n");
        i.Binary2ArrayLevel_print(gettreeDemo05());
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

    @Test
    public void testBinary2ArrayPreOrder() {
        array = binaryTree2Array.Binary2ArrayPreOrder(binaryTreeImplDemo1);
        Assert.assertArrayEquals(array, new int[]{});
        array = binaryTree2Array.Binary2ArrayPreOrder(binaryTreeImplDemo2);
        Assert.assertArrayEquals(array, new int[]{});
        array = binaryTree2Array.Binary2ArrayPreOrder(gettreeDemo03());
        Assert.assertArrayEquals(array, treeArray03Preorder);
        array = binaryTree2Array.Binary2ArrayPreOrder(gettreeDemo04());
        Assert.assertArrayEquals(array, treeArray04Preorder);
        array = binaryTree2Array.Binary2ArrayPreOrder(gettreeDemo05());
        Assert.assertArrayEquals(array, treeArray05Preorder);
        array = binaryTree2Array.Binary2ArrayPreOrder(getsubtreeDemo03());
        Assert.assertArrayEquals(array, new int[]{3, 6, 7});

        //首先生成后序、中序，再通过后序、中序数组生成二叉树，和原二叉树对比
        int[] arrayPost = binaryTree2Array.Binary2ArrayPostOrder(gettreeDemo05());
        int[] arrayIn = binaryTree2Array.Binary2ArrayInOrder(gettreeDemo05());
        BinaryTreeImpl root = array2BinaryTree.createTreePost_InOrder(arrayPost, arrayIn);
        assert root.equals(gettreeDemo05());

        int[] arrayPre = binaryTree2Array.Binary2ArrayPreOrder(gettreeDemo05());
        arrayIn = binaryTree2Array.Binary2ArrayInOrder(gettreeDemo05());
        root = array2BinaryTree.createTreePre_InOrder(arrayPre, arrayIn);
        assert root.equals(gettreeDemo05());
    }

    //先序遍历二叉树 输出数组(特殊符号) 测试案例
    @Test
    public void testBinary2ArrayPreOrder_Symbol() {
        array = binaryTree2Array.Binary2ArrayPreOrder_Symbol(binaryTreeImplDemo1);
        Assert.assertArrayEquals(array, new int[]{});
        array = binaryTree2Array.Binary2ArrayPreOrder_Symbol(binaryTreeImplDemo2);
        Assert.assertArrayEquals(array, new int[]{});
        array = binaryTree2Array.Binary2ArrayPreOrder_Symbol(gettreeDemo03());
        Assert.assertArrayEquals(array, treeArray03Preorder_Symbol);
        array = binaryTree2Array.Binary2ArrayPreOrder_Symbol(gettreeDemo04());
        Assert.assertArrayEquals(array, treeArray04Preorder_Symbol);
        array = binaryTree2Array.Binary2ArrayPreOrder_Symbol(gettreeDemo05());
        Assert.assertArrayEquals(array, treeArray05Preorder_Symbol);
    }

    //测试案例：中序遍历二叉树 输出数组
    @Test
    public void testBinary2ArrayInOrder() {
        array = binaryTree2Array.Binary2ArrayInOrder(binaryTreeImplDemo1);
        Assert.assertArrayEquals(array, new int[]{});
        array = binaryTree2Array.Binary2ArrayInOrder(binaryTreeImplDemo2);
        Assert.assertArrayEquals(array, new int[]{});
        array = binaryTree2Array.Binary2ArrayInOrder(gettreeDemo03());
        Assert.assertArrayEquals(array, treeArray03Inorder);
        array = binaryTree2Array.Binary2ArrayInOrder(gettreeDemo04());
        Assert.assertArrayEquals(array, treeArray04Inorder);
        array = binaryTree2Array.Binary2ArrayInOrder(gettreeDemo05());
        Assert.assertArrayEquals(array, treeArray05Inorder);
        array = binaryTree2Array.Binary2ArrayInOrder(getsubtreeDemo03());
        Assert.assertArrayEquals(array, new int[]{6, 3, 7});
    }

    //中序遍历二叉树 输出数组(特殊符号) 测试案例
    @Test
    public void testBinary2ArrayInOrder_Symbol() {
        array = binaryTree2Array.Binary2ArrayInOrder_Symbol(binaryTreeImplDemo1);
        Assert.assertArrayEquals(array, new int[]{});
        array = binaryTree2Array.Binary2ArrayInOrder_Symbol(binaryTreeImplDemo2);
        Assert.assertArrayEquals(array, new int[]{});
        array = binaryTree2Array.Binary2ArrayInOrder_Symbol(gettreeDemo03());
        Assert.assertArrayEquals(array, treeArray03Inorder_Symbol);
        array = binaryTree2Array.Binary2ArrayInOrder_Symbol(gettreeDemo04());
        Assert.assertArrayEquals(array, treeArray04Inorder_Symbol);
        array = binaryTree2Array.Binary2ArrayInOrder_Symbol(gettreeDemo05());
        Assert.assertArrayEquals(array, treeArray05Inorder_Symbol);
    }

    //测试案例：后序遍历二叉树 输出数组
    @Test
    public void testBinary2ArrayPostOrder() {
        array = binaryTree2Array.Binary2ArrayPostOrder(binaryTreeImplDemo1);
        Assert.assertArrayEquals(array, new int[]{});
        array = binaryTree2Array.Binary2ArrayPostOrder(binaryTreeImplDemo2);
        Assert.assertArrayEquals(array, new int[]{});
        array = binaryTree2Array.Binary2ArrayPostOrder(gettreeDemo03());
        Assert.assertArrayEquals(array, treeArray03Postorder);
        array = binaryTree2Array.Binary2ArrayPostOrder(gettreeDemo04());
        Assert.assertArrayEquals(array, treeArray04Postorder);
        array = binaryTree2Array.Binary2ArrayPostOrder(gettreeDemo05());
        Assert.assertArrayEquals(array, treeArray05Postorder);
        array = binaryTree2Array.Binary2ArrayPostOrder(getsubtreeDemo03());
        Assert.assertArrayEquals(array, new int[]{6, 7, 3});
    }

    //后序遍历二叉树 输出数组(特殊符号)
    @Test
    public void testBinary2ArrayPostOrder_Symbol() {
        array = binaryTree2Array.Binary2ArrayPostOrder_Symbol(binaryTreeImplDemo1);
        Assert.assertArrayEquals(array, new int[]{});
        array = binaryTree2Array.Binary2ArrayPostOrder_Symbol(binaryTreeImplDemo2);
        Assert.assertArrayEquals(array, new int[]{});
        array = binaryTree2Array.Binary2ArrayPostOrder_Symbol(gettreeDemo03());
        Assert.assertArrayEquals(array, treeArray03Postorder_Symbol);
        array = binaryTree2Array.Binary2ArrayPostOrder_Symbol(gettreeDemo04());
        Assert.assertArrayEquals(array, treeArray04Postorder_Symbol);
        array = binaryTree2Array.Binary2ArrayPostOrder_Symbol(gettreeDemo05());
        Assert.assertArrayEquals(array, treeArray05Postorder_Symbol);
    }
}
