package UnitTest.DatastructureTest.arrayANDlistTest.listTest;

import DataStructure.arrayANDlist.list.listRealize.ListAdd;
import DataStructure.arrayANDlist.list.listRealize.SinglyLinkedList;
import org.junit.Test;

/**
 * @author liujun
 * @version 1.0
 * @date 2020/12/11
 * @author—Email liujunfirst@outlook.com
 * @blogURL https://blog.csdn.net/ljfirst
 * @description 链表相加 测试案例
 */

public class ListAddTest {

    ListAdd listAdd = new ListAdd();
    SinglyLinkedList l1 = new SinglyLinkedList();
    SinglyLinkedList l2 = new SinglyLinkedList();

    @Test
    public void test() {
        l1.insert(true, demo01_1);
        l2.insert(true, demo01_2);
        int target = listAdd.add(l1, l2);
        assert target == answer01;

        l1.clear();
        l2.clear();
        l1.insert(true, demo02_1);
        l2.insert(true, demo02_2);
        target = listAdd.add(l1, l2);
        assert target == answer02;

        l1.clear();
        l2.clear();
        l1.insert(true, demo02_1);
        l2.insert(true, demo02_2);
        target = listAdd.add(l1, l2);
        assert target == answer02;

        l2.clear();
        l2.insert(true, demo02_2);
        target = listAdd.add(null, l2);
        assert target == 237836;

        l1.clear();
        l1.insert(true, demo02_1);
        target = listAdd.add(l1, null);
        assert target == 69282;

        l1.clear();
        l2.clear();
        l1.insert(true, demo03_1);
        l2.insert(true, demo03_2);
        target = listAdd.add(l1, l2);
        assert target == answer03;

        l1.clear();
        l2.clear();
        l1.insert(true, demo04_1);
        l2.insert(true, demo04_2);
        target = listAdd.add(l1, l2);
        assert target == answer04;
    }

    int[] demo01_1 = {1, 2, 3};
    int[] demo01_2 = {1, 2, 3};
    int answer01 = 246;

    int[] demo02_1 = {6, 9, 2, 8, 2};
    int[] demo02_2 = {2, 3, 7, 8, 3, 6};
    int answer02 = 307118;

    int[] demo03_1 = {7, 8, 9, 0, 2, 4, 7};
    int[] demo03_2 = {7, 2, 4, 8, 3, 0, 9, 0};
    int answer03 = 80373337;

    int[] demo04_1 = {9, 8, 7};
    int[] demo04_2 = {9, 8, 7};
    int answer04 = 1974;
}
