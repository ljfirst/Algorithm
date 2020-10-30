package DataStructure.stackHeapQueue.stack;

import java.util.Stack;

/**
 * @author liujun
 * @version 1.0
 * @date 2020/8/3
 * @author—Email liujunfirst@outlook.com
 * @blogURL https://blog.csdn.net/ljfirst
 * @description 逆置栈中元素
 * 有两个相同的栈，一个里面放着自大到小排列的数，栈顶的数最小，另一个栈是空的.
 * 不允许利用其它的数据结构，只能利用这两个栈，要求把第一个栈里的数字反过来，从
 * 小到大排列，结果还放在原来的那个栈里面。
 */
public class InversionStack {

    public Stack inversion(Stack<Integer> stackA) {
        Stack<Integer> stackB = new Stack();
        int length = stackA.size();
        int temp;
        for (int i = 0; i < length; i++) {
            temp = stackA.pop();
            for (int j = 0; j < length - i -1; j++) {
                stackB.push(stackA.pop());
            }
            stackA.push(temp);
            while (!stackB.empty()) {
                stackA.push(stackB.pop());
            }
        }
        return stackA;
    }
}
