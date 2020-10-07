package UnitTest.AlgorithmTest.dynamicTest.largestSquareTest;

import Algorithm.dynamic.largestSquare.LargestSquareViolence;
import org.junit.Test;

/**
 * @author liujun
 * @version 1.0
 * @date 2020/6/3
 * @author—Email liujunfirst@outlook.com
 * @blogURL https://blog.csdn.net/ljfirst
 * @description
 */
public class LargestSquareViolenceTest extends LargestSquareTest {
    Algorithm.dynamic.largestSquare.LargestSquareViolence LargestSquareViolence = new LargestSquareViolence();

    @Test
    public void testSolution() {
        super.testSolution(LargestSquareViolence);
    }

    //UT：暴力循环扫描法（含冗余扫描）
    @Test
    public void getMaxSideLengthViolenceTest(){
        //测试用例01，起始点:(0，0),最大边长:2，期望值为2
        int bound_value = LargestSquareViolence.getMaxSideLengthViolence(Square_Test01,0,0);
        assert bound_value == 2;

        //测试用例02：起始点:(1，1),最大边长:3,期望值为3
        Square_Test01 = null;
        bound_value = LargestSquareViolence.getMaxSideLengthViolence(Square_Test02,1,1);
        assert bound_value == 3;

        //测试用例03：起始点:无或者(0,0),最大边长:0,期望值为0
        bound_value = LargestSquareViolence.getMaxSideLengthViolence(Square_Test03,0,0);
        assert bound_value == -1;

        //测试用例04：起始点:(5,5),最大边长:0,越界，期望值为0
        bound_value = LargestSquareViolence.getMaxSideLengthViolence(Square_Test04,5,5);
        assert bound_value == -2;

        //测试用例05：起始点:(2，1),最大边长:2,
        bound_value = LargestSquareViolence.getMaxSideLengthViolence(Square_Test05,2,1);
        assert bound_value == 2;

        //测试用例06：起始点:(1，1),最大边长:2,期望值为2
        bound_value = LargestSquareViolence.getMaxSideLengthViolence(Square_Test06,1,1);
        assert bound_value == 2;

        //测试用例07：起始点:(1，1),最大边长:2,期望值为2
        bound_value = LargestSquareViolence.getMaxSideLengthViolence(Square_Test07,1,1);
        assert bound_value == 2;
    }

    //逐层扫描法
    @Test
    public void getMaxSideLengthScannerTest(){
        //测试用例01，起始点:(0，0),最大边长:2，期望值为2
        int bound_value = LargestSquareViolence.getMaxSideLengthScanner(Square_Test01,0,0);
        assert bound_value == 2;

        //测试用例02：起始点:(1，1),最大边长:3,期望值为3
        Square_Test01 = null;
        bound_value = LargestSquareViolence.getMaxSideLengthScanner(Square_Test02,1,1);
        assert bound_value == 3;

        //测试用例03：起始点:无或者(0,0),最大边长:0,期望值为0
        bound_value = LargestSquareViolence.getMaxSideLengthScanner(Square_Test03,0,0);
        assert bound_value == -1;

        //测试用例04：起始点:(5,5),最大边长:0,越界，期望值为0
        bound_value = LargestSquareViolence.getMaxSideLengthScanner(Square_Test04,5,5);
        assert bound_value == -2;

        //测试用例05：起始点:(2，1),最大边长:2,期望值为2
        bound_value = LargestSquareViolence.getMaxSideLengthScanner(Square_Test05,2,1);
        assert bound_value == 2;

        //测试用例06：起始点:(1，1),最大边长:2,期望值为2
        bound_value = LargestSquareViolence.getMaxSideLengthScanner(Square_Test06,1,1);
        assert bound_value == 2;

        //测试用例07：起始点:(1，1),最大边长:2,期望值为2
        bound_value = LargestSquareViolence.getMaxSideLengthScanner(Square_Test07,1,1);
        assert bound_value == 2;
    }

    //最大长度限制法
    @Test
    public void getMaxSideLengthLimit(){
        //测试用例01，起始点:(0，0),最大边长:2，期望值为2
        int bound_value = LargestSquareViolence.getMaxSideLengthLimit(Square_Test01,0,0);
        assert bound_value == 2;

        //测试用例02：起始点:(1，1),最大边长:3,期望值为3
        Square_Test01 = null;
        bound_value = LargestSquareViolence.getMaxSideLengthLimit(Square_Test02,1,1);
        assert bound_value == 3;

        //测试用例03：起始点:无或者(0,0),最大边长:0,期望值为0
        bound_value = LargestSquareViolence.getMaxSideLengthLimit(Square_Test03,0,0);
        assert bound_value == -1;

        //测试用例04：起始点:(5,5),最大边长:0,越界，期望值为0
        bound_value = LargestSquareViolence.getMaxSideLengthLimit(Square_Test04,5,5);
        assert bound_value == -2;

        //测试用例05：起始点:(2，1),最大边长:2,期望值为2
        bound_value = LargestSquareViolence.getMaxSideLengthLimit(Square_Test05,2,1);
        assert bound_value == 2;

        //测试用例06：起始点:(1，1),最大边长:2,期望值为2
        bound_value = LargestSquareViolence.getMaxSideLengthLimit(Square_Test06,1,1);
        assert bound_value == 2;

        //测试用例07：起始点:(1，1),最大边长:2,期望值为2
        bound_value = LargestSquareViolence.getMaxSideLengthLimit(Square_Test07,1,1);
        assert bound_value == 2;
    }
}
