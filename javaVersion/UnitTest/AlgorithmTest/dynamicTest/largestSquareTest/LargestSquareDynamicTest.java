package UnitTest.AlgorithmTest.dynamicTest.largestSquareTest;

import Algorithm.dynamic.largestSquare.LargestSquare_Dynamic;
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

    LargestSquare_Dynamic largestSquareDynamic = new LargestSquare_Dynamic();

    @Test
    public void testSolution(){
        super.testSolution(largestSquareDynamic);
    }
}
