package Algorithm.comprehensive.optimalSchedule;

/**
 * @author liujun
 * @version 1.0
 * @date 2020/10/28
 * @author—Email liujunfirst@outlook.com
 * @blogURL https://blog.csdn.net/ljfirst
 * @description 最佳调度问题
 */
public interface OptimalSchedule {

    public int schedule(int[] taskspendTime, int machineNum);

    default boolean check(int[] taskspendTime, int machineNum) {
        if (taskspendTime == null || taskspendTime.length == 0 || machineNum <= 0) {
            return false;
        }
        return true;
    }
}
