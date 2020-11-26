package DataStructure.graph.mst;

/**
 * @author liujun
 * @version 1.0
 * @date 2019-12-27 00:09
 * @author-Email liujunfirst@outlook.com
 * @description 克鲁斯卡尔算法的节点
 * @blogURL
 */
public class KruskalEdgeNode {

    int edgeValue;
    int startPoint;
    int endPoint;

    /**
     *
     * @param edgeValue
     * @param startPoint
     * @param endPoint
     */
    KruskalEdgeNode(int edgeValue, int startPoint, int endPoint){
        this.edgeValue = edgeValue;
        this.startPoint = startPoint;
        this.endPoint = endPoint;
    }
}
