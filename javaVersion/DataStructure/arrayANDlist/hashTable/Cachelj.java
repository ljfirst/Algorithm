package DataStructure.arrayANDlist.hashTable;

/**
 * @author liujun
 * @version 1.0
 * @date 2020/12/24
 * @author—Email liujunfirst@outlook.com
 * @blogURL https://blog.csdn.net/ljfirst
 * @description 缓存
 * 1、新增元素
 * 2、删除元素
 * 3、获取元素
 */
public interface Cachelj {

    //新增元素
    boolean put(int key, String value);

    //删除元素
    boolean delete(int x);

    //获取元素
    String get(int key);

    //获取最近的元素，并重新更新到队尾
    String getRecent();

    //更新最近元素
    boolean makeRecently(Node4Cache node);

    //新增最近元素
    boolean addRecently(int x, String value);

    //清除内存，删除最近不使用的
    boolean deteleLUR();

}
