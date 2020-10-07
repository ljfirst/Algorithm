package DataStructure.sort.innerSort.innerSortApply;

/**
 * @author liujun
 * @version 1.0
 * @date 2018-9-5 下午08:35:45
 * @author—Email liujunfirst@outlook.com
 * @description  将一段压缩后的字符串解压缩，并且排序输出。
 * 解压：字符串后续跟着的数字表示该字符串需要重复几次。
 * 排序：若相同的数字，如“c2a2”,按照ASCII编码排序，应输出“aacc”
 * 若不同的数字，按照出现顺序解压缩
 */
public class Decompress {

    public String decompression(String source) {

        if (source == null || source.length() == 0) {
            return "";
        }
        //匹配表达式，alpha是所有分割出来的字母，number是所有分割出来的数字
        String[] alpha = source.split("[0-9]+");
        String[] number = source.split("[a-zA-Z]+");

        boolean flag = true;
        for (int i = 0; i < source.length(); i++) {
            if (i % 2 == 0) {
                flag = String.valueOf(source.charAt(i)).matches("[a-zA-Z]+") ? true : false;
            } else {
                flag = String.valueOf(source.charAt(i)).matches("[0-9]+") ? true : false;
            }
            if (!flag) {
                return "";
            }
        }

        //num是为了后续排序，numreally是排序不影响跟alpha一对一
        int[] numberfront = new int[number.length - 1];
        int count = 0;
        //string转int
        for (int i = 0; i < number.length; i++) {
            if(number[i].matches("[0-9]+")){
                numberfront[count++] = Integer.parseInt(number[i]);
            }
        }
        StringBuffer sb = new StringBuffer();
        //选择排序，按照字母顺序排列相同数量的字母
        for (int i = 0; i < numberfront.length - 1; i++) {
            for (int j = i + 1; j < numberfront.length; j++) {
                //相同出现数量的按照asc码排序
                if ((numberfront[j] == numberfront[i]) && (alpha[i].charAt(0) - alpha[j].charAt(0) > 0)) {
                    String sd = alpha[i];
                    alpha[i] = alpha[j];
                    alpha[j] = sd;
                }
            }
        }
        //生成字符串
        for (int i = 0; i < numberfront.length; i++) {
            for (int j = 0; j < numberfront[i]; j++) {
                sb.append(alpha[i]);
            }
        }
        return sb.toString();
    }
}
