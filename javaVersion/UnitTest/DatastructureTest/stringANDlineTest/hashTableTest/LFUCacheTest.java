package UnitTest.DatastructureTest.stringANDlineTest.hashTableTest;

import DataStructure.stringANDline.hashTable.LFUCache;

/**
 * @author liujun
 * @version 1.0
 * @date 2020/8/5
 * @author—Email liujunfirst@outlook.com
 * @blogURL https://blog.csdn.net/ljfirst
 * @description
 */
public class LFUCacheTest {

    LFUCache lfuCache = new LFUCache(4);

    public void tt(){
        lfuCache.put(1,"1111");
        lfuCache.put(2,"2222");
        lfuCache.put(3,"3333");
        lfuCache.put(4,"4444");

        assert "1111".equals(lfuCache.get(1));
        assert "2222".equals(lfuCache.get(2));

        lfuCache.put(2,"string 222");
        lfuCache.put(1,"string 111");
        lfuCache.put(4,"4444");
        lfuCache.put(5,"55555");
        lfuCache.put(6,"66666");

        assert "".equals(lfuCache.get(3));
        assert "".equals(lfuCache.get(5));
        assert "66666".equals(lfuCache.get(6));

        lfuCache.put(6,"string 6666");
        lfuCache.get(6);
        lfuCache.get(6);
        lfuCache.get(6);
        lfuCache.put(7,"7777777");
        //此时只剩下 1 2 6 7
        assert "".equals(lfuCache.get(5));
    }
}
