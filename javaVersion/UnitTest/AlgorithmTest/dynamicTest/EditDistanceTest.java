package UnitTest.AlgorithmTest.dynamicTest;

import Algorithm.dynamic.EditDistance;
import org.junit.Test;

/**
 * @author liujun
 * @version 1.0
 * @date： 2019-12-06 22:05
 * @author—Email liujunfirst@outlook.com
 * @description
 * @blogURL
 */
public class EditDistanceTest {
    EditDistance editDistance = new EditDistance();

    @Test
    public void editDistanceTest() {
        int count = editDistance.countDistance(demo01_1, demo01_2);
        assert count == 3;
        count = editDistance.countDistance(demo02_1, demo02_2);
        assert count == 1;
        count = editDistance.countDistance(demo03_1, demo03_2);
        assert count == 4;
        count = editDistance.countDistance(demo04_1, demo04_2);
        assert count == 2;
    }

    String demo01_1 = "kitten";
    String demo01_2 = "sitting";
    String demo02_1 = "liujun";
    String demo02_2 = "liuju";
    String demo03_1 = "ljfirst";
    String demo03_2 = "firstll";
    String demo04_1 = "ljfirst";
    String demo04_2 = "ljfeirrt";

}
