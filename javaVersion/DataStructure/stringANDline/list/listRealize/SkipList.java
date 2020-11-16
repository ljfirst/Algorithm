package DataStructure.stringANDline.list.listRealize;

import DataStructure.stringANDline.list.Listlj;
import DataStructure.stringANDline.list.Nodelj;

import javax.swing.plaf.basic.BasicTreeUI;
import java.util.Arrays;
import java.util.Random;

/**
 * @author liujun
 * @version 1.0
 * @date 2019-7-25 ����11:59:31
 * @author-Email liujunfirst@outlook.com
 * @description 跳表
 * 支持：
 * <p>
 * 1、插入（批量插入）
 * 2、删除（删除元素）
 * 3、查找（查找元素、查找指定位置的元素）
 * 4、输出（数组）
 * 5、相等
 * 6、清除
 */
public class SkipList implements Listlj {

    //首尾指针
    public Nodelj head, tail;
    //链表的层高
    public int SkipListlevel;
    //链表的节点个数，最底层的那一层（实际插入的元素个数）
    public int SkipListnum;
    private static final int HEAD_KEY = Integer.MIN_VALUE;
    private static final int TAIL_KEY = Integer.MAX_VALUE;
    private static final int error = Integer.MIN_VALUE;

    public SkipList() {
        this.head = initial();
        this.tail = head.next;
        this.SkipListlevel = 1;
        this.SkipListnum = 0;
    }

    @Override
    public boolean insert(boolean HeadTail, int... args) {
        if (args == null || args.length == 0) {
            return false;
        }
        for (int i = 0; i < args.length; i++) {
            Nodelj insertKey;
            Nodelj fathernode = null;
            if (this.SkipListnum > (2 << this.SkipListlevel - 1)) {
                relever();
                insertKey = this.head;
            } else {
                int levelNum = randomLevel();
                insertKey = this.head;
                for (int j = 0; j < levelNum; j++) {
                    insertKey = insertKey.down;
                }
            }
            //循环在每一层都创建该值
            while (insertKey != null) {
                while (insertKey.next.value < args[i]) {
                    insertKey = insertKey.next;
                }
                //此处的Node需要在每一层都建立一个
                Nodelj node = new Nodelj(args[i]);
                if (fathernode != null) {
                    fathernode.down = node;
                }
                node.next = insertKey.next;
                insertKey.next = node;
                insertKey = insertKey.down;
                fathernode = node;
            }
            SkipListnum++;
        }
        return true;
    }

    //跳表没有这个功能
    @Override
    public boolean insert(int index, int... args) {
        return insert(true, args);
    }

    @Override
    public boolean delete_value(int value) {
        if (-1 == search_value(value)) {
            return false;
        }
        Nodelj point = this.head;
        Nodelj prepoint = point;
        while (point.value != value) {
            while (point.next.value <= value) {
                prepoint = point;
                point = point.next;
            }
            if (point.value == value) {
                break;
            }
            point = point.down;
            prepoint = prepoint.down;
            if (point.equals(prepoint)) {
                continue;
            }
            while (prepoint.next != point) {
                prepoint = prepoint.next;
            }
        }
        //开始清除工作
        while (prepoint != null) {
            point = point.down;
            prepoint.next = prepoint.next.next;
            prepoint = prepoint.down;
            //ѭ������͵����
            while (prepoint != null && prepoint.next != point) {
                prepoint = prepoint.next;
            }
        }
        this.SkipListnum--;
        /**
         * 操作：降层
         * 注意：每次删除操作后，进行降层操作，
         *      注意到降层操作是一个循环过程，而不是一个判断过程
         *      当连续层级关系是仅有一个元素的时候，需要进行连续降级
         */
        while (this.head.next == this.tail && this.head.down != null) {
            head = head.down;
            tail = tail.down;
            this.SkipListlevel--;
        }
        return true;
    }

    //跳表没有这个功能
    @Override
    public boolean delete_index(int index) {
        return false;
    }

    @Override
    public int search_value(int value) {
        Nodelj point = this.head;
        int index = 0;
        while (point != null) {
            while (point.next.value <= value) {
                point = point.next;
                index++;
            }
            if (point.value == value) {
                return index;
            }
            point = point.down;
        }
        return -1;
    }

    @Override
    public int search_index(int index) {
        if (index < this.SkipListnum) {
            Nodelj p = this.head;
            while (p.down != null) {
                p = p.down;
            }
            int count = 0;//第一个首节点是标记为，其值是HEAD_KEY = Integer.MIN_VALUE
            while (count <= index) {
                p = p.next;
                count++;
            }
            return p.value;
        }
        return this.error;
    }

    @Override
    public int[] toarray() {
        Nodelj headpoint = this.head;
        while (headpoint.down != null) {
            headpoint = headpoint.down;
        }
        headpoint = headpoint.next;
        int[] arr = new int[this.SkipListnum];
        int count = 0;
        while (headpoint.value != TAIL_KEY) {
            arr[count] = headpoint.value;
            headpoint = headpoint.next;
            count++;//总是 会忘记类似的一些自加操作
        }
        return arr;
    }

    //输出结构
    public void print() {
        Nodelj point;
        Nodelj headpoint = this.head;
        while (headpoint != null) {
            point = headpoint;
            while (point.value != TAIL_KEY) {
                if (point.value != HEAD_KEY) {
                    System.out.print(point.value + "-");
                }
                point = point.next;
            }
            System.out.println();
            headpoint = headpoint.down;
        }
    }

    @Override
    public void clear() {
        this.head = initial();
        this.tail = head.next;
        this.SkipListlevel = 1;
        this.SkipListnum = 0;
    }

    @Override
    public boolean listequals(Listlj listlj) {
        return listequals(this, listlj);
    }

    @Override
    public boolean listequals(Listlj l1, Listlj l2) {
        SkipList l3 = (SkipList) l1;
        SkipList l4 = (SkipList) l2;
        if (l3 == l4) {
            return true;
        }
        if (l3 != null && l4 != null &&
                l3.SkipListnum == l4.SkipListnum && l3.SkipListlevel == l4.SkipListlevel) {
            /*boolean flag = Arrays.equals(l3.toarray(), l4.toarray());
            return flag;*/
            Nodelj p1 = l3.head;
            Nodelj p2 = l4.head;
            while (p1.down != null) {
                p1 = p1.down;
                p2 = p2.down;
            }
            while (p1.next != null && p1.value == p2.value) {
                p1 = p1.next;
                p2 = p2.next;
            }
            return p1.next == null;
        }
        return false;
    }

    public Nodelj initial() {
        // TODO Auto-generated method stub
        Nodelj phead = new Nodelj();
        Nodelj ptail = new Nodelj();
        phead.value = HEAD_KEY;
        ptail.value = TAIL_KEY;
        phead.next = ptail;
        return phead;
    }

    //新增加一层
    private void relever() {
        Nodelj phead = initial();
        phead.down = this.head;
        phead.next.down = this.tail;
        head = phead;
        tail = phead.next;
        SkipListlevel++;
    }

    private int randomLevel() {
        Random r = new Random();
        return r.nextInt(SkipListlevel);
    }

}