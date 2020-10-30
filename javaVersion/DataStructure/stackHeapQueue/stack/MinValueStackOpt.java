package DataStructure.stackHeapQueue.stack;

/**
 * @author liujun
 * @version 1.0
 * @date 2019-10-21 12:19
 * @author-Email liujunfirst@outlook.com
 * @description 最小栈 优化
 * 实现一个这样的栈，这个栈除了可以进行普通的push、pop操作以外，还可以进行getMin的操作，
 * getMin方法被调用后，会返回当前栈的最小值。栈里面存放的都是 int 整数，并且数值的范围是 [-100000, 100000]。
 * 要求所有操作的时间复杂度是 O(1)。
 * 附加：如果空间复杂度也能O(1)的话可加分。
 */

public class MinValueStackOpt extends ArrayStacklj {

    //压栈值跟最小值做差
    int miniStackValue;

    @Override
    public int pop() {
        if(!this.empty()){
            int peekValue = super.peek();
            miniStackValue = peekValue < 0 ? miniStackValue - peekValue : miniStackValue;
            return super.pop();
        }
        return -1;
    }

    @Override
    public boolean push(int value) {
        boolean flag = false;
        //ջΪ��
        if(this.empty()){
            miniStackValue = value;
            flag = super.push(0);
        }else {
            //ջδ��
            int pushValue = value - miniStackValue;
            flag = super.push(pushValue);
            miniStackValue = pushValue < 0 ? value : miniStackValue;
        }
        return flag;
    }

    @Override
    public int peek() {
        if(!this.empty()){
            int stackPeekValue = super.peek();
            return stackPeekValue < 0 ? miniStackValue : stackPeekValue + miniStackValue;
        }
        return super.peek();
    }

    public int getMinValue(){
        if(!this.empty()){
            return miniStackValue;
        }
        return -1;
    }
}
