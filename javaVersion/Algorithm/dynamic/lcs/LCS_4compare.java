package Algorithm.dynamic.lcs;

import java.util.ArrayList;
import java.util.List;

/**
 * @author liujun
 * @version 1.0
 * @date 2018-7-19 Time：上午10:15:35
 * @author—Email ljfirst@mail.ustc.edu.cn
 * @description LCS算法，找出两个字符串最大匹配子串。
 */

public class LCS_4compare {

    //获取字符串长度,其中在矩阵中n1表示行数,n2表示列数
    int n1;
    int n2;
    //数值矩阵 存放字符匹配数量的最大值
    int[][] num_matrix;
    //标记矩阵 存放字符匹配标记
    char[][] char_matrix;
    //找寻匹配上的字符串
    List<Character> ComparedList = new ArrayList<Character>();

    public LCS_4compare() {
    }

    public void Lcsforcompare(String s1, String s2) {

        //获取字符串长度,其中在矩阵中n1表示行数,n2表示列数
        n1 = s1.length();
        n2 = s2.length();

        //数值矩阵 存放字符匹配数量的最大值
        num_matrix = new int[n1 + 1][n2 + 1];
        //标记矩阵 存放字符匹配标记
        char_matrix = new char[n1 + 1][n2 + 1];

        //数值矩阵初始化（若未初始化,数值矩阵显示为0,标记矩阵显示为口）
        for (int i = 0; i < n1; i++) {
            num_matrix[i][0] = 0;
            char_matrix[i][0] = 0;
        }
        for (int j = 0; j < n2; j++) {
            num_matrix[0][j] = 0;
            char_matrix[0][j] = 0;
        }

        //矩阵匹配,从每一行（或列）开始匹配
        //初始化的部分不用考虑，匹配从1开始
        for (int row = 1; row <= n1; row++) {
            //遍历列
            for (int column = 1; column <= n2; column++) {
                num_matrix[row][column] = 0;//初始化数值矩阵
                char_matrix[row][column] = 0;//初始化标记矩阵

                if (s1.charAt(row - 1) == s2.charAt(column - 1)) {//字符串元素匹配相等
                    num_matrix[row][column] = num_matrix[row - 1][column - 1] + 1;//取矩阵左上角数值加一
                    char_matrix[row][column] = '↖';//匹配标记（方便后面寻找）
                } else {//字符串元素匹配不等
                    if (num_matrix[row - 1][column] > num_matrix[row][column - 1]) {
                        num_matrix[row][column] = num_matrix[row - 1][column];//取矩阵上一行数值
                        char_matrix[row][column] = '↑';//向上寻找标记
                    } else {
                        num_matrix[row][column] = num_matrix[row][column - 1];//取矩阵左边数值
                        char_matrix[row][column] = '←';//向左寻找标记
                    }
                }
            }
        }

        //找寻匹配上的字符串
        for (int i = n1, j = n2; i > 0 && j > 0; ) {
            if (char_matrix[i][j] == '↖') {
                ComparedList.add(s1.charAt(i - 1));
                i--;
                j--;
            } else if (char_matrix[i][j] == '↑') {
                i--;
            } else {
                j--;
            }
        }

    }

    public int getCompareLength() {

        //System.out.println("LCS's length:");
        return num_matrix[n1][n2];
    }

    public String getCompareSequence() {
        //打印匹配上的字符串（逆序打印）
        //System.out.print("LCS:");
        StringBuffer sb = new StringBuffer();
        for (int as = ComparedList.size() - 1; as >= 0; as--) {
            sb.append(ComparedList.get(as));
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        LCS_4compare l = new LCS_4compare();
        l.Lcsforcompare("个人客户数据分析应用", "2017年度大数据挖掘建模分析");
        System.out.println(l.getCompareLength());
        System.out.println(l.getCompareSequence());
    }
}
