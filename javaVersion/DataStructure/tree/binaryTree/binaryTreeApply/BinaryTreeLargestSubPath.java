package DataStructure.tree.binaryTree.binaryTreeApply;

import DataStructure.tree.binaryTree.BinaryTreeImpl;

import java.util.ArrayList;
import java.util.List;

/**
 * @author liujun
 * @date 2020-02-20 11:39
 * @description 计算二叉树中最大的子树路径和
 * 1、记录最大的子树路径和
 * 2、记录最大的子树路径和的值
 */
public class BinaryTreeLargestSubPath {

    int sum;
    int sumTemp;
    List<Integer> list;
    List<Integer> listTemp;

    public int[] countLargestSubPath(BinaryTreeImpl binaryTree) {
        //init
        list = new ArrayList<>();
        listTemp = new ArrayList<>();
        sum = 0;
        sumTemp = 0;
        //count
        countPath(binaryTree);
        int[] arrayValue = list.stream().mapToInt(Integer::intValue).toArray();
        return arrayValue;
    }

    private List countPath(BinaryTreeImpl binaryTree) {
        if (binaryTree == null) {
            return list;
        }
        sumTemp += binaryTree.value;

        listTemp.add(binaryTree.value);
        if (sumTemp > sum) {
            sum = sumTemp;
            //此处的list一定要重新赋值（Java值传递，但是此处是引用）
            list = new ArrayList<>(listTemp);
        }
        countPath(binaryTree.left);
        countPath(binaryTree.right);

        sumTemp -= binaryTree.value;
        //list最好用remove对象方式，而不是值
        listTemp.remove((Integer) binaryTree.value);
        return list;
    }

    public int countLargestSum(BinaryTreeImpl binaryTree) {
        if (binaryTree == null) {
            return 0;
        }
        sumTemp += binaryTree.value;
        if (sumTemp > sum) {
            sum = sumTemp;
        }
        countLargestSum(binaryTree.left);
        countLargestSum(binaryTree.right);
        sumTemp -= binaryTree.value;
        return sum;
    }
}
