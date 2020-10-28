package Algorithm.dynamic.lss;
/**
 * @author liujun
 * @version 1.0
 * @date 2018-7-19 Time：上午10:15:35
 * @author—Email liujunfirst@outlook.com
 * @description 已知数组A[1..n]中存放着一些实数，有正有负，
 * 请写程序找出其最大求和子区间
 * @version 1.0
 */
//最大子段和:LargestSumofSubSequence by dynamic
public class LSSopt {

	//输入序列数组，输出最大子段和、起始地址、结束地址
	public int LargestSumofSubSequence(int [] Sequence){
		
		int begin = 0;      //最大字段和的起始地址
		int begin_temp = 0; //假设的最大值
		int end = 0;        //最大字段和的结束地址
		int sum_temp = 0;   //暂时的最大值
		int sum = 0;        //记录最大值

        if(Sequence == null || Sequence.length == 0){
            return 0;
        }
        sum = sum_temp = Sequence[0];

		for(int i = 1; i < Sequence.length; i++){
			sum_temp += Sequence[i];
			if(sum_temp <= Sequence[i]){  //新开始
				sum_temp = Sequence[i];   //sum清空
				begin_temp = i;           //假定的起始位置
			}
			if(sum < sum_temp){
				sum = sum_temp;           //记录最大值
				begin = begin_temp;       //假定的起始地址赋值给起始地址
				end = i;                  //结束地址包括 i
			}
		}
		//System.out.println("maxValue:"+sum);
		//System.out.println("start position:"+(begin+1)+"  end position:"+(end+1));
		return sum;
	}
}
