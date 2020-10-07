package DataStructure.stackHeapQueue.stack;

/**
 * @author liujun
 * @version 1.0
 * @date 2020/9/4
 * @author—Email liujunfirst@outlook.com
 * @blogURL https://blog.csdn.net/ljfirst
 * @description 单调栈
 * 给你一个数组，返回一个等长的数组，对应索引存储着下一个更大元素，如果没有更大的元素，就存 -1.
 */
public class MonotonousStack {

    //单数组的方法
    public int[] method(int[] array) {
        if (array == null || array.length == 0) {
            return new int[]{};
        }
        Stacklj stack = new ArrayStacklj();
        int[] ans = new int[array.length];
        for (int i = array.length - 1; i >= 0; i++) {
            while (!stack.empty() && stack.peek() < array[i]) {
                stack.pop();
            }
            ans[i] = stack.empty() ? -1 : stack.peek();
            stack.push(array[i]);
        }
        return ans;
    }

    //循环数组的方法
    public int[] cycilmethod(int[] array) {
        if (array == null || array.length == 0) {
            return new int[]{};
        }
        Stacklj stack = new ArrayStacklj();
        int[] ans = new int[array.length];

        return ans;
    }
}
