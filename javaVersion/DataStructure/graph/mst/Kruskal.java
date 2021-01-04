package DataStructure.graph.mst;

import DataStructure.arrayANDlist.arrayApply.MatrixCheck;

/**
 *@author liujun
 *@date 2018-8-2 04:43:06
 *@author-Email liujunfirst@outlook.com
 *@description 克鲁斯卡尔算法
 *@version 1.0
 */
public class Kruskal implements mst{

    public int mstTotalValue;
    public int[] mstEdgeSet;
    public int[][] mstMatrix;

    @Override
    public void buildmst(int[][] matrix){
        if(!MatrixCheck.judgeisSquare(matrix)){
            return;
        }
        mstEdgeSet = buildEdgeSet(matrix);
        mstTotalValue = 0;

    }

    private int[] buildEdgeSet(int[][] matrix){
        int length = matrix.length;
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