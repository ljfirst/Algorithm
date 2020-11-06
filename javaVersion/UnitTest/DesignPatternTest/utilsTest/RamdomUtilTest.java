package UnitTest.DesignPatternTest.utilsTest;

import org.junit.Test;
import DesignPattern.utils.RamdomUtil;
import java.util.regex.Pattern;

/**
 * @author liujun
 * @version 1.0
 * @date 2019-11-03 00:21
 * @author��Email liujunfirst@outlook.com
 * @description 
 */
public class RamdomUtilTest {

    RamdomUtil ramdomUtil = new RamdomUtil();

    @Test
    public void productRandomStringTest(){
        /*1����֤����Ϊ5
          2����֤����0-9/A-Z/a-z����
          3����֤�ַ����Ƿ����ַ��ȸ������*/
        int testnum = 5;
        String testString;
        String testStringandNum;
        String patternString = "[0-9a-zA-Z]+";
        for (int i = 0; i < 20; i++) {
            testString = ramdomUtil.productRandomString(5);
            testStringandNum = ramdomUtil.productRandomNumandString(5);
            assert testString.length() == testnum;
            assert testStringandNum.length() == testnum;

            assert Pattern.matches(patternString,testString);
            assert Pattern.matches(patternString,testStringandNum);
            //assert testString.matches(patternString);
        }
    }

    @Test
    public void getEqualNumTest(){
        /*����һ���ȸ��ʵ�[0,9],[17,42],[49,74]֮�����
        ��Ҫע�����㣺1���ȸ��ʵ�����
                   2���������Ƿ���ȷ*/
        int totalnum = 62;
        int power = 10;
        int[] statistic = new int[75];
        for (int j = 0; j < totalnum * power; j++) {
            int testNum = ramdomUtil.getEqualNum();
            //2���ж������Ƿ���ȷ
            assert (testNum >= 0 && testNum <= 9) || (testNum >= 17 && testNum <= 42) || (testNum >= 49 && testNum <= 75);
            statistic[testNum]++;
        }
        //1���ж��Ƿ�ȸ��ʵ���
        int flag = 0;
        for (int i = 0; i < statistic.length; i++) {
            if(statistic[i] > 2 * power){
                flag++;
            }
        }
        //�����쳣��������ݴ���1/100
        assert flag <= totalnum/100;
    }
}
