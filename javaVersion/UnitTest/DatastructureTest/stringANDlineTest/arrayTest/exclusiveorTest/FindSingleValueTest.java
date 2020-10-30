package UnitTest.DatastructureTest.stringANDlineTest.arrayTest.exclusiveorTest;

import DataStructure.stringANDline.array.findNum.FindSingleValue;
import org.junit.Test;

/**
 * @author liujun
 * @version 1.0
 * @date 2020/8/31
 * @author—Email liujunfirst@outlook.com
 * @blogURL https://blog.csdn.net/ljfirst
 * @description 找数字 测试案例
 * 在一组数中，每个数都出现了两次，但是出现了唯独一个数，仅出现一次，找出这个数
 */
public class FindSingleValueTest {

    FindSingleValue fv = new FindSingleValue();

    @Test
    public void testget() {
        int target = fv.get(array01);
        assert target == value01;
        target = fv.get(array02);
        assert target == value02;
        target = fv.get(array03);
        assert target == value03;
        target = fv.get(array04);
        assert target == value04;
        target = fv.get(array05);
        assert target == value05;
        target = fv.get(array06);
        assert target == value06;
    }

    int[] array01 = {};
    int value01 = Integer.MIN_VALUE;
    int[] array02 = null;
    int value02 = Integer.MIN_VALUE;
    int[] array03 = {5,5,1,2,6,3,2,6,7,8,1,4,3,8,4};
    int value03 = 7;
    int[] array04 = {5,5,1,2,6,3,2,6,7,8,1,4,3,8,4,5,5,1,11,2,6,3,2,6,7,8,1,4,3,8,4};
    int value04 = 11;
    int[] array05 = {3879,700,15,5009,15,455,3,4,3879,700,222,5,222,11,455,5009,666,666,818,818,3,4,5};
    int value05 = 11;
    int[] array06 = {11,12,13,14,15,16,17,18,19,20,20,19,18,17,16,15,14,13,12,11,90};
    int value06 = 90;
}
