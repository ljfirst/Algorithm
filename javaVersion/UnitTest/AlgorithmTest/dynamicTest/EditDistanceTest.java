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
        int count = editDistance.countDistance(demo011, demo012);
        assert count == 3;
    }

    String demo011 = "kitten";
    String demo012 = "sitting";

}
