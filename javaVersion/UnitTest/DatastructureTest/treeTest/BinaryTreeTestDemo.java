package UnitTest.DatastructureTest.treeTest;

import DataStructure.tree.binaryTree.BinaryTreeImpl;

/**
 * @author liujun
 * @date 2020-02-18 19:02
 * @description 树数据结构的测试用例
 */
public class BinaryTreeTestDemo {

    public BinaryTreeImpl binaryTreeImplDemo1 = null;
    public BinaryTreeImpl binaryTreeImplDemo2 = null;
    public BinaryTreeImpl binaryTreeImplDemo3 = null;
    public BinaryTreeImpl binaryTreeImplDemo4 = null;

    //按照S形打印的数组
    public int[] treeArray01s = {};
    public int[] treeArray02s = {};
    public int[] treeArray03s = {1, 2, 3, 7, 6, 5, 4};
    public int[] treeArray04s = {1, 2, 3, 7, -1, -1, 4};
    public int[] treeArray05s = {1, 2, 3, 8, 7, 6, 4, 9, -1, -1, -1, 10, 11, 12, -1, -1, 5, -1, -1,
            16, 15, -1, 13, 14, -1, -1, -1, 17, -1, -1, 20, -1, -1, 18, -1, -1, -1, 19, -1, -1, -1};

    //层次遍历的数组
    public int[] treeArray01 = {};
    public int[] treeArray02 = null;
    public int[] treeArray03 = {
                 1,
              2,   3,
            4, 5, 6, 7};
    public int[] treeArray04 = {
                  1,
               2,    3,
            4, -1, -1, 7};

    public int[] treeArray05 = {
                            1,
                     2,                     3,
                 4,      6,         7,           8,
                9, -1, -1, -1, 10,      11,    12, -1,
              13, -1,       15,    16, -1, -1, 5, -1,
            14, -1,      -1, -1, 17, -1,    -1, 20,
            -1, -1,            -1, 18,        -1, -1,
                                 19, -1,
                               -1, -1
    };

    //先序遍历的数组
    public int[] treeArray03Preorder = {1,2,4,5,3,6,7};
    public int[] treeArray04Preorder = {1,2,4,3,7};
    public int[] treeArray05Preorder = {1,2,4,9,13,14,6,3,7,10,15,16,17,18,19,11,8,12,5,20};
    //中序遍历的数组
    public int[] treeArray03Inorder = {4,2,5,1,6,3,7};
    public int[] treeArray04Inorder = {4,2,1,3,7};
    public int[] treeArray05Inorder = {14,13,9,4,2,6,1,15,10,17,19,18,16,7,11,3,5,20,12,8};
    //后序遍历的数组
    public int[] treeArray03Postorder = {4,5,2,6,7,3,1};
    public int[] treeArray04Postorder = {4,2,7,3,1};
    public int[] treeArray05Postorder = {14,13,9,4,6,2,15,19,18,17,16,10,11,7,20,5,12,8,3,1};


    public BinaryTreeImpl gettreeDemo03() {
        BinaryTreeImpl binaryTree1 = new BinaryTreeImpl(1);
        BinaryTreeImpl binaryTree2 = new BinaryTreeImpl(2);
        BinaryTreeImpl binaryTree3 = new BinaryTreeImpl(3);
        BinaryTreeImpl binaryTree4 = new BinaryTreeImpl(4);
        BinaryTreeImpl binaryTree5 = new BinaryTreeImpl(5);
        BinaryTreeImpl binaryTree6 = new BinaryTreeImpl(6);
        BinaryTreeImpl binaryTree7 = new BinaryTreeImpl(7);

        binaryTree1.left = binaryTree2;
        binaryTree1.right = binaryTree3;
        binaryTree2.left = binaryTree4;
        binaryTree2.right = binaryTree5;
        binaryTree3.left = binaryTree6;
        binaryTree3.right = binaryTree7;
        return binaryTree1;
    }

    public BinaryTreeImpl gettreeDemo04() {
        BinaryTreeImpl binaryTree1 = new BinaryTreeImpl(1);
        BinaryTreeImpl binaryTree2 = new BinaryTreeImpl(2);
        BinaryTreeImpl binaryTree3 = new BinaryTreeImpl(3);
        BinaryTreeImpl binaryTree4 = new BinaryTreeImpl(4);
        BinaryTreeImpl binaryTree7 = new BinaryTreeImpl(7);

        binaryTree1.left = binaryTree2;
        binaryTree1.right = binaryTree3;
        binaryTree2.left = binaryTree4;
        binaryTree3.right = binaryTree7;
        return binaryTree1;
    }

    public BinaryTreeImpl gettreeDemo05() {
        BinaryTreeImpl binaryTree1 = new BinaryTreeImpl(1);
        BinaryTreeImpl binaryTree2 = new BinaryTreeImpl(2);
        BinaryTreeImpl binaryTree3 = new BinaryTreeImpl(3);
        BinaryTreeImpl binaryTree4 = new BinaryTreeImpl(4);
        BinaryTreeImpl binaryTree5 = new BinaryTreeImpl(5);
        BinaryTreeImpl binaryTree6 = new BinaryTreeImpl(6);
        BinaryTreeImpl binaryTree7 = new BinaryTreeImpl(7);
        BinaryTreeImpl binaryTree8 = new BinaryTreeImpl(8);
        BinaryTreeImpl binaryTree9 = new BinaryTreeImpl(9);
        BinaryTreeImpl binaryTree10 = new BinaryTreeImpl(10);
        BinaryTreeImpl binaryTree11 = new BinaryTreeImpl(11);
        BinaryTreeImpl binaryTree12 = new BinaryTreeImpl(12);
        BinaryTreeImpl binaryTree13 = new BinaryTreeImpl(13);
        BinaryTreeImpl binaryTree14 = new BinaryTreeImpl(14);
        BinaryTreeImpl binaryTree15 = new BinaryTreeImpl(15);
        BinaryTreeImpl binaryTree16 = new BinaryTreeImpl(16);
        BinaryTreeImpl binaryTree17 = new BinaryTreeImpl(17);
        BinaryTreeImpl binaryTree18 = new BinaryTreeImpl(18);
        BinaryTreeImpl binaryTree19 = new BinaryTreeImpl(19);
        BinaryTreeImpl binaryTree20 = new BinaryTreeImpl(20);

        binaryTree1.left = binaryTree2;
        binaryTree1.right = binaryTree3;
        binaryTree2.left = binaryTree4;
        binaryTree2.right = binaryTree6;
        binaryTree3.left = binaryTree7;
        binaryTree3.right = binaryTree8;
        binaryTree4.left = binaryTree9;
        binaryTree7.left = binaryTree10;
        binaryTree7.right = binaryTree11;
        binaryTree8.left = binaryTree12;
        binaryTree9.left = binaryTree13;
        binaryTree10.left = binaryTree15;
        binaryTree10.right = binaryTree16;
        binaryTree12.left = binaryTree5;
        binaryTree13.left = binaryTree14;
        binaryTree16.left = binaryTree17;
        binaryTree5.right = binaryTree20;
        binaryTree17.right = binaryTree18;
        binaryTree18.left = binaryTree19;

        return binaryTree1;
    }
}
