package UnitTest.DatastructureTest.stackHeapQueueTest.stackTest;

import DataStructure.stackHeapQueue.stack.LongestEffectBrackets;
import org.junit.Test;

/**
 * @author liujun
 * @version 1.0
 * @date�� 2019-12-01 17:51
 * @author��Email liujunfirst@outlook.com
 * @description 
 * @blogURL
 */
public class LongestEffectBracketsTest {

    LongestEffectBrackets longestEffectBrackets = new LongestEffectBrackets();
    @Test
    public void TestLongestEffectBracketsNum_violence(){

        int num = longestEffectBrackets.LongestEffectBracketsNum_violence(Demo01);
        assert num == 0;
        num = longestEffectBrackets.LongestEffectBracketsNum_violence(Demo02);
        assert num == 0;
        num = longestEffectBrackets.LongestEffectBracketsNum_violence(Demo03);
        assert num == 2;
        num = longestEffectBrackets.LongestEffectBracketsNum_violence(Demo04);
        assert num == 4;
        num = longestEffectBrackets.LongestEffectBracketsNum_violence(Demo05);
        assert num == 14;
        num = longestEffectBrackets.LongestEffectBracketsNum_violence(Demo06);
        assert num == 14;
        num = longestEffectBrackets.LongestEffectBracketsNum_violence(Demo07);
        assert num == 10;
    }

    //@Test
    public void TestLongestEffectBracketsNum_(){

        int num = longestEffectBrackets.LongestEffectBracketsNum_(Demo01);
        assert num == 0;
        num = longestEffectBrackets.LongestEffectBracketsNum_(Demo02);
        assert num == 0;
        num = longestEffectBrackets.LongestEffectBracketsNum_(Demo03);
        assert num == 2;
        num = longestEffectBrackets.LongestEffectBracketsNum_(Demo04);
        assert num == 4;
        num = longestEffectBrackets.LongestEffectBracketsNum_(Demo05);
        assert num == 14;
        num = longestEffectBrackets.LongestEffectBracketsNum_(Demo06);
        assert num == 14;
        num = longestEffectBrackets.LongestEffectBracketsNum_(Demo07);
        assert num == 10;
    }

    //��������
    String Demo01 = "";
    String Demo02 = null;
    String Demo03 = "()";
    String Demo04 = "()()";
    String Demo05 = "(()()(()(())))";
    String Demo06 = "(()()(()(()))))";//false
    String Demo07 = "()(()()))(()(()()))";//10
}
