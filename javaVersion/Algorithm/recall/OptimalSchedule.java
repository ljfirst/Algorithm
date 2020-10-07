package Algorithm.recall;

/**
 * @author liujun
 * @version 1.0
 * @date 2019-12-06 22:05
 * @author—Email  liujunfirst@outlook.com
 * @description  最佳调度问题（分支限界）
 * 设有n个任务由k个可并行工作的机器来完成，完成任务i需要时间为 taskspendTime。试设计一个算法找出完成这n个任务的最佳调度，使完成全部任务的时间最早
 * @blogURL
 */
//注释掉的部分，是用于记录 任务-机器 对应表
public class OptimalSchedule {

    //最优解
    int bestTime;
    //机器花费的时间序列、任务数量
    int[] MachineTaskSchedule;
    int machineNum;
    int[] taskspendTime;
    int taskNum;
    /*//每个任务分配给的机器型号
    int[] tasktoMachine_temp;
    int[] tasktoMachine_best;*/

    public int schedule(int[] taskspendTime, int machineNum) {

        //检查
        if (taskspendTime == null || taskspendTime.length == 0 || machineNum <= 0) {
            return -1;
        }
        bestTime = Integer.MAX_VALUE;
        taskNum = taskspendTime.length;
        this.machineNum = machineNum;
        this.taskspendTime = taskspendTime;
        this.MachineTaskSchedule = new int[machineNum];
       /* this.tasktoMachine_temp = new int[taskNum];
        this.tasktoMachine_best = new int[taskNum];*/
        long time = System.nanoTime();
        arrange(0);
        System.out.println(System.nanoTime() - time);
        return bestTime;
    }

    public void arrange(int Taskdepth) {
        if (Taskdepth == taskNum) {
            //计算
            int temp = 0;
            for (int i = 0; i < machineNum; i++) {
                temp = temp < MachineTaskSchedule[i] ? MachineTaskSchedule[i] : temp;
            }
            //刷新 任务-机器 对应表
            if(bestTime > temp){
                bestTime = temp;
                /*for (int i = 0; i < taskNum; i++) {
                    tasktoMachine_best[i] = tasktoMachine_temp[i];
                }*/
            }
            return;
        }
        for (int i = 0; i < machineNum; i++) {
            //剪枝,相对没有if的语句，效率提升一个数量级
            if(MachineTaskSchedule[i] + taskspendTime[Taskdepth] < bestTime){
                MachineTaskSchedule[i] += taskspendTime[Taskdepth];
                /*tasktoMachine_temp[Taskdepth] = i;*/
                arrange(Taskdepth + 1);
                MachineTaskSchedule[i] -= taskspendTime[Taskdepth];
            }
        }
    }
}
