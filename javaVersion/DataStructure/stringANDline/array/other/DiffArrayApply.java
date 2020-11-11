package DataStructure.stringANDline.array.other;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author liujun
 * @version 1.0
 * @date 2020/9/8
 * @author—Email liujunfirst@outlook.com
 * @blogURL https://blog.csdn.net/ljfirst
 * @description 差分数组/及应用
 * 这里有 n 个航班，它们分别从 1 到 n 进行编号。我们这儿有一份航班预订表，
 * 表中第 i 条预订记录 bookings[i] = [i, j, k] 意味着我们在从 i 到 j 的每个航班上预订了 k 个座位。
 * 请你返回一个长度为 n 的数组 answer，按航班编号顺序返回每个航班上预订的座位数。
 * 示例：
 * 输入：bookings = [[1,2,10],[2,3,20],[2,5,25]], n = 5
 * 输出：[10,55,45,25,25]
 */
public class DiffArrayApply {

    DiffArray diffArray = new DiffArray();

    public int[] deal(int[][] arrays, int n) {
        if (arrays == null || arrays.length == 0) {
            return new int[]{};
        }
        int[] ans = new int[n];
        diffArray.diff_init(ans);
        for (int[] an : arrays) {
            diffArray.diffINC(an[0]-1, an[1]-1, an[2]);
        }
        return diffArray.diffGetOrigin();
    }

    @Test
    public void test() {
        DiffArrayApply d = new DiffArrayApply();
        int[][] bookings = {{1, 2, 10},{2, 3, 20 },{2, 5, 25}};
        int n = 5;
        int [] s = d.deal(bookings,n);
        int[] target = {10,55,45,25,25};
        Assert.assertArrayEquals(s,target);
    }
}
