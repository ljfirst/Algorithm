package DataStructure.tree.binaryTree.ertyuygf;


import DataStructure.tree.binaryTree.binaryTreeRealize.BinaryTreeImpl;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;
import java.util.stream.Collectors;

/**
 * @author liujun
 * @version 1.0
 * @date 2019-11-04 17:00
 * @author-Email liujunfirst@outlook.com
 * @description 
 */
public class BTFindCertainValuePath_nonRecursion {

    static class Staff {
        private String name;
        private int age;
        private BigDecimal salary;
        Staff(String s, int i, BigDecimal b){
            this.name=s;
            this.age=i;
            this.salary=b;
        }

        public int getAge() {
            return age;
        }

        public String getName() {
            return name;
        }
    }
    public static void main(String[] args) {
        List<Staff> staff = Arrays.asList(
                new Staff("mkyong", 30, new BigDecimal(10000)),
                new Staff("jack", 27, new BigDecimal(20000)),
                new Staff("lawrence", 33, new BigDecimal(30000))
        );

        //Java 8
        List<Integer> collect = staff.stream().map(x -> x.getAge()).collect(Collectors.toList());
        System.out.println(collect); //[mkyong, jack, lawrence]
    }


    public ArrayList<ArrayList<Integer>> FindPath(BinaryTreeImpl root, int target) {
        //·��list
        ArrayList<Integer> route_list = new ArrayList<Integer>();
        //����·��list��ɵ�list
        ArrayList<ArrayList<Integer>> all_list = new ArrayList<ArrayList<Integer>>();

        //�����ۼ�ֵsumƥ��target
        int sum = 0;
        //������������
        BinaryTreeImpl note = root;
        //����ջ
        Stack<BinaryTreeImpl> stack = new Stack<BinaryTreeImpl>();

        //��������ǵݹ�������ۼ�ƥ��
        while (!stack.empty() || note != null) {
            while (note != null) {
                if (sum + note.value > target) {
                    break;
                }
                sum += note.value;
                route_list.add(note.value);
                stack.push(note);
                note = note.left;
            }

            if (!stack.empty()) {
                note = stack.pop();
                note = note.right;
            }

            //Ѱ��ƥ��ֵtarget��·��
            while (note != null && sum < target) {
                sum += note.value;
                //����ƥ���ϵ�·�����
                route_list.add(note.value);
            }
            //����ƥ���ϵ�·��list
            if (sum == target) {
//                ArrayList<Integer> route_list_ = new ArrayList<Integer>(stack);
//                all_list.add(route_list_);
                ArrayList<Integer> route_list_ = (ArrayList<Integer>) stack.stream().map(x->x.value).collect(Collectors.toList());
                }
        }
        return all_list;
    }
}