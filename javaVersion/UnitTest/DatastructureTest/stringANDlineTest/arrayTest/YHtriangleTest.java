package UnitTest.DatastructureTest.stringANDlineTest.arrayTest;

import DataStructure.stringANDline.array.other.YHtriangle;
import org.junit.Test;

import java.util.Arrays;

/**
 * @author liujun
 * @version 1.0
 * @date 2020/6/30
 * @author—Email liujunfirst@outlook.com
 * @blogURL https://blog.csdn.net/ljfirst
 * @description
 */
public class YHtriangleTest {

    YHtriangle y = new YHtriangle();

    @Test
    public void testprint() {
        int[] ans = y.print(1);
        assert Arrays.equals(ans, demo01);
        ans = y.print(2);
        assert Arrays.equals(ans, demo02);
        ans = y.print(3);
        assert Arrays.equals(ans, demo03);
        ans = y.print(4);
        assert Arrays.equals(ans, demo04);
        ans = y.print(5);
        assert Arrays.equals(ans, demo05);
        ans = y.print(6);
        assert Arrays.equals(ans, demo06);
        ans = y.print(7);
        assert Arrays.equals(ans, demo07);
        ans = y.print(8);
        assert Arrays.equals(ans, demo08);

    }

    int[] demo01 = {1};
    int[] demo02 = {
              1,
            1,  1};
    int[] demo03 = {
              1,
            1,  1,
          1,  2,  1
    };
    int[] demo04 = {
              1,
            1,  1,
          1,  2,  1,
        1,  3,  3,  1
    };
    int[] demo05 = {
              1,
            1,  1,
          1,  2,  1,
        1,  3,  3,  1,
      1,  4,  6,  4,  1
    };
    int[] demo06 = {
              1,
            1,  1,
          1,  2,  1,
        1,  3,  3,  1,
      1,  4,  6,  4,  1,
    1,  5,  10, 10, 5,  1
    };
    int[] demo07 = {
              1,
            1,  1,
          1,  2,  1,
        1,  3,  3,  1,
      1,  4,  6,  4,  1,
    1,  5,  10, 10, 5,  1,
  1,  6,  15, 20, 15, 6,  1
    };
    int[] demo08 = {
              1,
            1,  1,
          1,  2,  1,
        1,  3,  3,  1,
      1,  4,  6,  4,  1,
    1,  5,  10, 10, 5,  1,
  1,  6,  15, 20, 15, 6,  1,
1,  7,  21, 35, 35, 21, 7,  1
    };
}
