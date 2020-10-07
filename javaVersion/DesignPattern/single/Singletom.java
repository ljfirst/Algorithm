package DesignPattern.single;

/**
 * @author liujun
 * @version 1.0
 * @date 2020-02-17 18:30
 * @Email liujunfirst@outlook.com
 * @description
 * single pattern desing for this situation:just provider an instance for Class.
 * @HungrySinglePattern creates an instance object when
 * *the class is loaded, but there is no delay in loading.
 * *In order to solve this problem, {@LazySinglePattren} is introduced,
 * *although the load can be delayed, but the thread is unsafe.
 * *In order to solve the thread security problem,
 * *the synchronized keyword is introduced.
 * *But there is a performance problem, more time-consuming,
 * *finally , the {@inner-class} is a perfect solution.
 * *
 * *Attention:Experiments show that the double locks is faster
 * @blogURL:
 */
public interface Singletom {

}
