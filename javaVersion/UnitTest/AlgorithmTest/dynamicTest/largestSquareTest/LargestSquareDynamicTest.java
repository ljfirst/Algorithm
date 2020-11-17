package UnitTest.AlgorithmTest.dynamicTest.largestSquareTest;

import Algorithm.dynamic.largestSquare.LargestSquare_Dynamic;
import org.junit.Test;

/**
 * @author liujun
 * @version 1.0
 * @date 2020/6/3
 * @author—Email liujunfirst@outlook.com
 * @blogURL https://blog.csdn.net/ljfirst
 * @description 最大正方形的测试案例
 */
public class LargestSquareDynamicTest extends LargestSquareTest{

    @Test
    public void testSolution(){
        super.testSolution(new LargestSquare_Dynamic());
    }
}
