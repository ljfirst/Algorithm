package DataStructure.stringANDline.array.arrayApply;

import java.util.Scanner;

/**
 * @author liujun
 * @version 1.0
 * @date 2020/12/20
 * @author—Email liujunfirst@outlook.com
 * @blogURL https://blog.csdn.net/ljfirst
 * @description 细菌扩展
 */
public class BacterialExpansion {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String s = scanner.nextLine();
            if (s == null || s.length() == 0) {
                System.out.println(0);
                continue;
            }
            String[] s1 = s.split(",");
            if (s1.length != 6) {
                System.out.println(0);
                continue;
            }
            int[] u = new int[s1.length];
            for (int i = 0; i < s1.length; i++) {
                u[i] = Integer.parseInt(s1[i]);
            }
            int raw = u[0];
            int column = u[1];
            int[][] mx = new int[raw][column];
            int[][] mx2 = new int[raw][column];
            if (u[2] >= raw || u[3] >= column || u[4] >= raw || u[5] >= column) {
                System.out.println(0);
               continue;
            }
            init(mx, u[2], u[3], u[4], u[5]);
            init(mx2, u[2], u[3], u[4], u[5]);
            int count = 0;
            for (; ; count++) {
                if (check(mx)) {
                    break;
                }
                int[][] temp = mx;
                mx = mx2;
                mx2 = temp;
                reflash(mx, mx2);
            }
            System.out.println(count);
        }
    }

    public static void init(int[][] matrix, int l1, int l2, int r1, int r2) {
        matrix[l1][l2] = 1;
        matrix[r1][r2] = 1;
    }

    public static void reflash(int[][] matrix, int[][] matrix2) {
        int raw = matrix2.length;
        int column = matrix2[0].length;
        for (int i = 0; i < raw; i++) {
            for (int j = 0; j < column; j++) {
                if (matrix2[i][j] == 1) {
                    if (j - 1 >= 0) {
                        matrix[i][j - 1] = 1;
                    }
                    if (j + 1 < column) {
                        matrix[i][j + 1] = 1;
                    }
                    if (i - 1 >= 0) {
                        matrix[i - 1][j] = 1;
                    }
                    if (i + 1 < raw) {
                        matrix[i + 1][j] = 1;
                    }
                }
            }
        }
    }

    public static boolean check(int[][] matrix) {
        int raw = matrix.length;
        int column = matrix[0].length;
        for (int i = 0; i < raw; i++) {
            for (int j = 0; j < column; j++) {
                if (matrix[i][j] == 0) {
                    return false;
                }
            }
        }
        return true;
    }
}
