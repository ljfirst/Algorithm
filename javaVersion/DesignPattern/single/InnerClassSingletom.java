package DesignPattern.single;

/**
 * @author liujun
 * @version 1.0
 * @date 2018-4-22 Time������12:04:39
 * @Email ljfirst@mail.ustc.edu.cn
 * @description
 */
public class InnerClassSingletom implements Singletom {

    private InnerClassSingletom() {
    }

    //inner-class
    public static class SinglePatternHub {
        private static final InnerClassSingletom singlePattern =
                new InnerClassSingletom();
    }

    public static InnerClassSingletom getsSinglePattern() {
        return SinglePatternHub.singlePattern;
    }
}