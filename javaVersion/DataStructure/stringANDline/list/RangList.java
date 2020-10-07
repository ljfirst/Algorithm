package DataStructure.stringANDline.list;

import java.util.HashMap;
import java.util.Map;

/** 
 *@author liujun
 *@date 2018-8-22 ����02:06:33
 *@author��Email liujunfirst@outlook.com
 *@description  ������
 *1. β�巨��дΪ�����л�����
 *2. �жϵ��ı��Ƿ��л�
 *3. �ҳ���������������
 *4. �����ཻ����
 *5. �ж����������Ƿ��ཻ
 *6. �ҳ���������Ľ���
 *@version 1.0
 */

public class RangList extends SinglyLinkedList{

	public RangList(int value) {
		//super(value);
	}
	
	@Override
	//β�巨��дΪ�����л�����
	public SinglyLinkedNode insertTail(int[] list) {
		System.out.println("β�巨��дΪ�����л�����");
		SinglyLinkedNode point = null;
		SinglyLinkedNode first = point;
		//����ڽ��
		SinglyLinkedNode temp = new SinglyLinkedNode();
		//β�巨��ѭ����ֵ
		for (int i = 0; i < list.length; i++) {
			SinglyLinkedNode link = new SinglyLinkedNode(list[i]);
			//�״��ж�
			if (first == null) {
				first = point = link;
			}
			//����ڽ��
			if(i == list.length/2){
				temp = link;
				System.out.println("����㣺"+temp.value);
			}
			point.next = link;
			point = point.next;
		}
		//Ϊ�ڵ㹹�컷
		point.next = temp;
		return first;
	}
             
	//�жϵ������Ƿ��л�
	public boolean FindListTail(SinglyLinkedNode first) {
		// TODO Auto-generated method stub
		SinglyLinkedNode slow = first;
		SinglyLinkedNode fast = first;
		
		while (fast.next != null && fast != null) {
			fast = fast.next.next;
			slow = slow.next;
			if (fast == slow) {
				return true;
			}
		}
		return false;
	}
	
	//���ص�������������
	public SinglyLinkedNode ListMeet(SinglyLinkedNode first) {
		
		SinglyLinkedNode slow = first;
		SinglyLinkedNode fast = first;
		
		while (fast != null && fast.next != null) {
			fast = fast.next.next;
			slow = slow.next;
			if (fast == slow) {
				return fast;
			}
		}
		return null;
	}
	
	//�ҳ���������������
	public SinglyLinkedNode findLoopPort(SinglyLinkedNode first) {
		// TODO Auto-generated method stub

		SinglyLinkedNode point_meet = ListMeet(first);
		while(first != null && point_meet != null){
			if(first == point_meet){
				return point_meet;
			}
			first = first.next;
			point_meet = point_meet.next;
		}
		return null;
	}
	
	//�����ཻ����
	public Map<Integer, SinglyLinkedNode> buildCrossLink(int[] array_a, int[] array_b) {
		// TODO Auto-generated method stub

		//˼·����a�������꣬���뵽b��һ�룬��Ҫa�����βָ���b�����һ��ָ��
		//����a������β�巨
		SinglyLinkedNode tail = null;
		SinglyLinkedNode first_a = tail;
		for (int i = 0; i < array_a.length; i++) {
			SinglyLinkedNode link_a = new SinglyLinkedNode(array_a[i]);
			//�״��ж�
			if (first_a == null) {
				first_a = tail = link_a;
			}
			tail.next = link_a;
			tail = tail.next;
		}
		//����b������ͷ�巨
		SinglyLinkedNode first_b = null;
		for (int i = 0; i < array_b.length; i++) {
			SinglyLinkedNode link_b = new SinglyLinkedNode(array_b[i]);
			if(i == array_b.length/2){
				tail.next = link_b;
				System.out.println("����ֵ�ǣ� "+array_b[i]);
			}
			link_b.next = first_b;
			first_b = link_b;
		}
		Map<Integer, SinglyLinkedNode> map = new HashMap<Integer, SinglyLinkedNode>();
		map.put(1, first_a);
		map.put(2, first_b);
		return map;
	}
	
	//�ж����������Ƿ��ཻ
	public boolean judgeCrossLink(SinglyLinkedNode first, SinglyLinkedNode second) {
		// TODO Auto-generated method stub
		//�ж�βָ���Ƿ���ͬ
		while (first.next != null) {
			first = first.next;
		}
		while (second.next != null) {
			second = second.next;
		}
		if(first == second){
			return true;
		}
		return false;
	}
	
	//�ҳ���������Ľ���
	public int getCrossPoint(SinglyLinkedNode first, SinglyLinkedNode second) {
		// TODO Auto-generated method stub

		SinglyLinkedNode p1 = first;
		SinglyLinkedNode p2 = second;
		int count1 = 0;
		int count2 = 0;
		int way = 0;
		
		while (first.next != null) {
			first = first.next;
			count1++;
		}
		while (second.next != null) {
			second = second.next;
			count2++;
		}
		if(count1 - count2 > 0){
			way = count1 - count2;
			first = p1;
			second = p2;
		}else{
			way = count2 - count1;
			first = p2;
			second = p1;
		}
		while(way > 0){
			first = first.next;
			way--;
		}
		while(first != second){
			first = first.next;
			second = second.next;
		}
		return first.value;
	}
	
	//����������
	public static void main(String[] args) {
		
		//�����л�������
		int[] array1 = {1,2,3,4,5,6,7,8,9,10};
		int[] array2 = {11,12,13,14,15,16,17,18,19,20};
		RangList rl = new RangList(0);
		System.out.println("�����л�������");
		SinglyLinkedNode first= rl.insertTail(array1);
		
		//���Ե������Ƿ��л�
		System.out.println("�������Ƿ��л�");
		System.out.println(rl.FindListTail(first));
		System.out.println("����������ڽ�㣺");
		System.out.println(rl.ListMeet(first).value);
	
		//���������������ཻ
		Map<Integer, SinglyLinkedNode> map = rl.buildCrossLink(array1, array2);
		System.out.println("�����������Ƿ��ཻ");
		System.out.println(rl.judgeCrossLink(map.get(1), map.get(2)));
		System.out.println("�����������ཻ��㣺");
		System.out.println(rl.getCrossPoint(map.get(1), map.get(2)));
	}
}
