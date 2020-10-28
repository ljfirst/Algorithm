package Algorithm.backtrack;

/**
 * @author liujun
 * @version 1.0
 * @date 2019-12-06 22:05
 * @author—Email liujunfirst@outlook.com
 * @description 最佳调度问题 （分支限界、剪枝法、回溯法）
 * 设有n个任务由k个可并行工作的机器来完成，完成任务i需要时间为 task_SpendTime。
 * 试设计一个算法找出完成这n个任务的最佳调度，使完成全部任务的时间最早
 */

//注释掉的部分，是用于记录 任务-机器 对应表
public class OptimalSchedule_Backtrack implements OptimalSchedule {

    //最优解
    int bestTime;
    //机器花费的时间序列、任务数量
    int[] MachineTask_Schedule;
    int machineNum;
    int[] task_SpendTime;
    int taskNum;
    /*//每个任务分配给的机器型号
    int[] tasktoMachine_temp;
    int[] tasktoMachine_best;*/

    public int schedule(int[] taskspendTime, int machineNum) {

        //检查
        if (!check(taskspendTime, machineNum)) {
            return -1;
        }
        bestTime = Integer.MAX_VALUE;
        taskNum = taskspendTime.length;
        this.machineNum = machineNum;
        this.task_SpendTime = taskspendTime;
        this.MachineTask_Schedule = new int[machineNum];
       /* this.tasktoMachine_temp = new int[taskNum];
        this.tasktoMachine_best = new int[taskNum];*/
        arrange(0);
        return bestTime;
    }

    public void arrange(int Taskdepth) {
        if (Taskdepth == taskNum) {
            //找出所有机器的最大耗时
            int temp = 0;
            for (int i = 0; i < machineNum; i++) {
                temp = Math.max(temp, MachineTask_Schedule[i]);
            }
            //刷新 任务-机器 对应表
            if (bestTime > temp) {
                bestTime = temp;
                /*for (int i = 0; i < taskNum; i++) {
                    tasktoMachine_best[i] = tasktoMachine_temp[i];
                }*/
            }
            return;
        }
        for (int i = 0; i < machineNum; i++) {
            //剪枝,相对没有if的语句，效率提升一个数量级
            if (MachineTask_Schedule[i] + task_SpendTime[Taskdepth] < bestTime) {
                MachineTask_Schedule[i] += task_SpendTime[Taskdepth];
                /*tasktoMachine_temp[Taskdepth] = i;*/
                arrange(Taskdepth + 1);
                MachineTask_Schedule[i] -= task_SpendTime[Taskdepth];
            }
        }
    }
}
