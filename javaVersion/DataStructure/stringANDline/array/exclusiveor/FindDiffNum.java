package DataStructure.stringANDline.array.exclusiveor;

/**
 * @author liujun
 * @version 1.0
 * @date 2020-01-14 14:22
 * @author—Email liujunfirst@outlook.com
 * @description 找出不同的数
 * 1、一个长度为99的数组，数据范围是1-100，数组内数据均不重复，找出丢失的那个数
 * 2、一个长度为100的数组，共100个数，99个不同，找出那个相同的数
 * @blogURL
 */
public class FindDiffNum {

    /**
     * @param array      待查找数组
     * @param rangeBegin 数据范围开始
     * @param rangeEnd   数据范围结束
     * @return 丢失的那个数
     */
    public int findLostNum(int[] array, int rangeBegin, int rangeEnd) {
        int range = rangeEnd - rangeBegin + 1;
        if (array == null || range <= 1 || array.length != range - 1) {
            return Integer.MIN_VALUE;
        }
        return count(array, rangeBegin, rangeEnd);
    }

    private int count(int[] array, int rangeBegin, int rangeEnd) {
        int sum = 0;
        for (int i = 0, start = rangeBegin; i < array.length; i++, start++) {
            sum += (start - array[i]);
        }
        sum += rangeEnd;
        return sum;
    }

    //一个长度为100的数组，共100个数，每个数字均出现一个，后来混进来一个重复的数，找出那个重复的数
    public int findRepertNum(int[] array) {
        FindNum_One_Double f = new FindNum_One_Double();
        int value = f.findvalue(array);
        return value;
    }
}
