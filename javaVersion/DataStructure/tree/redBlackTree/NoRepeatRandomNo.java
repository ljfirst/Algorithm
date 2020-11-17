package DataStructure.tree.redBlackTree;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author liujun
 * @version 1.0
 * @date 2018-8-27 下午09:37:31
 * @author—Email liujunfirst@outlook.com
 * @description
 */
public class NoRepeatRandomNo {

    //??ú????
    private void useMap(int[] array) {
        //?????
		/*TreeSet<Integer> set = new TreeSet<Integer>();
        for(int i = 0 ; i < array.length ; i++){
            int curr = array[i];
            set.add(curr);
        }
        //??????
        for(Integer i : set){
            System.out.print(i);
        }*/

        //????????
        RedBlackTreeImpl rbt = new RedBlackTreeImpl();
        //rbt = rbt.put(array);
        //rbt.print(rbt);
        System.out.println(rbt.contain(81));
        System.out.println(rbt.contain(8));
    }

    //??????????????????????map?????????
    public void useBucket(int[] array) {

        Map<Integer, Integer> Bucket = new HashMap<Integer, Integer>();
        for (int i = 0; i < array.length; i++) {
            if (Bucket.containsKey(array[i])) {
                Bucket.put(array[i], Bucket.get(array[i]) + 1);
            } else {
                Bucket.put(array[i], 1);
            }
        }
        //map????????????
        //???1??
        System.out.println("??????");
        System.out.println(Bucket);//??????toString
        //???2??
        System.out.println("???????");
        Set<Integer> keys = Bucket.keySet();
        for (Object key : keys) {
            System.out.print(key + "=" + Bucket.get(key));
        }
        //???3??
        System.out.println("???????");
        Set<Map.Entry<Integer, Integer>> ms = Bucket.entrySet();
        for (Map.Entry<Integer, Integer> entry : ms) {
            System.out.print(entry.getKey() + "=" + entry.getValue());
        }
    }

    public static void main(String[] args) {
        int[] num = {8, 2, 4, 6, 9, 5, 7, 3, 1};
        NoRepeatRandomNo np = new NoRepeatRandomNo();
        np.useMap(num);

        int[] num1 = {81, 22, 43, 64, 95, 56, 77, 38, 19};
        np.useMap(num1);
        //np.useBucket(num);
    }
}
