package DataStructure.tree.redBlackTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author liujun
 * @version 1.0
 * @date 2018-8-29 10:29:42
 * @author-Email liujunfirst@outlook.com
 * @description 红黑树
 * 1、插入 insert(int key, int value)(是否去重)
 * 2、删除 delete(int key)
 * 3、查找 contain(int key)
 * 4、获取 get(int key)
 * 5、获取 getBelowKey(int key)   获取map内比这个key值小的元素个数
 * 6、打印 print(RedBlackNode root)
 * 7、输出 toarray() 输出排序后的数组
 */

public class RedBlackTreeImpl implements RedBlackTree {

    //红黑树的容量
    public int size;
    public RedBlackNode root;
    private static int keyNotFound = Integer.MIN_VALUE;
    private static final int initValue = Integer.MIN_VALUE;
    private List<Integer> red2array;

    public RedBlackTreeImpl() {
        this.size = 0;
        this.root = new RedBlackNode();
    }

    @Override
    public boolean put(int key, int value) {
        return put(false, key, value);
    }

    /**
     * 是否对插入节点进行去重，取决于duplicate， true表示去重
     */
    @Override
    public boolean put(boolean duplicate, int key, int value) {
        if (initValue == this.root.key) {
            this.root.key = key;
            this.root.value = value;
            this.root.color = BLACK;
            this.size++;
            return true;
        }
        RedBlackNode point = new RedBlackNode(key, value);
        RedBlackNode search = this.root;
        RedBlackNode search_bef = this.root;
        while (search != null) {
            search_bef = search;
            if (duplicate && search.key == key) {
                //update
                search.value = value;
                return true;
            } else if (search.key < key) {
                search = search.right;
            } else {
                search = search.left;
            }
        }
        point.parent = search_bef;
        if (search_bef.key < key) {
            search_bef.right = point;
        } else {
            search_bef.left = point;
        }
        insertFixup(point);
        this.size++;
        return true;
    }

    private void insertFixup1(RedBlackNode point) {
        if (root == point.parent) {
            root.color = BLACK;
            return;
        }
        RedBlackNode uncle;
        while (null != point.parent && RED.equals(point.parent.color)) {
            if (point.parent == point.parent.parent.left) {
                uncle = point.parent.parent.right;
                if (null == uncle || BLACK.equals(uncle.color)) {
                    if (point == point.parent.right) {
                        rotateLeft(point.parent);
                        point = point.left;
                    }
                    point.parent.color = BLACK;
                    point.parent.parent.color = RED;
                    rotateRight(point.parent.parent);
                    return;
                } else {
                    //红叔问题
                    uncle.color = BLACK;
                    point.parent.color = BLACK;
                    point.parent.parent.color = RED;
                    point = point.parent.parent;
                    if (this.root == point) {
                        this.root.color = BLACK;
                        return;
                    }
                }
            } else {
                uncle = point.parent.parent.left;
                if (null == uncle || BLACK.equals(uncle.color)) {
                    if (point == point.parent.left) {
                        rotateRight(point.parent);
                        point = point.right;
                    }
                    point.parent.color = BLACK;
                    point.parent.parent.color = RED;
                    rotateLeft(point.parent.parent);
                    return;
                } else {
                    //红叔问题
                    uncle.color = BLACK;
                    point.parent.color = BLACK;
                    point.parent.parent.color = RED;
                    point = point.parent.parent;
                    if (root == point) {
                        root.color = BLACK;
                        return;
                    }
                }
            }
        }
    }

