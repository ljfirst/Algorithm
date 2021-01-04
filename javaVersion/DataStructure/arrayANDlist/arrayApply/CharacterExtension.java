package DataStructure.arrayANDlist.arrayApply;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 * @author liujun
 * @version 1.0
 * @date 2020/12/20
 * @author—Email liujunfirst@outlook.com
 * @blogURL https://blog.csdn.net/ljfirst
 * @description 字符扩展
 */
public class CharacterExtension {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String s1 = scanner.nextLine();
            String s2 = scanner.nextLine();
            Map<Integer, String> map = count(s1);
            String ans = reduce(map, s2);
            System.out.println(ans);
        }
    }

    public static Map count(String s1) {
        String[] source = s1.split(",");
        Map<Integer, String> map = new TreeMap<>();
        for (String ss : source) {
            int index = ss.indexOf("-");
            String df = ss;
            if (index != -1) {
                df = ss.substring(0, index);
            }
            map.put(Integer.parseInt(df), ss);
        }
        return map;
    }

    public static String reduce(Map<Integer, String> map, String s2) {
        String dd = null;
        int target = Integer.parseInt(s2);
        for (int sd1 : map.keySet()) {
            if (sd1 <= target) {
                dd = map.get(sd1);
            }
        }
        if (dd != null) {
            if (dd.contains("-")) {
                String[] sed = dd.split("-");
                int start = Integer.parseInt(sed[0]);
                int end = Integer.parseInt(sed[1]);
                if (end >= target) {
                    if (start == target || end == target) {
                        String deal = start == target ? (target + 1) + "-" + end : start + "-" + (end - 1);
                        map.remove(start);
                        if (start == target) {
                            deal = target == end - 1 ? String.valueOf(end) : deal;
                            map.put(target + 1, deal);
                        } else {
                            deal = target == start + 1 ? String.valueOf(start) : deal;
                            map.put(start, deal);
                        }
                    } else {
                        String start1 = target - 1 == start ? start + "" : start + "-" + (target - 1);
                        String start2 = target + 1 == end ? end + "" : (target + 1) + "-" + end;
                        map.put(start, start1);
                        map.put(target + 1, start2);
                    }
                }
            } else {
                if (Integer.parseInt(dd) == target) {
                    map.remove(Integer.parseInt(dd));
                }
            }
        }
        return ts(map);
    }

    public static String ts(Map<Integer, String> map) {
        StringBuffer sb = new StringBuffer();
        for (int sd : map.keySet()) {
            sb.append(map.get(sd));
            sb.append(",");
        }
        int index = sb.lastIndexOf(",");
        sb.delete(index, index + 1);
        return sb.toString();
    }
}
