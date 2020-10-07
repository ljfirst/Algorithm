package DataStructure.stackHeapQueue.stack;

import java.util.Stack;

/** 
 *@author liujun
 *@date 2018-8-25 ����03:47:41
 *@authorEmail liujunfirst@outlook.com
 *@description  最小栈
 * 实现一个这样的栈，这个栈除了可以进行普通的push、pop操作以外，还可以进行getMin的操作，
 * getMin方法被调用后，会返回当前栈的最小值。栈里面存放的都是 int 整数，并且数值的范围是 [-100000, 100000]。
 * 要求所有操作的时间复杂度是 O(1)。
 * 附加：如果空间复杂度也能O(1)的话可加分。
 *@version 1.0
 */
public class MinValueStack extends Stack<Integer>{

	private static final long serialVersionUID = 1224463164541339165L;

	//解题思路在于新建立一个最小栈，保持当前最小值
    Stack<Integer> ministack = new Stack<Integer>();

	public MinValueStack() {
	}
	
	public synchronized Integer getMinValue() {
		// TODO Auto-generated method stub
		return ministack.peek();
	}

	public Integer push(int item) {

        super.push(item);
		if (ministack.size() == 0 || item < ministack.peek()) {
			return ministack.push(item);
		}else {
			return ministack.push(ministack.peek());
		}
	}
	
	@Override
	public synchronized Integer pop() {
		// TODO Auto-generated method stub
		ministack.pop();
		return super.pop();
	}

}
