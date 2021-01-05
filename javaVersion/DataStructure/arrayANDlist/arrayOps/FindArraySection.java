package DataStructure.arrayANDlist.arrayOps;

/**
 * @author liujun
 * @version 1.0
 * @date 2021/1/5
 * @author—Email liujunfirst@outlook.com
 * @blogURL https://blog.csdn.net/ljfirst
 * @description 查找给定值的数组区间
 * 给定一个按照升序排列的整数数组 nums，和一个目标值 target。
 * 找出给定目标值在数组中的开始位置和结束位置。
 * 如果数组中不存在目标值 target，返回 [-1, -1]。
 * 时间复杂度要求： O(log n)
 * <p>
 * 示例 1：
 * 输入：nums = [5,7,7,8,8,10], target = 8
 * 输出：[3,4]
 * 示例 2：
 * 输入：nums = [5,7,7,8,8,10], target = 6
 * 输出：[-1,-1]
 * 示例 3：
 * 输入：nums = [], target = 0
 * 输出：[-1,-1]
 */

public class FindArraySection {

    public int[] getSection(int[] array, int value) {
        if (array == null || array.length == 0) {
            return new int[]{};
        }
        int left = searchIndex(array, value, 0);
        int right = searchIndex(array, value, 1);
        int[] a = new int[]{left, right};
        return a;
    }

    /**
     * @param array
     * @param value
     * @param pos   0：查找左边界，1：查找右边界
     * @return 边界值
     */
    private int searchIndex(int[] array, int value, int pos) {
        int left = 0;
        int right = array.length - 1;
        int last = -1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (array[mid] < value) {
                left = mid + 1;
            } else if (array[mid] > value) {
                right = mid - 1;
            } else {
                last = mid;
                if (pos == 0) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
        }
        return last;
    }
}
