package UnitTest.DatastructureTest.stringANDlineTest.listTest;

import DataStructure.stringANDline.list.listRealize.SinglyLinkedList;
import org.junit.Test;

/**
 * @author liujun
 * @version 1.0
 * @date 2020/11/10
 * @author—Email liujunfirst@outlook.com
 * @blogURL https://blog.csdn.net/ljfirst
 * @description 单链表 测试案例
 */
public class SinglyLinkedListTest extends ListljTest {


    @Test
    public void test_insert() {
        super.test_insert(new SinglyLinkedList());
    }

    /**
     * @return 在索引位置插入元素
     */
    @Test
    public void test_insert_index() {
        super.test_insert_index(new SinglyLinkedList());
    }

    /**
     * @return 删除指定元素
     */
    @Test
    public void test_delete_value() {
        super.test_delete_value(new SinglyLinkedList());
    }

    /**
     * @return 删除索引位元素
     */
    @Test
    public void test_delete_index() {
        super.test_delete_index(new SinglyLinkedList());
    }

    /**
     * @return 查找指定元素，返回该元素的索引位置
     */
    @Test
    public void test_search_value() {
        super.test_search_value(new SinglyLinkedList());
    }

    /**
     * @return 查找索引位元素，返回该索引位置的元素
     */
    @Test
    public void test_search_index() {
        super.test_search_index(new SinglyLinkedList());
    }

    @Test
    public void test_listequals() {
        super.testlistequals(new SinglyLinkedList());
    }
}
