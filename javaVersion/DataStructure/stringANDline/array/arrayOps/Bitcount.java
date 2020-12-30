package DataStructure.stringANDline.array.arrayOps;

/**
 * @author liujun
 * @version 1.0
 * @date 2018-9-3 下午06:59:34
 * @author—Email liujunfirst@outlook.com
 * @description 计算bit位
 * 1)获取二进制正数中1位的数量
 * 2)获取二进制补码中1位的数量
 */
public class Bitcount {

    //获取二进制正数中1位的数量：右移法
    public void byteCountMethod1(int num) {
        // TODO Auto-generated method stub
        int count = 0;
        while (num > 0) {
            if ((num & 1) != 0) {
                count++;
            }
            //无符号右移，且重新赋值
            num >>= 1;
        }
        System.out.println(count);
    }

    //末尾1取反法，正数
    public void byteCountMethod2(int num) {
        int count = 0;
        while (num > 0) {
            num &= (num - 1);
            count++;
        }
        System.out.println(count);
    }

    //查表法，正数
    public void byteCountMethod3(int num) {
        // 列举了0到15 的表
        int[] countTable = {
                0, 1, 1, 2,
                1, 2, 2, 3,
                1, 2, 2, 3,
                2, 3, 3, 4
        };
        if (num > Integer.MAX_VALUE && num < 0) {
            System.out.println(-1);
        }
        System.out.println(countTable[num]);
    }

    //JDK自带补码字节统计工具，适用正数和负数
    public void byteCountMethod4(int num) {
        // TODO Auto-generated method stub
        System.out.println(Integer.bitCount(num));
    }

    /**
     * >>： 带符号右移。正数右移高位补0，负数右移高位补1。比如：4 >> 1，结果是2；-4 >> 1，结果是-2。-2 >> 1，结果是-1。
     * >>>：无符号右移。无论是正数还是负数，高位通通补0。
     */
    //获取二进制 补码 中1位的数量：两两合并法
    public int byteCountComplementMethod1(int i) {
        i = i - ((i >>> 1) & 0x55555555);
        i = (i & 0x33333333) + ((i >>> 2) & 0x33333333);
        i = (i + (i >>> 4)) & 0x0f0f0f0f;
        i = i + (i >>> 8);
        i = i + (i >>> 16);
        //0x3f，因为32字节，最多32个1，使用&的话，用到7位。
        return i & 0x3f;
    }

    //获取二进制 补码 中1位的数量：末尾1取反法
    public int byteCountComplementMethod2(int num) {
        int count = 0;
        while (num != 0) {
            count++;
            num = num & (num - 1);
        }
        return count;
    }

    /**
     * 左移法，需要配合& 一起使用
     * 右移法，一般选择无符号右移，但是需要注意符号位
     */
    public int byteCountComplementMethod3(int num) {
        int count = 0;
        while (num != 0) {
            count++;
            num = num & (num << 1);
            /**
             * 或者使用 num >>>= 1;
             */
        }
        return count;
    }

}
