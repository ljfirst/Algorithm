package UnitTest.AlgorithmTest.dynamicTest.largestSquareTest;

import Algorithm.dynamic.largestSquare.LargestSquareDynamic;
import org.junit.Test;

/**
 * @author liujun
 * @version 1.0
 * @date 2020/6/3
 * @author—Email liujunfirst@outlook.com
 * @blogURL https://blog.csdn.net/ljfirst
 * @description
 */
public class LargestSquareDynamicTest extends LargestSquareTest{

    LargestSquareDynamic largestSquareDynamic = new LargestSquareDynamic();

    @Test
    public void testSolution(){
        super.testSolution(largestSquareDynamic);
    }
}
