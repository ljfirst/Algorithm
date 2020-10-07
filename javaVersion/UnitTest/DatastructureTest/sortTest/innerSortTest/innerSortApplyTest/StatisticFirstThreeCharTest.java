package UnitTest.DatastructureTest.sortTest.innerSortTest.innerSortApplyTest;

import DataStructure.sort.innerSort.innerSortApply.StatisticFirstThreeChar;
import org.junit.Test;

/**
 * @author liujun
 * @version 1.0
 * @date 2019 11 24 17:34
 * @author—Email  liujunfirst@outlook.com
 * @description 
 * @blogURL
 */
public class StatisticFirstThreeCharTest {

    StatisticFirstThreeChar sftc = new StatisticFirstThreeChar();

    @Test
    public void TeststatisticCharbyMap() {

        char c = sftc.statisticCharbyMap(demo01);
        assert c == ' ';
        c = sftc.statisticCharbyMap(demo02);
        assert c == ' ';
        c = sftc.statisticCharbyMap(demo03);
        assert c == ' ';
        c = sftc.statisticCharbyMap(demo04);
        assert c == ' ';
        c = sftc.statisticCharbyMap(demo05);
        assert c == 'g';
        c = sftc.statisticCharbyMap(demo06);
        assert c == 'e';
    }

    @Test
    public void TeststatisticCharbyBucket() {
        char c = sftc.statisticCharbyBucket(demo01);
        assert c == ' ';
        c = sftc.statisticCharbyBucket(demo02);
        assert c == ' ';
        c = sftc.statisticCharbyBucket(demo03);
        assert c == ' ';
        c = sftc.statisticCharbyBucket(demo04);
        assert c == ' ';
        c = sftc.statisticCharbyBucket(demo05);
        assert c == 'g';
        c = sftc.statisticCharbyBucket(demo06);
        assert c == 'e';
    }

    //测试用例
    String demo01 = null;
    String demo02 = "";
    String demo03 = "aassddffgghhjjkkll";//没有出现三次的字母
    String demo04 = "aa1ss2dd3ff4gg5hh666jj7kk8ll9";//没有出现三次的字母
    String demo05 = "aa1ss2dd3ff4ggg5hh666jj7kk8ll9";//ggg
    String demo06 = "Have you ever gone shopping and";//e
}