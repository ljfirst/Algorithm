package UnitTest.DatastructureTest.arrayANDlistTest.hashTableTest;

import DataStructure.arrayANDlist.hashTable.LRUCachelj;
import org.junit.Test;

/**
 * @author liujun
 * @version 1.0
 * @date 2020/7/28
 * @author—Email liujunfirst@outlook.com
 * @blogURL https://blog.csdn.net/ljfirst
 * @description 最近最久未使用算法 测试案例
 */
public class LRUCacheljTest {

    LRUCachelj lruCache = new LRUCachelj(5);

    @Test
    public void testLRUCache() {
        lruCache.put(key01, value01);
        lruCache.put(key02, value02);
        lruCache.put(key03, value03);
        lruCache.put(key04, value04);
        lruCache.put(key05, value05);
        lruCache.put(key06, value06);
        //此时顺序 6->5->4->3->2
        String s = lruCache.get(3);
        assert value03.equals(s);
        //此时顺序 3->6->5->4->2
        s = lruCache.getRecent();
        assert value03.equals(s);
        lruCache.put(key07, value07);
        //此时顺序 7->3->6->5->4
        s = lruCache.getRecent();
        assert value07.equals(s);
        //此时顺序 5->7->3->6->4
        s = lruCache.get(key05);
        assert value05.equals(s);
        s = lruCache.get(key01);
        assert null == s;
        lruCache.put(key06, value06);
        s = lruCache.getRecent();
        assert value06.equals(s);
    }

    int key01 = 1;
    int key02 = 2;
    int key03 = 3;
    int key04 = 4;
    int key05 = 5;
    int key06 = 6;
    int key07 = 7;
    String value01 = "111111";
    String value02 = "222222";
    String value03 = "333333";
    String value04 = "444444";
    String value05 = "55555";
    String value06 = "66666";
    String value07 = "77777";
}
