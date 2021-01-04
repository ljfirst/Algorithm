package UnitTest.DatastructureTest.arrayANDlistTest.findValueTest;

import DataStructure.arrayANDlist.findValue.FindMostValueofMonotonousArray;
import org.junit.Test;

/**
 * @author liujun
 * @version 1.0
 * @date 2020-01-08 19:50
 * @author-Email liujunfirst@outlook.com
 * @description 单调数组，返回数组的最值（最大/最小值）
 *  * 存在情况：
 *  * 1、单调递增，
 *  * 2、单调递减，
 *  * 3、先增后减，
 *  * 4、先减后增
 *  * 5、均值单调
 * @blogURL
 */
public class FindMostValueofMonotonousArrayTest {
    FindMostValueofMonotonousArray findMostValueofMonotonousArray = new FindMostValueofMonotonousArray();

    @Test
    public void testfind (){

        findMostValueofMonotonousArray.find(Demo01);
        assert findMostValueofMonotonousArray.getMaxValue() == 9;
        assert findMostValueofMonotonousArray.getMinValue() == 1;

        findMostValueofMonotonousArray.find(Demo02);
        assert findMostValueofMonotonousArray.getMaxValue() == 9;
        assert findMostValueofMonotonousArray.getMinValue() == 1;

        findMostValueofMonotonousArray.find(Demo03);
        assert findMostValueofMonotonousArray.getMaxValue() == 9;
        assert findMostValueofMonotonousArray.getMinValue() == 1;

        findMostValueofMonotonousArray.find(Demo04);
        assert findMostValueofMonotonousArray.getMaxValue() == 9;
        assert findMostValueofMonotonousArray.getMinValue() == 1;

        findMostValueofMonotonousArray.find(Demo05);
        assert findMostValueofMonotonousArray.getMaxValue() == 5;
        assert findMostValueofMonotonousArray.getMinValue() == 5;
    }

    int[] Demo01 = {1,2,3,4,5,6,7,8,9,7,6,3,1};
    int[] Demo02 = {1,2,3,4,5,6,7,8,9};
    int[] Demo03 = {9,8,7,6,4,3,1};
    int[] Demo04 = {9,8,7,6,4,3,1,3,4,7};
    int[] Demo05 = {5,5,5,5,5,5,5,5,5,5,5};
}
