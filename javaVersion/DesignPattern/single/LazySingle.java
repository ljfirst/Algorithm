package DesignPattern.single;

/**
 * @author liujun
 * @version 1.0
 * @date 2020-02-17 18:24
 * @Email liujunfirst@outlook.com
 * @description LazySinglePattren means delayed loading,
 * but exist thread safety problem.
 * So use synchronized to solve this problem,
 * but still exist performance problem.
 * @blogURL
 */

public class LazySingle implements Singletom {
    private static LazySingle lazySinglePattren = null;

    private LazySingle() {
    }

    public static LazySingle getlLazySinglePattren() {
        synchronized (LazySingle.class) {
            if (lazySinglePattren == null) {
                lazySinglePattren = new LazySingle();
            }
        }

        return lazySinglePattren;
    }
}
