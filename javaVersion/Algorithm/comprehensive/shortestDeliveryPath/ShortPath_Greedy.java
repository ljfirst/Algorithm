package Algorithm.comprehensive.shortestDeliveryPath;

/**
 * @author liujun
 * @version 1.0
 * @date 2020-02-11 14:32
 * @author—Email  liujunfirst@outlook.com
 * @description  送货最短路径  贪心算法
 * @blogURL
 */
public class ShortPath_Greedy implements ShortPath {

    @Override
    public int shortPath(int[] position_row, int[] position_column) {

        return check(position_row, position_column) ? shortPath_greedy(position_row, position_column) : -1;
    }

    //计算最短距离：prim思路
    public int shortPath_greedy(int[] position_row, int[] position_column) {

        //定义总距离 和 当前距离最小值
        int sum = 0;
        int min = Integer.MAX_VALUE;
        int positionNum = position_row.length;
        //p结点代表每次新加入的结点，是数组下标
        int p = 0;
        //初始化最短距离的数组 shortRouteValue有两个作用，记录最短距离和访问标识
        int[] shortRouteValue = new int[positionNum];
        for (int i = 0; i < shortRouteValue.length; i++) {
            shortRouteValue[i] = position_row[i] + position_column[i];
            if (min > shortRouteValue[i]) {
                min = shortRouteValue[i];
                p = i;
            }
        }
        sum += shortRouteValue[p];
        shortRouteValue[p] = -1;
        //第一个点作为起点，置为-1，表示已遍历过。
        for (int i = 1; i < positionNum; i++) {
            min = Integer.MAX_VALUE;
            //每次加入的新结点p,用来更新最短距离的数组。
            shortRouteValue = update(p, shortRouteValue, position_row, position_column);

            //遍历数组找出当前最小值的点
            for (int j = 0; j < shortRouteValue.length; j++) {
                if (shortRouteValue[j] != -1 && min > shortRouteValue[j]) {
                    min = shortRouteValue[j];
                    p = j;
                }
            }
            //将最小值与sum相加,并刷新最小值,设置当前最小值点已访问
            sum += min;
            shortRouteValue[p] = -1;
        }

        //最后加上返回值：从最后那个点回到起点
        sum = sum + position_row[p] + position_column[p];
        return sum;
    }

    //最短距离数组的更新函数
    private int[] update(int p, int[] shortRouteValue, int[] position_row, int[] position_column) {

        //定义距离
        int row_value = 0;
        int column_value = 0;
        //int count = 0;
        for (int i = 0; i < position_column.length; i++) {
            //更新所有未访问结点距离
            if (shortRouteValue[i] != -1) {
                //求绝对值,此处有两种不同写法
                column_value = Math.abs(position_column[p] - position_column[i]);
                row_value = position_row[p] - position_row[i] > 0 ? position_row[p] - position_row[i] : position_row[i] - position_row[p];
                //count = column_value + row_value;
                //shortRouteValue[i] = count < shortRouteValue[i] ? count : shortRouteValue[i];
                shortRouteValue[i] = column_value + row_value;
            }
        }
        return shortRouteValue;
    }
}