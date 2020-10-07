package DataStructure.stringANDline.list;

/** 
 *@author liujun
 *@date 2018-8-18 ����01:08:11
 *@author��Email liujunfirst@outlook.com
 *@description  ������
 *1. �������ͷ�巨��β�巨
 *2. ����������
 *  2.1 �����ţ��������
 *  2.2 ����ջ�������(�ݹ�)
 *  2.3 ��������Ȼ�����(�ǵݹ�)
 *  2.4 ��������Ȼ�����(�ݹ�)
 *@version 1.0
 */
public class SinglyLinkedList {

	int size;
	SinglyLinkedNode next = null;
	
	public SinglyLinkedList() {
		// TODO Auto-generated constructor stub
		this.size = 0;
	}
	
	//������,����ת������ͷ�巨
	public SinglyLinkedNode insertHead(int[] list) {
		//��������׽��-ͷ�巨,��ֵ
		//System.out.println("��������ͷ�巨");
		SinglyLinkedNode first = null;
		if(list == null || list.length == 0){
			return first;
		}
		for (int i = 0; i < list.length; i++) {
			SinglyLinkedNode link = new SinglyLinkedNode(list[i]);
			link.next = first;
			first = link;
		}
		return first;
	}
	
	//������,����ת������β�巨
	public SinglyLinkedNode insertTail(int[] list) {
		System.out.println("��������β�巨");
		// TODO Auto-generated method stub
		SinglyLinkedNode point = null;
		SinglyLinkedNode first = point;
		//ѭ����ֵ
		for (int i = 0; i < list.length; i++) {
			//β�巨
			SinglyLinkedNode link = new SinglyLinkedNode(list[i]);
			//�״��ж�
			if (first == null) {
				first = point = link;
			}
			point.next = link;
			point = point.next;
		}
		return first;
	}
	 //2. ����������
	 //  2.1 �����ţ��������
	/*public void arrayReverse(SinglyLinkedNode first) {
		// TODO Auto-generated method stub
		System.out.println("�����ţ��������");
		int[] array = new int[16];
		int count = 0;
		int max = 16;
		while (first != null) {
			array[count] = first.value;
			count++;
			//��������Խ������
			if(count == max){
				int[] arraycopy = new int[max * 2];
				for (int i : array) {
					
				}
			}
		}
	}*/
	
	 //  2.2 ����ջ�������(�ݹ�)
	public void stackReverse(SinglyLinkedNode first) {
		// TODO Auto-generated method stub
		//System.out.println("����ջ�������(�ݹ�)");
		if(first.next != null){
			stackReverse(first.next);
		}
		System.out.print(first.value);
	}
	
	 //  2.3 ��������Ȼ�����(�ǵݹ�)
	public SinglyLinkedNode listReverse(SinglyLinkedNode first) {
		// TODO Auto-generated method stub
		System.out.println("��������Ȼ�����(�ǵݹ�)");
		SinglyLinkedNode head = null;
		SinglyLinkedNode p = null;
		while (first != null) {
			p = first;
			first = first.next;
			p.next = head;
			head = p;
		}
		return head;
	}
	
	
	 //  2.4 ��������Ȼ�����(�ݹ�)
	public SinglyLinkedNode listReverseRecursion(SinglyLinkedNode first) {
		// TODO Auto-generated method stub
		if(first == null || first.next == null){
			return first;
		}
		SinglyLinkedNode newhead = listReverseRecursion(first.next);
		first.next.next = first;
		first.next = null;
		return newhead;
	}
	
	//�������
	public void printLink(SinglyLinkedNode first) {
		// TODO Auto-generated method stub
		while (first != null) {
			System.out.print(first.value + " ");
			first = first.next;
		}
	}
	
	//����������
	/*public static void main(String[] args) {
//		Map  s = new HashMap<Integer, Integer>(12);
		//first�Ǳ�ͷ���(��ֵ0���������滻)
		SinglyLinkedNode first = new SinglyLinkedNode(0);
		int[] array = {1,2,3,4,5,6,7,8,9,10};
		first = first.insertTail(array);
		first.printLink(first);
		System.out.println();
		first = first.listReverseRecursion(first);
		first.printLink(first);
	}*/
}
