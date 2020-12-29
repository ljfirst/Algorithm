package UnitTest.DatastructureTest.sortTest.innerSortTest.innerSortRealizeTest;

import DataStructure.sort.innerSort.innerSortRealize.ShellSort;
import UnitTest.DatastructureTest.sortTest.innerSortTest.SortTest;
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
 * @description shell排序  测试案例
 */
public class ShellSortTest extends SortTest {
    @Test
    //@Benchmark
    //@BenchmarkMode(Mode.Throughput)
    public void TestInnerSortRealize(){
        super.TestInnerSortRealize(new ShellSort());
    }
}
