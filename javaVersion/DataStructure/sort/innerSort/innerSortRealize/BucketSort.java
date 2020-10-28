package DataStructure.sort.innerSort.innerSortRealize;

import DataStructure.sort.innerSort.SortInterface;
import DataStructure.stringANDline.hashTable.Node4Simplex;

/**
 * @author liujun
 * @version 1.0
 * @date 2018-8-22 ����05:03:35
 * @authorEmail liujunfirst@outlook.com
 * @description 桶排序
 * 首先定义桶的数量
 * 将数组按照桶的数量，分成若干堆
 * 每一堆内进行插入排序（注意到此处是）
 */

public class BucketSort implements SortInterface {

    @Override
    public void sortMethod(int[] array) {
        //判空
        if (!check(array)) {
            return ;
        }
        //桶初始值设定为10
        int defaultBucketSize = 10;
        bucketsort(array, defaultBucketSize);
    }

    public void bucketsort(int[] array, int bucketsize) {

        //创建桶，注意对象数组初始化一定要创建对象，否则为空
        Node4Simplex[] hashTableNodes = new Node4Simplex[bucketsize];
        for (int i = 0; i < bucketsize; i++) {
            hashTableNodes[i] = new Node4Simplex();
        }
        //找出最大最小值(设置array[0]存数组最大值，array[1]存最小值)，并确定桶的间距
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            max = Math.max(max, array[i]);
            min = Math.min(min, array[i]);
        }
        //桶的间距: 因为除法只保留商的原因，需要加1，向上取整
        int bucketgap = (max - min) / bucketsize + 1;

        //哈希数据（哈希之后使用插入排序，对桶内进行排序）
        for (int i : array) {
            int head = (i - min) / bucketgap;
            //桶内插入排序
            //新建节点
            Node4Simplex point = new Node4Simplex(i);
            //插入链表，注意新建的节点value均为Integer.MIN_VALUE
            if (Integer.MIN_VALUE == hashTableNodes[head].value) {
                hashTableNodes[head] = point;
            } else {
                //链表的插入排序
                Node4Simplex pro = hashTableNodes[head];
                Node4Simplex p = pro;
                //此处需要注意 头节点 的问题
                if(point.value < pro.value){
                    point.next = pro;
                    hashTableNodes[head] = point;
                }else{
                    while (p != null && p.value < point.value) {
                        pro = p;
                        p = p.next;
                    }
                    point.next = pro.next;
                    pro.next = point;
                }
            }
        }
        //整理为数组并返回
        int count = 0;
        for (int i = 0; i < bucketsize; i++) {
            Node4Simplex p = hashTableNodes[i];
            while (p != null && p.value != Integer.MIN_VALUE) {
                array[count] = p.value;
                p = p.next;
                count++;
            }
        }
    }
}