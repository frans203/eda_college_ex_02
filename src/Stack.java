public class Stack {
    private int[] stack;
    private int top;
    private int maxCapacity;

    public Stack(int capacity){
        stack = new int[capacity];
        maxCapacity = capacity;
    }

    public boolean isEmpty(){
        return top == 0;
    }

    public boolean isFull() {
        return top - 1 == maxCapacity;
    }

    public int size() {
        return top;
    }

    public boolean push(int element){
        if(isFull()){
            return false;
        }
        stack[top] = element;
        top++;
        return true;
    }

    public int pop(){
        if(isEmpty()){
            return -1;
        }
        int element = stack[top-1];
        top--;
        return element;
    }

    public int top() {
        return stack[top-1];
    }

    public void printStack() {
        for(int i=top-1;i>=0;i--){
            System.out.println(stack[i]);
        }
    }

}
