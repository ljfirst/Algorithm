package UnitTest.DatastructureTest.graphTest;

import DataStructure.graph.graphConnection.unionFind.UnionFind;
import org.junit.Test;

/**
 * @author liujun
 * @version 1.0
 * @date 2019-12-18 21:16
 * @author¡ªEmail liujunfirst@outlook.com
 * @description 
 * @blogURL
 */
public class UnionFindTest {

    UnionFind unionFind = new UnionFind(10);

    @Test
    public void TestUnionFind() {
        unionFind.union(1, 2);
        unionFind.union(1, 3);
        unionFind.union(1, 4);
        assert unionFind.count() == 7;
        assert unionFind.connected(3, 4);

        unionFind = new UnionFind(100);
        for (int i = 0; i <= 96; i++) {
            unionFind.union(i, i + 2);
            unionFind.union(i + 1, i + 3);
            i += 1;
        }
        assert unionFind.count() == 2;
        int num = 58;
        assert unionFind.connected(num/2, num/2+4);
        assert unionFind.connected(num, num/2+3);
        assert !unionFind.connected(num, num/2+4);
    }
}
