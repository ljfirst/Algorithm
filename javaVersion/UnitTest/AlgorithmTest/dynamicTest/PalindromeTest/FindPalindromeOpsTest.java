package UnitTest.AlgorithmTest.dynamicTest.PalindromeTest;

import Algorithm.dynamic.palindrome.FindPalindromeOps;

/**
 * @author liujun
 * @version 1.0
 * @date 2019-11-07 22:42
 * @author��Email liujunfirst@outlook.com
 * @description 
 */
public class FindPalindromeOpsTest {

    FindPalindromeOps findPalindromeOps = new FindPalindromeOps();

    public void findStringTest(){

        String target = findPalindromeOps.findString(TestString01);
        assert target == null;
        target = findPalindromeOps.findString(TestString02);
        assert target == null;
        target = findPalindromeOps.findString(TestString03);
        assert target == "abcddcba";
        target = findPalindromeOps.findString(TestString04);
        assert target == "abcddcba";
        target = findPalindromeOps.findString(TestString05);
        assert target == "abcdcba";
        target = findPalindromeOps.findString(TestString06);
        assert target == "abcdcba";
        target = findPalindromeOps.findString(TestString07);
        assert target == "abcdcba";
        target = findPalindromeOps.findString(TestString08);
        assert target == null;
        target = findPalindromeOps.findString(TestString09);
        assert target.equals("a");
    }

    //��������01:��
    String TestString01 = null;
    //��������02:�մ�
    String TestString02 = "";
    //��������03:ż�����Ȼ��Ĵ�
    String TestString03 = "abcddcba";
    //��������04:�������Ȼ��Ĵ�
    String TestString04 = "abcdcba";
    //��������05:abcdcba
    String TestString05 = "sdfabcdcba";
    //��������06:abcdcba
    String TestString06 = "abcdcbawer";
    //��������07:�����Ĵ���abcdcba
    String TestString07 = "dec4ev5veswnrtbtymnymabcdcbarfvbgtcjv9vc";
    //��������08:�������Ĵ�
    String TestString08 = "awhnjkwhcwnlkibectdvhewhcoicybua";
    //��������09:����1���ַ�
    String TestString09 = "a";
}
