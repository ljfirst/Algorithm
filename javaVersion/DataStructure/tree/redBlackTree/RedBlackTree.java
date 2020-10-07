package DataStructure.tree.redBlackTree;

/** 
 *@author liujun
 *@date 2018-8-29 ����10:29:42
 *@author��Email liujunfirst@outlook.com
 *@description �����
 *����������containsKey(), get(), put(), remove()��
 *����ֻ����int����ֵ�ĺ������
 *@version 1.0
 */
public class RedBlackTree {

	int value;
	RedBlackTree left;
	RedBlackTree right;
	RedBlackTree parent;
	String color ;
	
	static RedBlackTree root = new RedBlackTree(-1);
	
	//���캯��
	public RedBlackTree() {

		this.value = -1;
		color = "RED";
	}
	
	public RedBlackTree(int value) {
		this.value = value;
		color = "RED";
	}

	public RedBlackTree add(int[] array) {
		
		root.clear();
		for (int i = 0; i < array.length; i++) {
			root = add(root, array[i]);
		}
		return root;
	}

	public RedBlackTree add(int value) {
		
		root.clear();
		return root = add(root, value);
	}
	
	//����Ԫ��
	public RedBlackTree add(RedBlackTree root, int value) {

		//init
		if (-1 == root.value) {
			root.value = value;
			root.color = "BLACK";
			return root;
		}
		RedBlackTree point = new RedBlackTree(value);
		RedBlackTree search = root;
		RedBlackTree search_bef = root;
		//Ѱ�Ҳ����
		while (search != null) {
			search_bef = search;
			if (search.value < value) {
				search = search.right;
			}else {
				search = search.left;
			}
		}
		//������
		point.parent = search_bef;
		if (search_bef.value < value) {
			search_bef.right = point;
		}else {
			search_bef.left = point;
		}
		// ÿ�β�����н�����,�˴�����point.paren�����жϣ������ж���insertFixup�н���?
		if (null != point.parent) {
			root = insertFixup(root, point);
		}
		return root;
	}
	
	//�������Ԫ�������е�������(��С����)
	//�����ҵ��ýڵ㣬���������������ж��ٽڵ㼴��
	public int get(int value) {

		return get(root, value);
	}
	
	public int get(RedBlackTree root, int value) {

		if(!root.containsKey(value)){
			return -1;
		}
		if(root.value == value){
			return countTreeNum(root.left) + 1;
		}
		if(value < root.value){
			return get(root.left, value);
		}else{
			return countTreeNum(root.left) + 1 + get(root.right, value);
		}
	}
	
	public int countTreeNum(RedBlackTree root) {

		if(root == null){
			return 0;
		}
		return 1 + countTreeNum(root.left) + countTreeNum(root.right);
	}
	
	public boolean containsKey(int value) {
		
		return root.containsKey(root, value);
	}

	//Ԫ�ؼ��
	public boolean containsKey(RedBlackTree root, int value) {

		if(root == null){
			return false;
		}
		if(root.value == value){
			return true;
		}
		if(value < root.value){
			return containsKey(root.left, value);
		}else{
			return containsKey(root.right, value);
		}
	}
	
	public void remove(int value) {
		remove(root, value);
	}
	
	//�Ƴ�Ԫ��,�����������1.Ҷ�ӽ��    2���������ӻ����Һ��ӵĽ��
	public void remove(RedBlackTree root, int value) {

		if(!root.containsKey(value)){
			return ;
		}
		
		
	}
	
	//�ж����͵�ʱ��1���ȿ���ɾ���Ľڵ����ɫ��
	//           2���ٿ��ֵܽڵ����ɫ��
	//           3���ٿ�ֶ�ӽڵ����ɫ��ֶ�ӽڵ�3.1���ȿ�Զֶ��3.2���ٿ���ֶ�ӣ���
	//           4����󿴸��׽ڵ����ɫ
	
	//���һ��ɾ��Ҷ�ӽڵ�Ϊ��ɫ��ֱ��ɾ�������
	public void deleteRedLeaf(RedBlackTree root) {

		if(root == null){
			return ;
		}
		if(root.parent.left == root){
			root.parent.left = null;
		}else{
			root.parent.right = null;
		}
	}
	
