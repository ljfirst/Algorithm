package UnitTest.AlgorithmTest.dynamicTest;

import Algorithm.dynamic.MiniValuePathofMatrix;
import org.junit.Test;

/**
 * @author liujun
 * @version 1.0
 * @date�� 2019-11-25 17:00
 * @author��Email liujunfirst@outlook.com
 * @description 
 * @blogURL
 */
public class MiniValuePathofMatrixTest {

    MiniValuePathofMatrix miniValuePathofMatrix = new MiniValuePathofMatrix();
    @Test
    public void Testmethod(){

        int value = miniValuePathofMatrix.method(Demo01);
        assert value == 7;
        value = miniValuePathofMatrix.method(Demo02);
        assert value == -1;
        value = miniValuePathofMatrix.method(Demo03);
        assert value == 7;
        value = miniValuePathofMatrix.method(Demo04);
        assert value == 23;
        value = miniValuePathofMatrix.method(Demo05);
        assert value == -1;
        value = miniValuePathofMatrix.method(Demo06);
        assert value == -1;
        value = miniValuePathofMatrix.method(Demo07);
        assert value == -1;
        value = miniValuePathofMatrix.method(Demo08);
        assert value == 9;
    }

    //��������
    int[][] Demo01= {
            {1,3,1},
            {1,5,1},
            {4,2,1},
    };
    int[][] Demo02= {
            {2},
            {3,4},
            {6,5,7},
            {4,1,8,3}
    };
    int[][] Demo03= {
            {1,3,1},
            {1,5,1},
            {1,20,1},
    };
    int[][] Demo04= {
            {1,3,1},
            {1,10,20},
            {24,10,1},
    };
    int[][] Demo05= {
            {},
            {},
            {4,10,1},
    };
    int[][] Demo06= {
            {}
    };
    int[][] Demo07= null;
    int[][] Demo08= {
            {1, 3,1, 8, 1},
            {1, 1,20,8, 50},
            {24,1,1, 60,1},
            {24,1,1, 1, 50},
            {24,1,1, 1, 1},
    };
}
