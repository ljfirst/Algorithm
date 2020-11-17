package DataStructure.tree.redBlackTree;

/**
 * @author liujun
 * @version 1.0
 * @date 2020/11/18
 * @author—Email liujunfirst@outlook.com
 * @blogURL https://blog.csdn.net/ljfirst
 * @description 红黑树
 * 1、插入 insert(int key, int value)(是否去重)
 * 2、删除 delete(int key)
 * 3、查找 contain(int key)
 * 4、获取 get(int key)
 * 5、获取 getBelowKey(int key)   获取map内比这个key值小的元素个数
 * 6、打印 print(RedBlackNode root)
 * 7、输出 toarray() 输出排序后的数组
 */

public interface RedBlackTree {

    String RED = "RED";
    String BLACK = "BLACK";

    /**
     * @param key
     * @param value
     * @return 在map 中插入key的节点 默认是不去重的
     */
    boolean put(int key, int value);

    /**
     *
     * @param duplicate
     * @param key
     * @param value
     * @return 是否对插入节点进行去重，取决于duplicate， true表示去重
     */
    boolean put(boolean duplicate, int key, int value);

    /**
     * @param key
     * @return 删除map 中的key的节点
     */
    boolean remove(int key);

    /**
     * @param key
     * @return 查找map 中是否含有key的节点
     */
    boolean contain(int key);

    /**
     * @param key
     * @return 根据key 获取value
     */
    int get(int key);

    /**
     * @param key
     * @return 获取map内比这个key值小的元素个数
     */
    int getBelowKey(int key);

    /**
     * @param root 按行打印红黑树
     */
    void print(RedBlackNode root);

    /**
     * @return 输出排序后的数组
     */
    int[] toarray();
}
