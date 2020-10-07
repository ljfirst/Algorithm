package Algorithm.comprehensive.backpack;

/** 
 *@author liujun
 *@date 2018-7-19 上午11:55:33
 *@author—Email liujunfirst@outlook.com
 *@description 
 *1.状态转换方程
 *2.如何找出所选物品
 *
 *扩展：
 *1.是否还有其他方法？回溯法？分支限界法？贪心？
 *2.然后可以重复选择呢？
 *@version 1.0
 */
public class Backpack_dynamic {

	public Backpack_dynamic(Integer[] goodsvalue, Integer[] weight, int packageweight) {

		//价值矩阵，列:背包的重量，行:加入的物品
		int[][] bestvalue = new int [packageweight + 1][goodsvalue.length + 1];
		
		//逐层规划,外层循环表示背包重量增加
		for (int i = 1; i <= packageweight; i++) {
			//内层循环,遍历物品
			for (int j = 1; j <= goodsvalue.length; j++) {
				
				//如果放入值比背包总重量还大，放弃
				if(weight[j-1] > i){
					bestvalue[i][j] = bestvalue[i][j - 1];
				}else{
					bestvalue[i][j] = 
						bestvalue[i][j - 1] > bestvalue[i - weight[j - 1]][j - 1] + goodsvalue[j - 1] ? 
							bestvalue[i][j - 1] : bestvalue[i - weight[j - 1]][j - 1] + goodsvalue[j - 1];
				}
			}
		}
		
		//打印矩阵值
		for (int i = 1; i <= packageweight; i++) {
			for (int j = 1; j <= goodsvalue.length; j++){
				if (bestvalue[i][j] < 10) {
					System.out.print(" " + bestvalue[i][j] + " ");
				}else{
					System.out.print(bestvalue[i][j] + " ");
				}
			}
			System.out.println();
		}
		
		
		//存放选择的物品
		int x[] = new int[goodsvalue.length];
		//背包实际装载重量
		int real_weight = 0;
		//找出所选物品
		int i = packageweight;
		int j = x.length;
		
		while(j >= 1 && i >= 1){
			if(bestvalue[i][j] != bestvalue[i][j - 1]){
				x[j - 1] = 1;//装入第i个物品
				i -= weight[j - 1];
				real_weight += weight[j - 1];
				j--;
			}else {
				x[j - 1] = 0;//不装入第i个物品
				j--;
			}
		}
		
		System.out.println("背包实际转载重量为："+real_weight);
		System.out.print("背包最大价值为：");
		System.out.println(bestvalue[packageweight - 1][goodsvalue.length - 1]);
		System.out.print("背包包含物品为：");
		
		//输出选择的物品
		for(int y = 0;y < x.length; y++){
			if(x[y] != 0){
				System.out.print(y+" ");
			}
		}
	}
}
