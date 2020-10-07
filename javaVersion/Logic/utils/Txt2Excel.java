package Logic.utils;

import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author liujun
 * @version 1.0
 * @date 2020/3/24
 * @author—Email  liujunfirst@outlook.com
 * @blogURL https://blog.csdn.net/ljfirst
 * @description 
 */
public class Txt2Excel {
    int offsite = 5;
    int id = 1;
    int length = 0;
    int targetnum = 0;
    String repoName = "";
    String commitType = "";
    String branchName = "";
    String commitID = "";
    String commit = "";
    String codeReview = "1、未进行CI，未合并至DEV_sprint4分支。 \n" +
            "2、未进行CodeReview。\n" +
            "3、本次缺少单元测试案例，需要后补。";
    String commitor = "";
    String deployVersion = "无";
    String buildPath = "无";

    boolean flag = true;
    WritableSheet sheetA;
    WritableWorkbook Excelbook;

    public static void main(String[] args) {
        Txt2Excel t = new Txt2Excel();
        t.txt2excel();
    }

    public void txt2excel() {
        String dailybuild = "Dailybuild";
        Date now = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd ");
        String time = dateFormat.format(now);
        String txtPath = "d:/test/1.txt";
        String excelPath = "d:/test/" + dailybuild + "_" + time + ".xls";

        File fileExcel = new File(excelPath);
        File fileTxt = new File(txtPath);
        dowork(fileExcel, fileTxt);
    }

