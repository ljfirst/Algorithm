package UnitTest.AlgorithmTest.backtrackTest;

import Algorithm.backtrack.StringCombination;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author liujun
 * @version 1.0
 * @date 2020/6/29
 * @author—Email liujunfirst@outlook.com
 * @blogURL https://blog.csdn.net/ljfirst
 * @description
 */
public class StringCombinationTest {

    StringCombination sc = new StringCombination();

    @Test
    public void test() {
        String[] target = sc.print(demo01);
        Arrays.equals(target, answer01);
        target = sc.print(demo02);
        Arrays.equals(target, answer02);
        target = sc.print(demo03);
        Arrays.equals(target, answer03);
        target = sc.print(demo04);
        Arrays.equals(target, answer04);
        target = sc.print(demo05);
        Arrays.equals(target, answer05);
        target = sc.print(demo06);
        Arrays.equals(target, answer06);
        target = sc.print(demo07);
        Arrays.equals(target, answer07);
    }

    String demo01 = "";
    String[] answer01 = {};
    String demo02 = null;
    String[] answer02 = {};
    String demo03 = "abcd";
    String[] answer03 = {
            "abcd", "abdc", "acdb", "acbd", "adcb", "adbc",
            "bcad", "bcda", "bdac", "dbca", "bacd", "badc",
            "cadb", "cabd", "cdab", "cdba", "cbda", "cbad",
            "dadc", "dacb", "dcba", "dcab", "dbca", "dbac",};
    String demo06 = "dcab";
    String[] answer06 = {
            "abcd", "abdc", "acdb", "acbd", "adcb", "adbc",
            "bcad", "bcda", "bacd", "badc", "bdac", "dbca",
            "cadb", "cabd", "cdab", "cdba", "cbda", "cbad",
            "dadc", "dacb", "dcba", "dcab", "dbca", "dbac",};
    String demo04 = "1234";
    String[] answer04 = {
            "1234", "1243", "1324", "1342", "1423", "1432",
            "2143", "2134", "2314", "2341", "2413", "2431",
            "3124", "3142", "3421", "3412", "3214", "3241",
            "4321", "4312", "4231", "4213", "4123", "4132",};
    String demo05 = "2314";
    String[] answer05 = {
            "1234", "1243", "1324", "1342", "1423", "1432",
            "2143", "2134", "2314", "2341", "2413", "2431",
            "3124", "3142", "3421", "3412", "3214", "3241",
            "4321", "4312", "4231", "4213", "4123", "4132",};
    String demo07 = "liu";
    String[] answer07 = {"liu", "lui", "iul", "ilu", "uil", "uli",};
}
