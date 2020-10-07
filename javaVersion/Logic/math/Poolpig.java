package Logic.math;

/**
 * @author liujun
 * @version 1.0
 * @date 2019-12-03 20:09
 * @author—Email  liujunfirst@outlook.com
 * @description  假设有n只水桶，猪饮水中毒后会在m分钟内死亡，
 * 你需要多少猪（x）就能在p分钟内找出 “有毒” 水桶？
 * 这n只水桶里有且仅有一只有毒的桶。
 * @blogURL
 */
public class Poolpig {

    public int needNum(int bucketNum, int alivetime, int givenTime){

        if(bucketNum <= 0 || alivetime <= 0 || givenTime <= 0){
            return 0;
        }
        if(givenTime <= alivetime){
            return 0;
        }
        int maxtTestNum = givenTime / alivetime + 1;
        double logNum = Math.log(bucketNum) / Math.log(maxtTestNum);
        int needNum = (int)Math.ceil(logNum);
        return needNum <= 1 ? 1 : needNum;
    }
}
