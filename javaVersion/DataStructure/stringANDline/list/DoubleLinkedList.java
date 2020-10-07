package DataStructure.stringANDline.list;

/**
 * @author liujun
 * @version 1.0
 * @date 2019-12-07 18:17
 * @author��Email  liujunfirst@outlook.com
 * @description 
 * 1��˫������Ĳ���
 * 2��˫������ɾ��
 * 3��˫���������
 * 4��˫������ת����
 * @blogURL
 */
public class DoubleLinkedList {

    DoubleLinkedNode headpoint = null;
    DoubleLinkedNode tailpoint = null;
    int size;

    public DoubleLinkedList(){
        size = 0;
    }

    //˫��������롪��ͷ�巨
    public DoubleLinkedList insertHead(int[] array){
        DoubleLinkedList head = new DoubleLinkedList();
        if(array == null || array.length == 0){
            return null;
        }
        for (int i = 0; i < array.length; i++) {
            DoubleLinkedNode node = new DoubleLinkedNode(array[i]);
            //�޸� ǰ���׽ڵ�
            node.next = head.headpoint;
            node.next.front = node;
            //�޸� ���׽ڵ�
            head.headpoint = node;
            node.front = head.tailpoint;
            //�޸� β�ڵ�
            head.tailpoint.next = node;
            this.size++;
        }

        return head;
    }

    //˫��������롪��β�巨
    public DoubleLinkedList insertTail(int[] array){
        DoubleLinkedList head = null;
        return head;
    }

    //˫��������롪������Ԫ�ز���
    public DoubleLinkedList insert(DoubleLinkedList head, int value){
        return head;
    }

    //˫������Ĳ��ҡ�������ĳԪ��
    public int findValue(int value){
        return -1;
    }

    //˫������Ĳ��ҡ�������ĳλ���Ƿ���Ԫ��
    public int findIndex(int index){
        return -1;
    }

    //˫�������ɾ������ɾ��ĳԪ��
    public int deleteValue(int value){
        return -1;
    }

    //˫�������ɾ������ɾ��ĳλ��
    public int deleteIndex(int index){
        return -1;
    }

    //˫������ת����
    public int[] transtoArray(DoubleLinkedList head){
        int[] array = new int[head.size];
        return array;
    }
}