	//�������ɾ��Ҷ�ӽڵ�Ϊ��ɫ
	//���2.1����ɾ���ڵ�D���ֵܽڵ�SΪ��ɫ
	public void deleteBlackLeafwithRedBrother(RedBlackTree root, RedBlackTree point){
		if(point == null){
			return ;
		}
		//��ɾ�����Ϊ����
		if(point.parent.left == point){
			RedBlackTree tempRight = point.parent.right;
			//��ɫ����
			String s = tempRight.color;
			tempRight.color = point.parent.color;
			point.parent.color = s;
			//LL
			rotateLeft(root, point.parent);
			deleteBlackLeafwithBlackBrother(root, point);
		}else{//��ɾ�����Ϊ�Һ���
			RedBlackTree tempRight = point.parent.left;
			//��ɫ����
			String s = tempRight.color;
			tempRight.color = point.parent.color;
			point.parent.color = s;
			//RR
			rotateRight(root, point.parent);
			deleteBlackLeafwithBlackBrother(root, point);
		}
		
	}
	//���2.2����ɾ���ڵ�D���ֵܽڵ�SΪ��ɫ��
	public void deleteBlackLeafwithBlackBrother(RedBlackTree root, RedBlackTree point){
		if(root == null){
			return ;
		}
		
		if(point.parent.left == point){
			//RedBlackTree tempRight = point.parent.right;
			//��һ��ֶ�ӽ��Ϊ��ɫ
			
			//�жϸ��׽����ɫ
			
		}
	}
	
	//���2.2.1����Զֶ�ӽڵ�Ϊ��ɫ
	public void rightNephewisRed(RedBlackTree point){
		
	}
	
	//���2.2.2����ֶ�ӽ��Ϊ��ɫ��Զֶ�ӽڵ�Ϊ��ɫ
	public void leftNephewisRed(RedBlackTree point){
		
	}
	
	//���2.2.3�����ڵ�Ϊ��ɫ(��ǰ�ڵ�Ϊ��ɫ���ֵܽڵ�Ϊ��ɫ)
	public void fatherisRed(RedBlackTree point){
		RedBlackTree temppoint;
		if(point.parent.left == point){
			temppoint = point.parent.right;
			//ɾ�����
			point.parent.left = null;
		}else{
			temppoint = point.parent.left;
			point.parent.right = null;
		}
		String s = point.parent.color;
		point.parent.color = temppoint.color;
		point.color = s;
		temppoint.color = s;
	}

	//���2.2.4�����ڵ�Ϊ��ɫ(��ǰ�ڵ�Ϊ��ɫ���ֵܽڵ�Ϊ��ɫ)
	public void fatherisBlack(RedBlackTree point){
	
		if(point.parent.left == point){
			point.right.color = "RED";
			point.parent.left = null;
		}else{
			point.left.color = "RED";
			point.parent.right = null;
		}
		fixcolor(point.parent);
	}
	
	public void fixcolor(RedBlackTree point) {

		//���ڵ�
		if(point.parent == null){
			
		}else{
			if("RED".equals(point.parent.color)){
				if(point.parent.left == point){
					point.right.color = "RED";
					point.parent.color = "BLACK";
				}else{
					point.left.color = "RED";
					point.parent.color = "BLACK";
				}
			}else{
				
			}
		}
	}
	
	//�������ɾ���ڵ�Ϊ��ɫ���ӽڵ�Ϊ��ɫ(ֻ����������ֻ���������Ľڵ�)
	public void deleteOnlyleftorOnlyright(RedBlackTree point){
		if(point == null){
			return ;
		}
		RedBlackTree pointTemp;
		if(point.left != null){
			pointTemp = point.left;
			if(point.parent.left == point){
				point.parent.left = pointTemp;
			}else{
				point.parent.right = pointTemp;
			}
		}else{
			pointTemp = point.right;
			if(root.parent.right == root){
				root.parent.right = pointTemp;
			}else{
				root.parent.left = pointTemp;
			}
		}
		pointTemp.parent = point.parent;
		pointTemp.color = point.color;
	}

	//����
	public void clear() {

		root = new RedBlackTree();
	}
	
	//����������������С����
	public void print(RedBlackTree root) {

		if (null == root) {
			return;
		}
		print(root.left);
		System.out.print(root.value + " ");
		print(root.right);
	}
	
