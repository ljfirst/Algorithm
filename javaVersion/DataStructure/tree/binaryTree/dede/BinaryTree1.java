package DataStructure.tree.binaryTree.dede;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author liujun
 * @version 1.0
 * @date 2019-10-18 01:38
 * @authorEmail liujunfirst@outlook.com
 * @description 
 */
//�����������ݽṹ
public class BinaryTree1 {

    public BinaryTree1 left;   //����
    public BinaryTree1 right;  //�Һ���
    public int value = 0;      //Ĭ�϶�������ֵΪ0
    public static int count = 0;//����һ��ȫ�־�̬��������

    public BinaryTree1(int value) {
        // TODO Auto-generated constructor stub
        this.value = value;
    }

    public BinaryTree1() {
        // TODO Auto-generated constructor stub
    }

    //�����������ֱ�����ֵ
    //���������������ֵ������,Լ��-1�ǿ�ָ��
    public BinaryTree1 create_preOrder(BinaryTree1 root, int [] tree_num , int i){

        if(i < tree_num.length){
            if(tree_num[i] == -1){
                return null;
            }else{
                //new root's lchild and rchild
                BinaryTree1 lchild = new BinaryTree1();
                BinaryTree1 rchild = new BinaryTree1();
                //preOrder
                root.value = tree_num[i];
                //����++count�������ʱ������
                root.left = create_preOrder(lchild, tree_num, ++count);
                root.right = create_preOrder(rchild, tree_num, ++count);
            }
        }
        return root;
    }

    //���������������ֵ������
    public BinaryTree1 create_inOrder(BinaryTree1 root){

        return root;
    }

    //��������������ֵ������
    public BinaryTree1 create_postOrder(BinaryTree1 root){

        return root;
    }

    //�������
    public void clear(){
        count = 0;
    }
    //�������Ĳ�α���,ʹ��ջ������ʵ��
    public void levelTraverse(BinaryTree1 root){

        // Queue is just an interface, LinkedList is Realization
        Queue<BinaryTree1> queue = new LinkedList<BinaryTree1>();
        queue.offer(root);
        while(!queue.isEmpty()){
            BinaryTree1 note = queue.poll();
            System.out.print(note.value + " ");
            if(note.left != null){
                levelTraverse(note.left);
            }
            if(note.right != null){
                levelTraverse(note.right);
            }
        }
    }

    // �������İ��д�ӡ
    public void printTreebyLine(BinaryTree1 root) {
        if(root == null){
            return;
        }
        //���û��еı�־ָ�룺pre,next
        BinaryTree1 pre = null;
        BinaryTree1 next = null;
        //��������
        Queue<BinaryTree1> queue = new LinkedList<BinaryTree1>();
        queue.offer(root);
        next = pre = root;
        //ָ���ƶ�����
        while (!queue.isEmpty()) {
            BinaryTree1 note = queue.poll();
            System.out.print(note.value + " ");
            if(note.left != null){
                pre = note.left;
                queue.add(note.left);
            }
            if(note.right != null){
                pre = note.right;
                queue.add(note.right);
            }
            //����
            if (note.value == next.value) {
                next = pre;
                System.out.println();
            }
        }
    }
}
