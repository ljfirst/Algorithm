package DataStructure.stringANDline.slidingWindow;

import DataStructure.stringANDline.StringCompare;

import java.util.ArrayList;

/**
 * @author liujun
 * @version 1.0
 * @date 2019-10-28 09:03
 * @author—Email liujunfirst@outlook.com
 * @description 字符串预处理法解决字符串匹配问题
 * 在 源串序列 中是否含有 目标串的 序列
 */
public class ProdealString implements StringCompare {

    @Override
    public boolean compare(String source, String target) {
        if (check(source, target)) {
            ArrayList<Integer>[] sourceList = stringPreDeal(source);
            return StringCompareComponent(sourceList, target);
        }
        return false;
    }

    public boolean compare(String source, String[] targetstring) {
        for (String s : targetstring) {
            return compare(source, s);
        }
        return false;
    }

    public boolean StringCompareComponent(ArrayList<Integer>[] sourceList, String target) {
        int source_point = 0;
        for (int i = 0; i < target.length(); i++) {
            char c = target.charAt(i);
            //target 出现了 source 中没有的字符，直接返回失败
            if (sourceList[c] == null) {
                return false;
            }
            //根据 source_point 获取 target 中该字符出现的位置（最接近source_point的位置）：targetList_Position
            int targetList_Position = getLeftBound(sourceList[c], source_point);
            //返回越界，不存在这个值
            if (targetList_Position == sourceList[c].size()) {
                return false;
            }
            //获取源串中的最左边的位置
            source_point = sourceList[c].get(targetList_Position) + 1;
        }
        return true;
    }

    //目标串预处理: 记录字符数组中的字符出现在目标串的位置
    public ArrayList[] stringPreDeal(String pattern) {
        //因为asc字符共有128个
        ArrayList<Integer>[] targetList = new ArrayList[128];
        for (int i = 0; i < pattern.length(); i++) {
            char c = pattern.charAt(i);
            if (targetList[c] == null) {//字符 c 自动转换成数字
                targetList[c] = new ArrayList<>();
            }
            //i是字符在目标串出现的的位置
            targetList[c].add(i);
        }
        return targetList;
    }

    //get left bound
    public int getLeftBound(ArrayList<Integer> list, int target) {
        int left = 0;
        int right = list.size() - 1;
        int mid;
        while (left <= right) { //二分法
            mid = (left + right) / 2;
            if (target == list.get(mid)) {
                return mid;
            } else if (target < list.get(mid)) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }
}