    private void insertFixup(RedBlackNode point) {
        if (this.root == point.parent) {
            this.root.color = BLACK;
            return;
        }
        RedBlackNode uncle;
        while (null != point.parent && RED.equals(point.parent.color)) {
            uncle = (point.parent == point.parent.parent.left) ? point.parent.parent.right : point.parent.parent.left;
            if (null != uncle && RED.equals(uncle.color)) {
                //红叔问题
                uncle.color = BLACK;
                point.parent.color = BLACK;
                point.parent.parent.color = RED;
                point = point.parent.parent;
                if (this.root == point) {
                    this.root.color = BLACK;
                    return;
                }
                //红叔问题的最后一步是递归祖父节点，因为此处存在外循环，就省略递归操作
            } else {
                //黑叔问题
                if (uncle == point.parent.parent.right) {
                    if (point == point.parent.right) {
                        rotateLeft(point.parent);
                        point = point.left;
                    }
                    point.parent.color = BLACK;
                    point.parent.parent.color = RED;
                    rotateRight(point.parent.parent);
                } else {
                    if (point == point.parent.left) {
                        rotateRight(point.parent);
                        point = point.right;
                    }
                    point.parent.color = BLACK;
                    point.parent.parent.color = RED;
                    rotateLeft(point.parent.parent);
                }
            }
        }
    }

    @Override
    public boolean remove(int key) {
        return false;
    }

    @Override
    public boolean contain(int key) {
        return contain(this.root, key);
    }

    private boolean contain(RedBlackNode node, int key) {
        if (node == null) {
            return false;
        }
        if (node.key == key) {
            return true;
        }
        if (key < node.key) {
            return contain(node.left, key);
        } else {
            return contain(node.right, key);
        }
    }

    @Override
    public int get(int key) {
        return get(this.root, key);
    }

    private int get(RedBlackNode node, int key) {
        if (node == null) {
            return keyNotFound;
        }
        if (node.key == key) {
            return node.value;
        }
        if (key < node.key) {
            return get(node.left, key);
        } else {
            return get(node.right, key);
        }
    }

    @Override
    public int getBelowKey(int key) {
        return 0;
    }

    //调整插入节点周围的颜色
    private void fixcolor(RedBlackNode point) {
        if (point.parent != null && RED.equals(point.parent.color)) {
            if (point.parent.left == point) {
                point.right.color = RED;
            } else {
                point.left.color = RED;
            }
            point.parent.color = BLACK;
        }
    }

    // rotateRight：change the position of point and point.left
    private void rotateRight(RedBlackNode point) {
        RedBlackNode pleft = point.left;
        point.left = pleft.right;
        if (null != pleft.right) {
            pleft.right.parent = point;
        }
        pleft.parent = point.parent;
        if (null == point.parent) {
            this.root = pleft;
        } else if (point.parent.left == point) {
            point.parent.left = pleft;
        } else {
            point.parent.right = pleft;
        }
        pleft.right = point;
        point.parent = pleft;
    }

    // rotateLeft ：change the position of point and point.right
    private void rotateLeft(RedBlackNode point) {
        RedBlackNode pright = point.right;
        point.right = pright.left;
        if (null != pright.left) {
            pright.left.parent = point;
        }
        pright.parent = point.parent;
        if (null == point.parent) {
            this.root = pright;
        } else if (point.parent.left == point) {
            point.parent.left = pright;
        } else {
            point.parent.right = pright;
        }
        pright.left = point;
        point.parent = pright;
    }

    public void clear() {
        this.size = 0;
        this.root = new RedBlackNode();
    }

    // 按行打印红黑树
    @Override
    public void print(RedBlackNode root) {
        if (root == null) {
            return;
        }
        Queue<RedBlackNode> queue = new LinkedList<>();
        queue.offer(root);
        RedBlackNode front = root;
        RedBlackNode tail = root;
        while (!queue.isEmpty()) {
            RedBlackNode binaryTree = queue.poll();
            // System.out.print(binaryTree.value + " ");
            System.out.print(binaryTree.key + " ");
            if (binaryTree.left != null) {
                queue.offer(binaryTree.left);
                tail = binaryTree.left;
            }
            if (binaryTree.right != null) {
                queue.offer(binaryTree.right);
                tail = binaryTree.right;
            }
            if (binaryTree == front) {
                front = tail;
                System.out.println();
            }
        }
    }

    @Override
    public int[] toarray() {
        if (this.root.key == initValue) {
            return new int[]{};
        }
        this.red2array = new ArrayList<>();
        RedBlackTree2Array(this.root);
        int[] array = red2array.stream().mapToInt(Integer::intValue).toArray();
        return array;
    }

