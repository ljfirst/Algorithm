package Algorithm.comprehensive.shortestDeliveryPath;

/**
 * @author liujun
 * @version 1.0
 * @date 2020-02-11 14:36
 * @author—Email  liujunfirst@outlook.com
 * @description  送货最短路径 接口 ShortestDeliveryPath
 * 如图，某物流派送员p，需要给a、b、c、d4个快递点派送包裹， 请问派送员需要选择什么的路线，才能完成最短路程的派送。假设如图派送员的起点坐标(0,0)，
 *  * 派送路线只能沿着图中的方格边行驶，每个小格都是正方形，且边长为1，如p到d的距离就是4。
 *  * 随机输入n个派送点坐标，求输出最短派送路线值（从起点开始完成n个点派送并回到起始点的距离）。
 * @blogURL
 */
public interface ShortPath {

    public int shortPath(int[] position_row, int[] position_column);

    default boolean check(int[] position_row, int[] position_column){
        if (position_row == null || position_column == null
                || position_row.length == 0 || position_column.length == 0
                || position_row.length != position_column.length) {
            return false;
        }
        return true;
    }
}
