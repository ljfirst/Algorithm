package Logic.game;

import javax.naming.ldap.Rdn;
import java.util.Arrays;
import java.util.stream.Stream;

/**
 * @author liujun
 * @version 1.0
 * @date 2020/8/4
 * @author—Email liujunfirst@outlook.com
 * @blogURL https://blog.csdn.net/ljfirst
 * @description 大乐透
 */
public class BigLotto {

    public void congratulations(int[][] source, String... s) {
        for (String s1 : s) {
            congratulations(source, s1);
        }
    }

    public void congratulations(int[][] source, String s) {
        String[] arrs = s.split(" ");
        int blue;
        int red;
        for (int flag = 0; flag < source.length; flag++) {
            blue = 0;
            red = 0;
            for (int i = 0; i < 5; i++) {
                if (source[flag][i] == Integer.parseInt(arrs[i])) {
                    blue++;
                }
            }
            for (int i = 5; i < 7; i++) {
                if (source[flag][i] == Integer.parseInt(arrs[i])) {
                    red++;
                }
            }
            if (red >= 2 || (red + blue >= 3)) {
                System.out.print("red >= 2 || red+blue>=3" + "\nsource:");
                Arrays.stream(source[flag]).forEach(x -> System.out.print(x + " "));
                System.out.println("\nreal  :" + s + "\n");
            }else {
                System.out.println("fail...");
            }
        }
    }
}
