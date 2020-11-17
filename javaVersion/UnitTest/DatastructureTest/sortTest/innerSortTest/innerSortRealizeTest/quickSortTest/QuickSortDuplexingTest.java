package UnitTest.DatastructureTest.sortTest.innerSortTest.innerSortRealizeTest.quickSortTest;

import DataStructure.sort.innerSort.innerSortRealize.QuickSortDuplexing;
import UnitTest.DatastructureTest.sortTest.innerSortTest.innerSortRealizeTest.InnerSortRealizeTestData;
import org.junit.Test;
import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Mode;

/**
 * @author liujun
 * @version 1.0
 * @date 2020-02-11 15:09
 * @author-Email liujunfirst@outlook.com
 * @description
 * @blogURL
 */
public class QuickSortDuplexingTest extends InnerSortRealizeTestData {

    @Test
    @Benchmark
    @BenchmarkMode(Mode.Throughput)
    public void TestInnerSortRealize() {
        super.TestInnerSortRealize(new QuickSortDuplexing());
    }
}
