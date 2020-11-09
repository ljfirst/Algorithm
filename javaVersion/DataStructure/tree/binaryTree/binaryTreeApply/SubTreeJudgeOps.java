package DataStructure.tree.binaryTree.binaryTreeApply;

import DataStructure.stringANDline.stringCompare.KMP;
import DataStructure.tree.binaryTree.binaryTreeApply.SubTreeJudge;
import DataStructure.tree.binaryTree.binaryTreeRealize.BinaryTreeImpl;

/**
 *@author liujun
 *@date 2019-7-8 ����03:48:46
 *@author-Email liujunfirst@outlook.com
 *@description 通过字符串的先序遍历和中序遍历能唯一确定一颗二叉树
 * 如果树和子树的先序遍历和中序遍历均是包含关系，说明该子树是这颗树的子树
 *@version 1.0
 */
public class SubTreeJudgeOps {

	public boolean treeJudgeOps(BinaryTreeImpl tree1, BinaryTreeImpl tree2) {

		String s1PreOrder = subTreePreOrderSequence(tree1);
		String s2PreOrder = subTreePreOrderSequence(tree2);
		String s1InOrder = subTreeInOrderSequence(tree1);
		String s2InOrder = subTreeInOrderSequence(tree2);
		
		return subTreeKmp(s1PreOrder, s2PreOrder) && subTreeKmp(s1InOrder, s2InOrder);
	}
	
	//生成先序遍历字符串
	public String subTreePreOrderSequence(BinaryTreeImpl tree) {
		if(tree == null){
			return "";
		}
		return tree.value + subTreePreOrderSequence(tree.left) + subTreePreOrderSequence(tree.right);
	}
	
	//生成中序遍历字符串
	public String subTreeInOrderSequence(BinaryTreeImpl tree) {
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
}
