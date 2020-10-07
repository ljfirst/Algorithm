package Logic.math;
/** 
 *@author liujun
 *@date 2018-9-3 下午06:59:34
 *@author—Email liujunfirst@outlook.com
 *@description 
 *  1)获取二进制正数中1位的数量
 *  2)获取二进制补码中1位的数量
 *@version 1.0
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
	        0,1,1,2,  
	        1,2,2,3,  
	        1,2,2,3,  
	        2,3,3,4  
	    };    
	    if( num > Integer.MAX_VALUE && num < 0 ){  
	        System.out.println(-1); 
	    }  
	    System.out.println(countTable[num]);
	}
	
	//JDK自带补码字节统计工具，适用正数和负数
	public void byteCountMethod4(int num) {
		// TODO Auto-generated method stub

		System.out.println(Integer.bitCount(num));
	}
	
	//获取二进制补码中1位的数量：两两合并法
	public void byteCountComplementMethod1(int i) {
		// TODO Auto-generated method stub

		i = i - ((i >>> 1) & 0x55555555);
		i = (i & 0x33333333) + ((i >>> 2) & 0x33333333);
		i = (i + (i >>> 4)) & 0x0f0f0f0f;
		i = i + (i >>> 8);
		i = i + (i >>> 16);
		//0x3f，因为32字节，最多32个1，使用&的话，用到7位。
		System.out.println(i & 0x3f);
	}
	
	public int byteCountComplementMethod11(int i) {

		i = i - ((i >>> 1) & 0x55555555);
		i = (i & 0x33333333) + ((i >>> 2) & 0x33333333);
		i = (i + (i >>> 4)) & 0x0f0f0f0f;
		i = i + (i >>> 8);
		i = i + (i >>> 16);
		//0x3f，因为32字节，最多32个1，使用&的话，用到7位。
		return i & 0x3f;
	}
	
	//获取二进制补码中1位的数量：末尾1取反法
	private void byteCountComplementMethod2(int num) {

		int count = 0; 
        while(num != 0){ 
            count++;
            num = num & (num - 1);
         } 
        System.out.println(count); 
	}
	
	//左移法，尽量不要使用右移，因为有符号位
	public void byteCountComplementMethod3(int num) {

		int count = 0; 
        while(num != 0){ 
            count++;
            num <<= 1;
         }
        System.out.println(count); 
	}
	
	//主方法测试
	public static void main(String[] args) {
		
		//-1包括符号位，一个32个1
		int i = -1;
		Bitcount bc = new Bitcount();
		//bc.byteCountMethod1(i);
		bc.byteCountComplementMethod1(i);
		bc.byteCountComplementMethod2(i);
		bc.byteCountComplementMethod3(i);
	}
}
