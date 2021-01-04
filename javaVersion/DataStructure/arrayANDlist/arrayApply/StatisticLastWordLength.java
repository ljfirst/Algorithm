package DataStructure.arrayANDlist.arrayApply;

import java.util.Scanner;

/**
 * @author liujun
 * @version 1.0
 * @date 2018-5-2 09:34:09
 * @author-Email liujunfirst@outlook.com
 * @description 统计最后一个字母的长度
 */
public class StatisticLastWordLength {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (scan.hasNext()) {
            String string = scan.nextLine();
            System.out.println(string.trim().length() -
                    string.trim().lastIndexOf(" ") - 1);
        }
    }
}
