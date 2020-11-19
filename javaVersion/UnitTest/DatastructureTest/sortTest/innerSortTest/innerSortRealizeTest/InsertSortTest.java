package UnitTest.DatastructureTest.sortTest.innerSortTest.innerSortRealizeTest;

import DataStructure.sort.innerSort.innerSortRealize.InsertSort;
import DataStructure.stringANDline.list.Listlj;
import DataStructure.stringANDline.list.listRealize.SinglyLinkedList;
import UnitTest.DatastructureTest.sortTest.innerSortTest.InnerSortRealizeTestData;
import UnitTest.DatastructureTest.stringANDlineTest.listTest.ListljTest;
import com.google.common.collect.Maps;
import org.junit.Test;
import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Mode;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * @author liujun
 * @version 1.0
 * @date 2020-02-11 15:12
 * @author-Email liujunfirst@outlook.com
 * @description
 * @blogURL
 */
public class InsertSortTest extends InnerSortRealizeTestData {

    @Test
    @Benchmark
    @BenchmarkMode(Mode.Throughput)
    public void TestInnerSortRealize() {
        super.TestInnerSortRealize(new InsertSort());
    }

    Listlj listlj = new SinglyLinkedList();
    InsertSort insertSort = new InsertSort();

    @Test
    public void TestInsertSortLinkedList() throws Exception {
        Class c = Class.forName("UnitTest.DatastructureTest.stringANDlineTest.listTest.ListljTest");
        ListljTest gg = (ListljTest) c.newInstance();
        Field[] f = c.getDeclaredFields();
        for (Field f1 : f) {
            if (f1.getName().contains("array0")) {
                Method m = c.getMethod("get" + getMethodName(f1.getName()));
                Object o = m.invoke(gg);
                if (o != null && o instanceof int[]) {
                    int[] array = (int[]) m.invoke(gg);
                    testEquals(array);
                }
            }
        }
    }

    //将首字母大写
    private String getMethodName(String fildeName) throws Exception {
        byte[] items = fildeName.getBytes();
        items[0] = (byte) ((char) items[0] - 'a' + 'A');
        return new String(items);
    }

    @Test
    public void TestInsertSortLinkedList1() throws Exception {
        Map map = getSortTestData();
        for (Object o : map.keySet()) {
            int[] array = (int[]) map.get(o);
            testEquals(array);
        }
    }

    private boolean testEquals(int[] array) {
        int[] Arr = Arrays.copyOf(array, array.length);
        insertSort.sortMethod(Arr);
        listlj.clear();
        listlj.insert(true, array);
        insertSort.sortMethod(listlj);
        int[] targetArr = listlj.toarray();
        return Arrays.equals(targetArr, Arr);
    }

    private Map getSortTestData() throws Exception {
        Class c = Class.forName("UnitTest.DatastructureTest.stringANDlineTest.listTest.ListljTest");
        ListljTest gg = (ListljTest) c.newInstance();
        Field[] f = c.getDeclaredFields();
        Map<String, Object> map = Arrays.stream(f)
                .filter(x -> x.getName().contains("array0"))
                .collect(Collectors.toMap(Field::getName, field -> {
                    Object resultObj = null;
                    field.setAccessible(true);
                    try {
                        resultObj = field.get(gg);
                    } catch (IllegalArgumentException e) {
                        e.printStackTrace();
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    }
                    return Optional.ofNullable(resultObj).orElse(0);
                }, (k1, k2) -> k2));
        return map;
    }
}
