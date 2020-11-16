package DataStructure.stringANDline.array.arrayApply;

import java.util.HashMap;
import java.util.Map;

/**
 * @author liujun
 * @version 1.0
 * @date 2020/6/30
 * @author—Email liujunfirst@outlook.com
 * @blogURL https://blog.csdn.net/ljfirst
 * @description 杨辉三角
 * 考虑二维数组映射成一位数组
 * 输入行数 n
 * 输出对应行数的杨辉三角
 */
public class YHtriangle {

    int[] yh;
    Map<Integer, Integer> map = new HashMap();
    int levellocal;
    int mapSize = 4;

    {
        initialMap(mapSize);//初始化 4层
    }

    public int[] print(int n) {
        if (n == 1) {
            return new int[]{1};
        }
        //map扩容
        if (n > mapSize) {
            initialMap(n);
        }
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        yh = new int[sum];
        yh[0] = 1;

        for (int i = 1; i < sum; i++) {

            int raw1 = countraw(i);
            int column = countcolumn(i, raw1);
            yh[i] = (column == 0 || column == raw1 - 1) ? 1 : countValue(raw1 - 1, column - 1) + countValue(raw1 - 1, column);
        }

        return yh;
    }

    public void initialMap(int level) {
        int totalnum = map.size();
        levellocal = totalnum == 0 ? 1 : map.get(map.size() - 1) + 1;
        for (int i = levellocal; i <= level; i++) {
            for (int j = 0; j < i; j++) {
                map.put(totalnum + j, i);
            }
            totalnum += i;
        }
    }

    public int countraw(int num) {
        return map.get(num);
    }

    public int countcolumn(int num, int raw) {
        int sum = 0;
        for (int i = 1; i <= raw - 1; i++) {
            sum += i;
        }
        return num - sum;
    }

    public int countValue(int raw, int column) {
        int sum = 0;
        for (int i = 1; i < raw; i++) {
            sum += i;
        }
        return yh[column + sum];
    }
}
