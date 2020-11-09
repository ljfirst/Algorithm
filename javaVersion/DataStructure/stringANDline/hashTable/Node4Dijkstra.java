package DataStructure.stringANDline.hashTable;

import DataStructure.stringANDline.list.Nodelj;

/**
 * @author liujun
 * @version 1.0
 * @date 2019-12-26 00:12
 * @author-Email liujunfirst@outlook.com
 * @description 为狄杰斯特拉 设计的链表 Node 节点
 * @blogURL
 */
public class Node4Dijkstra extends Nodelj {
    public boolean visit;

    public Node4Dijkstra(){
        super();
        this.visit = false;
    }

    public Node4Dijkstra(int value){
        super(value);
        this.visit = false;
    }
}
