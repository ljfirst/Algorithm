package Algorithm.backtrack;

/**
 * @author liujun
 * @version 1.0
 * @date 2019-12-06 22:05
 * @author—Email liujunfirst@outlook.com
 * @description 最佳调度问题 （贪心）
 * 设有n个任务由k个可并行工作的机器来完成，完成任务i需要时间为 task_SpendTime。
 * 试设计一个算法找出完成这n个任务的最佳调度，使完成全部任务的时间最早
 */

public class OptimalSchedule_Greed implements OptimalSchedule {

    //最优解
    int bestTime;
    //机器花费的时间序列、任务数量
    int[] MachineTask_Schedule;
    int machineNum;
    int[] task_SpendTime;
    int taskNum;

    @Override
    public int schedule(int[] taskspendTime, int machineNum) {
        if (!check(taskspendTime, machineNum)) {
            return -1;
        }
        MachineTask_Schedule = new int[machineNum];
        for (int i = 0; i < taskspendTime.length; i++) {
            int time = getminMachine();
            MachineTask_Schedule[time] += taskspendTime[i];
        }
        int spendTime = 0;
        for (int i = 0; i < MachineTask_Schedule.length; i++) {
            if (MachineTask_Schedule[i] > spendTime) {
                spendTime = MachineTask_Schedule[i];
            }
        }
        return spendTime;
    }

    //找出目前花费最少时间的那台机器
    public int getminMachine() {
        int num = 0;
        int time = Integer.MAX_VALUE;
        for (int i = 0; i < MachineTask_Schedule.length; i++) {
            if (time > MachineTask_Schedule[i]) {
                time = MachineTask_Schedule[i];
                num = i;
            }
        }
        return num;
    }
}
