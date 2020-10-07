package DataStructure.stringANDline.array;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @author liujun
 * @version 1.0
 * @date 2020/7/28
 * @author—Email liujunfirst@outlook.com
 * @blogURL https://blog.csdn.net/ljfirst
 * @description 根据身高重建队列
 * 假设有打乱顺序的一群人站成一个队列。 每个人由一个整数对(h, k)表示，
 * 其中h是这个人的身高，k是排在这个人前面且身高大于或等于h的人数。 编写一个算法来重建这个队列。
 * <p>
 * 输入:
 * [[7,0], [4,4], [7,1], [5,0], [6,1], [5,2]]
 * 输出:
 * [[5,0], [7,0], [5,2], [6,1], [4,4], [7,1]]
 * 解题思路：对输入数组的身高排序（倒叙）
 * 身高的相同，基于人数排序（正序）
 */
public class BuildTeambyTall {

    public int[][] solution(int[][] array) {

        if (array == null || array.length == 0) {
            return new int[0][0];
        }
        /*Arrays.sort(array, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[0] != o2[0]) {
                    return o2[0] - o1[0];
                }
                return o1[1] - o2[1];
            }
        });*/
        //使用lambda表达式简化代码
        Arrays.sort(array,(x1,x2)->{
            if (x1[0] != x2[0]) {
                return x2[0] - x1[0];
            }
            return x1[1] - x2[1];
        });

        List<int[]> list = new LinkedList<>();
        for (int[] p : array) {
            list.add(p[1], p);
        }
        return list.toArray(new int[array.length][]);
    }
}
