package Logic.game;

import lombok.AllArgsConstructor;
import lombok.Data;
import java.util.Random;

/**
 * @author liujun
 * @version 1.0
 * @date 2019-3-7 下午05:23:40
 * @author—Email liujunfirst@outlook.com
 * @description
 * @URL
 */
public class Chance {

    int playnameNormalID = 17;
    int playnameSpecialID = 26;

    @Data
    @AllArgsConstructor
    class GameNode {
        //名字
        String name;
        //属性
        int playnameID;
        //概率
        int ratio;
        //赔率
        int Odds;
    }

    private int countRatio() {
        int totalRatio = 0;
        for (GameNode i : gameNodes) {
            totalRatio += i.ratio;
        }
        return totalRatio;
    }

    public int produceRatio() {
        Random random = new Random();
        int num = random.nextInt(countRatio() + 1);
        int countNode = 0;
        int point = 0;
        while (num > countNode) {
            countNode += gameNodes[point].ratio;
            if (num <= countNode) {
                return point;
            }
            point++;
        }
        //只可能在num=0的时候，到这一步
        return 0;
    }

    public GameNode[] gameNodes = {
            //名字、概率、赔率,常规节点：0-17 (playnameNormalID)
            new GameNode("大天福", 0, 1, 100),
            new GameNode("中天福", 0, 2, 50),
            new GameNode("小天福", 0, 4, 25),

            new GameNode("大双七", 1, 20, 20),
            new GameNode("大双星", 2, 20, 20),
            new GameNode("大西瓜", 3, 20, 20),
            new GameNode("大铃铛", 4, 50, 10),
            new GameNode("大芒果", 5, 50, 10),
            new GameNode("大橘子", 6, 50, 10),

            new GameNode("小双七", 1, 200, 3),
            new GameNode("小双星", 2, 200, 3),
            new GameNode("小西瓜", 3, 200, 3),
            new GameNode("小铃铛", 4, 300, 3),
            new GameNode("小芒果", 5, 300, 3),
            new GameNode("小橘子", 6, 300, 3),
            new GameNode("大苹果", 7, 400, 5),
            new GameNode("小苹果", 7, 500, 3),
            new GameNode("奖金丢失", 19, 400, -1),

            //名字、概率、赔率,非常规节点：18-26  (playnameSpecialID)
            new GameNode("满堂彩", 10, 1, -1),
            new GameNode("半边红", 11, 2, -1),
            new GameNode("纵横四海", 12, 4, -1),
            new GameNode("大三元", 13, 10, -1),
            new GameNode("小三元", 14, 20, -1),
            new GameNode("四小福", 15, 80, -1),
            new GameNode("彩金翻倍", 16, 50, -1),
            new GameNode("开火车", 17, 20, -1),
            new GameNode("随机炸", 18, 200, -1)
    };
}
