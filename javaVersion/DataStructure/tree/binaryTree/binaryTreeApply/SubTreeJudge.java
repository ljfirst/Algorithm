package DataStructure.tree.binaryTree.binaryTreeApply;

import DataStructure.tree.binaryTree.dede.BinaryTree1;

/**
 *@author liujun
 *@date 2018-7-21 ����10:57:09
 *@authorEmail liujunfirst@outlook.com
 *@description �������ö�����A��B���ж�B�ǲ���A���ӽṹ��
 *��ps������Լ��������������һ�������ӽṹ��
 *˼·�������ǰ�����ͬ����ͨ��compare�������жԱȡ�
 *compare���������������������жϡ�
 *@version 1.0
 */
public class SubTreeJudge {

	boolean flag = false;
	
	//�����ж�
	public boolean judgeTree(BinaryTree1 tree, BinaryTree1 subtree) {

		if(tree == null && subtree == null){
			//�˴�ֱ��return�����������һ��if,������ָ���쳣
			return true;
		}
		if(tree == null || subtree == null){
			//�˴�ֱ��return�����������һ��if,������ָ���쳣
			return false;
		}
		//���ֵ��ȣ����������жϡ�
		if(tree.value == subtree.value && compare(tree, subtree)){
			flag = true;
		}else {
			if(judgeTree(tree.left, subtree) ||
					judgeTree(tree.right, subtree)){
				flag = true;
			}
		}
		return flag;
	}
	
	//�������ȶԣ��ж϶������Ƿ���ȫһ��
	public boolean compare(BinaryTree1 tree, BinaryTree1 subtree){
		
		//�жϸ��ڵ��Ƿ����,��������subtreeƥ��tree��
	    //��subtreeΪ��ʱ������treeΪ��ֵ�������ж�subtreeƥ��tree��
		if(subtree ==null){
			return true;
		}
		
		//��treeΪ�գ�����subtree��Ϊ�գ��ж�subtree����tree��һ���֡�
		if(tree == null && subtree !=null){
			return false;
		}
		//��tree��subtree����Ϊ�գ���ֵ��ȣ��ݹ��ж���ͬ
		if(tree.value == subtree.value){
			return compare(tree.left, subtree.left)
			&&compare(tree.right, subtree.right);
		}
		
		return false;
	}
	
	
	public static void main(String[] args) {
		//test
		//A����
		int [] A = {8,8,9,-1,-1,2,4,7,-1,-1,7,-1,-1,-1,-1};
		//B����
		int [] B = {8,9,-1,-1,2,-1,-1};
		//int [] B = {9,-1,-1};

		BinaryTree1 bta = new BinaryTree1();
		BinaryTree1 btb = new BinaryTree1();
		
		//A������������γ�A��
		bta.create_preOrder(bta, A, 0);
		//B������������γ�B��
		bta.clear();
		btb.create_preOrder(btb, B, 0);
		
		//�����ж�
		SubTreeJudge zishu = new SubTreeJudge();
	    System.out.println(zishu.judgeTree(bta,btb));
		
		/*TreeJudgeOps tjo = new TreeJudgeOps();
		System.out.println(tjo.treeJudgeOps(bta, btb));
		*/
	}
}