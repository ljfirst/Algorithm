package Logic.utils;

import java.util.Random;

/**
 * @author liujun
 * @version 1.0
 * @date 2019-11-02 23:30
 * @author—Email liujunfirst@outlook.com
 * @description 
 */
public class RamdomUtil {

    Random random = new Random();

    //随机生成不同长度的字符串:字符串长度，限制在2-100
    public String productrandomdomString(){
        //randomd.nextInt(x)表示区间[0,x)
        int num = random.nextInt(99)+2;
        return productRandomString(num);
    }

    //随机生成给定长度的字符串
    public String productRandomString(int num){
        /*在asc码中,'0'+17='A',“A”+32=“a”
        所以，‘0-9’=‘0’+[0,9],‘A-Z’=‘0’+[17,42],‘a-z’=‘0’+[49,75]*/
        char a = '0';
        int addNum;
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < num; i++) {
            addNum = getEqualNum();
            char c1 = (char) (a + addNum);
            stringBuffer.append(c1);
        }
        return stringBuffer.toString();
    }
    //生成一组包含大小写，数字的 不同长度 字符串:字符串长度，限制在2-100
    public String productRandomNumandString() {

        int num = random.nextInt(99)+2;
        return productRandomNumandString(num);
    }

    //生成一组包含大小写，数字的 定长 字符串
    public String productRandomNumandString(int num) {

        String[] alpha = {"A","B","C","D","E","F","G","H","I","J","K",
                "L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
        //字符串序列
        StringBuffer stringBuffer = new StringBuffer();
        //m取值1，2，3，表示选择“大写字母”、“小写字母”、“数字”
        int choice = 0;
        while(num>0){
            choice = random.nextInt(3);
            switch(choice){
                case 0:
                    stringBuffer.append(alpha[random.nextInt(26)]);
                    break;
                case 1:
                    stringBuffer.append(alpha[random.nextInt(26)].toLowerCase());
                    break;
                case 2:
                    stringBuffer.append(random.nextInt(10));
                    break;
                default:
                    break;
            }
            num--;
        }
        //输出随机字符串
        return stringBuffer.toString();
    }
    
    //生成一个等概率的[0,9],[17,42],[49,74]之间的数
    public int getEqualNum(){
        int equalNum = random.nextInt(75);
        if((equalNum > 9 && equalNum < 17) || (equalNum > 42 && equalNum < 49)){
            return getEqualNum();
        }
        return equalNum;
    }


}