    private void RedBlackTree2Array(RedBlackNode node) {
        if (node == null) {
            return;
        }
        RedBlackTree2Array(node.left);
        this.red2array.add(node.key);
        RedBlackTree2Array(node.right);
    }
    //--------------------

/*

    public int countTreeNum(RedBlackTreeImpl root) {

        if (root == null) {
            return 0;
        }
        return 1 + countTreeNum(root.left) + countTreeNum(root.right);
    }


    public void deleteRedLeaf(RedBlackTreeImpl root) {
        if (root == null) {
            return;
        }
        if (root.parent.left == root) {
            root.parent.left = null;
        } else {
            root.parent.right = null;
        }
    }

    //�������ɾ��Ҷ�ӽڵ�Ϊ��ɫ
    //���2.1����ɾ���ڵ�D���ֵܽڵ�SΪ��ɫ
    public void deleteBlackLeafwithRedBrother(RedBlackTreeImpl root, RedBlackTreeImpl point) {
        if (point == null) {
            return;
        }
        //��ɾ�����Ϊ����
        if (point.parent.left == point) {
            RedBlackTreeImpl tempRight = point.parent.right;
            //��ɫ����
            String s = tempRight.color;
            tempRight.color = point.parent.color;
            point.parent.color = s;
            //LL
            rotateLeft(root, point.parent);
            deleteBlackLeafwithBlackBrother(root, point);
        } else {//��ɾ�����Ϊ�Һ���
            RedBlackTreeImpl tempRight = point.parent.left;
            //��ɫ����
            String s = tempRight.color;
            tempRight.color = point.parent.color;
            point.parent.color = s;
            //RR
            rotateRight(root, point.parent);
            deleteBlackLeafwithBlackBrother(root, point);
        }

    }

    //���2.2����ɾ���ڵ�D���ֵܽڵ�SΪ��ɫ��
    public void deleteBlackLeafwithBlackBrother(RedBlackTreeImpl root, RedBlackTreeImpl point) {
        if (root == null) {
            return;
        }

        if (point.parent.left == point) {
            //RedBlackTree tempRight = point.parent.right;
            //��һ��ֶ�ӽ��Ϊ��ɫ

            //�жϸ��׽����ɫ

        }
    }

    //���2.2.1����Զֶ�ӽڵ�Ϊ��ɫ
    public void rightNephewisRed(RedBlackTreeImpl point) {

    }

    //���2.2.2����ֶ�ӽ��Ϊ��ɫ��Զֶ�ӽڵ�Ϊ��ɫ
    public void leftNephewisRed(RedBlackTreeImpl point) {

    }

    public void redFather(RedBlackNode point) {
        RedBlackNode temppoint;
        if (point.parent.left == point) {
            temppoint = point.parent.right;
            //ɾ�����
            point.parent.left = null;
        } else {
            temppoint = point.parent.left;
            point.parent.right = null;
        }
        String s = point.parent.color;
        point.parent.color = temppoint.color;
        point.color = s;
        temppoint.color = s;
    }

    public void blackFather(RedBlackNode point) {
        if (point.parent.left == point) {
            point.right.color = RED;
            point.parent.left = null;
        } else {
            point.left.color = RED;
            point.parent.right = null;
        }
        fixcolor(point.parent);
    }


    public void deleteOnlyleftorOnlyright(RedBlackNode point) {
        if (point == null) {
            return;
        }
        RedBlackNode pointTemp;
        if (point.left != null) {
            pointTemp = point.left;
            if (point.parent.left == point) {
                point.parent.left = pointTemp;
            } else {
                point.parent.right = pointTemp;
            }
        } else {
            pointTemp = point.right;
            if (root.parent.right == root) {
                root.parent.right = pointTemp;
            } else {
                root.parent.left = pointTemp;
            }
        }
        pointTemp.parent = point.parent;
        pointTemp.color = point.color;
    }
*/


}
