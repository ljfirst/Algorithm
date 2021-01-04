package DataStructure.arrayANDlist.list;

/**
 * @author liujun
 * @version 1.0
 * @date 2020/11/1
 * @author—Email liujunfirst@outlook.com
 * @blogURL https://blog.csdn.net/ljfirst
 * @description 链表结构（单双链表）
 */

public class Nodelj {

    public int value;
    public Nodelj next;
    public Nodelj front;
    public Nodelj down;

    // 单链表
    public Nodelj() {
        this.value = Integer.MIN_VALUE;
        this.next = null;
        this.front = null;
        this.down = null;
    }

    // 单链表、双向链表、跳表
    public Nodelj(int value) {
        this.value = value;
        this.next = null;
        this.front = null;
        this.down = null;
    }

}
