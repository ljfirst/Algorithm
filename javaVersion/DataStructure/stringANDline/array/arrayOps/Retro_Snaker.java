package DataStructure.stringANDline.array.arrayOps;

/**
 * @author liujun
 * @version 1.0
 * @date 2018-7-29 上午11:55:36
 * @author—Email liujunfirst@outlook.com
 * @description 贪吃蛇
 * 初始状态：贪吃蛇的蛇头在坐标(0,0)处，蛇身长度为10，
 * 蛇尾在(-10,0)处，呈一字型，输入一行字符，L表示蛇向左行走一格，R表示蛇向右行走一格，
 * U表示蛇向上行走一格，D表示蛇向下行走一格，判断输入的操作方式会不会导致蛇在自身上发生碰撞，
 * 会发生输出legal，不会发生输出illegal。
 */

public class Retro_Snaker {

    public Retro_Snaker() {
        // TODO Auto-generated constructor stub
    }

    public boolean Retro_Snaker_opera(String opera) {
        //判断输入的opera是否合法(操作仅含L,R,U,D)
        String match = "[LRUD]+";
        if (!opera.matches(match)) {
            System.out.println("illegal input");
            return false;
        }
        //每一节蛇身体的行列坐标，实现方式多样，也可以用类实现
        int[] row = {0, -1, -2, -3, -4, -5, -6, -7, -8, -9};
        int[] column = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

        //读取字符串序列，进行操作
        for (int i = 0; i < opera.length(); i++) {
            //保存开始时蛇头的位置
            int head_r = row[0];
            int head_c = column[0];
            //对操作进行判断
            switch (opera.charAt(i)) {
                case 'L'://如果是向左移动，只有横坐标发生变化，横坐标减一
                    head_r--;
                    break;
                case 'R'://如果是向右移动，只有横坐标发生变化，横坐标加一
                    head_r++;
                    break;
                case 'U'://如果是向上移动，只有纵坐标发生变化，纵坐标加一
                    head_c++;
                    break;
                case 'D'://如果是向下移动，只有纵坐标发生变化，横坐标减一
                    head_c--;
                    break;
                default:
                    break;
            }
            //对每一步操作进行判断是否发生碰撞，并且更新蛇身体的全部坐标
            for (int j = row.length - 2; j >= 0; j--) {
                //判断蛇头与身体上的某一处重合，发生碰撞
                if (head_r == row[j] && head_c == column[j]) {
                    System.out.println("CRASHED!");
                    return false;
                } else {//没有发生碰撞，更新蛇身体节点
                    row[j + 1] = row[j];
                    column[j + 1] = column[j];
                }
            }
            //最后更新蛇头节点
            row[0] = head_r;
            column[0] = head_c;
        }

        System.out.println("legal");
        return true;
    }
}
