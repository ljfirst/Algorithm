package UnitTest.DatastructureTest.graphTest;

import DataStructure.graph.shortestPath.singleSourceShortestPath.Dijkstra;
import DataStructure.stringANDline.hashTable.Node4Dijkstra;
import org.junit.Test;

/**
 * @author liujun
 * @version 1.0
 * @date 2019-12-25 21:37
 * @author��Email liujunfirst@outlook.com
 * @description 
 * @blogURL
 */
public class DijkstraTest {

    Dijkstra dijkstra = new Dijkstra();

    @Test
    public void TestgetShortestPath(){
        /*int mulsum = 1;
        int sum = 0;*/
        int startpoint = 0;
        Node4Dijkstra[] ht4d = dijkstra.getShortestPath(startpoint,Demo01);
        /*for (int i = 0; i < ht4d.length; i++) {
            if(i != startpoint){
                mulsum *= ht4d[i].value;
                sum += ht4d[i].value;
            }
        }
        assert mulsum == 3024;
        assert sum == 26;*/
        assert ht4d[0].value == 0;
        assert ht4d[1].value == 4;
        assert ht4d[2].value == 6;
        assert ht4d[3].value == 3;
        assert ht4d[4].value == 6;
        assert ht4d[5].value == 7;
    }

    int max = Integer.MAX_VALUE;
    //��������
    int[][] Demo01= {
            {0,16,max,3,max,max},
            {16,0,2,1,2,3},
            {max,2,0,max,max,7},
            {3,1,max,0,23,max},
            {max,2,max,23,0,max},
            {max,3,7,max,max,0},
    };
}
