package DataStructure.stringANDline.array.findValue;

/**
 * @author liujun
 * @version 1.0
 * @date 2020/8/20
 * @author—Email liujunfirst@outlook.com
 * @blogURL https://blog.csdn.net/ljfirst
 * @description 一个有序数组，比如[1,2,3,4,5,6,7],
 * 后面部分被替换到前面，比如[5,6,7,1,2,3,4],找出替换后的数组的最小值
 */

public class GetMostValueofOrderArray {

    public int getmin(int[] array) {
        if (array == null || array.length == 0) {
            return Integer.MIN_VALUE;
        }
        int target = array[0];
        int minvalue = getvalue(array, 0, array.length - 1);
        return Math.min(target, minvalue);
    }

    private int getvalue(int[] arr, int left, int right) {
        if (left + 1 == right || left == right) {
            return Math.min(arr[left], arr[right]);
        }
        int mid = (left + right) / 2;
        int value = 0;
        if (arr[left] < arr[mid]) {
            value = getvalue(arr, mid + 1, right);
        } else {
            value = getvalue(arr, left, mid);
        }
        return value;
    }
}
