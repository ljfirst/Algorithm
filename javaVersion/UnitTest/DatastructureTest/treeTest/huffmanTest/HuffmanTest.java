package UnitTest.DatastructureTest.treeTest.huffmanTest;

import DataStructure.tree.huffman.Huffman;
import org.junit.Test;

/**
 * @author liujun
 * @date 2020-02-19 17:00
 * @description  huffman的测试方法是，测试其WPL是否是最小（给定值）
 */
public class HuffmanTest {

    Huffman huf = new Huffman();

    @Test
    public void TestHuffman() {
        int value = huf.getHuffmanWPL(huf.buildHuffman(Demo01));
        assert value == WPL01;
        value = huf.getHuffmanWPL(huf.buildHuffman(Demo02));
        assert value == WPL02;
        value = huf.getHuffmanWPL(huf.buildHuffman(Demo03));
        assert value == WPL03;
        value = huf.getHuffmanWPL(huf.buildHuffman(Demo04));
        assert value == WPL04;
        value = huf.getHuffmanWPL(huf.buildHuffman(Demo05));
        assert value == WPL05;
    }

    //TestDemo
    int[] Demo01 = {1, 48, 17, 65, 42, 34, 44, 16, 41, 5};
    int WPL01 = 941;
    int[] Demo02 = {};
    int WPL02 = 0;
    int[] Demo03 = null;
    int WPL03 = 0;
    int[] Demo04 = {7, 5, 2, 4};
    int WPL04 = 35;
    int[] Demo05 = {5, 7, 5, 2, 4, 9};
    int WPL05 = 80;
}
