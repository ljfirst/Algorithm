package DataStructure.stringANDline.stringCompare;

import DataStructure.stringANDline.StringCompare;
import java.util.Map;
import java.util.TreeMap;

/**
 * @author liujun
 * @version 1.0
 * @date 2019-12-06 22:52
 * @authorEmail liujunfirst@outlook.com
 * @description Boyer-Moore BM算法匹配字符串
 * @blogURL 参考博客（推荐）：https://blog.csdn.net/weixin_34419321/article/details/85595113?utm_medium=distribute.pc_relevant.none-task-blog-BlogCommendFromMachineLearnPai2-2.nonecase&depth_1-utm_source=distribute.pc_relevant.none-task-blog-BlogCommendFromMachineLearnPai2-2.nonecase
 * 参考博客：https://www.cnblogs.com/sunsky303/p/9580378.html
 * 参考博客：https://www.cnblogs.com/wxgblogs/p/5701101.html
 */
public class BM implements StringCompare {
    Map<Character, Integer> targetMap_BedTable;
    Map<Integer, Integer> targetMap_GoodTable;
    int sourceLength;
    int targetLength;

    @Override
    public boolean compare(String source, String target) {
        return check(source, target) ? bmcmp(source, target) : false;
    }

    //算法主体
    public boolean bmcmp(String source, String target) {
        int sourcePoint = -1;
        sourceLength = source.length() - 1;
        targetLength = target.length() - 1;
        targetMap_BedTable = new TreeMap<>();
        targetMap_GoodTable = new TreeMap<>();
        //初始化好后缀表、坏字符表
        bedCharTable(target);
        goodSuffixTable(target);

        while (sourcePoint <= sourceLength - targetLength) {
            //target串的指针每次从字符串末尾开始匹配,注意：targetPoint的范围是[1,target.length()]
            int targetPoint = targetLength + 1;
            Character c = null;
            //串内匹配
            for (; targetPoint >= 1; targetPoint--) {
                c = source.charAt(targetPoint + sourcePoint);
                if (c != target.charAt(targetPoint - 1)) {
                    break;
                }
            }
            //字符串完全匹配，target指针匹配至第一位，位置为0
            if (targetPoint == 0) {
                return true;
            }
            //计算source字符串的最大跳跃次数
            int goodp = goodSuffix(targetPoint);
            int bedp = bedChar(targetPoint, c);
            sourcePoint += Math.max(goodp, bedp);
        }
        return false;
    }
    
    //坏字符 需要 移动的位数
    public int bedChar(int targetPosition, Character c) {
        if (c == null) {
            return -1;
        }
        int offsite = targetMap_BedTable.containsKey(c) ? targetMap_BedTable.get(c) : -1;
        return targetPosition - offsite;
    }

    //构建 坏字符表，注意到此处只记录了存在的字符，不存在的需要置为-1，因此在使用的时候做一个转换
    public void bedCharTable(String target) {
        for (int i = 0; i <= targetLength; i++) {
            Character c = target.charAt(i);
            // BM算法还可能走回头路，也就是右移的距离是负数，
            // 只存模式串的最右边出现的位置，所以对于重复的词，只存最近的一次(距离字符串尾最近的)
            targetMap_BedTable.put(c, i + 1);
        }
    }

    //好后缀 需要 移动的位数
    public int goodSuffix(int targetPosition) {
        int offsite = targetMap_GoodTable.get(targetPosition);
        return offsite;
    }

    //构建 好后缀表
    public void goodSuffixTable(String target) {
        //写代码的时候我们先计算第三种情况，再计算第二种情况，再计算第一种情况，具体情况分类见博客

        //初始化，只要是匹配不上，就移动最大字符串长度
        for (int i = 1; i <= targetLength + 1; i++) {
            targetMap_GoodTable.put(i, targetLength + 1);
        }
        //恰后缀找不到，补前缀
        int temp = targetLength + 1;
        for (int i = targetLength; i >= 1; i--) {
            if (isPrefix(target, i)) {
                temp = i;
            }
            //targetMap_GoodTable.put(i, targetLength - (targetLength - temp));
            targetMap_GoodTable.put(i, temp);
        }

        //对应博客：https://www.cnblogs.com/wxgblogs/p/5701101.html
        //里面的"模式串中有子串匹配上好后缀"情况
        for (int i = 1; i <= targetLength; i++) {
            int templength = suffixLength(target, i);
            targetMap_GoodTable.put(targetLength + 1 - templength, targetLength - i);
        }
    }

    //前缀匹配，其中p表示 待匹配的前缀起始地址
    public boolean isPrefix(String target, int p) {
        for (int i = 0, j = p; j <= targetLength; i++, j++) {
            if (target.charAt(i) != target.charAt(j)) {
                return false;
            }
        }
        return true;
    }

    //后缀匹配，其中p表示 待匹配的后缀起始地址
    public int suffixLength(String target, int p) {
        int count = 0;
        for (int i = targetLength, j = p; i > 0 && target.charAt(i) == target.charAt(j); i--, j--) {
            count++;
        }
        return count;
    }

}
