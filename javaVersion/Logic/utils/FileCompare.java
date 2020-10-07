package Logic.utils;

import Algorithm.dynamic.lcs.LCSforcompare;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

/**
 * @author liujun
 * @version 1.0
 * @date 2019-10-22 16:32
 * @author��Emailliujunfirst@outlook.com
 * @description 
 */
public class FileCompare {

    LCSforcompare lcsc = new LCSforcompare();
    HashMap<String,ArrayList> hashmap = new HashMap<>();
    SelectionSortforFileCompare ssfc = new SelectionSortforFileCompare();

    //compare source string and target string,
    // similarity means how many same character in the two string
    public void compareComponent(String source, String target, int similarity){

        ReadTxt rt = new ReadTxt();
        ArrayList list1 = rt.ReadTxttoList(source);
        ArrayList list2 = rt.ReadTxttoList(target);

        for (int i = 0; i < list1.size(); i++) {
            for (int j = 0; j < list2.size(); j++) {
                lcsc.Lcsforcompare((String)list1.get(i),(String)list2.get(j));
                if(lcsc.getCompareLength() >= similarity){
                    ArrayList<String> list;
                    if(hashmap.containsKey(list1.get(i))){
                        list = hashmap.get(list1.get(i));
                    }else{
                        list = new ArrayList();
                    }
                    list.add(String.valueOf(lcsc.getCompareLength())+list2.get(j));
                    hashmap.put((String)list1.get(i),list);
                }
            }
            System.out.println("--------------"+i+"------------------");
        }
    }

    public void print(){
        Set<String> keys=hashmap.keySet();
        int totalnum = 0;
        for (String s:keys) {
            System.out.println(s+"=======:");
            ArrayList list = hashmap.get(s);
            String[] compareStorage = ssfc.selectionSort(list);
            for(String s1 : compareStorage){
                System.out.println(s1+"<---->");
            }
            totalnum++;
            System.out.println("------------------------------------");
        }
        System.out.println("totalnum:"+totalnum);
    }

    public void compareFile(String source, String target, int similarity){
        compareComponent(source,target,3);
        print();
    }

    public static void main(String[] args) {
        String filepath1 = "C:\\Users\\Administrator\\Desktop\\1\\1.txt";
        String filepath2 = "C:\\Users\\Administrator\\Desktop\\1\\3.txt";
        FileCompare cf = new FileCompare();
        cf.compareComponent(filepath1,filepath2,3);
        cf.print();
    }
}
