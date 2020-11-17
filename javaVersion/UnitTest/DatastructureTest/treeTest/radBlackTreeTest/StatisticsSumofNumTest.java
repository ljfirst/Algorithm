package UnitTest.DatastructureTest.treeTest.radBlackTreeTest;

import DataStructure.tree.redBlackTree.StatisticsSumofNum;
import org.junit.Test;

/**
 * @author liujun
 * @date 2020-02-22 22:59
 * @description
 */
public class StatisticsSumofNumTest {

    StatisticsSumofNum sumofNum = new StatisticsSumofNum();

    @Test
    public void Testcount() {
        int value = sumofNum.count(Demo01);
        assert value == 0;
        value = sumofNum.count(Demo02);
        assert value == 0;
        value = sumofNum.count(Demo03);
        assert value == 0;
        value = sumofNum.count(Demo04);
        assert value == 0;
        value = sumofNum.count(Demo05);
        assert value == 18;
        value = sumofNum.count(Demo06);
        assert value == 100;
    }

    String Demo01 = "";
    String Demo02 = null;
    String Demo03 = "333r3g3=333";
    String Demo04 = "9fil3dj11P0jAsf11j ";
    String Demo05 = "2a3c2t3v3g2r2h3u2g2i3l3f2p2p2pppp3r3";
    String Demo06 = "5q5q2a5a3s5a3s2d2d5f3fgs3gh1h3h3h2h4j4j4j3s4d3i4f5u4f5r5t3t6y6r6r6u6d7d7d5x7x8c8f3f9j9g9h5b0b0t" +
            "3g5g3r0r5r9d3d8d6d5g6h7y5e2h6h6c2vb2g1h6y5u6j1k1l1l1d1d1s5a5a5x5c5";
}