    public void dowork(File fileExcel, File fileTxt) {

        if (fileExcel.exists()) {
            fileExcel.delete();
        }
        try {
            Excelbook = Workbook.createWorkbook(fileExcel);
            sheetA = Excelbook.createSheet("sheet1", 0);
            //Title
            String[] Title = {"提交\n序号", "仓名", "提交\n类型", "提交分支和编号", "提交说明", "审核情况", "代码\n提交人", "可部署\n版本号", "制品库"};
            for (int i = 0; i < 9; i++) {
                Label label = new Label(i + 1, offsite, Title[i]);
                sheetA.addCell(label);
            }
            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(fileTxt), "UTF-8"));
                String strLine = null;
                if (null != (strLine = bufferedReader.readLine())) {
                    length++;
                    strLine = strLine.trim();
                    if (strLine.startsWith("====")) {
                        dealrepo(bufferedReader, strLine);
                    }
                }
                //codeing row num static
                String[] Title1 = {"提交类型", "代码总增量", "*.java", "*.cs", "*.js/*.vue/*.css", "*.json/xml/html/htm", "*.ps"};
                for (int i = 0; i < 7; i++) {
                    Label label = new Label(i + 1, 0, Title1[i]);
                    sheetA.addCell(label);
                }
                Label label2 = new Label(1, 1, "行数");
                sheetA.addCell(label2);
                BufferedReader bufferedReader1 = new BufferedReader(new InputStreamReader(new FileInputStream(fileTxt), "UTF-8"));
                int staticNum = 0;
                strLine = null;
                while (null != (strLine = bufferedReader1.readLine())) {
                    staticNum++;
                    if (staticNum >= targetnum) {
                        if (strLine.startsWith("今日")) {
                            Label label = new Label(2, 1, strLine.split("：")[1]);
                            sheetA.addCell(label);
                        } else if (strLine.startsWith("java")) {
                            Label label = new Label(3, 1, strLine.split("：")[1]);
                            sheetA.addCell(label);
                        } else if (strLine.startsWith("cs")) {
                            Label label = new Label(4, 1, strLine.split("：")[1]);
                            sheetA.addCell(label);
                        } else if (strLine.startsWith("js_")) {
                            Label label = new Label(5, 1, strLine.split("：")[1]);
                            sheetA.addCell(label);
                        } else if (strLine.startsWith("json")) {
                            Label label = new Label(6, 1, strLine.split("：")[1]);
                            sheetA.addCell(label);
                        } else if (strLine.startsWith("ps")) {
                            Label label = new Label(7, 1, strLine.split("：")[1]);
                            sheetA.addCell(label);
                        }
                    }
                }

            } catch (Exception e) {
                e.printStackTrace();
            }
            Excelbook.write();
            Excelbook.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void dealrepo(BufferedReader bufferedReader, String strLine) throws IOException, WriteException {

        repoName = strLine.replace("=", "").trim();
        while (null != (strLine = bufferedReader.readLine())) {
            length++;
            if(strLine.startsWith("今日")){
                targetnum = length;
            }
            if (strLine.startsWith("commit")) {
                flag = true;
                dealcommmit(bufferedReader, strLine);
            }
            if (strLine.startsWith("*")) {
                branchName = strLine.replace("*", "").trim();
            }
            if (strLine.startsWith("====")) {
                clearrepo();
                dealrepo(bufferedReader, strLine);
            }
        }
        return;
    }

    public void dealcommmit(BufferedReader bufferedReader, String strLine) throws IOException, WriteException {
        while (strLine != null) {
            strLine = strLine.trim();
            if (strLine.startsWith("commit") && flag) {
                flag = false;
                commitID = strLine.replace("commit", "").trim().substring(0, 8);
            } else if (strLine.startsWith("Author:")) {
                commitor = strLine.replace("Author:", "").trim();
            } else if (strLine.startsWith("Date:") || strLine.equals("")) {
            } else if (strLine.startsWith("====")) {
                printcommit();
                clearrepo();
                id++;
                dealrepo(bufferedReader, strLine);
            } else if (strLine.startsWith("commit")) {
                printcommit();
                clearcommit();
                id++;
                flag = true;
                dealcommmit(bufferedReader, strLine);
            } else {
                if (strLine.startsWith("Type")) {
                    commitType = strLine.replace("Type：", "").trim();
                    commitType = commitType.replace("Type:", "");
                }
                commit = commit + strLine.trim() + "\n";
            }
            strLine = bufferedReader.readLine();
            length++;
            if(null != strLine && strLine.startsWith("今日")){
                targetnum = length;
            }
        }
        return;
    }

    public void printcommit() throws WriteException {
        Label label1 = new Label(1, id + offsite, id + "");
        Label label2 = new Label(2, id + offsite, repoName);
        if (commitType.equals("")) {
            commitType = "feat";
        }
        Label label3 = new Label(3, id + offsite, commitType);
        Label label4 = new Label(4, id + offsite, "Branch：\n" + branchName + "\n SHA：\n" + commitID);
        Label label5 = new Label(5, id + offsite, commit);
        Label label6 = new Label(6, id + offsite, codeReview);
        Label label7 = new Label(7, id + offsite, commitor);
        Label label8 = new Label(8, id + offsite, deployVersion);
        Label label9 = new Label(9, id + offsite, buildPath);
        sheetA.addCell(label1);
        sheetA.addCell(label2);
        sheetA.addCell(label3);
        sheetA.addCell(label4);
        sheetA.addCell(label5);
        sheetA.addCell(label6);
        sheetA.addCell(label7);
        sheetA.addCell(label8);
        sheetA.addCell(label9);

        /*System.out.println("id:" + id
                + "——《》——" + "repoName:" + repoName
                + "——《》——" + "commitType:" + commitType
                + "——《》——" + "branchName:" + branchName
                + "——《》——" + "commitID:" + commitID
                + "——《》——" + "commit:" + commit
                + "——《》——" + "codeReview:" + codeReview
                + "——《》——" + "commitor:" + commitor
                + "——《》——" + "deployVersion:" + deployVersion
                + "——《》——" + "buildPath:" + buildPath);
        System.out.println("==================================================");*/
    }

    public void clearrepo() {
        repoName = "";
        commitType = "";
        branchName = "";
        commitID = "";
        commit = "";
        //String codeReview = "";
        commitor = "";
        //String deployVersion = "";
        //String buildPath = "";
    }

    public void clearcommit() {
        commitType = "";
        commitID = "";
        commit = "";
        //String codeReview = "";
        commitor = "";
        //String deployVersion = "";
        //String buildPath = "";
    }

}
