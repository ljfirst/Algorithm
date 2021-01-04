package DataStructure.arrayANDlist.list;

/**
 * @author liujun
 * @version 1.0
 * @date 2020/11/1
 * @author—Email liujunfirst@outlook.com
 * @blogURL https://blog.csdn.net/ljfirst
 * @description 链表
 * 1、插入（批量插入、指定位置插入）
 * 2、删除（删除元素、删除指定位置的元素）
 * 3、查找（查找元素、查找指定位置的元素）
 * 4、输出（数组）
 * 5、相等
 * 6、清除
 */
public interface Listlj {

    /**
     *
     * @param array
     * @return 判断 array不为空
     */
    default boolean checkArray(int[] array) {
        if (array == null || array.length == 0) {
            return false;
        }
        return true;
    }

    /**
     * @param HeadTail true表示头插法，false尾插法
     * @param args     输入待插入数据
     * @return 使用头插法或者尾查法进行批量插入 返回成功或者失败
     */
    public boolean insert(boolean HeadTail, int... args);

    /**
     * @param index 索引位置
     * @param args  待插入元素
     * @return 在索引位置插入元素
     */
    public boolean insert(int index, int... args);

    /**
     * @param value
     * @return 删除指定元素
     */
    public boolean delete_value(int value);

    /**
     * @param index
     * @return 删除索引位元素
     */
    public boolean delete_index(int index);

    /**
     * @param value
     * @return 查找指定元素，返回该元素的索引位置
     */
    public int search_value(int value);

    /**
     * @param index
     * @return 查找索引位元素，返回该索引位置的元素
     * 失败返回 Integer.MIN_VALUE;
     */
    public int search_index(int index);

    /**
     * @return 将链表输出为数组
     */
    public int[] toarray();


    /**
     * @return 链表置空操作
     */
    public void clear();

    /**
     * @param listlj
     * @return 链表判断相等
     */
    public boolean listequals(Listlj listlj);

    /**
     * @param l1
     * @param l2
     * @return 链表判断相等
     */
    public boolean listequals(Listlj l1, Listlj l2);

}
