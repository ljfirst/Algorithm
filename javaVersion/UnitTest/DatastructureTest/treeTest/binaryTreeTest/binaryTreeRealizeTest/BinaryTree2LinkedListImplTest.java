package UnitTest.DatastructureTest.treeTest.binaryTreeTest.binaryTreeRealizeTest;

import DataStructure.stringANDline.list.Listlj;
import DataStructure.stringANDline.list.listRealize.SinglyLinkedList;
import DataStructure.tree.binaryTree.binaryTreeRealize.BinaryTree2LinkedListImpl;
import UnitTest.DatastructureTest.treeTest.BinaryTreeTestDemo;
import org.junit.Test;

/**
 * @author liujun
 * @version 1.0
 * @date 2020/11/4
 * @author—Email liujunfirst@outlook.com
 * @blogURL https://blog.csdn.net/ljfirst
 * @description 二叉树转链表 测试案例
 */
public class BinaryTree2LinkedListImplTest extends BinaryTreeTestDemo {
    BinaryTree2LinkedListImpl bt = new BinaryTree2LinkedListImpl();

    @Test
    public void test() {
        Listlj list = bt.BinaryTree2LinkedList(binaryTreeImplDemo1);
        assert list == null;

        list = bt.BinaryTree2LinkedList(gettreeDemo03());
        SinglyLinkedList listlj = new SinglyLinkedList();
        listlj.insert(false, tree2list_gettreeDemo03);
        boolean f = list.listequals(listlj);
        assert f;

        list = bt.BinaryTree2LinkedList(gettreeDemo04());
        listlj.clear();
        listlj.insert(false, tree2list_gettreeDemo04);
        assert list.listequals(listlj);

        list = bt.BinaryTree2LinkedList(gettreeDemo05());
        listlj.clear();
        listlj.insert(false, tree2list_gettreeDemo05);
        assert list.listequals(listlj);

        list = bt.BinaryTree2LinkedList(gettreeDemo05());
        listlj.clear();
        listlj.insert(false, tree2list_gettreeDemo05_fake);
        assert !list.listequals(listlj);
    }

    int[] tree2list_gettreeDemo03 = {1, 2, 4, 5, 3, 6, 7};
    int[] tree2list_gettreeDemo04 = {1, 2, 4, 3, 7};
    int[] tree2list_gettreeDemo05 = {1, 2, 4, 9, 13, 14, 6, 3, 7, 10, 15, 16, 17, 18, 19, 11, 8, 12, 5, 20};
    int[] tree2list_gettreeDemo05_fake = {1, 2, 4, 5, 3, 6, 7};
}
