package UnitTest.DatastructureTest.stringANDlineTest;

import DataStructure.stringANDline.list.SkipList;
import org.junit.Test;

/**
 * @author liujun
 * @version 1.0
 * @date�� 2019-10-18 02:50
 * @author��Emailliujunfirst@outlook.com
 * @description 
 */
public class SkipListTest {

    @Test
    public void testSkipList() {
        SkipList skipList = new SkipList();
        for (int i = 1; i <= 30; i++) {
            skipList.add(i);
        }
        skipList.print();
        assert skipList.SkipListlevel == 5;
        assert skipList.SkipListnum == 30;

        for (int i = 1; i <= 30; i++) {
            assert skipList.find(i);
        }
        for (int i = 1; i <= 30; i++) {
            assert skipList.delete(i);
        }
        for (int i = 1; i <= 30; i++) {
            assert !skipList.delete(i);
        }

        assert skipList.SkipListlevel == 1;
        assert skipList.SkipListnum == 0;

        for (int i = 1; i <= 30; i++) {
            skipList.add(i);
        }
        for (int i = 15; i < 22; i++) {
            skipList.delete(i);
        }
        for (int i = 1; i < 18; i++) {
            skipList.add(i);
        }
        for (int i = 2; i <= 30; i++) {
            skipList.delete(i);
        }
        assert skipList.SkipListnum == 1;
    }
}