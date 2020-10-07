package DataStructure.graph.mst;

import Logic.check.MatrixCheck;

/**
 *@author liujun
 *@date 2018-8-2 下午04:43:06
 *@author—Email liujunfirst@outlook.com
 *@description 克鲁斯卡尔算法
 *@version 1.0
 */
public class Kruskal implements mst{

    //输出 最小生成树的 总长度、最小边集合、最小生成树矩阵
    public int mstTotalValue;
    public int[] mstEdgeSet;
    public int[][] mstMatrix;

    @Override
    public void buildmst(int[][] matrix){

        if(!MatrixCheck.judgeisSquare(matrix)){
            return;
        }
        //获取边数据结构
        mstEdgeSet = buildEdgeSet(matrix);
        //边排序
        //边纳入

        //计算总长度
        mstTotalValue = 0;
        //根据最小边集合构建最小生成树矩阵

    }

    //根据矩阵构造 边数据结构
    private int[] buildEdgeSet(int[][] matrix){
        int length = matrix.length;
        //这里用treemap而不用数组，
        // 用数组，需要三次双层循环，第一次预先获取边数，才能初始化边数据结构，
        // 第二次装载边数据，第三次排序，
        // 用treemap，只需要一次双层循环，无需预先获取边数，
        // 采用红黑书排序，边初始化，边排序，不去重，且排序
        //TreeMap<Integer, KruskalEdgeNode> map = new TreeMap<Integer, KruskalEdgeNode>();
        for (int i = 0; i < length; i++) {
            //自身不做判断，所有j=i+1
            for (int j = i + 1; j < length; j++) {
                //数据允许负值，但是不允许0
                if(matrix[i][j] != 0){
                    KruskalEdgeNode kruskalEdgeNode = new KruskalEdgeNode(matrix[i][j], i, j);
                    //map.put(matrix[i][j], kruskalEdgeNode);
                }
            }
        }
        return mstEdgeSet;
    }

    //边排序
    private int[] sortEdgeSet(int[] mstEdgeSet){

        return mstEdgeSet;
    }

    //绝对终点判断
    private boolean judgeTerminal(KruskalEdgeNode kruskalEdgeNode){

        return false;
    }

    //根据最小边集合构建最小生成树矩阵
    private int[][] buildmstMatrix(){
        mstMatrix = null;
        return mstMatrix;
    }
}