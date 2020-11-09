package DataStructure.stringANDline.list.listRealize;

import DataStructure.stringANDline.list.Nodelj;

import java.util.Random;

/**
 * @author liujun
 * @version 1.0
 * @date 2019-7-25 ����11:59:31
 * @author-Email liujunfirst@outlook.com
 * @description 跳表
 * 支持：
 * 清除(clear)、初始化(initial)
 * 新增(add)、删除(delete)、查找(find)
 */
public class SkipList {

    //ͷβָ��(����ͷָ��ֵΪ��Сֵ��βָ��Ϊ���ֵ)
    Nodelj head, tail;
    //��Ծ����
    public int SkipListlevel;
    //��Ծ���ܽ�����
    public int SkipListnum;
    public static final int HEAD_KEY = Integer.MIN_VALUE;
    public static final int TAIL_KEY = Integer.MAX_VALUE;

    public SkipList() {
        clear();
        head = initial();
        tail = head.next;
        SkipListlevel = 1;
    }

    public void clear() {
        head = null;
        tail = null;
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

    public void add(int Value) {

        if (find(Value)) {
            return;
        }
        Nodelj insertKey;
        Nodelj fathersln = null;
        /* ����ʵ��֤�������� ��ʱ �� ���� ���Ӻ�ʱ��
        ����Խ�ߣ��������ݱ���Խ�࣬Խӷ�ף����ǲ��ҿ졢�����ɾ����
		����Խ�ͣ��������ݱ���Խ�٣�      ���ǲ������������ɾ����
		�ۺϿ��ǣ����������
		*/

        //�����½�����
        if (SkipListnum <= (2 << SkipListlevel - 1)) {
            int k = randomLevel();
            insertKey = head;
            for (int i = 0; i < k; i++) {
                insertKey = insertKey.down;
            }
        } else {//��Ҫ�½�����
            Nodelj phead = initial();
            phead.down = head;
            phead.next.down = tail;
            head = phead;
            tail = phead.next;
            insertKey = head;
            SkipListlevel++;
        }
        //���²�ȫ���еĲ���ڵ�
        while (insertKey != null) {
            while (insertKey.next.value < Value) {
                insertKey = insertKey.next;
            }
            Nodelj sln = new Nodelj(Value);
            if (fathersln != null) {
                fathersln.down = sln;
            }
            sln.next = insertKey.next;
            insertKey.next = sln;
            insertKey = insertKey.down;
            fathersln = sln;
        }
        SkipListnum++;
    }

    public boolean delete(int x) {

        //����߽���
        if (head.next == tail && head.down != null) {
            head = head.down;
            tail = tail.down;
            this.SkipListlevel--;
        }
        //ע��˳���Ƚ��������жϲ�Ȼ��������һ��Ԫ��ɾ���ˣ����Ǳ���Ȼ��Ϊ1
		if (!find(x)) {
			return false;
		}
        Nodelj point = head;
        Nodelj prepoint = point;

        //�������
        while (point.value != x) {
            while (point.next.value <= x) {
                prepoint = point;
                point = point.next;
            }
            if (point.value == x) {
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
        //����ɾ��
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
        return true;
    }

    public boolean find(int x) {

        Nodelj point = head;
        while (true) {
            while (point.next.value <= x) {
                point = point.next;
            }
            if (point.value == x) {
                return true;
            }
            if (point.down == null) {//������ײ�
                return false;
            }
            point = point.down;
        }
    }

    public int randomLevel() {
        Random r = new Random();
        return r.nextInt(SkipListlevel);
    }

    public void print() {//������������ṹ
        Nodelj point;
        Nodelj headpoint = head;
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
}