package Logic.game;

import java.util.*;
/**
 * @author liujun
 * @version 1.0
 * @date 2019-3-7 ����01:45:09
 * @author-Email liujunfirst@outlook.com
 * @description 游戏组件
 */

public class Tiger_Game_Utils {


    static String[] playname = {"天福", "双七", "双星", "西瓜", "铃铛", "芒果", "橘子", "苹果",};
    static boolean flag__limitless = false;
    static Scanner scan = new Scanner(System.in);
    static Chance chance = new Chance();
    static Random random = new Random();
    static int[] score = new int[8];
    static int money;
    static int lastMoney = 0;

    public void putmoney() {
        System.out.println("请输入筹码（10单位为一元）：");
        String s = scan.nextLine();

        money = Integer.parseInt(s);
        lastMoney = money;
    }

    public void input() {
        while (true) {
            System.out.print("              ");
            for (String i : playname) {
                System.out.print(i + "   ");
            }
            System.out.print("\n请下注本局筹码：");
            //下注
            if (wager(scan.nextLine()) == -1) {
                return;
            }
            System.out.println("下注结束还剩余：" + money);
            //奖池开始
            chance();
            lastMoney = money;
        }
    }

    private int wager(String s) {
        if (s.trim().equals("")) {
            //按照上一句继续押注
            for (int y : score) {
                money -= y;
            }
        } else if (s.trim().equals("M")) {
            //M情况下：全部押注99
            score = new int[]{99, 99, 99, 99, 99, 99, 99, 99};
            money -= 99 * playname.length;
        } else if (s.trim().equals("m")) {
            //m情况下：全部押注10
            score = new int[]{10, 10, 10, 10, 10, 10, 10, 10};
            money -= 10 * 8;
        } else if (s.trim().equals("1")) {
            //1情况下：只押注苹果 1
            score = new int[]{0, 0, 0, 0, 0, 0, 0, 1};
            money -= 1;
        } else {
            //其他正常投注，校验及修正
            score = new int[8];
            Check(s);
        }
        //System.out.println("剩余金额：" + money);
        if (money < 0) {
            System.out.println("金额不足，剩余：" + lastMoney);
            return -1;
        }
        return 0;
    }

    private void chance() {
        int gNodeIndex = chance.produceRatio();
        System.out.println("本次开奖为：" + chance.gameNodes[gNodeIndex].name);
        int playnameID = chance.gameNodes[gNodeIndex].getPlaynameID();
        int nowTimeMoney = 0;
        if (playnameID == 19) {
            nowTimeMoney = 0;
        } else if (gNodeIndex <= chance.playnameNormalID) {
            //常规节点
            int odds = chance.gameNodes[gNodeIndex].Odds;
            nowTimeMoney = odds * score[playnameID];
        } else {
            //非常规节点
            try {
                nowTimeMoney = judge_special(playnameID);
            } catch (Exception e) {
                e.printStackTrace();
            }
            System.out.println();
        }
        money += nowTimeMoney;
        System.out.println("本轮中奖金额：" + nowTimeMoney +
                "           目前总金额为：" + money +
                "\n\n===========新一轮开始============\n");
    }

    //金额检查
    private void Check(String s) {
        String[] c = s.trim().split(" ");
        int count = 0;
        for (int i = 0; i < c.length; i++) {
            if (c[i].equals("") || c[i] == null || c[i].length() == 0) {
                continue;
            }
            //金额填充
            score[count] = Integer.parseInt(c[i].trim());
            //在受限玩法中最大押注99
            if (score[count] > 99 && !flag__limitless) {
                score[count] = 99;
            }
            //循环扣除押注金额
            money -= score[count];
            count++;
            //下一位押注金额
            if (count == playname.length) {
                return;
            }
        }
        if (count < playname.length) {
            for (int i = count; i < playname.length; i++) {
                //没写默认为0
                score[i] = 0;
            }
        }
    }

    static int print(int i) throws InterruptedException {
        int id = chance.gameNodes[i].playnameID;
        int u = chance.gameNodes[i].Odds * score[id];
        System.out.print(chance.gameNodes[i].name + "=" + u + "元  ");
        Thread.sleep(850);
        return u;
    }

