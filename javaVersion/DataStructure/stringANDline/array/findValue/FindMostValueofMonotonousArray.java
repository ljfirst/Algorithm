package DataStructure.stringANDline.array.findValue;

/**
 * @author liujun
 * @version 1.0
 * @date 2020-01-08 19:50
 * @author—Email  liujunfirst@outlook.com
 * @description  数组，返回数组的最值（最大/最小值）
 * 存在情况：
 * 1、单调递增，
 * 2、单调递减，
 * 3、先增后减，
 * 4、先减后增
 * 5、均值单调
 * @blogURL
 */
public class FindMostValueofMonotonousArray {

    public static int maxValue = 0;
    public static int minValue = 0;

    public void find(int[] array) {

        //验证是否为均值
        if (array[0] == array[1]) {
            maxValue = array[0];
            minValue = array[0];
            return;
        }
        int left = 0;
        int bound = array.length - 1;
        int right = bound;
        int mid = (left + right) / 2;
        //先单增
        if (array[0] < array[1]) {
            while (mid > 0 && mid < bound) {//防止越界
                if (array[mid] > array[mid + 1] && array[mid] > array[mid - 1]) {
                    maxValue = array[mid];
                    minValue = Math.min(array[0], array[bound]);
                    break;
                    //依旧在单增区
                } else if (array[mid] > array[mid - 1]) {
                    left = mid + 1;//注意加一
                    mid = (left + right) / 2;
                    //进入单减区
                } else {
                    right = mid;
                    mid = (left + right) / 2;
                }
            }
            //单增区
            if (mid == bound) {
                minValue = array[0];
                maxValue = array[bound];
            }
        } else {//先单减
            while (mid > 0 && mid < bound) {//防止越界
                if (array[mid] < array[mid + 1] && array[mid] < array[mid - 1]) {
                    minValue = array[mid];
                    maxValue = Math.max(array[0], array[bound]);
                    break;
                    //依旧在单减区
                } else if (array[mid] < array[mid - 1]) {
                    left = mid + 1;//注意加一
                    mid = (left + right) / 2;
                } else {
                    //进入单增区
                    right = mid;
                    mid = (left + right) / 2;
                }
            }
            //单减区
            if (mid == bound) {
                maxValue = array[0];
                minValue = array[bound];
            }
        }
    }

    public int getMaxValue() {
        return maxValue;
    }

    public int getMinValue() {
        return minValue;
    }
}
