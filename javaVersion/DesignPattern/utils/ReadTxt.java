package DesignPattern.utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

/**
 * @author liujun
 * @version 1.0
 * @date 2019-10-22 16:03
 * @author��Email liujunfirst@outlook.com
 * @description read txt to list
 */
public class ReadTxt {

    ArrayList list;
    int rownum;

    public ArrayList ReadTxttoList(String path) {
        rownum = 1;
        list = new ArrayList();
        try {
            File file = new File(path);
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String strLine = null;
            while(null != (strLine = bufferedReader.readLine())){
                System.out.println("��[" + rownum + "]������:[" + strLine + "]");
                /*strLine = strLine.replace("ϵͳ","");
                strLine = strLine.replace("��Ŀ","");
                strLine = strLine.replace("����","");
                strLine = strLine.replace("����","");
                strLine = strLine.replace("��Ϣ","");
                strLine = strLine.replace("ƽ̨","");*/
                list.add(strLine);
                rownum++;
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return list;
    }
}
