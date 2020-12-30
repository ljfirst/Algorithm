package DataStructure.tree.huffman;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author liujun
 * @version 1.0
 * @date 2018-8-27 下午09:37:31
 * @author—Email liujunfirst@outlook.com
 * @description 将数组转化为赫夫曼树。
 */
public class Huffman {

    //权值和指针域
    int weight;
    int left, right, parent;

    public Huffman() {
        this.weight = -1;
        this.left = -1;
        this.right = -1;
        this.parent = -1;
    }

    public Huffman[] buildHuffman(int[] array) {

        if (array == null || array.length == 0) {
            return null;
        }
        //构建Huffman数组并初始化
        Huffman[] root = new Huffman[2 * array.length - 1];
        //初始化
        for (int i = 0; i < 2 * array.length - 1; i++) {
            root[i] = new Huffman();
            if (i < array.length) {
                root[i].weight = array[i];
            }
        }
        //寻找最小值和次小值，并构建关系
        int min = 0;
        int minsecond = 0;
        int min_flag = 0;
        int minsecond_flag = 0;
        //注意：j < array.length - 1，遍历时为了构建n-1个非叶子结点。
        //分清array数组和root数组
        for (int j = 0; j < array.length - 1; j++) {
            //每次都需要重新赋值
            min = Integer.MAX_VALUE;
            minsecond = Integer.MAX_VALUE;
            //寻找最小值和次小值
            for (int k = 0; k < array.length + j; k++) {
                if (min > root[k].weight && root[k].parent == -1) {
                    minsecond_flag = min_flag;
                    min_flag = k;
                    minsecond = min;
                    min = root[k].weight;
                } else if (minsecond > root[k].weight && root[k].parent == -1) {
                    minsecond_flag = k;
                    minsecond = root[k].weight;
                }
            }
            //构建关系
            root[array.length + j].weight = minsecond + min;
            root[array.length + j].left = min_flag;
            root[array.length + j].right = minsecond_flag;
            root[min_flag].parent = array.length + j;
            root[minsecond_flag].parent = array.length + j;
        }
        return root;
    }

    public int getHuffmanWPL(Huffman[] root) {
        //按层计算WPL肯定需要队列
        if (root == null) {
            return 0;
        }
        int findParent = root.length - 1;
        int depth = 1;
        int WPL = 0;
        int head = findParent;
        int tail = findParent;
        int originLength = (root.length + 1) / 2;
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(findParent);

        while (!queue.isEmpty()) {
            findParent = queue.poll();
            if (root[findParent].left >= 0) {//if left child exist,count
                queue.offer(root[findParent].left);
                //叶子节点判断
                if (root[findParent].left < originLength) {
                    WPL += root[root[findParent].left].weight * depth;
                }
                tail = root[findParent].left;
            }
            if (root[findParent].right >= 0) {//count right child if it exist
                queue.offer(root[findParent].right);
                //叶子节点判断
                if (root[findParent].right < originLength) {
                    WPL += root[root[findParent].right].weight * depth;
                }
                tail = root[findParent].right;
            }
            if (findParent == head) {
                depth++;
                head = tail;
            }
        }
        return WPL;
    }
}
