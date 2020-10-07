package Logic.math;

import java.util.ArrayList;
import java.util.List;

/** 
 *@author liujun
 *@date 2019-8-2 下午01:18:35
 *@author—Email liujunfirst@outlook.com
 *@CSDN Blog URL:https://blog.csdn.net/ljfirst/article/details/98177653
 *@description 吸血鬼数字的实现
 *@version 1.0
 */
public class Vampire {

	public static void main(String[] args) {
		Vampire v = new Vampire();
		long time1 = System.nanoTime();
		for (int i = 0; i < 1000; i++) {

			v.Vampire1();
		}
		System.out.println(System.nanoTime() - time1);
		
		time1 = System.nanoTime();
		for (int i = 0; i < 1000; i++) {

			v.Vampire2();
		}
		System.out.println(System.nanoTime() - time1);
		
	}
	public void Vampire1() {
		List<String> list = new ArrayList<String>();
		for (int i = 10; i <= 99; i++) {
			for (int j = i; j <= 99; j++) {
				// Pete Hartley's theoretical result:  
				//If x·y is a vampire number then x·y == x+y (mod 9) 
		        if ((i * j) % 9 != (i + j) % 9){
		            continue;
		        }
		        int value = i * j;
		        String s = i+""+j;
		        char[] c = Integer.toString(value).toCharArray();
				if(c.length != 4){
					continue;
				}
		        for (int l = 0; l < c.length; l++) {
		        	if(s.indexOf(c[l]) != -1){
		        		s = s.substring(0,s.indexOf(c[l]))+"a"+s.substring(s.indexOf(c[l])+1,s.length());
		        	}
				}
		        if(s.equals("aaaa")){
		        	list.add(i+"*"+j+"="+value);
		        }
			}
		}
		/*for (String s : list) {
			System.out.println(s);
		}*/
	}
	
	public void Vampire2() {  
        int[] startDigit = new int[4];  
        int[] productDigit = new int[4];  
        for (int num1 = 10; num1 <= 99; num1++)  
            for (int num2 = num1; num2 <= 99; num2++) {  
                // Pete Hartley's theoretical result:  
                // If x·y is a vampire number then  
                // x·y == x+y (mod 9)  
                if ((num1 * num2) % 9 != (num1 + num2) % 9)  
                    continue;  
                int product = num1 * num2;  
                startDigit[0] = num1 / 10;  
                startDigit[1] = num1 % 10;  
                startDigit[2] = num2 / 10;  
                startDigit[3] = num2 % 10;  
                productDigit[0] = product / 1000;  
                productDigit[1] = (product % 1000) / 100;  
                productDigit[2] = product % 1000 % 100 / 10;  
                productDigit[3] = product % 1000 % 100 % 10;  
                int count = 0;  
                for (int x = 0; x < 4; x++)  
                    for (int y = 0; y < 4; y++) {  
                        if (productDigit[x] == startDigit[y]) {  
                            count++;  
                            productDigit[x] = -1;  
                            startDigit[y] = -2;  
                            /*if (count == 4)  
                                System.out.println(num1 + " * " + num2 + " : "  
                                        + product); */ 
                        }  
                    }  
            }  
    } 
}
