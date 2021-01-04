package UnitTest.DatastructureTest.arrayANDlistTest.listTest;

import DataStructure.arrayANDlist.list.listRealize.SkipList;
import org.junit.Test;
import java.util.Arrays;

/**
 * @author liujun
 * @version 1.0
 * @date 2019-10-18 02:50
 * @author-Email liujunfirst@outlook.com
 * @description
 */
public class SkipListTest extends ListljTest {

    SkipList skipList = new SkipList();

    @Test
    public void test_insert() {
        //插入单个元素
        skipList.insert(true, 2);
        int[] target = skipList.toarray();
        assert Arrays.equals(target, demo01);
        assert skipList.SkipListlevel == 1;
        assert skipList.SkipListnum == 1;
        //数组循环插入
        skipList.clear();
        for (int i = 0; i < array05.length; i++) {
            skipList.insert(true, array05[i]);
        }
        target = skipList.toarray();
        assert Arrays.equals(target, array05);
        assert skipList.SkipListlevel == 5;
        assert skipList.SkipListnum == 20;
        //插入数组
        skipList.clear();
        skipList.insert(true, array05);
        target = skipList.toarray();
        assert Arrays.equals(target, array05);
        assert skipList.SkipListlevel == 5;
        assert skipList.SkipListnum == 20;
        skipList.clear();
        skipList.insert(true, array05_head);
        target = skipList.toarray();
        //注意到跳表是有序的
        assert Arrays.equals(target, array05);
        assert skipList.SkipListlevel == 5;
        assert skipList.SkipListnum == 20;
        skipList.insert(true, array05);
        target = skipList.toarray();
        //注意到跳表是有序的
        assert Arrays.equals(target, array05_double);
        assert skipList.SkipListlevel == 6;
        assert skipList.SkipListnum == 40;

        super.test_insert(skipList);
    }

    /**
     * @return 删除指定元素
     */
    @Test
    public void test_delete_value() {
        super.test_delete_value(new SkipList());
    }

    /**
     * @return 查找指定元素，返回该元素的索引位置
     */
    @Test
    public void test_search_value() {
        super.test_search_value(new SkipList());
    }

    /**
     * @return 查找索引位元素，返回该索引位置的元素
     */
    @Test
    public void test_search_index() {
        super.test_search_index(new SkipList());
    }

    @Test
    public void test_listequals() {
        super.testlistequals(new SkipList());
    }

    int[] demo01 = {2};


    //@Test
    public void testSkipListALL() {
        SkipList skipList = new SkipList();
        for (int i = 1; i <= 30; i++) {
            skipList.insert(true, i);
        }
        skipList.print();
        assert skipList.SkipListlevel == 5;
        assert skipList.SkipListnum == 30;

        for (int i = 1; i <= 30; i++) {
            assert -1 != skipList.search_value(i);
        }
        for (int i = 1; i <= 30; i++) {
            assert skipList.delete_value(i);
        }
        for (int i = 1; i <= 30; i++) {
            assert !skipList.delete_value(i);
        }
        System.out.println("\n\n\n\n");
        skipList.print();
        assert skipList.SkipListlevel == 1;
        assert skipList.SkipListnum == 0;

        for (int i = 1; i <= 30; i++) {
            skipList.insert(true, i);
        }
        for (int i = 15; i < 22; i++) {
            skipList.delete_value(i);
        }
        for (int i = 1; i < 18; i++) {
            skipList.insert(true, i);
        }
        for (int i = 2; i <= 30; i++) {
            skipList.delete_value(i);
        }
        System.out.println("\n\n\n\n");
        skipList.print();
        assert skipList.SkipListnum == 15;
    }


}