package UnitTest.DatastructureTest.stackHeapQueueTest.stackTest;

import DataStructure.stackHeapQueue.stack.MonotonousStack;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author liujun
 * @version 1.0
 * @date 2020/9/4
 * @author—Email liujunfirst@outlook.com
 * @blogURL https://blog.csdn.net/ljfirst
 * @description 单调栈 测试案例
 */
public class MonotonousStackTest {

    MonotonousStack ms = new MonotonousStack();

    @Test
    public void testmethod() {
        int[] answer = ms.method(source01);
        Assert.assertArrayEquals(answer, target01);
        answer = ms.method(source02);
        Assert.assertArrayEquals(answer, target02);
        answer = ms.method(source03);
        Assert.assertArrayEquals(answer, target03);
        answer = ms.method(source04);
        Assert.assertArrayEquals(answer, target04);
        answer = ms.method(source05);
        Assert.assertArrayEquals(answer, target05);
        answer = ms.method(source06);
        Assert.assertArrayEquals(answer, target06);
        answer = ms.method(source07);
        Assert.assertArrayEquals(answer, target07);
    }

    @Test
    public void testcycilmethod() {
        int[] answer = ms.cycilmethod(source01);
        Assert.assertArrayEquals(answer, targetCycle01);
        answer = ms.cycilmethod(source02);
        Assert.assertArrayEquals(answer, targetCycle02);
        answer = ms.cycilmethod(source03);
        Assert.assertArrayEquals(answer, targetCycle03);
        answer = ms.cycilmethod(source04);
        Assert.assertArrayEquals(answer, targetCycle04);
        answer = ms.cycilmethod(source05);
        Assert.assertArrayEquals(answer, targetCycle05);
        answer = ms.cycilmethod(source06);
        Assert.assertArrayEquals(answer, targetCycle06);
        answer = ms.cycilmethod(source07);
        Assert.assertArrayEquals(answer, targetCycle07);
    }

    int[] source01 = {};
    int[] target01 = {};
    int[] targetCycle01 = {};
    int[] source02 = null;
    int[] target02 = {};
    int[] targetCycle02 = {};
    int[] source03 = {2, 1, 2, 4, 3};
    int[] target03 = {4, 2, 4, -1, -1};
    int[] targetCycle03 = {4, 2, 4, -1, 3};

    int[] source04 = {73, 74, 75, 71, 69, 72, 76, 73};
    int[] target04 = {1, 2, -1, 5, 5, 6, -1, -1};
    int[] targetCycle04 = {1, 2, -1, 5, 5, 6, -1, 1};
    int[] source05 = {};
    int[] target05 = {};
    int[] targetCycle05 = {};
    int[] source06 = {};
    int[] target06 = {};
    int[] targetCycle06 = {};
    int[] source07 = {};
    int[] target07 = {};
    int[] targetCycle07 = {};
}
