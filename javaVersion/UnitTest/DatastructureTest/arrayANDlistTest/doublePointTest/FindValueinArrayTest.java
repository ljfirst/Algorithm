package UnitTest.DatastructureTest.arrayANDlistTest.doublePointTest;

import java.util.ArrayList;
import java.util.List;

/**
 * @author liujun
 * @version 1.0
 * @date 2020/12/1
 * @author—Email liujunfirst@outlook.com
 * @blogURL https://blog.csdn.net/ljfirst
 * @description n数之和 测试案例
 * 给定一个数 target，在一维数组中，找出某 n 个数相加得 target。
 * 要求一：如果存在这个 n 个数，返回true，反则返回false。
 * 要求二：返回存在的这 n 个值
 * 要求三：返回存在的这 n 个值在数组中的原位置
 * 要求四：返回所有的 n 数之和的组合
 * 要求五：返回所有的 n 数之和在数组中原位置的组合
 */
public class FindValueinArrayTest {

    //正案例
    int[] demoArray01_y = {1, 100, 22, 39, 43, 58, 64, 77, 79, 85, 96, 58};
    int target01_2_y = 99;
    List<int[]> value01_2_y = new ArrayList() {{
        this.add(new int[]{22, 77});
    }};
    List<int[]> position01_2_y = new ArrayList() {{
        this.add(new int[]{2, 7});
    }};
    int target01_2s_y = 101;
    List<int[]> value01_2s_y = new ArrayList() {{
        this.add(new int[]{1, 100});
        this.add(new int[]{22, 79});
        this.add(new int[]{43, 58});
    }};
    List<int[]> position01_2s_y = new ArrayList() {{
        this.add(new int[]{0, 1});
        this.add(new int[]{2, 8});
        this.add(new int[]{4, 11});
    }};

    int target01_3s_y = 199;
    List<int[]> value01_3s_y = new ArrayList() {{
        this.add(new int[]{22, 77, 100});
        this.add(new int[]{39, 64, 96});
        this.add(new int[]{43, 77, 79});
        this.add(new int[]{58, 64, 77});
        this.add(new int[]{58, 64, 77});
    }};
    List<int[]> position01_3s_y = new ArrayList() {{
        this.add(new int[]{5, 6, 7});
    }};

    /**
     * =======
     */
    int[] demoArray02_y = {34, 5, 6, 78, 7, 68, 43, 4, 56, 136, 789, 65, 139, 41, 60};
    int target02_2_y = 13;
    List<int[]> value02_2_y = new ArrayList() {{
        this.add(new int[]{6, 7});
    }};
    List<int[]> position02_2_y = new ArrayList() {{
        this.add(new int[]{2, 4});
    }};
    int target02_2s_y = 143;
    List<int[]> value02_2s_y = new ArrayList() {{
        this.add(new int[]{4, 139});
        this.add(new int[]{7, 136});
        this.add(new int[]{65, 78});
    }};
    List<int[]> position02_2s_y = new ArrayList() {{
        this.add(new int[]{3, 5});
        this.add(new int[]{4, 9});
        this.add(new int[]{7, 12});
    }};

    int target02_3_y = 990;
    List<int[]> value02_3_y = new ArrayList() {{
        this.add(new int[]{65, 136, 789});
    }};
    List<int[]> position02_3_y = new ArrayList() {{
        this.add(new int[]{9, 10, 11});
    }};
    int target02_3s_y = 168;
    List<int[]> value02_3s_y = new ArrayList() {{
        this.add(new int[]{34, 56, 78});
        this.add(new int[]{43, 60, 65});
    }};
    List<int[]> position02_3s_y = new ArrayList() {{
        this.add(new int[]{0, 3, 8});
        this.add(new int[]{6, 11, 14});
    }};

    /**
     * =======
     */
    int[] demoArray03_y = {34, 5, 6, 78, 7, 56, 432, 56, 78, 79,
            56, 8, 675, 64, 65, 43, 4, 56, 789, 65,
            41, 799, 469};
    int target03_2_y = 112;
    List<int[]> value03_2_y = new ArrayList() {{
        this.add(new int[]{34, 78});
        this.add(new int[]{56, 56});
        this.add(new int[]{56, 56});
    }};
    List<int[]> position03_2_y = new ArrayList() {{
        this.add(new int[]{5, 10});
        this.add(new int[]{5, 7});
        this.add(new int[]{7, 10});
    }};

    int target03_3_y = 1238;
    List<int[]> value03_3_y = new ArrayList() {{
        this.add(new int[]{7, 432, 799});
    }};
    List<int[]> position03_3_y = new ArrayList() {{
        this.add(new int[]{4, 6, 21});
    }};

    int target03_3s_y = 554;
    List<int[]> value03_3s_y = new ArrayList() {{
        this.add(new int[]{6, 79, 469});
        this.add(new int[]{7, 78, 469});
        this.add(new int[]{43, 79, 432});

    }};
    List<int[]> position03_3s_y = new ArrayList() {{
        this.add(new int[]{6, 9, 15});
        this.add(new int[]{2, 9, 22});
    }};

    //反案例
    int[] demoArray01_n = {};
    int[] demoArray02_n = null;
    int[] demoArray03_n = {34, 5, 6, 78, 7, 65, 43, 4, 56, 789, 65, 41};

    int target01_n_all = 112;
    int target02_n_all = 112;
    int target03_n_all = 4567;

    List<int[]> value01_2s_all = null;
    List<int[]> position03_2s_all = null;
}
