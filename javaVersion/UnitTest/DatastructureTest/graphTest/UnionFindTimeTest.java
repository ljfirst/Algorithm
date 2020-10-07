package UnitTest.DatastructureTest.graphTest;

import DataStructure.graph.graphConnection.unionFind.UnionFind;
import DataStructure.graph.graphConnection.unionFind.UnionFindOpt;
import org.junit.Test;

/**
 * @author liujun
 * @version 1.0
 * @date 2019-12-18 23:27
 * @author¡ªEmail liujunfirst@outlook.com
 * @description 
 * @blogURL
 */
public class UnionFindTimeTest {
    int num = 1000000;
    UnionFind unionFind = new UnionFind(num);
    UnionFindOpt unionFindOpt = new UnionFindOpt(num);

    @Test
    public void TestTimeUnionFind(){
        long timeBegin = System.nanoTime();
        for (int i = 0; i <= num - 3; i++) {
            unionFind.union(i, i + 2);
            unionFind.union(i + 1, i + 3);
            i += 1;
        }
        assert unionFind.count() == 2;
        num /= 2;
        assert unionFind.connected(num/2, num/2+2);
        assert unionFind.connected(num/2+1, num/2+3);
        assert !unionFind.connected(num/2, num/2+1);
        long timecount = System.nanoTime() - timeBegin;
        System.out.println("unionFind:   "+timecount);
    }

    @Test
    public void TestTimeUnionFindOpt(){
        long timeBegin = System.nanoTime();
        num = 1000000;
        timeBegin = System.nanoTime();
        for (int i = 0; i <= num - 3; i++) {
            unionFindOpt.union(i, i + 2);
            unionFindOpt.union(i + 1, i + 3);
            i += 1;
        }
        assert unionFindOpt.count() == 2;
        num /= 2;
        assert unionFindOpt.connected(num/2, num/2+2);
        assert unionFindOpt.connected(num/2+1, num/2+3);
        assert !unionFindOpt.connected(num/2, num/2+1);
        long timecount1 = System.nanoTime() - timeBegin;
        System.out.println("unionFindOpt:"+timecount1);
    }
}