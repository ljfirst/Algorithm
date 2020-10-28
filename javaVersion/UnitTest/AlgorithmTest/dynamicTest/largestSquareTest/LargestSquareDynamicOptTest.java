package UnitTest.AlgorithmTest.dynamicTest.largestSquareTest;

import Algorithm.dynamic.largestSquare.LargestSquare_DynamicOpt;
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
    LargestSquare_DynamicOpt largestSquareDynamicOpt = new LargestSquare_DynamicOpt();

    @Test
    public void testSolution() {
        super.testSolution(largestSquareDynamicOpt);
    }
}
