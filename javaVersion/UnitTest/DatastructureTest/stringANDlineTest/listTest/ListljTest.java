package UnitTest.DatastructureTest.stringANDlineTest.listTest;

import DataStructure.stringANDline.list.Listlj;
import DataStructure.stringANDline.list.listRealize.DoubleLinkedList;
import DataStructure.stringANDline.list.listRealize.SinglyLinkedList;
import org.junit.Assert;

import java.util.Arrays;

/**
 * @author liujun
 * @version 1.0
 * @date 2020/11/1
 * @author—Email liujunfirst@outlook.com
 * @blogURL https://blog.csdn.net/ljfirst
 * @description 链表 测试案例
 */
public class ListljTest {

    int[] target;
    int value;

    /**
     * 1、测试使用头插法或者尾查法插入 单个元素 返回成功或者失败
     * 2、测试使用头插法或者尾查法进行 循环插入 返回成功或者失败
     * 3、测试使用头插法或者尾查法进行 数组插入 返回成功或者失败
     */
    public void test_insert(Listlj listlj) {
        listlj.clear();
        listlj.insert(true, array01);
        target = listlj.toarray();
        Assert.assertArrayEquals(target, new int[]{});

        listlj.clear();
        listlj.insert(true, array02);
        target = listlj.toarray();
        Assert.assertArrayEquals(target, array02);

        listlj.clear();
        listlj.insert(true, array02_1);
        target = listlj.toarray();
        assert target[0] == array02_1;
        listlj.clear();
        listlj.insert(false, array02_1);
        target = listlj.toarray();
        assert target[0] == array02_1;

        listlj.clear();
        for (int i = 0; i < array03.length; i++) {
            listlj.insert(true, array03[i]);
        }
        target = listlj.toarray();
        Assert.assertArrayEquals(target, array03_head);

        listlj.clear();
        for (int i = 0; i < array03.length; i++) {
            listlj.insert(false, array03[i]);
        }
        target = listlj.toarray();
        Assert.assertArrayEquals(target, array03_tail);

        listlj.clear();
        listlj.insert(true, array04);
        target = listlj.toarray();
        Assert.assertArrayEquals(target, array04_head);
        listlj.clear();
        listlj.insert(false, array04);
        target = listlj.toarray();
        Assert.assertArrayEquals(target, array04_tail);

        listlj.clear();
        listlj.insert(false, array01);
        target = listlj.toarray();
        Assert.assertArrayEquals(target, new int[]{});
        listlj.clear();

        listlj.insert(true, array05);
        target = listlj.toarray();
        Assert.assertArrayEquals(target, array05_head);
        listlj.clear();
        listlj.insert(false, array05);
        target = listlj.toarray();
        Assert.assertArrayEquals(target, array05_tail);
        listlj.clear();
    }

    /**
     * @return 在索引位置插入元素
     */
    public void test_insert_index(Listlj listlj) {
        listlj.clear();
        listlj.insert(false, array04);
        listlj.insert(11, 12);
        Arrays.equals(listlj.toarray(), array04_insert_11_12);
        value = listlj.search_index(11);
        assert value == 12;
        listlj.clear();
        listlj.insert(false, array04);
        listlj.insert(3, 30);
        Arrays.equals(listlj.toarray(), array04_insert_3_30);
        value = listlj.search_index(3);
        assert value == 30;
        listlj.clear();
        listlj.insert(false, array05);
        listlj.insert(array05.length, 100);
        Arrays.equals(listlj.toarray(), array05_insert_100_100);
        value = listlj.search_index(array05.length);
        assert value == 100;
        listlj.clear();
        listlj.insert(false, array05);
        listlj.insert(0, 1000);
        Arrays.equals(listlj.toarray(), array05_insert_0_1000);
        value = listlj.search_index(0);
        assert value == 1000;
        listlj.clear();
        listlj.insert(false, array03);
        listlj.insert(array03.length, array04);
        Arrays.equals(listlj.toarray(), array03_04);
        value = listlj.search_index(0);
        assert value == array03[0];
        value = listlj.search_index(array03.length);
        assert value == array04[0];
        value = listlj.search_value(array03[0]);
        assert value == 0;
        value = listlj.search_index(array03_04.length - 1);
        assert value == array04[array04.length - 1];

        listlj.clear();
        listlj.insert(0, 1000);
        Arrays.equals(listlj.toarray(), new int[]{1000});
        value = listlj.search_value(0);
        assert value == -1;
        value = listlj.search_value(1000);
        assert value == 0;
        value = listlj.search_index(0);
        assert value == 1000;
    }

    /**
     * @return 链表删除特定值的函数
     */
    public void test_delete_value(Listlj listlj) {
        listlj.clear();
        listlj.insert(false, array04);
        boolean flag = listlj.delete_value(5);
        assert flag;
        flag = listlj.delete_value(986);
        assert flag;
        flag = listlj.delete_value(666);
        assert !flag;
        target = listlj.toarray();
        assert Arrays.equals(target, array04_delete_value);

        listlj.clear();
        flag = listlj.delete_value(45);
        assert !flag;
        flag = listlj.insert(false, 5);
        assert flag;
        flag = listlj.delete_value(45);
        assert !flag;
        flag = listlj.delete_value(5);
        assert flag;
        target = listlj.toarray();
        assert Arrays.equals(target, array04_delete_value_5);
    }

