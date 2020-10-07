package UnitTest.AlgorithmTest.dynamicTest;

import Algorithm.dynamic.MiniValuePathofTriangle;
import org.junit.Test;

/**
 * @author liujun
 * @version 1.0
 * @date�� 2019-11-25 16:44
 * @author��Email liujunfirst@outlook.com
 * @description 
 * @blogURL
 */
public class MiniValuePathofTriangleTest {

    MiniValuePathofTriangle miniValuePathofTriangle = new MiniValuePathofTriangle();
    @Test
    public void Testmethod(){
        int value = miniValuePathofTriangle.method(Demo01);
        assert value == 9;
        value = miniValuePathofTriangle.method(Demo02);
        assert value == 11;
        value = miniValuePathofTriangle.method(Demo03);
        assert value == -1;
        value = miniValuePathofTriangle.method(Demo04);
        assert value == -1;
        value = miniValuePathofTriangle.method(Demo05);
        assert value == 60;
        value = miniValuePathofTriangle.method(Demo06);
        assert value == -1;
    }

    //��������
    int[][] Demo01 = {
            {1},
            {2, 5},
            {3, 6, 5},
            {2, 1, 5, 1},
            {8, 9, 2, 8, 9}
    };
    int[][] Demo02 = {
            {2},
            {3,4},
            {6,5,7},
            {4,1,8,3}
    };
    int[][] Demo03 = {
            {}
    };
    int[][] Demo04 = null;
    int[][] Demo05 = {
            {10},
            {20, 10},
            {30, 10, 55},
            {20, 10, 10, 91},
            {80, 92, 92, 10, 95},
            {80, 90, 62, 10, 10,10}
    };
    int[][] Demo06 = {
            {10},
            {20, 10},
            {30, 10, 55,60},
            {20, 10, 10, 91},
            {80, 92, 92, 10, 95},
            {80, 90, 62, 10, 10,10}
    };
}
