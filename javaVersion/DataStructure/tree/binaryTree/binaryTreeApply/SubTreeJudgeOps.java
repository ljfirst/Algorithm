package DataStructure.tree.binaryTree.binaryTreeApply;

import DataStructure.stringANDline.stringCompare.KMP;
import DataStructure.tree.binaryTree.dede.BinaryTree1;

/**
 *@author liujun
 *@date 2019-7-8 ����03:48:46
 *@author��Email liujunfirst@outlook.com
 *@description 
 *����ƥ���Ż���1���������л�(��������+����)
 *          2�������ַ���ƥ��
 *@URL
 *@version 1.0
 */
public class SubTreeJudgeOps {

	public boolean treeJudgeOps(BinaryTree1 tree1, BinaryTree1 tree2) {

		String s1PreOrder = subTreePreOrderSequence(tree1);
		String s2PreOrder = subTreePreOrderSequence(tree2);
		String s1InOrder = subTreeInOrderSequence(tree1);
		String s2InOrder = subTreeInOrderSequence(tree2);
		
		return subTreeKmp(s1PreOrder, s2PreOrder) && subTreeKmp(s1InOrder, s2InOrder);
	}
	
	//�������л�(����)
	public String subTreePreOrderSequence(BinaryTree1 tree) {

		if(tree == null){
			return "";
		}
		return tree.value + subTreePreOrderSequence(tree.left) + subTreePreOrderSequence(tree.right);
	}
	
	//�������л�(����)
	public String subTreeInOrderSequence(BinaryTree1 tree) {

		if(tree == null){
			return "";
		}
		return subTreeInOrderSequence(tree.left) + tree.value + subTreeInOrderSequence(tree.right);
	}
	
	//�����ַ���ƥ��
	public boolean subTreeKmp(String source, String pattern) {

        KMP kmp = new KMP();
        return kmp.kmp(source, pattern);
    }

	public static void main(String[] args) {
		SubTreeJudge g = new SubTreeJudge();
	}
}
