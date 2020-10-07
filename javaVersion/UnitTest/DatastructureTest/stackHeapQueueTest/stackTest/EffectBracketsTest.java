package UnitTest.DatastructureTest.stackHeapQueueTest.stackTest;

import DataStructure.stackHeapQueue.stack.EffectBrackets;
import org.junit.Test;

/**
 * @author liujun
 * @version 1.0
 * @date 2019-11-30 01:14
 * @authorEmail liujunfirst@outlook.com
 * @description 
 * @blogURL
 */
public class EffectBracketsTest {

    EffectBrackets effectBrackets = new EffectBrackets();

    @Test
    public void TestEffectBracketsbyStack(){
        assert !effectBrackets.EffectBracketsbyStack(Demo01);
        assert !effectBrackets.EffectBracketsbyStack(Demo02);
        assert effectBrackets.EffectBracketsbyStack(Demo03);
        assert effectBrackets.EffectBracketsbyStack(Demo04);
        assert effectBrackets.EffectBracketsbyStack(Demo05);
        assert !effectBrackets.EffectBracketsbyStack(Demo06);
        assert !effectBrackets.EffectBracketsbyStack(Demo07);
    }

    @Test
    public void TestEffectBracketsbyTotalNum(){

        assert !effectBrackets.EffectBracketsbyTotalNum(Demo01);
        assert !effectBrackets.EffectBracketsbyTotalNum(Demo02);
        assert effectBrackets.EffectBracketsbyTotalNum(Demo03);
        assert effectBrackets.EffectBracketsbyTotalNum(Demo04);
        assert effectBrackets.EffectBracketsbyTotalNum(Demo05);
        assert !effectBrackets.EffectBracketsbyTotalNum(Demo06);
        assert !effectBrackets.EffectBracketsbyTotalNum(Demo07);
    }

    //测试案例
    String Demo01 = "";
    String Demo02 = null;
    String Demo03 = "()";
    String Demo04 = "()()";
    String Demo05 = "(()()(()(())))";
    String Demo06 = "(()()(()(()))))";//false
    String Demo07 = "()(()()))(()(()()))";//10
}