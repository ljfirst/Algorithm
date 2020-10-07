package DataStructure.graph.graphConnection.unionFind;

/**
 * @author liujun
 * @version 1.0
 * @date 2019-12-18 21:16
 * @author—Email  liujunfirst@outlook.com
 * @description  Union-Find 并查集算法
 * @blogURL
 */
public class UnionFind {

    int[] parent;
    //联通分量
    int count;

    public UnionFind(int n){
        this.count = n;
        parent = new int[n];
        for (int i = 0; i < n; i++) {
            parent[i] = i;
        }
    }

    //关联 x 和 y 为一个联通分量
    public void union(int x, int y) {
        int x_parent = find(x);
        int y_parent = find(y);
        if (x_parent != y_parent) {
            parent[x_parent] = y_parent;
            this.count--;
        }
    }

    //判断 p 和 q 是否连通
    public boolean connected(int x, int y) {
        int x_parent = find(x);
        int y_parent = find(y);
        return x_parent == y_parent;
    }

    //返回图中有多少个连通分量
    public int count() {
        return count;
    }

    //查找 x 的父节点
    private int find(int x) {
        while (parent[x] != x) {
            x = parent[x];
        }
        return x;
    }
}
