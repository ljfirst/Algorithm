package UnitTest.DatastructureTest.sortTest.innerSortTest.innerSortRealizeTest;

import DataStructure.sort.innerSort.innerSortRealize.BucketSort;
import UnitTest.DatastructureTest.sortTest.innerSortTest.SortTest;
import org.junit.Test;
import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Mode;

/**
 * @author liujun
 * @version 1.0
 * @date 2020-02-11 15:06
 * @author-Email liujunfirst@outlook.com
 * @description 桶排序  测试案例
 * @blogURL
 */
public class BucketSortTest extends SortTest {

    @Test
    @Benchmark
    @BenchmarkMode(Mode.Throughput)
    public void TestInnerSortRealize(){
        super.TestInnerSortRealize(new BucketSort());
    }
}
