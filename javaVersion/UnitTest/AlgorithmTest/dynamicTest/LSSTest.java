package UnitTest.AlgorithmTest.dynamicTest;

import Algorithm.dynamic.lss.LSS;
import Algorithm.dynamic.lss.LSS_Divide;
import Algorithm.dynamic.lss.LSSopt;
import Algorithm.dynamic.lss.LargestSumofSubSequence;
import org.junit.Test;
import org.reflections.Reflections;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * @author liujun
 * @version 1.0
 * @date 2019-11-25 16:39
 * @author—Email liujunfirst@outlook.com
 * @description 最大子段和
 * @blogURL
 */
public class LSSTest {

    // 存储接口IDataValidator所有实现类的对象
    private static List<LargestSumofSubSequence> dataValidators = new ArrayList<>();

    {
        // 扫描 LargestSumofSubSequence 所在的包
        Reflections reflections = new Reflections(LargestSumofSubSequence.class.getPackage().getName());
        // 获取包 下面所有 LargestSumofSubSequence 实现类
        Set<Class<? extends LargestSumofSubSequence>> implClass = reflections.getSubTypesOf(LargestSumofSubSequence.class);
        for (Class<? extends LargestSumofSubSequence> aClass : implClass) {
            try {
                dataValidators.add(aClass.newInstance());
            } catch (InstantiationException | IllegalAccessException e) {
                e.printStackTrace();
            }
        }
    }

    @Test
    public void Testmethodlss() {
        for (LargestSumofSubSequence lss : dataValidators) {
            int sum = lss.LargestSumofSubSequence(demo01);
            assert sum == 39;
            sum = lss.LargestSumofSubSequence(demo02);
            assert sum == 233;
            sum = lss.LargestSumofSubSequence(demo03);
            assert sum == 0;
            sum = lss.LargestSumofSubSequence(demo04);
            assert sum == 0;
            sum = lss.LargestSumofSubSequence(demo05);
            assert sum == -1;
            sum = lss.LargestSumofSubSequence(demo06);
            assert sum == 36;
            sum = lss.LargestSumofSubSequence(demo07);
            assert sum == 22;
            sum = lss.LargestSumofSubSequence(demo08);
            assert sum == -1;
            sum = lss.LargestSumofSubSequence(demo09);
            assert sum == 1;
        }
    }

    //测试用例
    int[] demo01 = {-1, -2, -3, 4, 5, 6, 7, 8, 9, -10, -11, -12};//39
    int[] demo02 = {27, -49, 1, 3, -6, 8, 12, -5, -6, 78, 2, -6, -2, 15, 47,
            1, 5, -69, 52, 5, 51, -48, 1, 56, -19, -8, 48, 15};//233
    int[] demo03 = {};//0
    int[] demo04 = null;//0
    int[] demo05 = {-1, -2, -3, -4};//-1
    int[] demo06 = {-1, -2, 1, 2, 3, 4, 5, 6, -3, -4, 2, 2, 3, 4, 5, 6};//36
    int[] demo07 = {-1, -2, 1, 2, 3, 4, 5, 6, -3, -4, -50, 2, 2, 3, 4, 5, 6};//22
    int[] demo08 = {-8, -2, -3, -1, -4};//-1
    int[] demo09 = {-8, -2, 1, -3, -1, -4};//1
}
