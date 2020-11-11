package DataStructure.stringANDline.array.other;

/**
 * @author liujun
 * @version 1.0
 * @date 2020/5/15
 * @author—Email liujunfirst@outlook.com
 * @blogURL https://blog.csdn.net/ljfirst
 * @description 大整数乘法
 */
public class BigIntegersMulti {

    //大整数乘法
    public String multi(String args, String args2) {
        StringBuffer sb = new StringBuffer(args);
        StringBuffer sb2 = new StringBuffer(args2);
        //运算符判断
        int signal = 0;
        if ("-".equals(args.substring(0, 1))) {
            sb.delete(0, 1);
            signal++;
        }
        if ("-".equals(args2.substring(0, 1))) {
            sb2.delete(0, 1);
            signal++;
        }
        //字符串逆置，方便计算和存储
        char[] ch = sb.reverse().toString().toCharArray();
        char[] ch2 = sb2.reverse().toString().toCharArray();
        //两个数相乘的积位数不会大于两数位数之和
        int length = ch.length + ch2.length;
        int[] sum = new int[length];
        //运算
        for (int i = 0; i < ch.length; i++) {
            for (int j = 0; j < ch2.length; j++) {
                sum[i + j] += (ch[i] - '0') * (ch2[j] - '0');
            }
        }
        //数值整理和进位
        for (int i = 0; i < length - 1; i++) {
            sum[i + 1] += (sum[i] / 10);
            sum[i] %= 10;
        }
        StringBuffer sb3 = new StringBuffer();
        //消除0
        int u = length - 1;
        while (sum[u] == 0) {
            u--;
        }
        //逆序
        for (; u >= 0; u--) {
            sb3.append(sum[u]);
        }

        //带上运算符号
        if ((signal & 1) == 1) {
            sb3.insert(0, "-");
        }
        return sb3.toString();
    }
}
