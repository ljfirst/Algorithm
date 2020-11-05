package UnitTest.LogicTest.utilsTest;

import org.junit.Test;
import Logic.utils.RamdomUtil;
import java.util.regex.Pattern;

/**
 * @author liujun
 * @version 1.0
 * @date 2019-11-03 00:21
 * @author—Email liujunfirst@outlook.com
 * @description 
 */
public class RamdomUtilTest {

    RamdomUtil ramdomUtil = new RamdomUtil();

    @Test
    public void productRandomStringTest(){
        /*1、验证长度为5
          2、验证仅由0-9/A-Z/a-z构成
          3、验证字符串是否由字符等概率组成*/
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
        /*生成一个等概率的[0,9],[17,42],[49,74]之间的数
        需要注意两点：1、等概率的数；
                   2、数区间是否正确*/
        int totalnum = 62;
        int power = 10;
        int[] statistic = new int[75];
        for (int j = 0; j < totalnum * power; j++) {
            int testNum = ramdomUtil.getEqualNum();
            //2、判断区间是否正确
            assert (testNum >= 0 && testNum <= 9) || (testNum >= 17 && testNum <= 42) || (testNum >= 49 && testNum <= 75);
            statistic[testNum]++;
        }
        //1、判断是否等概率的数
        int flag = 0;
        for (int i = 0; i < statistic.length; i++) {
            if(statistic[i] > 2 * power){
                flag++;
            }
        }
        //出现异常情况的数据大于1/100
        assert flag <= totalnum/100;
    }
}
