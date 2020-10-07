package Logic.utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

/**
 * @author liujun
 * @version 1.0
 * @date 2019-10-22 16:03
 * @author—Email liujunfirst@outlook.com
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
                System.out.println("第[" + rownum + "]行数据:[" + strLine + "]");
                /*strLine = strLine.replace("系统","");
                strLine = strLine.replace("项目","");
                strLine = strLine.replace("开发","");
                strLine = strLine.replace("管理","");
                strLine = strLine.replace("信息","");
                strLine = strLine.replace("平台","");*/
                list.add(strLine);
                rownum++;
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return list;
    }
}
