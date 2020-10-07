package Logic.math;

/**
 * @author liujun
 * @version 1.0
 * @date 2020-01-14 14:22
 * @author—Email  liujunfirst@outlook.com
 * @description  找出不同的数
 * @blogURL
 */
public class FindDiffNum {

    //一个长度为99的数组，数据范围是1-100，数组内数据均不重复，找出丢失的那个数
    /*
    * size:数据范围
    * array:数组
    * array.length == size -1*/
    public int findLostNum(int[] array, int begin){
        int sum = array.length + begin;
        for (int i = 0; i < array.length; i++) {
            sum += (begin - array[i]);
            begin++;
        }
        return sum;
    }

    public static void main(String[] args) {
        FindDiffNum f = new FindDiffNum();
       /* int[] hh = {1,2,3,9,8,7,5,6,4};
        int h = f.findLostNum(hh,1);
        System.out.println(h);*/

        int[] hh = {1,2,3,9,8,7,6,6,4,0};
        int h = f.findRepertNum(hh);
        System.out.println(h);

    }
    //一个长度为100的数组，共100个数，99个不同，找出那个相同的数
    public int findRepertNum(int[] array){
        //数组内交换
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        for (int i = 0; i < 9; i++) {

        }
        return 1;
    }
}
