package UnitTest.DatastructureTest.stringANDlineTest.arrayTest.findValueTest;

import DataStructure.stringANDline.array.findValue.FindDiffinMonotonousArray;
import org.junit.Test;

/**
 * @author liujun
 * @version 1.0
 * @date 2020-01-08 14:03
 * @authorEmail liujunfirst@outlook.com
 * @description 
 * @blogURL
 */
public class FindDiffinMonotonousArrayTest {

    FindDiffinMonotonousArray findDiffinMonotonousArray = new FindDiffinMonotonousArray();

    @Test
    public void testfind(){
        int count = findDiffinMonotonousArray.find(Demo01);
        assert count == 9;
        count = findDiffinMonotonousArray.find(Demo02);
        assert count == 9;
        count = findDiffinMonotonousArray.find(Demo03);
        assert count == 7;
        count = findDiffinMonotonousArray.find(Demo04);
        assert count == 9;
    }

    int[] Demo01 = {1,2,3,4,5,6,7,8,9,7,6,3,1};
    int[] Demo02 = {1,2,3,4,5,6,7,8,9};
    int[] Demo03 = {9,8,7,6,4,3,1};
    int[] Demo04 = {1,2,4,4,5,6,8,9,9,7,6,4,3,1};
}
