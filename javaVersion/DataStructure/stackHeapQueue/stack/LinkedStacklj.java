package DataStructure.stackHeapQueue.stack;

/**
 * @author liujun
 * @version 1.0
 * @date 2019-10-21 12:17
 * @authorEmail liujunfirst@outlook.com
 * @description  链式栈
 */
public class LinkedStacklj implements Stacklj {

    public Node stackTop;
    public int stackRealSize;
    public int stackMaxSize;

    public LinkedStacklj(int num){
        stackRealSize = 0;
        stackMaxSize = num;
        stackTop = null;
    }

    public LinkedStacklj(){
        //Ĭ��ջ������50
        new LinkedStacklj(50);
    }

    private class Node{
        int vlaue;
        Node next;
        Node(int value){
            this.vlaue = value;
            this.next = null;
        }
    }

    public int pop(){
        //��ջ�п�
        if(!this.empty()){
            stackRealSize--;
            int value = stackTop.vlaue;
            stackTop = stackTop.next;
            return value;
        }
        return -1;
    }

    public boolean push(int value){
        //��ջ����
        Node node = new Node(value);
        if(stackRealSize == stackMaxSize){
            return false;
        }else{
            node.next = stackTop;
        }
        stackTop = node;
        stackRealSize++;
        return true;
    }

    public int peek(){
        return (stackTop == null && stackRealSize ==0) ? -1 : stackTop.vlaue;
    }

    public boolean empty(){
        return (stackTop == null && stackRealSize ==0) ? true : false;
    }

    public boolean search(int value){
        Node test = stackTop;
        while (test != null){
            if(test.vlaue == value){
                return true;
            }
            test = test.next;
        }
        return false;
    }

    public int getRealsize(){
        return stackRealSize;
    }

    public int getMaxsize(){
        return stackMaxSize;
    }

    @Override
    public void resize() {

    }

}
