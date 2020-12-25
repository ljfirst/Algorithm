package DataStructure.stringANDline.hashTable;

import java.util.HashMap;

/**
 * @author liujun
 * @version 1.0
 * @date 2020/7/28
 * @author—Email liujunfirst@outlook.com
 * @blogURL https://blog.csdn.net/ljfirst
 * @description 最近最久未使用算法
 * The Least Recently Used ，LRU
 * LFU相对于LRU而言，多了一个频率统计
 */
public class LRUCachelj implements Cachelj {

    private DoublyLinked4Cache cacheList;
    private HashMap<Integer, Node4Cache> map;
    int cap;
    int defaultcap = 5;

    public LRUCachelj() {
        this.cacheList = new DoublyLinked4Cache();
        this.map = new HashMap<>(32);
        this.cap = defaultcap;
    }

    public LRUCachelj(int cap) {
        this.cacheList = new DoublyLinked4Cache();
        this.map = new HashMap<>(32);
        this.cap = cap;
    }

    public String get(int key) {
        if (!map.containsKey(key)) {
            return null;
        }
        Node4Cache node = map.get(key);
        makeRecently(node);
        return node.value;
    }

    //最近的元素都插在队尾
    public String getRecent() {
        String value = null;
        if (cacheList.getsize() != 0) {
            Node4Cache node = cacheList.tail.pre;
            value = node.value;
            makeRecently(node);
        }
        return value;
    }

    public boolean put(int key, String value) {
        if (map.containsKey(key)) {
            makeRecently(map.get(key));
            return true;
        }
        //容量是否满
        if (cacheList.getsize() == cap) {
            deteleLUR();
        }
        addRecently(key, value);
        return true;
    }

    public boolean makeRecently(Node4Cache node) {
        cacheList.delete(node);
        cacheList.insertLast(node);
        return true;
    }

    public boolean addRecently(int x, String value) {
        Node4Cache node = new Node4Cache(x, value);
        //双增加
        cacheList.insertLast(node);
        map.put(x, node);
        return true;
    }

    public boolean delete(int x) {
        Node4Cache node = map.get(x);
        //双删除
        cacheList.delete(node);
        map.remove(x);
        return true;
    }

    //删除最久未使用
    public boolean deteleLUR() {
        Node4Cache node = cacheList.deleteFirst();
        int u = node.key;
        map.remove(u);
        return true;
    }
}
