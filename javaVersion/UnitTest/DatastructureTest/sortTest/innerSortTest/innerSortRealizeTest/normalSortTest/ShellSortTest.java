package UnitTest.DatastructureTest.sortTest.innerSortTest.innerSortRealizeTest.normalSortTest;

import DataStructure.sort.innerSort.innerSortRealize.ShellSort;
import UnitTest.DatastructureTest.sortTest.innerSortTest.innerSortRealizeTest.InnerSortRealizeTestData;
import org.junit.Test;
import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Mode;

/**
 * @author liujun
 * @version 1.0
 * @date 2020/5/2
 * @author-Email liujunfirst@outlook.com
 * @blogURL https://blog.csdn.net/ljfirst
 * @description
 */
public class ShellSortTest extends InnerSortRealizeTestData {
    @Test
    @Benchmark
    @BenchmarkMode(Mode.Throughput)
    public void TestInnerSortRealize(){
        super.TestInnerSortRealize(new ShellSort());
    }
}
