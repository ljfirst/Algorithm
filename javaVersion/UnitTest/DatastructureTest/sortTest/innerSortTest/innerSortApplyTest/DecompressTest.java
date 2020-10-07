package UnitTest.DatastructureTest.sortTest.innerSortTest.innerSortApplyTest;

import DataStructure.sort.innerSort.innerSortApply.Decompress;
import org.junit.Test;

/**
 * @author liujun
 * @version 1.0
 * @date 2019-11-25 00:35
 * @author—Email  liujunfirst@outlook.com
 * @description 
 * @blogURL
 */
public class DecompressTest {

    Decompress decompress = new Decompress();

    @Test
    public void testDecompression(){
        String depressString = decompress.decompression(demo01);
        assert depressString.equals("");
        depressString = decompress.decompression(demo02);
        assert depressString.equals("");
        depressString = decompress.decompression(demo03);
        assert depressString.equals("");
        depressString = decompress.decompression(demo04);
        assert depressString.equals("benddoouzzvvvv");
        depressString = decompress.decompression(demo05);
        assert depressString.equals("bbddddeaaacc");
        depressString = decompress.decompression(demo06);
        assert depressString.equals("gtthhhyyybbbbbfffffvvvvv");
    }
    //测试用例01
    public String demo01 = null;
    //测试用例02
    public String demo02 = "";
    //测试用例03
    public String demo03 = "a1b2cc3d4f56";//不是标准输入
    //测试用例04
    public String demo04 = "u1e1b1o2z2n1d2v4";//benddoouzzvvvv
    //测试用例05
    public String demo05 = "c2d4e1a3b2";//输出bbddddeaaacc
    //测试用例06
    public String demo06 = "g1t2y3h3b5v5f5";//输出gtthhhyyybbbbbfffffvvvvv
}
