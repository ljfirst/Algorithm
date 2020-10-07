package UnitTest.AlgorithmTest.dynamicTest.largestSquareTest;

import Algorithm.dynamic.largestSquare.LargestSquareDynamicOpt;
import org.junit.Test;

/**
 * @author liujun
 * @version 1.0
 * @date 2020/6/3
 * @author—Email liujunfirst@outlook.com
 * @blogURL https://blog.csdn.net/ljfirst
 * @description
 */
public class LargestSquareDynamicOptTest extends LargestSquareTest {
    LargestSquareDynamicOpt largestSquareDynamicOpt = new LargestSquareDynamicOpt();

    @Test
    public void testSolution() {
        super.testSolution(largestSquareDynamicOpt);
    }
}
