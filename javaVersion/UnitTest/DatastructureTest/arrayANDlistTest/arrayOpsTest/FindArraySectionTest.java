package UnitTest.DatastructureTest.arrayANDlistTest.arrayOpsTest;

import DataStructure.arrayANDlist.arrayOps.FindArraySection;
import org.junit.Test;
import java.util.Arrays;

/**
 * @author liujun
 * @version 1.0
 * @date 2021/1/5
 * @author—Email liujunfirst@outlook.com
 * @blogURL https://blog.csdn.net/ljfirst
 * @description 查找给定值的数组区间 测试案例
 */
public class FindArraySectionTest {

    FindArraySection fa = new FindArraySection();

    @Test
    public void test() {
        int[] answer = fa.getSection(demo01, 2);
        assert Arrays.equals(answer, target01);
        answer = fa.getSection(demo02, 2);
        assert Arrays.equals(answer, target02);
        answer = fa.getSection(demo03, 8);
        assert Arrays.equals(answer, target03);
        answer = fa.getSection(demo04, 6);
        assert Arrays.equals(answer, target04);
        answer = fa.getSection(demo05, 7);
        assert Arrays.equals(answer, target05);
        answer = fa.getSection(demo06, 9);
        assert Arrays.equals(answer, target06);
    }

    int[] demo01 = {};
    int[] target01 = new int[]{};
    int[] demo02 = null;
    int[] target02 = new int[]{};
    int[] demo03 = {5, 7, 7, 8, 8, 10};
    int[] target03 = new int[]{3, 4};
    int[] demo04 = {5, 7, 7, 8, 8, 10};
    int[] target04 = new int[]{-1, -1};
    int[] demo05 = {1, 2, 2, 3, 4, 4, 5, 5, 6, 6, 6, 7, 7, 7, 8, 8, 9, 9};
    int[] target05 = new int[]{11, 13};
    int[] demo06 = {
            1, 2, 1, 2, 2, 2, 2, 3, 3, 3,
            4, 4, 4, 4, 5, 5, 5, 5, 6, 6,
            6, 6, 7, 7, 7, 7, 8, 8, 8, 9,
            9, 9, 9, 9, 9, 9, 9, 9, 9, 9};
    int[] target06 = new int[]{29, 39};
}
