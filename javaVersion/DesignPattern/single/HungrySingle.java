package DesignPattern.single;

/**
 * @author liujun
 * @version 1.0
 * @date 2020-02-17 18:22
 * @Email liujunfirst@outlook.com
 * @description HungrySinglePattern means The class object is created
 * when the class is loaded.
 * The private access level constructor ensures that
 * singletons are not instantiated in other code in the system.
 * @blogURL
 */
public class HungrySingle implements Singletom {

    //The final keyword ensures that objects will not be modified later.
    private static final HungrySingle hungrySinglePattern =
            new HungrySingle();

    private HungrySingle() {
    }

    public static HungrySingle getHungrySinglePattern() {
        return hungrySinglePattern;
    }

}
