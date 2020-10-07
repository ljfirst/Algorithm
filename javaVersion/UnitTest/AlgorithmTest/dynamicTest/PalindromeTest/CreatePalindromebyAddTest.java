package UnitTest.AlgorithmTest.dynamicTest.PalindromeTest;

import Algorithm.dynamic.palindrome.CreatePalindromebyAdd;
import org.junit.Test;

/**
 * @author liujun
 * @version 1.0
 * @date 2019-11-07 20:08
 * @author��Email liujunfirst@outlook.com
 * @description 
 */
public class CreatePalindromebyAddTest {
    CreatePalindromebyAdd createPalindromebyAdd = new CreatePalindromebyAdd();

    //����һ����λ�ԱȲ���
    @Test
    public void headAndTailCompareTest(){

        //���Խ��������-1��-1��0��0��3��8��1��-1
        int flag = createPalindromebyAdd.headAndTailCompare(TestString01);
        assert flag == -1;
        flag = createPalindromebyAdd.headAndTailCompare(TestString02);
        assert flag == -1;
        flag = createPalindromebyAdd.headAndTailCompare(TestString03);
        assert flag == 4;
        flag = createPalindromebyAdd.headAndTailCompare(TestString04);
        assert flag == 3;
        flag = createPalindromebyAdd.headAndTailCompare(TestString05);
        assert flag == 2;
        flag = createPalindromebyAdd.headAndTailCompare(TestString06);
        assert flag == 7;
        flag = createPalindromebyAdd.headAndTailCompare(TestString07);
        assert flag == 0;
        flag = createPalindromebyAdd.headAndTailCompare(TestString08);
        assert flag == -1;
        flag = createPalindromebyAdd.headAndTailCompare(TestString09);
        assert flag == 0;
    }

    //��������ɾ���������
    @Test
    public void useDeleteTest(){

        //���Խ��������-1��-1��0��0��3��8��1��-1
        int flag = createPalindromebyAdd.useDelete(TestString01);
        assert flag == -1;
        flag = createPalindromebyAdd.useDelete(TestString02);
        assert flag == -1;
        flag = createPalindromebyAdd.useDelete(TestString03);
        assert flag == 4;
        flag = createPalindromebyAdd.useDelete(TestString04);
        assert flag == 3;
        flag = createPalindromebyAdd.useDelete(TestString05);
        assert flag == 2;
        flag = createPalindromebyAdd.useDelete(TestString06);
        assert flag == 7;
        flag = createPalindromebyAdd.useDelete(TestString07);
        assert flag == 0;
        flag = createPalindromebyAdd.useDelete(TestString08);
        assert flag == -1;
        flag = createPalindromebyAdd.useDelete(TestString09);
        assert flag == 0;
    }

    //��������LCS˼�����
    @Test
    public void useLCSTest(){
        //�޷��ж��ǵ�iλ����length-iλ
    }

    //�����ж�
    @Test
    public void PalindromeJudgeTest() {
        //���Խ��������
        boolean flag = createPalindromebyAdd.PalindromeJudge(TestString01);
        assert !flag;
        flag = createPalindromebyAdd.PalindromeJudge(TestString02);
        assert !flag;
        flag = createPalindromebyAdd.PalindromeJudge(TestString03);
        assert  flag;
        flag = createPalindromebyAdd.PalindromeJudge(TestString04);
        assert  flag;
        flag = createPalindromebyAdd.PalindromeJudge(TestString05);
        assert !flag;
        flag = createPalindromebyAdd.PalindromeJudge(TestString06);
        assert !flag;
        flag = createPalindromebyAdd.PalindromeJudge(TestString07);
        assert !flag;
        flag = createPalindromebyAdd.PalindromeJudge(TestString08);
        assert !flag;
        flag = createPalindromebyAdd.PalindromeJudge(TestString09);
        assert flag;
    }

    //��������01:�գ�������-1
    String TestString01 = null;
    //��������02:�մ���������-1
    String TestString02 = "";
    //��������03:ż�����Ȼ��Ĵ���������4
    String TestString03 = "abcddcba";
    //��������04:�������Ȼ��Ĵ���������3
    String TestString04 = "abcdcba";
    //��������05:��ɾ����3λ��������2
    String TestString05 = "ab2cdcba";
    //��������06:��ɾ�����һλ��7��������7
    String TestString06 = "abcdcba3";
    //��������07:��ɾ����һλ��0��������0
    String TestString07 = "0abcdcba";
    //��������08:ɾ��һλ���Բ��ǻ��Ĵ���������-1
    String TestString08 = "0abcd3cba";
    //��������09:����1���ַ�
    String TestString09 = "a";
}
