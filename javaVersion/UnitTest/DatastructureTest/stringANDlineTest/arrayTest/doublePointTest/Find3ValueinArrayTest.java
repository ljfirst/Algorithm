package UnitTest.DatastructureTest.stringANDlineTest.arrayTest.doublePointTest;

import DataStructure.stringANDline.array.doublePoint.Find3ValueinArray;
import DataStructure.stringANDline.array.doublePoint.FindValueinArray;
import UnitTest.DatastructureTest.ArrayTestDemoData;
import com.sun.xml.internal.ws.server.provider.ProviderInvokerTube;
import org.junit.Test;

import java.security.PublicKey;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author liujun
 * @version 1.0
 * @date 2020/7/22
 * @author—Email liujunfirst@outlook.com
 * @blogURL https://blog.csdn.net/ljfirst
 * @description 三数之和为给定值 测试案例
 */

public class Find3ValueinArrayTest extends FindValueinArrayTest {

    Find3ValueinArray f = new Find3ValueinArray();

    /**
     * @return 如果存在这个 n 个数，返回true，反则返回false。
     */
    @Test
    public void testexist() {
        boolean flag = f.exist(demoArray01_y, target01_3_y);
        assert flag;
        flag = f.exist(demoArray02_y, target02_3_y);
        assert flag;
        flag = f.exist(demoArray03_y, target03_3_y);
        assert flag;

        flag = f.exist(demoArray01_n, target01_n_all);
        assert !flag;
        flag = f.exist(demoArray02_n, target02_n_all);
        assert !flag;
        flag = f.exist(demoArray03_n, target03_n_all);
        assert !flag;
    }

    /**
     * @return 返回存在的这 n 个值
     */
    @Test
    public void testgetValue() {
        int[] values = f.getValue(demoArray01_y, target01_3_y);
        assert Arrays.equals(values, value01_3_y);
        values = f.getValue(demoArray02_y, target02_3_y);
        assert Arrays.equals(values, value02_3_y);
        values = f.getValue(demoArray03_y, target03_3_y);
        assert Arrays.equals(values, value03_3_y);

        values = f.getValue(demoArray01_n, target01_n_all);
        assert Arrays.equals(values, value01_2_all);
        values = f.getValue(demoArray02_n, target02_n_all);
        assert Arrays.equals(values, value01_2_all);
        values = f.getValue(demoArray03_n, target03_n_all);
        assert Arrays.equals(values, value01_2_all);
    }

    /**
     * @return 返回存在的这 n 个值在数组中的原位置
     */
    @Test
    public void getPosition() {
        int[] position = f.getValue(demoArray01_y, target01_3_y);
        assert Arrays.equals(position, position01_3_y);
        position = f.getValue(demoArray02_y, target02_3_y);
        assert Arrays.equals(position, position02_3_y);
        position = f.getValue(demoArray03_y, target03_3_y);
        assert Arrays.equals(position, position03_3_y);

        position = f.getValue(demoArray01_n, target01_n_all);
        assert Arrays.equals(position, position01_2_all);
        position = f.getValue(demoArray02_n, target02_n_all);
        assert Arrays.equals(position, position01_2_all);
        position = f.getValue(demoArray03_n, target03_n_all);
        assert Arrays.equals(position, position01_2_all);
    }

    /**
     * @return 返回所有的 n 数之和的组合
     */
    @Test
    public void getValues() {
        List list = f.getValues(demoArray01_y, target01_2s_y);
        Object[] arr = list.stream().sorted().toArray();
        Object[] arr1 = value01_2s_y.stream().sorted().toArray();
        assert Arrays.equals(arr, arr1);

        list = f.getValues(demoArray02_y, target02_2s_y);
        arr = list.stream().sorted().toArray();
        arr1 = value02_2s_y.stream().sorted().toArray();
        assert Arrays.equals(arr, arr1);

        list = f.getValues(demoArray03_y, target03_2s_y);
        arr = list.stream().sorted().toArray();
        arr1 = value03_2s_y.stream().sorted().toArray();
        assert Arrays.equals(arr, arr1);

        list = f.getValues(demoArray01_n, target01_n_all);
        assert list == value01_2s_all;
        list = f.getValues(demoArray02_n, target02_n_all);
        assert list == value01_2s_all;
        list = f.getValues(demoArray03_n, target03_n_all);
        assert list == value01_2s_all;
    }

    /**
     * @return 返回所有的 n 数之和在数组中原位置的组合
     */
    @Test
    public void getPositions() {
        List list = f.getPositions(demoArray01_y, target01_2s_y);
        Object[] arr = list.stream().sorted().toArray();
        Object[] arr1 = position01_2s_y.stream().sorted().toArray();
        assert Arrays.equals(arr, arr1);

        list = f.getPositions(demoArray02_y, target02_2s_y);
        arr = list.stream().sorted().toArray();
        arr1 = position02_2s_y.stream().sorted().toArray();
        assert Arrays.equals(arr, arr1);

        list = f.getPositions(demoArray03_y, target03_2s_y);
        arr = list.stream().sorted().toArray();
        arr1 = position03_2s_y.stream().sorted().toArray();
        assert Arrays.equals(arr, arr1);

        list = f.getPositions(demoArray01_n, target01_2s_y);
        assert list == position03_2s_all;
        list = f.getPositions(demoArray02_n, target02_2s_y);
        assert list == position03_2s_all;
        list = f.getPositions(demoArray03_n, target03_2s_y);
        assert list == position03_2s_all;
    }
}
