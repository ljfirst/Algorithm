package DataStructure.stringANDline.hashTable;

import sun.misc.Cache;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;

/**
 * @author liujun
 * @version 1.0
 * @date 2020/8/4
 * @author—Email liujunfirst@outlook.com
 * @blogURL https://blog.csdn.net/ljfirst
 * @description 最近最少使用算法
 * LFU，Least Frequently Used
 * LFU相对于LRU而言，多了一个频率统计
 * <p>
 * 参考博客：https://mp.weixin.qq.com/s/oXv03m1J8TwtHwMJEZ1ApQ
 */
public class LFUCachelj implements Cachelj {

    // key 到 val 的映射，我们后文称为 KV 表
    private HashMap<Integer, String> keyToVal;
    // key 到 freq 的映射，我们后文称为 KF 表
    private HashMap<Integer, Integer> keyToFreq;
    // freq 到 key 列表的映射，我们后文称为 FK 表
    private HashMap<Integer, LinkedHashSet<Integer>> freqToKeys;
    // 记录最小的频次
    int minFreq;
    // 记录 LFU 缓存的最大容量
    int cap;
    int defaultcap = 5;

    public LFUCachelj() {
        this.keyToVal = new HashMap<>();
        this.keyToFreq = new HashMap<>();
        this.freqToKeys = new HashMap<>();
        this.cap = defaultcap;
        this.minFreq = 0;
    }

    public LFUCachelj(int capacity) {
        this.keyToVal = new HashMap<>();
        this.keyToFreq = new HashMap<>();
        this.freqToKeys = new HashMap<>();
        this.cap = capacity;
        this.minFreq = 0;
    }

    @Override
    public boolean put(int key, String value) {
        if (keyToVal.containsKey(key)) {
            //页面插入（更新）
            keyToVal.put(key, value);
            //提升freg
            increaseFreq(key);
            return true;
        }
        if (keyToVal.size() + 1 > cap) { //判断容量
            //页面替换
            replace();
        }
        //三个表同时进行更新操作(KV、KF、FK)，需要写成一个方法
        keyToVal.put(key, value);
        keyToFreq.put(key, 1);
        freqToKeys.putIfAbsent(1, new LinkedHashSet<>());
        freqToKeys.get(1).add(key);
        this.minFreq = 1;
        return true;
    }

    public String get(int key) {
        if (!keyToVal.containsKey(key)) {
            return "";
        }
        //访问率提升一次
        increaseFreq(key);
        return keyToVal.get(key);
    }

    @Override
    public boolean delete(int x) {
        return false;
    }

    @Override
    public String getRecent() {
        return null;
    }

    @Override
    public boolean makeRecently(Node4Cache node) {
        return false;
    }

    @Override
    public boolean addRecently(int x, String value) {
        return false;
    }

    @Override
    public boolean deteleLUR() {
        return false;
    }


    private void increaseFreq(int key) {
        /* update keyToFreq */
        int u = keyToFreq.get(key);
        keyToFreq.put(key, u + 1);
        /* update freqToKeys */
        freqToKeys.get(u).remove(key);
        /* 如果 freqToKeys 对应的列表空了，移除这个 freq */
        freqToKeys.putIfAbsent(u + 1, new LinkedHashSet<>());
        freqToKeys.get(u + 1).add(key);
        /* 更新 minFreq */
        if (freqToKeys.get(u).isEmpty()) {
            freqToKeys.remove(u);
            if (u == this.minFreq) {
                this.minFreq = this.minFreq++;
            }
        }
    }

    private void replace() {
        LinkedHashSet<Integer> lfuset = freqToKeys.get(this.minFreq);
        int deleteKey = lfuset.iterator().next();
        /* 更新 FK 表 */
        lfuset.remove(deleteKey);
        if (lfuset.isEmpty()) {
            freqToKeys.remove(this.minFreq);
            //此处没需要更新 minFreq 的值
        }
        /* 更新 KV 表 */
        keyToVal.remove(deleteKey);
        /* 更新 kF 表 */
        keyToFreq.remove(deleteKey);
    }

}
