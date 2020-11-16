package DataStructure.stringANDline.array.arrayApply;

import UnitTest.DatastructureTest.stringANDlineTest.HoldWater;

/**
 * @author liujun
 * @version 1.0
 * @date 2020/7/1
 * @author—Email liujunfirst@outlook.com
 * @blogURL https://blog.csdn.net/ljfirst
 * @description 盛水问题
 * 给定 n 个非负整数 x1,x2,x3...，每个数代表坐标中的一个点 (i,xi)。
 * 在坐标内画 n 条竖直线，竖直线 i 的两个端点分别为(i,0)和(i,xi)。找出其中的两条线，
 * 使得它们与x轴共同构成的容器可以容纳最多的水。
 * 说明： 你不能倾斜容器，且 n 的值至少为 2。
 */
public class HoldWater1 implements HoldWater {

    public int calculate(int[] array) {
        if (!check(array)) {
            return 0;
        }
        int maxValue = Integer.MIN_VALUE;
        int leftbound = 0;
        int rightbound = array.length - 1;
        while (leftbound < rightbound) {
            int temp = (rightbound - leftbound) * Math.min(array[leftbound], array[rightbound]);
            if (temp > maxValue) {
                maxValue = temp;
            }
            if (array[leftbound] < array[rightbound]) {
                leftbound++;
            } else {
                rightbound--;
            }
        }
        return maxValue;
    }
}
