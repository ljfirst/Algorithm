package DataStructure.arrayANDlist.xor;

/**
 * @author liujun
 * @version 1.0
 * @date 2020/12/25
 * @author—Email liujunfirst@outlook.com
 * @blogURL https://blog.csdn.net/ljfirst
 * @description 找数字
 * 1、在一组数中，其他每个数都出现了两次，仅有一个数，仅出现一次，找出这个数。Double_One
 * 2、在一组数中，其他每个数都出现了两次，仅有两个数，仅出现一次，找出这两个数。DOuble_One_One
 * 3、在一组数中，其他每个数都出现了三次，仅有一个数，仅出现一次，找出这个数。Treble_One
 * 4、在一组数中，其他每个数都只出现一次，仅有一个数，出现了两次，找出这个数。One_Double
 */
public interface FindNum {

    int findvalue(int[] array);
}
