package Algorithm.dynamic;

/**
 * @author liujun
 * @version 1.0
 * @date 2019-11-25 16:44
 * @author—Email  liujunfirst@outlook.com
 * @description  数字的最大乘积（类似的题目还有剪绳子）
 * 给定一个正整数 n，将其拆分为至少两个正整数的和，
 * 并使这些整数的乘积最大化。 返回你可以获得的最大乘积
 * @blogURL
 */
public class NumReduceMaxMulti {

    public int reduce(int num) {
        if (num <= 1) {
            return num;
        }
        int[] maxMultiarray = new int[num+1];
        maxMultiarray[1] = 1;
        //注意循环范围
        for (int i = 2; i <= num; i++) {
            for (int j = 1; j < i; j++) {
                //maxMultiarray[i] = Math.max(maxMultiarray[i], (j) * Math.max(i - j, maxMultiarray[i - j]));
                maxMultiarray[i] = Math.max(maxMultiarray[i], (i - j) * Math.max(j, maxMultiarray[j]));
            }
        }
        return maxMultiarray[num];
    }

    /*在数学上貌似有个啥“均值定理”来着，大概意思是如果两个整数的和为n，
    当两个整数尽量平分n的时候，两个整数的乘积才能达到最大*/
    public int reduceMath(int num) {
        if (num <= 1) {
            return num;
        }
        if (num <= 3) {
            return num - 1;
        }
        /*最优因子是3，所以我们需要让 n/3，这样的话，余数可能是1,2 两种可能性。
        如果余数是1，刚才我们也分析过，对于1的拆分是没有意义的，所以我们退一步，将最后一次的3和1的拆分，用2和2代替。
        如果余数是2，那不消多说，直接乘以最后的2即可。*/
        int x = num / 3, y = num % 3;
        //恰好整除，直接为3^x
        if (y == 0) {
            return (int) Math.pow(3, x);
        }
        //余数为1，退一步 3^(x-1)*2*2,余数为2，直接乘以2
        return y == 1 ? (int) Math.pow(3, x - 1) * 4 : (int) Math.pow(3, x) * 2;
    }
}
