package UnitTest.DatastructureTest.sortTest.innerSortTest;

import DataStructure.sort.innerSort.SortInterface;
import UnitTest.DatastructureTest.ArrayTestDemoData;
import org.junit.Assert;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.State;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 * @author liujun
 * @version 1.0
 * @date 2020-02-11 14:59
 * @author—Email liujunfirst@outlook.com
 * @description
 * @blogURL
 */
//@State(Scope.Thread)
public class SortTest {

    int[] arraydata;
    int[] expected;

    public void TestInnerSortRealize(SortInterface sortInterface) {
        try {
            List list = ArrayTestDemoData.getDataArray();
            Map<String, int[]> mapArray = (Map<String, int[]>) list.get(0);
            Map<String, int[]> mapExpected = (Map<String, int[]>) list.get(1);
            for (String arrayKey : mapArray.keySet()) {
                arraydata = mapArray.get(arrayKey);
                sortInterface.sortMethod(arraydata);
                expected = mapExpected.get(arrayKey);
                Assert.assertArrayEquals(arraydata, expected);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
