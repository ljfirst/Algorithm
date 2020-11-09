package UnitTest.DatastructureTest.treeTest.binaryTreeTest.binaryTreeApplyTest;

import DataStructure.tree.binaryTree.binaryTreeApply.BTFindCertainValuePath;
import DataStructure.tree.binaryTree.binaryTreeRealize.Array2BinaryTreeImpl;
import DataStructure.tree.binaryTree.binaryTreeRealize.BinaryTreeImpl;
import UnitTest.DatastructureTest.treeTest.BinaryTreeTestDemo;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author liujun
 * @date 2020-02-21 09:20
 * @description  测试二叉树中和为某一值的路径
 */
public class BTFindCertainValuePathTest extends BinaryTreeTestDemo {

    BTFindCertainValuePath bt = new BTFindCertainValuePath();
    Array2BinaryTreeImpl ab = new Array2BinaryTreeImpl();
    ArrayList<ArrayList<BinaryTreeImpl>> all_list_Demo;
    ArrayList<BinaryTreeImpl> list_Demo;
    int[] ValuePath;

    @Test
    public void TestFindPath() {
        //注意此处的测试用例写法，和测试角度
        all_list_Demo = bt.FindPath(gettreeDemo03(), Demo033);
        assert all_list_Demo.size() == 0;
        all_list_Demo = bt.FindPath(null, Demo035);
        assert all_list_Demo.size() == 0;
        all_list_Demo = bt.FindPath(gettreeDemo05(), Demo036);
        assert all_list_Demo.size() == 0;
        all_list_Demo = bt.FindPath(new BinaryTreeImpl(), Demo037);
        assert all_list_Demo.size() == 0;

        list_Demo = bt.FindPath(gettreeDemo03(), Demo031).get(0);
        ValuePath = list_Demo.stream().mapToInt(x -> x.value).toArray();
        assert Arrays.equals(ValuePath, Demo031Result);
        list_Demo = bt.FindPath(gettreeDemo03(), Demo032).get(0);
        ValuePath = list_Demo.stream().mapToInt(x -> x.value).toArray();
        assert Arrays.equals(ValuePath, Demo032Result);

        list_Demo = bt.FindPath(gettreeDemo04(), Demo041).get(0);
        ValuePath = list_Demo.stream().mapToInt(x -> x.value).toArray();
        assert Arrays.equals(ValuePath, Demo041Result);
        list_Demo = bt.FindPath(gettreeDemo04(), Demo042).get(0);
        ValuePath = list_Demo.stream().mapToInt(x -> x.value).toArray();
        assert Arrays.equals(ValuePath, Demo042Result);

        list_Demo = bt.FindPath(gettreeDemo05(), Demo051).get(0);
        ValuePath = list_Demo.stream().mapToInt(x -> x.value).toArray();
        assert Arrays.equals(ValuePath, Demo051Result);
        list_Demo = bt.FindPath(gettreeDemo05(), Demo052).get(0);
        ValuePath = list_Demo.stream().mapToInt(x -> x.value).toArray();
        assert Arrays.equals(ValuePath, Demo052Result);

        all_list_Demo = bt.FindPath(new BinaryTreeImpl(), Demo034);
        assert all_list_Demo.size() == 0;

        BinaryTreeImpl b = ab.createBinaryTreeLevel(treeDemo060);
        all_list_Demo = bt.FindPath(b, Demo060);
        list_Demo = all_list_Demo.get(0);
        ValuePath = list_Demo.stream().mapToInt(x -> x.value).toArray();
        assert Arrays.equals(ValuePath, getDemo060Result1);
        list_Demo = all_list_Demo.get(1);
        ValuePath = list_Demo.stream().mapToInt(x -> x.value).toArray();
        assert Arrays.equals(ValuePath, getDemo060Result2);
        list_Demo = all_list_Demo.get(2);
        ValuePath = list_Demo.stream().mapToInt(x -> x.value).toArray();
        assert Arrays.equals(ValuePath, getDemo060Result3);
        list_Demo = all_list_Demo.get(3);
        ValuePath = list_Demo.stream().mapToInt(x -> x.value).toArray();
        assert Arrays.equals(ValuePath, getDemo060Result4);
        list_Demo = all_list_Demo.get(4);
        ValuePath = list_Demo.stream().mapToInt(x -> x.value).toArray();
        assert Arrays.equals(ValuePath, getDemo060Result5);
    }

