package DataStructure.stringANDline.hashTable;

import java.util.HashMap;

/**
 * @author liujun
 * @version 1.0
 * @date 2020/7/28
 * @author—Email liujunfirst@outlook.com
 * @blogURL https://blog.csdn.net/ljfirst
 * @description The Least Recently Used，最近最久未使用算法
 * LRU
 */
public class LRUCache {

    private DoublyLinked mynode;
    private HashMap<Integer, Node4DoublyLinked> map;
    int cap;
    int defaultcap = 5;

    public LRUCache() {
        mynode = new DoublyLinked();
        map = new HashMap<>();
        cap = defaultcap;
    }

    public LRUCache(int cap) {
        mynode = new DoublyLinked();
        map = new HashMap<>();
        this.cap = cap;
    }

    public String get(int key) {
        if (!map.containsKey(key)) {
            return null;
        }
        Node4DoublyLinked node = map.get(key);
        makeRecently(node);
        return node.value;
    }

    //最近的元素都插在队尾
    public String getRecent() {
        String value = null;
        if (mynode.getsize() != 0) {
            Node4DoublyLinked node = mynode.tail.pre;
            value = node.value;
            makeRecently(node);
        }
        return value;
    }

    public void put(int key, String value) {
        if (map.containsKey(key)) {
            makeRecently(map.get(key));
            return;
        }
        //容量是否满
        if (mynode.getsize() == cap) {
            deteleLUR();
        }
        addRecently(key, value);
    }

    private void makeRecently(Node4DoublyLinked node) {
        mynode.delete(node);
        mynode.insertLast(node);
    }

    private void addRecently(int x, String value) {
        Node4DoublyLinked node = new Node4DoublyLinked(x, value);
        mynode.insertLast(node);
        map.put(x, node);
    }

    private void delete(int x) {
        Node4DoublyLinked node = map.get(x);
        mynode.delete(node);
        map.remove(x);
    }

    //删除最久未使用
    private void deteleLUR() {
        Node4DoublyLinked node = mynode.deleteFirst();
        int u = node.key;
        map.remove(u);
    }
}
