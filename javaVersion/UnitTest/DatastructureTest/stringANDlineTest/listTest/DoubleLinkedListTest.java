package UnitTest.DatastructureTest.stringANDlineTest.listTest;

import DataStructure.stringANDline.list.listRealize.DoubleLinkedList;
import DataStructure.stringANDline.list.listRealize.SinglyLinkedList;
import org.junit.Test;

/**
 * @author liujun
 * @version 1.0
 * @date 2020/11/10
 * @author—Email liujunfirst@outlook.com
 * @blogURL https://blog.csdn.net/ljfirst
 * @description 双向链表 测试案例
 */
public class DoubleLinkedListTest extends ListljTest {

    /**
     * 插入元素
     */
    @Test
    public void test_insert() {
        super.test_insert(new DoubleLinkedList());
    }

    /**
     * @return 在索引位置插入元素
     */
    //@Test
    public void test_insert_index() {
        super.test_insert_index(new SinglyLinkedList());
    }

    /**
     * @return 删除指定元素
     */
    @Test
    public void test_delete_value() {
        super.test_delete_value(new DoubleLinkedList());
    }

    /**
     * @return 删除索引位元素
     */
    @Test
    public void test_delete_index() {
        super.test_delete_index(new DoubleLinkedList());
    }

    /**
     * @return 查找指定元素，返回该元素的索引位置
     */
    @Test
    public void test_search_value() {
        super.test_search_value(new DoubleLinkedList());
    }

    /**
     * @return 查找索引位元素，返回该索引位置的元素
     */
    @Test
    public void test_search_index() {
        super.test_search_index(new DoubleLinkedList());
    }

    DoubleLinkedList listlj = new DoubleLinkedList();

    @Test
    public void test_equals() {
        DoubleLinkedList s1 = new DoubleLinkedList();
        listlj.clear();
        listlj.insert(false, array04);
        s1.insert(false, array04);
        boolean flag = listlj.equals(s1);
        assert flag;

        //都是04，但是插入顺序不同，链表也不同
        listlj.clear();
        listlj.insert(false, array04);
        s1 = new DoubleLinkedList();
        s1.insert(true, array04);
        flag = listlj.equals(s1);
        assert !flag;

        //04，05 链表不同
        listlj.clear();
        listlj.insert(false, array05);
        s1 = new DoubleLinkedList();
        s1.insert(true, array04);
        flag = listlj.equals(s1);
        assert !flag;

        //测试 equals()
        DoubleLinkedList s2 = new DoubleLinkedList();
        s2.insert(true, array04);
        s1.clear();
        s1.insert(true, array04);
        flag = listlj.equals(s1, s2);
        assert flag;

        s2.clear();
        s2.insert(true, array04);
        s1.clear();
        s1.insert(true, array05);
        flag = listlj.equals(s1, s2);
        assert !flag;

        s2.clear();
        s2.insert(false, array05);
        s1.clear();
        s1.insert(true, array05);
        flag = listlj.equals(s1, s2);
        assert !flag;
    }
}
