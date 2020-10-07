package UnitTest.DatastructureTest.sortTest.innerSortTest.innerSortApplyTest;

import DataStructure.sort.innerSort.innerSortApply.HalfPastNum;
import org.junit.Test;

/**
 * @author liujun
 * @version 1.0
 * @date 2019-11-15 00:56
 * @Email liujunfirst@outlook.com
 * @description 
 * @blogURL
 */
public class HalfPastNumTest {
    HalfPastNum halfPastNum = new HalfPastNum();

    @Test
    public void testpigeon(){
        assert -1 == halfPastNum.method_pigeon(test01);
        assert -1 == halfPastNum.method_pigeon(test02);
        assert 1 == halfPastNum.method_pigeon(test03);
        assert 2 == halfPastNum.method_pigeon(test04);
        assert -1 == halfPastNum.method_pigeon(test05);
        assert 2 == halfPastNum.method_pigeon(test06);
        assert -1 == halfPastNum.method_pigeon(test07);
        assert -1 == halfPastNum.method_pigeon(test08);
        assert 9 == halfPastNum.method_pigeon(test09);
        assert -1 == halfPastNum.method_pigeon(test10);
        assert 8 == halfPastNum.method_pigeon(test11);
    }

    @Test
    public void testquicksort(){
        assert -1 == halfPastNum.method_quicksort(test01);
        assert -1 == halfPastNum.method_quicksort(test02);
        assert 1 == halfPastNum.method_quicksort(test03);
        assert 2 == halfPastNum.method_quicksort(test04);
        assert -1 == halfPastNum.method_quicksort(test05);
        assert 2 == halfPastNum.method_quicksort(test06);
        assert -1 == halfPastNum.method_quicksort(test07);
        assert -1 == halfPastNum.method_quicksort(test08);
        assert 9 == halfPastNum.method_quicksort(test09);
        assert -1 == halfPastNum.method_quicksort(test10);
        assert 8 == halfPastNum.method_quicksort(test11);
    }

    @Test
    public void testmap(){
        assert -1 == halfPastNum.method_map(test01);
        assert -1 == halfPastNum.method_map(test02);
        assert 1 == halfPastNum.method_map(test03);
        assert 2 == halfPastNum.method_map(test04);
        assert -1 == halfPastNum.method_map(test05);
        assert 2 == halfPastNum.method_map(test06);
        assert -1 == halfPastNum.method_map(test07);
        assert -1 == halfPastNum.method_map(test08);
        assert 9 == halfPastNum.method_map(test09);
        assert -1 == halfPastNum.method_map(test10);
        assert 8 == halfPastNum.method_map(test11);
    }

    //��������01
    public int[] test01 = null;
    //��������02
    public int[] test02 = {};
    //��������03
    public int[] test03 = {1};
    //��������04
    public int[] test04 = {2};
    //��������05
    public int[] test05 = {1,2};
    //��������06
    public int[] test06 = {1,2,3,2,2,2,5,4,2};
    //��������07:һ����
    public int[] test07 = {1,1,1,1,2,2,2,2};
    //��������08
    public int[] test08 = {1,2,3,4,5,6,7,8,9};
    //��������09
    public int[] test09 = {9,9,1,2,9,9,3,4,5,9,9,9,6,7,9,9,8,9};
    //��������10
    public int[] test10 = {3,2,3,2,3,2,3,2,3,3,8,8,8,8,8,8,8,8,8};
    //��������10
    public int[] test11 = {3,2,3,2,3,2,3,2,3,3,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8};
}
