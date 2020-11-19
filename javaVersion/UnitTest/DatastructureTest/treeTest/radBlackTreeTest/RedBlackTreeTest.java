package UnitTest.DatastructureTest.treeTest.radBlackTreeTest;

import DataStructure.tree.redBlackTree.RedBlackTreeImpl;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 * @author liujun
 * @version 1.0
 * @date 2020/11/18
 * @author—Email liujunfirst@outlook.com
 * @blogURL https://blog.csdn.net/ljfirst
 * @description 红黑树 测试案例
 */
public class RedBlackTreeTest {

    RedBlackTreeImpl rbt = new RedBlackTreeImpl();
    List<Integer> list;

    /**
     * put:         在map 中插入key的节点
     * get:         根据key 获取value
     * remove:      删除map 中的key的节点
     * contain:     查找map 中是否含有key的节点
     * getBelowKey: 获取map内比这个key值小的元素个数
     * print:       打印
     */
    @Test
    public void testInsert() {
        list = new ArrayList<>();
        boolean flag = false;
        int[] array = rbt.toarray();
        assert Arrays.equals(array, new int[]{});

        for (int i = 0; i < 10; i++) {
            flag = rbt.put(i, i);
            assert flag;
        }
        int below = rbt.getBelowKey(5);
        assert below == 5;
        array = rbt.toarray();
        assert Arrays.equals(array, array01);
        assert rbt.size == 10;
        assert rbt.contain(3);
        assert rbt.contain(5);
        assert rbt.contain(9);
        assert !rbt.contain(12);
        assert rbt.get(3) == 3;
        assert rbt.get(4) == 4;
        assert rbt.get(5) == 5;
        rbt.put(3, 30);
        int value30 = rbt.get(3);
        assert value30 == 3;

        rbt.put(22, 66);
        array = rbt.toarray();
        assert Arrays.equals(array, array02);

        Random r = new Random();
        rbt.clear();
        for (int i = 0; i < 10000; i++) {
            int n = r.nextInt(100);
            list.add(n);
            flag = rbt.put(true, n, i);
            assert flag;
        }
        array = rbt.toarray();
        int[] array100 = list.stream().distinct().mapToInt(Integer::intValue).sorted().toArray();
        assert Arrays.equals(array, array100);

        //测试 getBelowKey
        int pointnum = 23;
        below = rbt.getBelowKey(pointnum);
        int targetnum = (int) list.stream().distinct().filter(x -> x < pointnum).count();
        assert below == targetnum;
        int pointnum1 = 87;
        below = rbt.getBelowKey(pointnum1);
        targetnum = (int) list.stream().distinct().filter(x -> x < pointnum1).count();
        assert below == targetnum;

        /*assert rbt.remove(3);
        assert !rbt.remove(30);
        assert !rbt.contain(3);
        assert rbt.size == 9;

        for (int i = 0; i < 30; i++) {
            flag = rbt.put(i, i);
            assert flag;
        }
        assert rbt.size == 30;
        assert rbt.contain(3);
        assert rbt.contain(15);
        assert rbt.contain(29);
        assert !rbt.contain(35);
        assert rbt.get(3) == 3;
        assert rbt.get(4) == 4;
        assert rbt.get(5) == 5;
        rbt.put(23, 30);
        assert rbt.get(23) == 30;
        assert rbt.remove(23);
        assert !rbt.remove(23);
        assert !rbt.contain(23);
        assert rbt.size == 29;

        assert rbt.getBelowKey(27) == 26;
        rbt.print(rbt.root);*/
    }

    int[] array01 = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
    int[] array02 = {0, 1, 2, 3, 3, 4, 5, 6, 7, 8, 9, 22};
    int[] array03 = {0, 1, 2, 3, 4, 5, 90, 7, 8, 9, 22};
}
