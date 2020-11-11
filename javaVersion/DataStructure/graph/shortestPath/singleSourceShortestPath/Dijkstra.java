package DataStructure.graph.shortestPath.singleSourceShortestPath;

import DataStructure.stringANDline.hashTable.Node4Dijkstra;
import DataStructure.stringANDline.array.other.MatrixCheck;

/**
 * @author liujun
 * @version 1.0
 * @date 2019-12-25 21:11
 * @author��Email  liujunfirst@outlook.com
 * @description  ĳԴ�㵽;�����������·��
 * ���룺һ�� �ڽӾ��� ���� �ڽӱ� �������ͼ��
 *      ���ͼ��·��Ȩֵ����ȫ��Ϊ����
 *      ָ��ĳ����㡣
 * �����һ��ɢ�б�
 *      ������������㵽�������е����̾��룬
 *      �б��ֱ�ʾ����㵽��ǰ���·����
 * @blogURL
 */
//̰���㷨
public class Dijkstra {

    public Node4Dijkstra[] getShortestPath(int startPoint, int[][] matrix){

        //����Ƿ�Ϊ������
        if(!MatrixCheck.judgeisSquare(matrix)){
            return null;
        }
        int length = matrix.length;
        Node4Dijkstra[] hashTableNode4Dijkstras = new Node4Dijkstra[length];

        //initial
        for (int i = 0; i < length; i++) {
            hashTableNode4Dijkstras[i] = new Node4Dijkstra(matrix[startPoint][i]);
        }

        hashTableNode4Dijkstras[startPoint].value = 0;
        hashTableNode4Dijkstras[startPoint].visit = true;


        for (int i = 1; i < length; i++) {
            int minvalue = Integer.MAX_VALUE;
            int findpoint = 0;

            //find the min path
            for (int j = 0; j < length; j++) {
                if(!hashTableNode4Dijkstras[j].visit && hashTableNode4Dijkstras[j].value < minvalue){
                    minvalue = hashTableNode4Dijkstras[j].value;
                    findpoint = j;
                }
            }
            //fail to find min path,then break
            if(minvalue == Integer.MAX_VALUE){
                break;
            }
            hashTableNode4Dijkstras[findpoint].visit = true;
            hashTableNode4Dijkstras[findpoint].value = minvalue;

            //update the hashTableNode4Dijkstras
            for (int j = 0; j < length; j++) {
                    if(!hashTableNode4Dijkstras[j].visit && matrix[findpoint][j] != Integer.MAX_VALUE && hashTableNode4Dijkstras[j].value > matrix[findpoint][j] + minvalue){
                    hashTableNode4Dijkstras[j].value = matrix[findpoint][j] + minvalue;
                }
            }
        }

        return hashTableNode4Dijkstras;
    }
}
