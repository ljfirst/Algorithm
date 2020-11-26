package DataStructure.stackHeapQueue.heap;

import java.util.ArrayList;
import java.util.List;

/**
 * @author liujun
 * @version 1.0
 * @date 2020/11/30
 * @author—Email liujunfirst@outlook.com
 * @blogURL https://blog.csdn.net/ljfirst
 * @description 在输入的数组中找出第k大的素数
 */
public class ReturnKthPrimeNum {


    public int getKthPrimeNum(int[] array, int k) {
        if (array == null || array.length < k) {
            return -1;
        }
        array = getPrimeNum(array);
        ReturnKthMin r = new ReturnKthMin();
        int y = r.returnKthMinbyheap(array, k);
        return y;
    }


    private int[] getPrimeNum(int[] arr) {
        List<Integer> list = new ArrayList<>();
        for (int i : arr) {
            boolean flag = false;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                list.add(i);
            }
        }
        return list.stream()
                .filter(x -> x > 2)
                .mapToInt(Integer::intValue)
                .toArray();
    }

}
