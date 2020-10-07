package DataStructure.stringANDline.hashTable;

import java.util.HashMap;
import java.util.LinkedHashSet;

/**
 * @author liujun
 * @version 1.0
 * @date 2020/8/4
 * @author—Email liujunfirst@outlook.com
 * @blogURL https://blog.csdn.net/ljfirst
 * @description Least Frequently Used ，最近最少使用算法 LFU
 */
public class LFUCache {

    // key 到 val 的映射，我们后文称为 KV 表
    HashMap<Integer, String> keyToVal;
    // key 到 freq 的映射，我们后文称为 KF 表
    HashMap<Integer, Integer> keyToFreq;
    // freq 到 key 列表的映射，我们后文称为 FK 表
    HashMap<Integer, LinkedHashSet<Integer>> freqToKeys;
    // 记录最小的频次
    int minFreq;
    // 记录 LFU 缓存的最大容量
    int cap;

    public LFUCache(int capacity) {
        keyToVal = new HashMap<>();
        keyToFreq = new HashMap<>();
        freqToKeys = new HashMap<>();
        this.cap = capacity;
        this.minFreq = 0;
    }

    public String getrecent() {
        return "";
    }

    public String get(int key) {
        if (!keyToVal.containsKey(key)) {
            return "";
        }
        //访问率提升一次
        increaseFreq(key);
        return keyToVal.get(key);
    }

    public void put(int key, String val) {
        if (keyToVal.containsKey(key)) {
            //提升freg
            //increaseFreq();
            //页面插入
            keyToVal.put(key, val);
            return;
        }
        if (keyToVal.size() + 1 > cap) { //判断容量
            //页面替换
            replace();
        }
        //三个表同时操作，需要写成一个方法
        addpage();

    }

    private void increaseFreq(int key) {
        int u = keyToFreq.get(key);
        keyToFreq.put(key, u + 1);
        //
        //freqToKeys[]
    }

    private void replace() {

    }

    private void addpage() {

    }
}
