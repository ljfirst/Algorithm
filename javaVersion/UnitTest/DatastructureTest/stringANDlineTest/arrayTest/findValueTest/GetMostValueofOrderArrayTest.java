package UnitTest.DatastructureTest.stringANDlineTest.arrayTest.findValueTest;

import DataStructure.stringANDline.array.findValue.GetMostValueofOrderArray;
import org.junit.Test;

/**
 * @author liujun
 * @version 1.0
 * @date 2020/8/20
 * @author—Email liujunfirst@outlook.com
 * @blogURL https://blog.csdn.net/ljfirst
 * @description 测试案例
 * 一个有序数组，比如[1,2,3,4,5,6,7],
 * 后面部分被替换到前面，比如[5,6,7,1,2,3,4],找出替换后的数组的最小值
 */
public class GetMostValueofOrderArrayTest {

    GetMostValueofOrderArray find = new GetMostValueofOrderArray();

    @Test
    public void testgetmin() {
        int value = find.getmin(demoarray01);
        assert value == target01;
        value = find.getmin(demoarray02);
        assert value == target02;
        value = find.getmin(demoarray03);
        assert value == target03;
        value = find.getmin(demoarray04);
        assert value == target04;
        value = find.getmin(demoarray05);
        assert value == target05;
        value = find.getmin(demoarray06);
        assert value == target06;
        value = find.getmin(demoarray07);
        assert value == target07;
        value = find.getmin(demoarray08);
        assert value == target08;
        value = find.getmin(demoarray081);
        assert value == target08;
        value = find.getmin(demoarray082);
        assert value == target08;
        value = find.getmin(demoarray083);
        assert value == target08;
        value = find.getmin(demoarray084);
        assert value == target08;
        value = find.getmin(demoarray09);
        assert value == target09;
        value = find.getmin(demoarray10);
        assert value == target10;
    }

    int[] demoarray01 = {1, 2, 3, 4, 5, 6, 7};
    int target01 = 1;
    int[] demoarray02 = {5, 6, 7, 1, 2, 3, 4};
    int target02 = 1;
    int[] demoarray03 = {7, 1, 2, 3, 4, 5, 6,};
    int target03 = 1;
    int[] demoarray04 = {2, 3, 4, 5, 6, 7, 1};
    int target04 = 1;
    int[] demoarray05 = {0, 1, 4, 7, 9, 12, 13, 15, 23, 45, 67, 89};
    int target05 = 0;
    int[] demoarray06 = {15, 23, 45, 67, 89, 0, 1, 4, 7, 9, 12, 13};
    int target06 = 0;
    int[] demoarray07 = {89, 0, 1, 4, 7, 9, 12, 13, 15, 23, 45, 67};
    int target07 = 0;
    int[] demoarray08 = {1, 4, 7, 9, 12, 13, 15, 23, 45, 67, 89, 0};
    int target08 = 0;
    int[] demoarray081 = {1, 4, 7, 7, 9, 12, 13, 15, 23, 45, 67, 89, 0};
    int[] demoarray082 = {0, 1, 4, 7, 9, 12, 13, 15, 23, 45, 67, 89, 0};
    int[] demoarray083 = {1, 4, 7, 9, 12, 13, 15, 23, 45, 67, 89, 0, 0};
    int[] demoarray084 = {1, 4, 7, 9, 12, 13, 15, 15, 15, 23, 45, 67, 89, 0};

    int[] demoarray09 = {};
    int target09 = Integer.MIN_VALUE;
    int[] demoarray10 = null;
    int target10 = Integer.MIN_VALUE;
}
