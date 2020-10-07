package UnitTest.AlgorithmTest.dynamicTest.PalindromeTest;

import Algorithm.dynamic.palindrome.FindPalindrome;
import org.junit.Test;

/**
 * @author liujun
 * @version 1.0
 * @date 2019-11-07 22:41
 * @author��Email liujunfirst@outlook.com
 * @description 
 */
public class FindPalindromeTest {

    FindPalindrome findPalindrome = new FindPalindrome();

    @Test
    public void findStringViolenceTest(){
        String target = findPalindrome.findStringViolence(TestString01);
        assert target == null;
        target = findPalindrome.findStringViolence(TestString02);
        assert target == null;
        target = findPalindrome.findStringViolence(TestString03);
        assert target.equals("abcddcba");
        target = findPalindrome.findStringViolence(TestString04);
        assert target.equals("abcdcba");
        target = findPalindrome.findStringViolence(TestString05);
        assert target.equals("abcdcba");
        target = findPalindrome.findStringViolence(TestString06);
        assert target.equals("abcdcba");
        target = findPalindrome.findStringViolence(TestString07);
        assert target.equals("abcdcba");
        target = findPalindrome.findStringViolence(TestString08);
        assert target == null;
        target = findPalindrome.findStringViolence(TestString09);
        assert target.equals("a");
    }

    @Test
    public void findStringTest(){
        String target = findPalindrome.findString(TestString01);
        assert target == null;
        target = findPalindrome.findString(TestString02);
        assert target == null;
        target = findPalindrome.findString(TestString03);
        assert target == "abcddcba";
        target = findPalindrome.findString(TestString04);
        assert target == "abcdcba";
        target = findPalindrome.findString(TestString05);
        //�ַ����ıȽϾ���ʹ��equals
        assert target.equals("abcdcba");
        target = findPalindrome.findString(TestString06);
        assert target.equals("abcdcba");
        target = findPalindrome.findString(TestString07);
        assert target.equals("abcdcba");
        target = findPalindrome.findString(TestString08);
        assert target == null;
        target = findPalindrome.findString(TestString09);
        assert target == null;
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
    String TestString07 = "dec4evp5v8eswnrtbutymnabcdcbaymabcdicbarfvbgtcjvp9vc";
    //��������08:�������Ĵ�
    String TestString08 = "awhnjkwhcwnlkibectdvhewhcoicybua";
    //��������09:����1���ַ�
    String TestString09 = "a";
}