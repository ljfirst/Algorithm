package UnitTest.DatastructureTest.arrayANDlistTest.hashTableTest;

import DataStructure.arrayANDlist.hashTable.LFUCachelj;
import org.junit.Test;

/**
 * @author liujun
 * @version 1.0
 * @date 2020/8/5
 * @author—Email liujunfirst@outlook.com
 * @blogURL https://blog.csdn.net/ljfirst
 * @description 最近最少使用算法 测试案例
 */
public class LFUCacheljTest {

    LFUCachelj lfuCachelj = new LFUCachelj(4);

    @Test
    public void testlfuCache() {
        lfuCachelj.put(1, "1111");
        lfuCachelj.put(2, "2222");
        lfuCachelj.put(3, "3333");
        lfuCachelj.put(4, "4444");
        String d = lfuCachelj.get(1);
        assert "1111".equals(d);
        assert "2222".equals(lfuCachelj.get(2));

        lfuCachelj.put(2, "string 222");
        lfuCachelj.put(1, "string 111");
        lfuCachelj.put(4, "4444");
        lfuCachelj.put(5, "55555");
        lfuCachelj.put(6, "66666");

        //此时剩余顺序：6(1)->4(2)->2(2)->1(2)
        assert "".equals(lfuCachelj.get(3));
        assert "".equals(lfuCachelj.get(5));
        assert "66666".equals(lfuCachelj.get(6));

        //此时剩余顺序：6(2)->4(2)->2(2)->1(2)
        lfuCachelj.put(6, "string 6666");
        lfuCachelj.get(6);
        lfuCachelj.get(6);
        lfuCachelj.get(6);
        lfuCachelj.put(7, "7777777");
        //此时剩余顺序：7(1)->6(6)->4(2)->2(2)
        assert "".equals(lfuCachelj.get(5));
        assert "".equals(lfuCachelj.get(4));

        assert !lfuCachelj.delete(3);
        assert lfuCachelj.delete(7);
    }
}
