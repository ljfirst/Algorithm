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
        assert value == ans01;
        value = sumofNum.count(Demo02);
        assert value == ans02;
        value = sumofNum.count(Demo03);
        assert value == ans03;
        value = sumofNum.count(Demo04);
        assert value == ans04;
        value = sumofNum.count(Demo05);
        assert value == ans05;
    }

    String Demo01 = "";
    int ans01 = 0;
    String Demo02 = null;
    int ans02 = 0;
    String Demo03 = "333r3g3=333";
    int ans03 = 0;

    String Demo04 = "9fil3dj11P0jAsf11j ";
    int ans04 = 0;
    String Demo05 = "2a3c2t3v3g2r2h3u2g2i3l3f2p2p2pppp3r3";
    int ans05 = 18;
}