	//�������������ɫ����������ͺ������⣬���к������������Ϊ���Һ�������
	public RedBlackTree insertFixup(RedBlackTree root, RedBlackTree point) {

		RedBlackTree uncle;
		//���ڵ��Ǻ�ɫ
		while (null != point.parent && "RED".equals(point.parent.color)) {
			//���ڵ�λ�á�����һ��Ϊʲô���游�ڵ㡱֮ǰ�Ǻ�ɫ��
			//���Ӧ�ú����������ף���Ϊ�ڱ任����֮ǰ�������Ǻ�����������ڵ㡱�Ǻ�ɫ,��ô���游�ڵ㡱һ���Ǻ�ɫ��
			//�������Ϊʲô�����游�ڵ㡱�ɡ���ɫ����ɺ�ɫ��ͬʱ����������ڵ㡱�ɡ���ɫ����ɡ���ɫ����
			//�ܽ�������������ڵ㡱�͡�����ڵ㡱�ķ�֧�ĺ�ɫ�ڵ������������1�������⡣
			if (root == point.parent) {
				root.color = "BLACK";
				return root;
			}else {
				//else���˵��point.parent.parent��=null
				//���������
				if (point.parent == point.parent.parent.left) {
					//���ڵ����游�ڵ�����ӣ��������Һ���
					uncle = point.parent.parent.right;
					//��Ϊ��ָ�����ɫĬ���Ǻ�ɫ�������Ƚ����������
					if (null == uncle || "BLACK".equals(uncle.color)) {
						//��������:�Һ�������
						//(01) �������ڵ㡱��Ϊ����ɫ����(02) �����游�ڵ㡱��Ϊ����ɫ����(03) �ԡ��游�ڵ㡱Ϊ֧�����������
						//(01)�������������㣬(02)�����˾������ڵ��֧�ĺ�ɫ�ڵ�ĸ���������1
						//(03)�����˾���uncle��֧�ĺ�ɫ�ڵ�ĸ���������1
						if (point == point.parent.right) {
							root = rotateLeft(root, point.parent);
							point = point.left;//ע�⵱ǰ������
						}//�Һ�������ת��Ϊ��������
						//��������:��������
						point.parent.color = "BLACK";
						point.parent.parent.color = "RED";
						//�˴����������Һ����޹أ�����(03)���
						root = rotateRight(root, point.parent.parent);
						return root;
						
					//��������
					}else {
						uncle.color = "BLACK";
						point.parent.color = "BLACK";
						point.parent.parent.color = "RED";
						point = point.parent.parent;
						if (root == point) {
							root.color = "BLACK";
							return root;
						}
					}
				}else {
					//���ڵ����游�ڵ���Һ��ӣ�����������
					uncle = point.parent.parent.left;
					//����
					if (null == uncle || "BLACK".equals(uncle.color)) {
						if (point == point.parent.left) {
							root = rotateRight(root, point.parent);
							point = point.right;//ע�⵱ǰ������
						}
						point.parent.color = "BLACK";
						point.parent.parent.color = "RED";
						root = rotateLeft(root, point.parent.parent);
						return root;
						
					//����	
					}else {
						uncle.color = "BLACK";
						point.parent.color = "BLACK";
						point.parent.parent.color = "RED";
						point = point.parent.parent;
						if (root == point) {
							root.color = "BLACK";
							return root;
						}
					}
				}
			}
		}
		return root;
	}
	
	//��������,ע�⣺����ʹ�õ��ҽ����������Ӵ���ʱ����ˣ�����Ҫ��point.right�����жϡ�
	private RedBlackTree rotateRight(RedBlackTree root, RedBlackTree point) {

		RedBlackTree pleft = point.left;
		//����point���ӵ��Һ�������
		point.left = pleft.right;
		if (null != pleft.right) {
			pleft.right.parent = point;
		}
		//����point�ĸ��ڵ�����
		pleft.parent = point.parent;
		if (null == point.parent) {
			root = pleft;
		}else if(point.parent.left == point){
			point.parent.left = pleft;
		}else {
			point.parent.right = pleft;
		}
		//����point��������
		pleft.right = point;
		point.parent = pleft;
		return root;
	}
	
	//��������,ע�⣺����ʹ�õ��ҽ��������Һ��Ӵ���ʱ����ˣ�����Ҫ��point.right�����жϡ�
	private RedBlackTree rotateLeft(RedBlackTree root, RedBlackTree point) {

		RedBlackTree pright = point.right;
		//����point�Һ��ӵ���������
		point.right = pright.left;
		if (null != pright.left) {
			pright.left.parent = point;
		}
		//����point�ĸ��ڵ�����
		pright.parent = point.parent;
		if (null == point.parent) {
			root = pright;
		}else if(point.parent.left == point){
			point.parent.left = pright;
		}else {
			point.parent.right = pright;
		}
		//����point��������
		pright.left = point;
		point.parent = pright;
		return root;
	}
	
	//����������
	public static void main(String[] args) {
		//RedBlackTree root = new RedBlackTree();
		//int[] array1 = {8,2,4,6,5,7,9,1,3};
		
		int[] array = {0, 2, 2, 3, 3, 3, 4, 5, 9, 9, 9, 10, 10, 12, 12, 13, 14, 15, 15, 15, 16, 17, 19, 19, 20, 21, 21, 21, 25, 25, 26, 26, 26, 27, 28, 30, 31, 31, 32, 34, 34, 35, 37, 39, 40, 41, 41, 42, 42, 42, 42, 45, 46, 46, 46, 46, 47, 50, 51, 54, 54, 55, 56, 59, 62, 65, 65, 65, 67, 67, 69, 71, 74, 75, 76, 77, 77, 78, 78, 79, 79, 80, 80, 80, 80, 82, 82, 82, 82, 84, 85, 85, 85, 89, 89, 91, 95, 98, 98, 100};
		System.out.println(array.length);
		root.add(array);
		System.out.println(root.containsKey(45));
		root.print(root);
		System.out.println();
		System.out.println(root.get(16));
		System.out.println(root.get(95));
		System.out.println(root.get(45));
	}
}
