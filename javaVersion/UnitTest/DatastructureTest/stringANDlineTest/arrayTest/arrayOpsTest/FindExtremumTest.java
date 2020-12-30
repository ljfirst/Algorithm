package UnitTest.DatastructureTest.stringANDlineTest.arrayTest.arrayOpsTest;

import DataStructure.stringANDline.array.arrayOps.FindExtremum;
import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/**
 * @author liujun
 * @version 1.0
 * @date 2020/9/3
 * @author—Email liujunfirst@outlook.com
 * @blogURL https://blog.csdn.net/ljfirst
 * @description 寻找极值 测试案例
 */
public class FindExtremumTest {

    FindExtremum fe = new FindExtremum();

    @Test
    public void testgetMax() {
        int target = fe.getMax(demo01);
        assert target == valuemax01;
        target = fe.getMax(demo02);
        assert target == valuemax02;
        target = fe.getMax(demo03);
        assert target == valuemax03;
        target = fe.getMax(demo031);
        assert target == valuemax031;
        target = fe.getMax(demo04);
        assert target == valuemax04;
        target = fe.getMax(demo05);
        assert target == valuemax05;
        target = fe.getMax(demo06);
        assert target == valuemax06;
    }

    @Test
    public void testMin01() throws Exception {
        testMin("getMin1");
    }

    @Test
    public void testMin02() throws Exception {
        testMin("getMin2");
    }

    @Test
    public void testMin03() throws Exception {
        testMin("getMin3");
    }

    public void testMin(String method0) throws Exception {
        Class clz = Class.forName("DataStructure.stringANDline.array.arrayOps.FindExtremum");
        //反射获取方法，需要注意属性：int[].class
        Method method = clz.getMethod(method0, int[].class);
        Constructor appleConstructor = clz.getConstructor();
        Object findExtremum = appleConstructor.newInstance();

        int target = (int) method.invoke(findExtremum, demo01);
        assert target == valuemin01;
        target = (int) method.invoke(findExtremum, demo02);
        assert target == valuemin02;
        target = (int) method.invoke(findExtremum, demo03);
        assert target == valuemin03;
        target = (int) method.invoke(findExtremum, demo031);
        assert target == valuemin031;
        target = (int) method.invoke(findExtremum, demo04);
        assert target == valuemin04;
        target = (int) method.invoke(findExtremum, demo05);
        assert target == valuemin05;
        target = (int) method.invoke(findExtremum, demo051);
        assert target == valuemin051;
        target = (int) method.invoke(findExtremum, demo06);
        assert target == valuemin06;
    }

    int[] demo01 = {};
    int valuemin01 = Integer.MIN_VALUE;
    int valuemax01 = Integer.MIN_VALUE;
    int[] demo02 = null;
    int valuemin02 = Integer.MIN_VALUE;
    int valuemax02 = Integer.MIN_VALUE;
    int[] demo03 = {1, 2};
    int valuemin03 = 1;
    int valuemax03 = 1;
    int[] demo031 = {1};
    int valuemin031 = Integer.MIN_VALUE;
    int valuemax031 = Integer.MIN_VALUE;
    int[] demo04 = {-5, 0, 5, 1};
    int valuemin04 = 1;
    int valuemax04 = 10;
    int[] demo05 = {-100, 244, 544, -1, 1, 45, 90, 4567, 76};
    int valuemin05 = 2;
    int valuemax05 = 4667;
    int[] demo051 = {-100, 244, 544, -1, 45, 90, 4567, 1, 76};
    int valuemin051 = 2;
    int valuemax051 = 4667;
    int[] demo06 = {-2345, -356, -7654, -5667, 6_5435, 100_0000, -100, 244, 544, -2, 2, 45, 90, 4567, 76};
    int valuemin06 = 4;
    int valuemax06 = 100_7654;
    //期望输出10 - 7 = 3
    int[] demo07 = {15, 7, -640, 10, 80, -2, 33, 25, 41, -5, 84, 22};
    int valuemin07 = 3;
    int valuemax07 = 100_7654;

}