    //特殊酬金计算
    private int judge_special(int playnameid) throws InterruptedException {
        int sum = 0;
        int id = 0;
        int offsite = 0;
        switch (playnameid) {
            case 10: //"满堂彩",
                System.out.print("炸中：");
                for (int i = 0; i <= chance.playnameNormalID; i++) {
                    sum += print(i);
                    if (i % 6 == 5) {
                        System.out.print("\n     ");
                    }
                }
                return sum;
            case 11: //"半边红",
                //随机选取一般的节点：起始位不同
                offsite = random.nextInt(100) % 2;
                System.out.print("炸中：");
                for (int i = offsite; i <= chance.playnameNormalID; i += 2) {
                    sum += print(i);
                    if (i % 6 == 5) {
                        System.out.print("\n        ");
                    }
                }
                return sum;
            case 12: // "纵横四海",
                //随机选取一般的节点：起始位不同
                offsite = random.nextInt(100) % 4;
                System.out.print("炸中：");
                for (int i = offsite; i <= chance.playnameNormalID; i += 4) {
                    sum += print(i);
                }
                return sum;
            case 13: // "大三元",
                for (int i = 3; i <= 5; i++) {
                    id = chance.gameNodes[i].playnameID;
                    sum += chance.gameNodes[i].Odds * score[id];
                }
                return sum;
            case 14: // "小三元",
                for (int i = 6; i <= 8; i++) {
                    id = chance.gameNodes[i].playnameID;
                    sum += chance.gameNodes[i].Odds * score[id];
                }
                return sum;
            case 15: // "四小福", 苹果
                id = chance.gameNodes[15].playnameID;
                sum += chance.gameNodes[15].Odds * score[id];
                return sum;
            case 16: // "彩金翻倍", 1-20之间
                int n = random.nextInt(15) + 1;
                if (n > 10) {
                    n = random.nextInt(15) + 1;
                }
                System.out.print("恭喜您，彩金翻了" + n + "倍");
                for (int i = 0; i < score.length; i++) {
                    sum += score[i] * n;
                }
                return sum;
            case 17: // "开火车",
                sum = fireCar();
                return sum;
            case 18: // "随机炸"
                offsite = random.nextInt(chance.playnameNormalID + 1);
                System.out.println("随机炸中：" + chance.gameNodes[offsite].name);
                id = chance.gameNodes[offsite].playnameID;
                sum += chance.gameNodes[offsite].Odds * score[id];
                return sum;
        }
        return 0;
    }

    static Map<Integer, Integer> fireCarLimitMap;

    private int fireCar() throws InterruptedException {
        int sum = 0;
        //火车节数，此处有限制
        int fireCarNum = fireCarChance();
        int head = 0;
        limitfireCar();
        String s = "呜～呜～呜～ 火车开中：";
        for (int i = 0; i < s.length(); i++) {
            System.out.print(s.charAt(i));
            Thread.sleep(500);
        }
        int countCar = 0;
        for (int i = 0; i < fireCarNum; i++) {
            head = random.nextInt(chance.playnameNormalID + 1);
            //对于火车中奖限制：
            // 不允许同时出现两个一样的（大/中/小）天福、两个相同的大三元、两个以上相同的小三元,四个以上大苹果
            if (fireCarLimitMap.get(head) > 0) {
                sum += print(head);
                //对火车节数作出限制
                countCar++;
                if (countCar % 6 == 0) {
                    System.out.print("\n                   ");
                }
                if (countCar >= 12) {
                    break;
                }
            }
            fireCarLimitMap.put(head, fireCarLimitMap.get(head) - 1);
        }
        return sum;
    }

    private static void limitfireCar() {
        fireCarLimitMap = new HashMap<>();
        for (int i = 0; i < 9; i++) {
            fireCarLimitMap.put(i, 1);
        }
        for (int i = 9; i < 15; i++) {
            fireCarLimitMap.put(i, 2);
        }
        for (int i = 15; i <= 16; i++) {
            fireCarLimitMap.put(i, 4);
        }
    }

    private static int fireCarChance() {
        //火车节数：3-15节,因为后续有去重，所以此处多放置一些
        int carNum = 13;
        int n = random.nextInt(carNum) + 3;
        //如果节数太高，重新random一次
        if (n > 8) {
            n = random.nextInt(carNum) + 3;
            if (n >= 12) {
                n = random.nextInt(carNum) + 3;
            }
        }
        return n;
    }
}
