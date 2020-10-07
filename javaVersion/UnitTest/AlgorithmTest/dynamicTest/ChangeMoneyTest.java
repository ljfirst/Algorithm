package UnitTest.AlgorithmTest.dynamicTest;

import Algorithm.dynamic.ChangeMoney;

/**
 * @author liujun
 * @version 1.0
 * @date�� 2019-11-25 16:42
 * @author��Email liujunfirst@outlook.com
 * @description 
 * @blogURL
 */
public class ChangeMoneyTest {

    ChangeMoney changeMoney = new ChangeMoney();
    //@Test
    public void Testmethod(){
        int result = changeMoney.method(demo01, demo01_comp);
        assert result == 3;
        result = changeMoney.method(demo02, demo02_comp);
        assert result == -1;
        result = changeMoney.method(demo03, demo03_comp);
        assert result == -1;
        result = changeMoney.method(demo04, demo04_comp);
        assert result == -1;
    }

    //��������
    int[] demo01 = {1,2,5};
    int demo01_comp = 11;//return : 3
    int[] demo02 = {2};
    int demo02_comp = 3;//return : -1
    int[] demo03 = {};
    int demo03_comp = 11;//return : -1
    int[] demo04 = {1,2,5};
    int demo04_comp = 0;//return : -1
}
