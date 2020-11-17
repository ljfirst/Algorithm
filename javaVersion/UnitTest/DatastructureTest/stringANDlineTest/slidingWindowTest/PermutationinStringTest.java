package UnitTest.DatastructureTest.stringANDlineTest.slidingWindowTest;

import DataStructure.stringANDline.slidingWindow.PermutationinString;
import UnitTest.DatastructureTest.stringANDlineTest.StringData4Test;
import org.junit.Test;

/**
 * @author liujun
 * @version 1.0
 * @date 2020/6/23
 * @author—Email liujunfirst@outlook.com
 * @blogURL https://blog.csdn.net/ljfirst
 * @description 测试用例： 字符串排列
 */
public class PermutationinStringTest extends StringData4Test {

    PermutationinString p = new PermutationinString();

    @Test
    public void testcheck(){
        boolean flag = p.check(source01,target01);
        assert !flag;
        flag = p.check(source02,target02);
        assert !flag;

        flag = p.check(source03,target345);
        assert !flag;
        flag = p.check(source04,target345);
        assert !flag;
        flag = p.check(source05,target345);
        assert !flag;

        flag = p.check(source06,target678);
        assert !flag;
        flag = p.check(source07,target678);
        assert !flag;
        flag = p.check(source08,target678);
        assert !flag;

        flag = p.check(source09,target09);
        assert !flag;
        flag = p.check(source10,target10);
        assert !flag;

        flag = p.check(source11,target11);
        assert flag;
        flag = p.check(source12,target12);
        assert flag;
        flag = p.check(source13,target13);
        assert flag;
        flag = p.check(source131,target131);
        assert flag;
    }

}
