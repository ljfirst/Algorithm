package UnitTest.DatastructureTest.stringANDlineTest.arrayTest.doublePointTest;

import DataStructure.stringANDline.array.doublePoint.Find3ValueinArray;
import org.junit.Test;

import java.util.Arrays;

/**
 * @author liujun
 * @version 1.0
 * @date 2020/7/22
 * @author—Email liujunfirst@outlook.com
 * @blogURL https://blog.csdn.net/ljfirst
 * @description
 */
public class Find3ValueinArrayTest {

    Find3ValueinArray f = new Find3ValueinArray();

    @Test
    public void testExist() {
        boolean flag = f.exist(source01, findValue01);
        assert flag;
        int[] target = f.getValuePosition(source01, findValue01);
        assert Arrays.equals(target, position01);

        flag = f.exist(source02, findValue02);
        assert !flag;
        target = f.getValuePosition(source02, findValue02);
        assert Arrays.equals(target, position02);

        flag = f.exist(source03, findValue03);
        assert !flag;
        target = f.getValuePosition(source03, findValue03);
        assert Arrays.equals(target, position03);

        flag = f.exist(source04, findValue04);
        assert flag;
        target = f.getValuePosition(source04, findValue04);
        assert Arrays.equals(target, position04);

        flag = f.exist(source05, findValue05);
        assert flag;
        target = f.getValuePosition(source05, findValue05);
        assert Arrays.equals(target, position05);

        flag = f.exist(source06, findValue06);
        assert flag;
        target = f.getValuePosition(source06, findValue06);
        assert Arrays.equals(target, position06);

        flag = f.exist(source07, findValue07);
        assert !flag;
        target = f.getValuePosition(source07, findValue07);
        assert Arrays.equals(target, position07);
    }

    int[] source01 = {34, 5, 6, 78, 7, 65, 43, 4, 56, 789, 65, 41};
    int[] position01 = {1, 2, 4};
    int findValue01 = 18;
    int[] source02 = {};
    int[] position02 = {};
    int findValue02 = 20;
    int[] source03 = null;
    int[] position03 = {};
    int findValue03 = 20;

    int[] source04 = {5, 46, 78, 9, 6, 5, 67, 68, 95, 657, 89};
    int[] position04 = {0, 4, 9};
    int findValue04 = 668;
    int[] source05 = {654, 5, 67, 86, 54, 56, 78, 65, 44, 50, 789, 765, 44, 59, 78, 98, 76, 54, 3};
    int[] position05 = {1, 5, 18};
    int findValue05 = 64;
    int[] source06 = {2, 3};
    int[] position06 = {};
    int findValue06 = 8;

    int[] source07 = {654, 5, 67, 86, 54, 56, 78, 65, 44, 56, 789, 765, 44, 56, 78, 98, 76, 54, 3};
    int[] position07 = {-1, -1, -1};
    int findValue07 = 6758;
}
