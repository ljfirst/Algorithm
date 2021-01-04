package UnitTest.DatastructureTest.arrayANDlistTest.listTest;

import DataStructure.arrayANDlist.list.Nodelj;
import DataStructure.arrayANDlist.list.listRealize.RingList;
import DataStructure.arrayANDlist.list.listRealize.SinglyLinkedList;
import org.junit.Test;

/**
 * @author liujun
 * @version 1.0
 * @date 2020/11/16
 * @author—Email liujunfirst@outlook.com
 * @blogURL https://blog.csdn.net/ljfirst
 * @description 有环链表和相交链表
 * 1、相交
 * 1.1、构造交叉链表
 * 1.2、判读链表是否相交
 * 1.3、找出链表的交点
 * 2、有环
 * 2.1、构造有环链表
 * 2.2、判读链表是否有环
 * 2.3、找出带环单链表的入口
 */
public class RingListTest extends ListljTest {

    RingList ringList = new RingList();

    /**
     * 1.1、构造交叉链表
     * 1.2、判读链表是否相交
     * 1.3、找出链表的交点
     */
    @Test
    public void createCrossLinkedList() {
        ringList.createCrossLinkedList(array03, array04);
        boolean flag = ringList.judgeCrossLinkedList(ringList.singlyLinkedList_a, ringList.singlyLinkedList_b);
        assert flag;
        Nodelj nodelj = ringList.findCrossLinkedListPoint(ringList.singlyLinkedList_a, ringList.singlyLinkedList_b);
        assert nodelj.value == array03[array03.length / 2];

        ringList.clear();
        ringList.createCrossLinkedList(array04, array05);
        flag = ringList.judgeCrossLinkedList(ringList.singlyLinkedList_a, ringList.singlyLinkedList_b);
        assert flag;
        nodelj = ringList.findCrossLinkedListPoint(ringList.singlyLinkedList_a, ringList.singlyLinkedList_b);
        assert nodelj.value == array04[array04.length / 2];

        ringList.clear();
        ringList.createCrossLinkedList(array05, array03);
        flag = ringList.judgeCrossLinkedList(ringList.singlyLinkedList_a, ringList.singlyLinkedList_b);
        assert flag;
        nodelj = ringList.findCrossLinkedListPoint(ringList.singlyLinkedList_a, ringList.singlyLinkedList_b);
        assert nodelj.value == array05[array05.length / 2];
    }

    /**
     * 2.1、构造有环链表
     * 2.2、判读链表是否有环
     * 2.3、找出带环单链表的入口
     */
    @Test
    public void createRingList() {

        SinglyLinkedList linkedList = ringList.createRingList(array03);
        Nodelj nodelj = ringList.judgeRingList(linkedList);
        assert nodelj != null;
        nodelj = ringList.findRingListPoint(linkedList);
        assert nodelj.value == array03[array03.length / 2];

        ringList.clear();
        linkedList = ringList.createRingList(array04);
        nodelj = ringList.judgeRingList(linkedList);
        assert nodelj != null;
        nodelj = ringList.findRingListPoint(linkedList);
        assert nodelj.value == array04[array04.length / 2];

        ringList.clear();
        linkedList = ringList.createRingList(array05);
        nodelj = ringList.judgeRingList(linkedList);
        assert nodelj != null;
        nodelj = ringList.findRingListPoint(linkedList);
        assert nodelj.value == array05[array05.length / 2];
    }
}
