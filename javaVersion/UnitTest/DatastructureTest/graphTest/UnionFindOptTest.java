package UnitTest.DatastructureTest.graphTest;

import DataStructure.graph.graphConnection.unionFind.UnionFindOpt;
import org.junit.Test;

/**
 * @author liujun
 * @version 1.0
 * @date£º 2019-12-18 22:31
 * @author¡ªEmail liujunfirst@outlook.com
 * @description 
 * @blogURL
 */
public class UnionFindOptTest {
    
    UnionFindOpt unionFindOpt = new UnionFindOpt(10);
    @Test
    public void TestunionFindOpt() {
        unionFindOpt.union(1, 2);
        unionFindOpt.union(1, 3);
        unionFindOpt.union(1, 4);
        assert unionFindOpt.count() == 7;
        assert unionFindOpt.connected(3, 4);

        unionFindOpt = new UnionFindOpt(100);
        for (int i = 0; i <= 96; i++) {
            unionFindOpt.union(i, i + 2);
            unionFindOpt.union(i + 1, i + 3);
            i += 1;
        }
        assert unionFindOpt.count() == 2;
        int num = 58;
        assert unionFindOpt.connected(num/2, num/2+4);
        assert unionFindOpt.connected(num, num/2+3);
        assert !unionFindOpt.connected(num, num/2+4);
    }
}
