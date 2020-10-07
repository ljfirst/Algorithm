package UnitTest.DatastructureTest.stringANDlineTest.hashTableTest;

import DataStructure.stringANDline.hashTable.LRUCache;
import org.junit.Test;

/**
 * @author liujun
 * @version 1.0
 * @date 2020/7/28
 * @author—Email liujunfirst@outlook.com
 * @blogURL https://blog.csdn.net/ljfirst
 * @description
 */
public class LRUCacheTest {

    LRUCache lruCache = new LRUCache(5);

    @Test
    public void testLRUCache() {
        lruCache.put(key01, value01);
        lruCache.put(key02, value02);
        lruCache.put(key03, value03);
        lruCache.put(key04, value04);
        lruCache.put(key05, value05);
        lruCache.put(key06, value06);

        String s = lruCache.get(3);
        assert value03.equals(s);
        s = lruCache.getRecent();
        assert value03.equals(s);
        lruCache.put(key07, value07);
        s = lruCache.getRecent();
        assert value07.equals(s);
        s = lruCache.get(key05);
        assert value05.equals(s);
        s = lruCache.get(key01);
        assert null == s;
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
