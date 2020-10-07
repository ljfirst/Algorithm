package UnitTest.AlgorithmTest.dynamicTest;

import Algorithm.dynamic.ThiefSteal;
import org.junit.Test;

/**
 * @author liujun
 * @version 1.0
 * @date 2019-11-25 16:41
 * @author��Email  liujunfirst@outlook.com
 * @description 
 * @blogURL
 */
public class ThiefStealTest {

    ThiefSteal thiefSteal = new ThiefSteal();
    @Test
    public void Testmethod(){

        int result = thiefSteal.method(demo01);
        assert result == 18;
        result = thiefSteal.method(demo02);
        assert result == 0;
        result = thiefSteal.method(demo03);
        assert result == 0;
        result = thiefSteal.method(demo04);
        assert result == 352;
    }

    //��������
    int[] demo01 = {5,2,6,3,1,7};//ѡ��5��6��7,result = 18
    int[] demo02 = {};//result = 0
    int[] demo03 = null;//result = 0
    //����9��β�ģ�result = 352
    int[] demo04 = {9,1,19,5,2,29,3,3,39,4,1,49,5,59,36,6,69,56,7,79};
}
