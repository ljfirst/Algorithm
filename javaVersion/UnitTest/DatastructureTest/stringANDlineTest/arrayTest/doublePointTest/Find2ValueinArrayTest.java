package UnitTest.DatastructureTest.stringANDlineTest.arrayTest.doublePointTest;

import DataStructure.stringANDline.array.doublePoint.Find2ValueinArray;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * @author liujun
 * @version 1.0
 * @date 2020/7/22
 * @author—Email liujunfirst@outlook.com
 * @blogURL https://blog.csdn.net/ljfirst
 * @description 2数之和 测试案例
 * 给定一个数 target，在一维数组中，找出某 2 个数相加得 target。
 * 要求一：如果存在这个 2 个数，返回true，反则返回false。
 * 要求二：返回存在的这 2 个值
 * 要求三：返回存在的这 2 个值在数组中的原位置
 * 要求四：返回所有的 2 数之和的组合
 * 要求五：返回所有的 2 数之和在数组中原位置的组合
 */
public class Find2ValueinArrayTest extends FindValueinArrayTest {

    Find2ValueinArray f = new Find2ValueinArray();

    /**
     * @return 如果存在这个 n 个数，返回true，反则返回false。
     */
    @Test
    public void testexist() {
        boolean flag = f.exist(demoArray01_y, target01_2_y);
        assert flag;
        flag = f.exist(demoArray02_y, target01_2_y);
        assert flag;
        flag = f.exist(demoArray03_y, target03_2_y);
        assert flag;

        flag = f.exist(demoArray01_n, target01_n_all);
        assert !flag;
        flag = f.exist(demoArray02_n, target02_n_all);
        assert !flag;
        flag = f.exist(demoArray03_n, target03_n_all);
        assert !flag;
    }

    /**
     * @return 返回所有的 n 数之和的组合
     */
    @Test
    public void getValues() {

        List list = f.getValues(demoArray01_y, target01_2_y);
        for (int i = 0; i < list.size(); i++) {
            assert Arrays.equals((int[]) list.get(i), value01_2_y.get(i));
        }

        list = f.getValues(demoArray01_y, target01_2s_y);
        for (int i = 0; i < list.size(); i++) {
            assert Arrays.equals((int[]) list.get(i), value01_2s_y.get(i));
        }

        list = f.getValues(demoArray02_y, target02_2_y);
        for (int i = 0; i < list.size(); i++) {
            assert Arrays.equals((int[]) list.get(i), value02_2_y.get(i));
        }

        list = f.getValues(demoArray02_y, target02_2s_y);
        for (int i = 0; i < list.size(); i++) {
            assert Arrays.equals((int[]) list.get(i), value02_2s_y.get(i));
        }

        list = f.getValues(demoArray03_y, target03_2_y);
        for (int i = 0; i < list.size(); i++) {
            assert Arrays.equals((int[]) list.get(i), value03_2_y.get(i));
        }

        list = f.getValues(demoArray01_n, target01_n_all);
        assert list == null;
        list = f.getValues(demoArray02_n, target02_n_all);
        assert list == null;
        list = f.getValues(demoArray03_n, target03_n_all);
        assert list == null;
    }

    /**
     * @return 返回所有的 n 数之和在数组中原位置的组合
     */
    @Test
    public void getPositions() {

       /* int[] position = f.getValue(demoArray01_y, target01_2_y);
        assert Arrays.equals(position, position01_2_y);
        position = f.getValue(demoArray02_y, target02_2_y);
        assert Arrays.equals(position, position02_2_y);
        position = f.getValue(demoArray03_y, target03_2_y);
        assert Arrays.equals(position, position03_2_y);

        position = f.getValue(demoArray01_n, target01_n_all);
        assert Arrays.equals(position, position01_2_all);
        position = f.getValue(demoArray02_n, target02_n_all);
        assert Arrays.equals(position, position01_2_all);
        position = f.getValue(demoArray03_n, target03_n_all);
        assert Arrays.equals(position, position01_2_all);*/
        List list = f.getPositions(demoArray01_y, target01_2s_y);
        Object[] arr = list.stream().sorted().toArray();
        Object[] arr1 = position01_2s_y.stream().sorted().toArray();
        assert Arrays.equals(arr, arr1);

        list = f.getPositions(demoArray02_y, target02_2s_y);
        arr = list.stream().sorted().toArray();
        arr1 = position02_2s_y.stream().sorted().toArray();
        assert Arrays.equals(arr, arr1);


        list = f.getPositions(demoArray01_n, target01_2s_y);
        assert list == position03_2s_all;
        list = f.getPositions(demoArray02_n, target02_2s_y);
        assert list == position03_2s_all;
    }
}
