package DataStructure.graph.mst;

import DataStructure.stringANDline.array.other.MatrixCheck;

/**
 *@author liujun
 *@date 2018-8-2 ����04:43:06
 *@author��Email liujunfirst@outlook.com
 *@description ��³˹�����㷨
 *@version 1.0
 */
public class Kruskal implements mst{

    //��� ��С�������� �ܳ��ȡ���С�߼��ϡ���С����������
    public int mstTotalValue;
    public int[] mstEdgeSet;
    public int[][] mstMatrix;

    @Override
    public void buildmst(int[][] matrix){

        if(!MatrixCheck.judgeisSquare(matrix)){
            return;
        }
        //��ȡ�����ݽṹ
        mstEdgeSet = buildEdgeSet(matrix);
        //������
        //������

        //�����ܳ���
        mstTotalValue = 0;
        //������С�߼��Ϲ�����С����������

    }

    //���ݾ����� �����ݽṹ
    private int[] buildEdgeSet(int[][] matrix){
        int length = matrix.length;
        //������treemap���������飬
        // �����飬��Ҫ����˫��ѭ������һ��Ԥ�Ȼ�ȡ���������ܳ�ʼ�������ݽṹ��
        // �ڶ���װ�ر����ݣ�����������
        // ��treemap��ֻ��Ҫһ��˫��ѭ��������Ԥ�Ȼ�ȡ������
        // ���ú�������򣬱߳�ʼ���������򣬲�ȥ�أ�������
        //TreeMap<Integer, KruskalEdgeNode> map = new TreeMap<Integer, KruskalEdgeNode>();
        for (int i = 0; i < length; i++) {
            //�������жϣ�����j=i+1
            for (int j = i + 1; j < length; j++) {
                //��������ֵ�����ǲ�����0
                if(matrix[i][j] != 0){
                    KruskalEdgeNode kruskalEdgeNode = new KruskalEdgeNode(matrix[i][j], i, j);
                    //map.put(matrix[i][j], kruskalEdgeNode);
                }
            }
        }
        return mstEdgeSet;
    }

    //������
    private int[] sortEdgeSet(int[] mstEdgeSet){

        return mstEdgeSet;
    }

    //�����յ��ж�
    private boolean judgeTerminal(KruskalEdgeNode kruskalEdgeNode){

        return false;
    }

    //������С�߼��Ϲ�����С����������
    private int[][] buildmstMatrix(){
        mstMatrix = null;
        return mstMatrix;
    }
}