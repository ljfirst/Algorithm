package UnitTest.AlgorithmTest.dynamicTest;

import Algorithm.dynamic.StringInDic;
import org.junit.Test;

/**
 * @author liujun
 * @version 1.0
 * @date 2020/6/29
 * @author—Email liujunfirst@outlook.com
 * @blogURL https://blog.csdn.net/ljfirst
 * @description 字符组成判断 测试用例
 */
public class StringInDicTest {

    StringInDic stringInDic = new StringInDic();

    @Test
    public void testfindWord() {
        boolean flag = stringInDic.findWord(demos01, demoDict01);
        assert flag;
        flag = stringInDic.findWord(demos101, demoDict101);
        assert flag;
        flag = stringInDic.findWord(demos02, demoDict02);
        assert flag;
        flag = stringInDic.findWord(demos03, demoDict03);
        assert flag;
        flag = stringInDic.findWord(demos04, demoDict04);
        assert flag;
        flag = stringInDic.findWord(demos05, demoDict05);
        assert flag;
        flag = stringInDic.findWord(demos06, demoDict06);
        assert flag;
        flag = stringInDic.findWord(demos07, demoDict07);
        assert flag;
        flag = stringInDic.findWord(demos08, demoDict08);
        assert flag;
        flag = stringInDic.findWord(demos09, demoDict09);
        assert flag;
        flag = stringInDic.findWord(demos10, demoDict10);
        assert flag;

        flag = stringInDic.findWord(demos11, demoDict11);
        assert !flag;
        flag = stringInDic.findWord(demos12, demoDict12);
        assert !flag;
        flag = stringInDic.findWord(demos13, demoDict13);
        assert !flag;
        flag = stringInDic.findWord(demos14, demoDict14);
        assert !flag;
        flag = stringInDic.findWord(demos15, demoDict15);
        assert !flag;
    }

    String demos01 = "leetcode";
    String[] demoDict01 = {"leet", "code"};
    String demos101 = "leetcode";
    String[] demoDict101 = {"le","leet", "code","tc"};
    String demos02 = "github";
    String[] demoDict02 = {"git", "hub","leet", "code"};
    String demos03 = "wotebiexihuanhekekoukele";//我特别喜欢喝可口可乐
    String[] demoDict03 = {"ke", "kou","wo","xihuan","tebie","he","le"};
    String demos04 = "zhongguokexuejishudaxue";//中国科学技术大学
    String[] demoDict04 = {"daxue", "zhongguo","ke","xue","jishu"};
    String demos05 = "woxihuanzhaoliyin";
    String[] demoDict05 = {"zhao","wo","huan","xi","li","yin"};
    String demos06 = "zhaoliyinxihuanwo";
    String[] demoDict06 = {"zhao","wo","huan","xi","li","yin"};
    String demos07 = "woyibabababazhu";//我一把把把把住
    String[] demoDict07 = {"wo","ba","zhu","yi"};
    String demos08 = "woxiangguoguoguoguoguoguodeshenghuo";//我想过过过过过过的生活
    String[] demoDict08 = {"wo", "xiang","guo","de","sheng","huo"};
    String demos09 = "haomeni";
    String[] demoDict09 = {"ni", "hao","me"};
    String demos10 = "nihaoljfirst";
    String[] demoDict10 = {"ni", "hao","ljfirst","we"};

    //反案例
    String demos11 = "nihaoljfirst1";
    String[] demoDict11 = {"ni", "hao","ljfirst","we"};
    String demos12 = "";
    String[] demoDict12 = {"ni", "hao","ljfirst","we"};
    String demos13 = null;
    String[] demoDict13 = {"ni", "hao","ljfirst","we"};
    String demos14 = "nihaozhangsan";
    String[] demoDict14 = {"ni", "hao","ljfirst","we","zhang"};
    String demos15 = "nihao";
    String[] demoDict15 = {"",""};
}
