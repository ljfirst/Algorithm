package UnitTest.DatastructureTest.treeTest.binaryTreeTest.binaryTreeApplyTest;

import DataStructure.tree.binaryTree.binaryTreeApply.BinaryTreeLargestSubPath;
import DataStructure.tree.binaryTree.binaryTreeRealize.BinaryTreeImpl;
import UnitTest.DatastructureTest.treeTest.BinaryTreeTestDemo;
import org.junit.Test;

import java.util.Arrays;

/**
 * @author liujun
 * @date 2020-02-20 11:41
 * @description
 */
public class BinaryTreeLargestSubPathTest extends BinaryTreeTestDemo {

    BinaryTreeLargestSubPath largestSubPath = new BinaryTreeLargestSubPath();

    @Test
    public void TestcountLargestSubPath() {
        //注意：此处传入空对象，输出的是{}
        int[] arrayValue = largestSubPath.countLargestSubPath(binaryTreeImplDemo1);
        assert Arrays.equals(arrayValue, Demo01);
        arrayValue = largestSubPath.countLargestSubPath(new BinaryTreeImpl());
        assert Arrays.equals(arrayValue, Demo02);
        arrayValue = largestSubPath.countLargestSubPath(gettreeDemo03());
        assert Arrays.equals(arrayValue, Demo03);
        arrayValue = largestSubPath.countLargestSubPath(gettreeDemo04());
        assert Arrays.equals(arrayValue, Demo04);
        arrayValue = largestSubPath.countLargestSubPath(gettreeDemo05());
        assert Arrays.equals(arrayValue, Demo05);
    }

    @Test
    public void TestcountLargestSum() {
        int sum = largestSubPath.countLargestSum(binaryTreeImplDemo1);
        assert sum == 0;
        sum = largestSubPath.countLargestSum(new BinaryTreeImpl());
        assert sum == 0;
        sum = largestSubPath.countLargestSum(gettreeDemo03());
        assert sum == 11;
        sum = largestSubPath.countLargestSum(gettreeDemo04());
        assert sum == 11;
        sum = largestSubPath.countLargestSum(gettreeDemo05());
        assert sum == 91;
    }

    int[] Demo01 = {};
    int[] Demo02 = {};
    int[] Demo03 = {1, 3, 7};
    int[] Demo04 = {1, 3, 7};
    int[] Demo05 = {1, 3, 7, 10, 16, 17, 18, 19};
}
