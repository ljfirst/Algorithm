package UnitTest.DatastructureTest.stringANDlineTest.listTest;

import DataStructure.stringANDline.list.listRealize.SinglyLinkedList;
import DataStructure.stringANDline.list.listRealize.ListReverse;
import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author liujun
 * @version 1.0
 * @date 2020/11/1
 * @author—Email liujunfirst@outlook.com
 * @blogURL https://blog.csdn.net/ljfirst
 * @description 链表反转的测试案例
 */
public class ListReverseTest extends ListljTest {

    ListReverse sr = new ListReverse();
    SinglyLinkedList singlyLinkedList = new SinglyLinkedList();

    /**
     * 测试：利用数组来反转链表
     * 测试：利用系统堆栈来反转链表
     * 测试：利用堆栈来反转链表
     */
    @Test
    public void testreverse() throws ClassNotFoundException, InvocationTargetException, IllegalAccessException {

        Class c = Class.forName("DataStructure.stringANDline.list.listRealize.ListReverse");
        Method[] m = c.getMethods();
        for (Method m1 : m) {
            if (m1.getName().contains("reverse")) {
                singlyLinkedList.clear();
                singlyLinkedList.insert(true, array01);
                int[] target = (int[]) m1.invoke(sr, singlyLinkedList);
                Assert.assertArrayEquals(target, new int[]{});

                singlyLinkedList.clear();
                singlyLinkedList.insert(true, array02_1);
                target = (int[]) m1.invoke(sr, singlyLinkedList);
                assert target[0] == 4;

                singlyLinkedList.clear();
                singlyLinkedList.insert(true, array03);
                target = (int[]) m1.invoke(sr, singlyLinkedList);
                Assert.assertArrayEquals(target, array03);

                singlyLinkedList.clear();
                singlyLinkedList.insert(true, array04);
                target = (int[]) m1.invoke(sr, singlyLinkedList);
                Assert.assertArrayEquals(target, array04);

                singlyLinkedList.clear();
                singlyLinkedList.insert(true, array05);
                target = (int[]) m1.invoke(sr, singlyLinkedList);
                Assert.assertArrayEquals(target, array05);
            }
        }
    }

    @Test
    public void testrevert_part() {
        singlyLinkedList.clear();
        singlyLinkedList.insert(false, array03);
        int[] arr = sr.revert_part(singlyLinkedList, 0, 5);
        Assert.assertArrayEquals(arr, array03_part);

        singlyLinkedList.clear();
        singlyLinkedList.insert(false, array03);
        arr = sr.revert_part(singlyLinkedList, 1, 5);
        Assert.assertArrayEquals(arr, array03_part_1);

        singlyLinkedList.clear();
        singlyLinkedList.insert(false, array03);
        arr = sr.revert_part(singlyLinkedList, 7, 8);
        Assert.assertArrayEquals(arr, array03_part_78);

        singlyLinkedList.clear();
        singlyLinkedList.insert(false, array03);
        arr = sr.revert_part(singlyLinkedList, 8, 8);
        Assert.assertArrayEquals(arr, array03_part_88);

        singlyLinkedList.clear();
        singlyLinkedList.insert(false, array04);
        arr = sr.revert_part(singlyLinkedList, 0, 5);
        Assert.assertArrayEquals(arr, array04_part);

        singlyLinkedList.clear();
        singlyLinkedList.insert(false, array04);
        arr = sr.revert_part(singlyLinkedList, 3, 4);
        Assert.assertArrayEquals(arr, array04_part_34);

        singlyLinkedList.clear();
        singlyLinkedList.insert(false, array04);
        arr = sr.revert_part(singlyLinkedList, 5, 100);
        Assert.assertArrayEquals(arr, array04);

        singlyLinkedList.clear();
        singlyLinkedList.insert(false, array05);
        arr = sr.revert_part(singlyLinkedList, 99, 200);
        Assert.assertArrayEquals(arr, array05);

        singlyLinkedList.clear();
        singlyLinkedList.insert(false, array05);
        arr = sr.revert_part(singlyLinkedList, 5, 10);
        Assert.assertArrayEquals(arr, array05_part);

        singlyLinkedList.clear();
        singlyLinkedList.insert(false, array05);
        arr = sr.revert_part(singlyLinkedList, 10, singlyLinkedList.head.value - 1);
        Assert.assertArrayEquals(arr, array05_part_1);
    }

    @Test
    public void testrevert_partn() {
        singlyLinkedList.clear();
        singlyLinkedList.insert(false, array03);
        int[] target = sr.revert_partn(singlyLinkedList, 2);
        Assert.assertArrayEquals(target, array03_part_n);

        singlyLinkedList.clear();
        singlyLinkedList.insert(false, array04);
        target = sr.revert_partn(singlyLinkedList, 3);
        Assert.assertArrayEquals(target, array04_part_n);

        singlyLinkedList.clear();
        singlyLinkedList.insert(false, array04);
        target = sr.revert_partn(singlyLinkedList, array04.length);
        Assert.assertArrayEquals(target, array04);

        singlyLinkedList.clear();
        singlyLinkedList.insert(false, array05);
        target = sr.revert_partn(singlyLinkedList, 5);
        Assert.assertArrayEquals(target, array05_part_n);

        singlyLinkedList.clear();
        singlyLinkedList.insert(false, array05);
        target = sr.revert_partn(singlyLinkedList, 1);
        Assert.assertArrayEquals(target, array05_part_n_1);
    }

    int[] array03_part = {598, 40, 3, 76, 54, 2, 473, 6, 2};
    int[] array03_part_1 = {2, 598, 40, 3, 76, 54, 473, 6, 2};
    int[] array03_part_78 = {2, 54, 76, 3, 40, 598, 473, 2, 6};
    int[] array03_part_88 = {2, 54, 76, 3, 40, 598, 473, 6, 2};
    int[] array03_part_n = {54, 2, 3, 76, 598, 40, 6, 473, 2};
    int[] array04_part = {5, 40, 3, 76, 54, 2, 986, 56, 89, 854, 8, 9, 8, 473, 6, 2};
    int[] array04_part_34 = {2, 54, 76, 40, 3, 5, 986, 56, 89, 854, 8, 9, 8, 473, 6, 2};
    int[] array04_part_n = {76, 54, 2, 5, 40, 3, 89, 56, 986, 9, 8, 854, 6, 473, 8, 2};
    int[] array05_part = {1, 2, 3, 4, 5, 11, 10, 9, 8, 7, 6, 12, 13, 14, 15, 16, 17, 18, 19, 20};
    int[] array05_part_1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 20, 19, 18, 17, 16, 15, 14, 13, 12, 11};
    int[] array05_part_n = {5, 4, 3, 2, 1, 10, 9, 8, 7, 6, 15, 14, 13, 12, 11, 20, 19, 18, 17, 16};
    int[] array05_part_n_1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
}
