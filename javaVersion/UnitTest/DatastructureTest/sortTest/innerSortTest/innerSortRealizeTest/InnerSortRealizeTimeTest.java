package UnitTest.DatastructureTest.sortTest.innerSortTest.innerSortRealizeTest;

import org.junit.Test;
import org.openjdk.jmh.annotations.OutputTimeUnit;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;

import java.util.concurrent.TimeUnit;

/**
 * @author liujun
 * @version 1.0
 * @date 2020/6/4
 * @author—Email liujunfirst@outlook.com
 * @blogURL https://blog.csdn.net/ljfirst
 * @description
 */
@OutputTimeUnit(TimeUnit.NANOSECONDS)
public class InnerSortRealizeTimeTest {

    //@Test
    public void sortTimeTest() throws RunnerException {

        Options options = new OptionsBuilder().
                include("Sort")//此处是模糊匹配
                .warmupIterations(10)//预热2轮
                .measurementIterations(10)//实际2轮
                .forks(3)//预热2轮+实际2轮算一组，这是循环2组
                .build();
        new Runner(options).run();
    }
}