    @Test
    public void TestFindPathStack() {
        //注意此处的测试用例写法，和测试角度
        all_list_Demo = bt.FindPathStack(gettreeDemo03(), Demo033);
        assert all_list_Demo.size() == 0;
        all_list_Demo = bt.FindPathStack(null, Demo035);
        assert all_list_Demo.size() == 0;
        all_list_Demo = bt.FindPathStack(gettreeDemo05(), Demo036);
        assert all_list_Demo.size() == 0;
        all_list_Demo = bt.FindPathStack(new BinaryTreeImpl(), Demo037);
        assert all_list_Demo.size() == 0;

        list_Demo = bt.FindPathStack(gettreeDemo03(), Demo031).get(0);
        ValuePath = list_Demo.stream().mapToInt(x -> x.value).toArray();
        assert Arrays.equals(ValuePath, Demo031Result);
        all_list_Demo = bt.FindPathStack(gettreeDemo03(), Demo032);
        list_Demo = all_list_Demo.get(0);
        ValuePath = list_Demo.stream().mapToInt(x -> x.value).toArray();
        assert Arrays.equals(ValuePath, Demo032Result);

        list_Demo = bt.FindPathStack(gettreeDemo04(), Demo041).get(0);
        ValuePath = list_Demo.stream().mapToInt(x -> x.value).toArray();
        assert Arrays.equals(ValuePath, Demo041Result);
        list_Demo = bt.FindPathStack(gettreeDemo04(), Demo042).get(0);
        ValuePath = list_Demo.stream().mapToInt(x -> x.value).toArray();
        assert Arrays.equals(ValuePath, Demo042Result);

        list_Demo = bt.FindPathStack(gettreeDemo05(), Demo051).get(0);
        ValuePath = list_Demo.stream().mapToInt(x -> x.value).toArray();
        assert Arrays.equals(ValuePath, Demo051Result);
        list_Demo = bt.FindPathStack(gettreeDemo05(), Demo052).get(0);
        ValuePath = list_Demo.stream().mapToInt(x -> x.value).toArray();
        assert Arrays.equals(ValuePath, Demo052Result);

        all_list_Demo = bt.FindPathStack(new BinaryTreeImpl(), Demo034);
        ValuePath = list_Demo.stream().mapToInt(x -> x.value).toArray();

        BinaryTreeImpl b = ab.createBinaryTreeLevel(treeDemo060);
        all_list_Demo = bt.FindPathStack(b, Demo060);
        list_Demo = all_list_Demo.get(0);
        ValuePath = list_Demo.stream().mapToInt(x -> x.value).toArray();
        assert Arrays.equals(ValuePath, getDemo060Result1);
        list_Demo = all_list_Demo.get(1);
        ValuePath = list_Demo.stream().mapToInt(x -> x.value).toArray();
        assert Arrays.equals(ValuePath, getDemo060Result2);
        list_Demo = all_list_Demo.get(2);
        ValuePath = list_Demo.stream().mapToInt(x -> x.value).toArray();
        assert Arrays.equals(ValuePath, getDemo060Result3);
        list_Demo = all_list_Demo.get(3);
        ValuePath = list_Demo.stream().mapToInt(x -> x.value).toArray();
        assert Arrays.equals(ValuePath, getDemo060Result4);
        list_Demo = all_list_Demo.get(4);
        ValuePath = list_Demo.stream().mapToInt(x -> x.value).toArray();
        assert Arrays.equals(ValuePath, getDemo060Result5);
    }

    //反案例:
    // 033输入正常的二叉树和异常的值（-1）
    // 035输入null和正常的值
    // 036输入正常的二叉树和异常的值(超过最大值的值)
    // 037输入空的二叉树和异常的值
    int Demo033 = -1;
    int[] Demo033Result = {};
    int Demo035 = 3;
    int[] Demo035Result = {};
    int Demo036 = 157;
    int[] Demo036Result = {};
    int Demo037 = 157;
    int[] Demo037Result = {};

    //正案例
    int Demo031 = 10;
    int[] Demo031Result = {1, 3, 6};
    int Demo032 = 3;
    int[] Demo032Result = {1, 2};

    int Demo041 = 3;
    int[] Demo041Result = {1, 2};
    int Demo042 = 11;
    int[] Demo042Result = {1, 3, 7};

    int Demo051 = 43;
    int[] Demo051Result = {1, 2, 4, 9, 13, 14};
    int Demo052 = 91;
    int[] Demo052Result = {1, 3, 7, 10, 16, 17, 18, 19};

    //输入空的二叉树和正常的值：输出0
    int Demo034 = 3;
    int[] Demo034Result = {0};

    int Demo060 = 20;
    int[] treeDemo060 = {
                                                                 1,
                                         4,                                               9,
                             5,                         5,                  10,                   5,
                 6,                      5,    Symbol,      10,       Symbol, Symbol,     4,               5,
             3, Symbol,         5,              1,    Symbol,    12,               1,            2, Symbol, Symbol,
        Symbol, Symbol,  Symbol, Symbol, Symbol, Symbol,   Symbol, Symbol, Symbol, Symbol, Symbol, Symbol,
    };
    int[] getDemo060Result1 = {1, 9, 10};
    int[] getDemo060Result2 = {1, 4, 5, 10};
    int[] getDemo060Result3 = {1, 9, 5, 5};
    int[] getDemo060Result4 = {1, 4, 5, 5, 5};
    int[] getDemo060Result5 = {1, 9, 5, 4, 1};
}
