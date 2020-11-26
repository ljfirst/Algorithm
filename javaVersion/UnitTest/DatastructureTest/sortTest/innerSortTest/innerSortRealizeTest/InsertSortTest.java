package UnitTest.DatastructureTest.sortTest.innerSortTest.innerSortRealizeTest;

import DataStructure.sort.innerSort.innerSortRealize.InsertSort;
import DataStructure.stringANDline.list.Listlj;
import DataStructure.stringANDline.list.listRealize.SinglyLinkedList;
import UnitTest.DatastructureTest.sortTest.innerSortTest.SortTest;
import UnitTest.DatastructureTest.stringANDlineTest.listTest.ListljTest;
import org.junit.Test;
import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Mode;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.*;
import java.util.stream.Collectors;

/**
 * @author liujun
 * @version 1.0
 * @date 2020-02-11 15:12
 * @author-Email liujunfirst@outlook.com
 * @description 插入排序的测试案例
 * @blogURL
 */
public class InsertSortTest extends SortTest {

    @Test
    @Benchmark
    @BenchmarkMode(Mode.Throughput)
    public void TestInnerSortRealize() {
        super.TestInnerSortRealize(new InsertSort());
    }

    Listlj listlj = new SinglyLinkedList();
    InsertSort insertSort = new InsertSort();

    @Test
    public void TestInnerSortRealize1() throws Exception {
        //两者不同获取反射结果的方式
        //Map<String, int[]> arrayMap = getSortTestData1();
        Map<String, int[]> arrayMap = getSortTestData2();

        for (String s : arrayMap.keySet()) {
            int[] arr = arrayMap.get(s);
            int[] arrCopy = Arrays.copyOf(arr, arr.length);
            insertSort.sortMethod(arr);
            listlj.clear();
            listlj.insert(false, arrCopy);
            insertSort.sortMethod(listlj);
            int[] targetArr = listlj.toarray();
            assert Arrays.equals(targetArr, arr);
        }
    }

    private Map getSortTestData1() throws Exception {
        Map<String, int[]> map = new HashMap<>();
        Class c = Class.forName("UnitTest.DatastructureTest.stringANDlineTest.listTest.ListljTest");
        Object gg =  c.newInstance();
        Field[] f = c.getDeclaredFields();
        for (Field f1 : f) {
            if (f1.getName().contains("array0")) {
                Method m = c.getMethod("get" + getMethodName(f1.getName()));
                Object o = m.invoke(gg);
                if (o instanceof int[]) {
                    int[] array = (int[]) o;
                    map.put(f1.getName(), array);
                }
            }
        }
        return map;
    }

    //将首字母大写
    private String getMethodName(String fildeName) throws Exception {
        byte[] items = fildeName.getBytes();
        items[0] = (byte) ((char) items[0] - 'a' + 'A');
        return new String(items);
    }


    private Map getSortTestData2() throws Exception {
        Class c = Class.forName("UnitTest.DatastructureTest.stringANDlineTest.listTest.ListljTest");
        ListljTest gg = (ListljTest) c.newInstance();
        Field[] f = c.getDeclaredFields();
        Map<String, Object> map = Arrays.stream(f)
                .filter(x -> x.getName().contains("array0"))
                //此处添加了方法的返回值判断
                .filter(x -> x.getType().getName().equals("[I"))
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
                    return Optional.ofNullable(resultObj).orElse(new int[]{});
                }, (k1, k2) -> k2));
        return map;
    }
}
