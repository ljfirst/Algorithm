package Algorithm.greedy;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author liujun
 * @version 1.0
 * @date 2020/6/8
 * @author—Email liujunfirst@outlook.com
 * @blogURL https://blog.csdn.net/ljfirst
 * @description 无重叠区间
 * 给定一个区间的集合，找到需要移除区间的最小数量，使剩余区间互不重叠
 * 举个例子，intvs=[[1,3],[2,4],[3,6]]，这些区间最多有两个区间互不相交，即[[1,3],[3,6]]，
 * 你的算法应该返回 2。注意边界相同并不算相交
 * <p>
 * 设计思路：从区间集合 intvs 中选择一个区间 x，这个 x 是在当前所有区间中结束最早的（end 最小）。
 * 把所有与 x 区间相交的区间从区间集合 intvs 中删除。
 * 重复步骤 1 和 2，直到 intvs 为空为止。之前选出的那些 x 就是最大不相交子集。
 * <p>
 * 参考博客：https://mp.weixin.qq.com/s/C9HtVaZP8BommYMshtZxrA
 */
public class EraseOverlapIntervals {

    public int countSection(int[][] intvs) {
        //至少存在一个区间（自身）
        int countNum = 1;
        //数组检查
        if (intvs == null || intvs.length == 0) {
            return 0;
        }
        //坐标检查
        for (int i = 0; i < intvs.length; i++) {
            if (intvs[i].length != 2) {
                return 0;
            }
        }
        //对最早结束时间进行排序
        Arrays.sort(intvs, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[1] - o2[1];
            }
        });
        //计算重叠数
        int end = intvs[0][1];
        for (int[] position : intvs) {
            int begin = position[0];
            //此处需要理解 >=
            if (begin >= end) {
                countNum++;
                end = position[1];
            }
        }
        return countNum;
    }
}
