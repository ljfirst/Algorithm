package UnitTest.DatastructureTest.sortTest.innerSortTest.innerSortRealizeTest;

import DataStructure.sort.innerSort.innerSortRealize.QuickSortOpt;
import UnitTest.DatastructureTest.sortTest.innerSortTest.SortTest;
import org.junit.Test;
import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Mode;

/**
 * @author liujun
 * @version 1.0
 * @date 2020-02-11 15:09
 * @author—Email liujunfirst@outlook.com
 * @description 双向快排优化  测试案例
 * @blogURL
 */
public class QuickSortOptTest extends SortTest {

    @Test
    //@Benchmark
    //@BenchmarkMode(Mode.Throughput)
    public void TestInnerSortRealize(){
        super.TestInnerSortRealize(new QuickSortOpt());
    }
}
