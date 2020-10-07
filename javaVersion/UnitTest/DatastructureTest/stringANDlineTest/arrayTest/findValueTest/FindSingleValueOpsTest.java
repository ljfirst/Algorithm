package UnitTest.DatastructureTest.stringANDlineTest.arrayTest.findValueTest;

import DataStructure.stringANDline.array.findValue.FindSingleValueOps;
import org.junit.Test;

/**
 * @author liujun
 * @version 1.0
 * @date 2020/8/31
 * @author—Email liujunfirst@outlook.com
 * @blogURL https://blog.csdn.net/ljfirst
 * @description 找数字 测试案例
 * 数组中只出现一次的数字，其他出现3次
 */
public class FindSingleValueOpsTest {

    FindSingleValueOps fvo = new FindSingleValueOps();

    @Test
    public void testget(){
        int target = fvo.get(array01);
        assert target == value01;
        target = fvo.get(array02);
        assert target == value02;
        target = fvo.get(array03);
        assert target == value03;
        target = fvo.get(array04);
        assert target == value04;
        target = fvo.get(array05);
        assert target == value05;
    }

    int[] array01 = {};
    int value01 = Integer.MIN_VALUE;
    int[] array02 = null;
    int value02 = Integer.MIN_VALUE;
    int[] array03 = {1,2,3,4,5,6,7,8,9,1,2,3,4,5,6,7,8,9,1,2,3,4,5,6,7,8,9,10};
    int value03 = 10;
    int[] array04 = {10,1,2,6,5,6,1,7,3,4,5,7,9,4,5,6,1,8,9,9,8,2,3,4,2,3,7,8};
    int value04 = 10;
    int[] array05 = {4567,2456,100001,1234,4567,2456,9605,2038,10086,7329,100001,1234,2038,7329,3918,1234,3918,100001,9605,2038,4567,2456,9605,7329,3918};
    int value05 = 10086;
}
