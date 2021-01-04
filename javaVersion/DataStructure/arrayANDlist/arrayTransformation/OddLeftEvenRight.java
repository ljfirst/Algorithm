package DataStructure.arrayANDlist.arrayTransformation;

/**
 * @author liujun
 * @version 1.0
 * @date 2020/12/9
 * @author—Email liujunfirst@outlook.com
 * @blogURL https://blog.csdn.net/ljfirst
 * @description 奇数左边偶数右边
 * 输入输出，让所有的奇数出现在左边，偶数出现在右边，奇偶数的原相对顺序不变
 * 输入：
 * [7,6,4,9,3,6,7,9,6,4,3]
 * 输出：
 * [7,9,3,7,9,3,6,4,6,6,4]
 * <p>
 * 难点在于：奇偶数的原相对顺序不变
 */

public class OddLeftEvenRight {

    public int[] sort(int[] array) {

        if (array == null || array.length == 0) {
            return null;
        }
        //find even
        int odd = 0;
        //care for ArrayIndexOutOfBoundsException
        while (odd < array.length && (array[odd] & 1) == 1) {
            odd++;
        }
        for (int i = odd + 1; i < array.length; i++) {
            //find odd
            while (i < array.length && (array[i] & 1) == 0) {
                i++;
            }
            if (i == array.length) {
                break;
            }
            int temp = array[i];
            for (int j = i; j > odd; j--) {
                array[j] = array[j - 1];
            }
            array[odd] = temp;
            odd++;
        }
        return array;
    }

    public int[] sort1(int[] array) {
        int left = 0;
        int right = array.length - 1;
        int odd = 0;
        int even = 0;
        while (left < right) {
            while (left < right && (array[left] & 1) == 1) {
                left++;
            }
            while (left < right && (array[right] & 1) == 0) {
                right--;
            }
            //exchange
            if (left < right) {
                int temp = array[left];
                array[left] = array[right];
                array[right] = temp;
            }
        }
        int terminal = array.length - 1;
        while (right < terminal) {
            int temp = array[right];
            array[right] = array[terminal];
            array[terminal] = temp;
            right++;
            terminal--;
        }
        return array;
    }
}
