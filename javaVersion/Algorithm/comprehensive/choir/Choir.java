package Algorithm.comprehensive.choir;

/**
 * @author liujun
 * @version 1.0
 * @date 2020-02-12 09:37
 * @author—Email  liujunfirst@outlooChoseNum.com
 * @description  合唱团
 * 有 n 个学生站成一排，每个学生有一个能力值，牛牛想从这 n个学生中
 * *按照顺序选取 ChoseNum名学生，要求相邻两个学生的位置编号的差不超过 d，
 * *使得这 ChoseNum个学生的能力值的乘积最大，你能返回最大的乘积吗？
 * @blogURL
 */
public interface Choir {

    public int getMaxValue(int[] array, int choseNum, int intervald);

    default boolean check(int[] array, int choseNum, int interval) {
        if (array == null || array.length == 0 ||
                choseNum <= 0 || choseNum > array.length ||
                interval <= 0|| interval > array.length) {
            return false;
        }
        return true;
    }
}