    /**
     * 链表删除特定索引的函数
     */
    public void test_delete_index(Listlj listlj) {
        listlj.clear();
        boolean flag = listlj.delete_index(45);
        assert !flag;
        listlj.insert(true, array04);
        for (int i = 0; i < array04.length; i++) {
            //此处的测试案例，需要注意，删除操作是会导致链表变化的，因此 i 需要调整
            flag = listlj.delete_index(0);
            assert flag;
        }
        flag = listlj.insert(true, 5);
        assert flag;
        flag = listlj.delete_index(0);
        assert flag;
        flag = listlj.delete_index(10);
        assert !flag;
    }

    /**
     * @return 查找指定元素，返回该元素的索引位置
     */
    public void test_search_value(Listlj listlj) {
        listlj.clear();
        listlj.insert(false, array04);
        int index = listlj.search_value(5);
        assert index == 5;
        index = listlj.search_value(986);
        assert index == 6;
        index = listlj.search_value(666);
        assert index == -1;

        listlj.clear();
        listlj.insert(false, array05);
        index = listlj.search_value(5);
        assert index == 4;
        index = listlj.search_value(20);
        assert index == 19;
        index = listlj.search_value(21);
        assert index == -1;
        index = listlj.search_value(13);
        assert index == 12;
    }

    /**
     * @return 查找索引位元素，返回该索引位置的元素
     */
    public void test_search_index(Listlj listlj) {
        listlj.clear();
        int target = listlj.search_index(2);
        assert target == Integer.MIN_VALUE;
        listlj.clear();
        listlj.insert(false, array04);
        target = listlj.search_index(5);
        assert target == 5;
        target = listlj.search_index(10);
        assert target == 8;
        target = listlj.search_index(200);
        assert target == Integer.MIN_VALUE;
    }

    public void testlistequals(Listlj listlj) {
        Listlj listTest;
        Listlj listTest2;
        if (listlj instanceof DoubleLinkedList) {
            listTest = new DoubleLinkedList();
            listTest2 = new DoubleLinkedList();
        } else {
            listTest = new SinglyLinkedList();
            listTest2 = new SinglyLinkedList();
        }
        //都是04，相同
        listlj.clear();
        listTest.clear();
        listlj.insert(false, array04);
        listTest.insert(false, array04);
        boolean flag = listlj.listequals(listTest);
        assert flag;
        //都是04，但是插入顺序不同，链表也不同
        listlj.clear();
        listTest.clear();
        listlj.insert(false, array04);
        listTest.insert(true, array04);
        flag = listlj.listequals(listTest);
        assert !flag;
        //04，05 链表不同
        listlj.clear();
        listTest.clear();
        listlj.insert(true, array05);
        listTest.insert(true, array04);
        flag = listlj.listequals(listTest);
        assert !flag;

        //测试 listequals()
        listTest.clear();
        listTest2.clear();
        listTest.insert(true, array04);
        listTest2.insert(true, array04);
        flag = listlj.listequals(listTest, listTest2);
        assert flag;
        listTest.clear();
        listTest2.clear();
        listTest.insert(true, array04);
        listTest2.insert(true, array05);
        flag = listlj.listequals(listTest, listTest2);
        assert !flag;
        listTest.clear();
        listTest2.clear();
        listTest.insert(true, array05);
        listTest2.insert(true, array05);
        flag = listlj.listequals(listTest, listTest2);
        assert flag;
    }

    int[] array01 = null;
    int[] array02 = {};
    int array02_1 = 4;

    int[] array03 = {2, 54, 76, 3, 40, 598, 473, 6, 2};
    int[] array03_04 = {2, 54, 76, 3, 40, 598, 473, 6, 2, 2, 54, 76, 3, 40, 5, 986, 56, 89, 854, 8, 9, 8, 473, 6, 2};
    int[] array03_head = {2, 6, 473, 598, 40, 3, 76, 54, 2};
    int[] array03_tail = {2, 54, 76, 3, 40, 598, 473, 6, 2};

    int[] array04 = {2, 54, 76, 3, 40, 5, 986, 56, 89, 854, 8, 9, 8, 473, 6, 2};
    int[] array04_insert_3_30 = {2, 54, 76, 30, 3, 40, 5, 986, 56, 89, 854, 8, 9, 8, 473, 6, 2};
    int[] array04_insert_11_12 = {2, 54, 76, 3, 40, 5, 986, 56, 89, 854, 8, 12, 9, 8, 473, 6, 2};
    int[] array04_delete_value = {2, 54, 76, 3, 40, 56, 89, 854, 8, 9, 8, 473, 6, 2};
    int[] array04_delete_value_5 = {};
    int[] array04_head = {2, 6, 473, 8, 9, 8, 854, 89, 56, 986, 5, 40, 3, 76, 54, 2};
    int[] array04_tail = {2, 54, 76, 3, 40, 5, 986, 56, 89, 854, 8, 9, 8, 473, 6, 2};

    int[] array05 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
    int[] array05_insert_0_1000 = {1000, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
    int[] array05_insert_100_100 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 100};
    int[] array05_head = {20, 19, 18, 17, 16, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
    int[] array05_tail = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
}
