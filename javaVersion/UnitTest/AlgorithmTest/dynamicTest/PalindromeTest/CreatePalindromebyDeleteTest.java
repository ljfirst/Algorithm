package UnitTest.AlgorithmTest.dynamicTest.PalindromeTest;

import Algorithm.dynamic.palindrome.CreatePalindromebyDelete;
import org.junit.Test;

/**
 * @author liujun
 * @version 1.0
 * @date 2019-11-07 20:07
 * @author��Email liujunfirst@outlook.com
 * @description 
 */
public class CreatePalindromebyDeleteTest {

    CreatePalindromebyDelete createPalindromebyDelete = new CreatePalindromebyDelete();

    //����
    @Test
    public void useLcsTest() {

        //���Խ��������-1��-1��0��0��3��8��1��-1
        int flag = createPalindromebyDelete.useLcs(TestString01);
        assert flag == -1;
        flag = createPalindromebyDelete.useLcs(TestString02);
        assert flag == -1;
        flag = createPalindromebyDelete.useLcs(TestString03);
        assert flag == 0;
        flag = createPalindromebyDelete.useLcs(TestString04);
        assert flag == 0;
        flag = createPalindromebyDelete.useLcs(TestString05);
        assert flag == 1;
        flag = createPalindromebyDelete.useLcs(TestString06);
        assert flag == 1;
        flag = createPalindromebyDelete.useLcs(TestString07);
        assert flag == 1;
        flag = createPalindromebyDelete.useLcs(TestString08);
        assert flag == 2;
        flag = createPalindromebyDelete.useLcs(TestString09);
        assert flag == 0;
    }

    //��������01:��
    String TestString01 = null;
    //��������02:�մ�
    String TestString02 = "";
    //��������03:ż�����Ȼ��Ĵ�
    String TestString03 = "abcddcba";
    //��������04:�������Ȼ��Ĵ�
    String TestString04 = "abcdcba";
    //��������05:
    String TestString05 = "ab2cdcba";
    //��������06:
    String TestString06 = "abcdcba3";
    //��������07:
    String TestString07 = "0abcdcba";
    //��������08:
    String TestString08 = "0abcd3cba";
    //��������09:����1���ַ�
    String TestString09 = "a";
}
