package stack;
public class StackArr implements Interface {
    private int maxsize, top ;
    private Object[] stackArr;


    public StackArr(int maxsize, int top, Object[] stackArr) {
        this.maxsize = maxsize;
        this.top = top;
        this.stackArr = stackArr;
    }
    public StackArr(int a){
        this.maxsize = a;
        this.top = -1;
        this.stackArr = new Object[a];
    }
    public void push(Object a){
        if(top == maxsize-1){
            System.out.println("Stack is full");
            return;
        }
        stackArr[++top] = a;
    }
    public Object pop(){
        if(top == -1){
            System.out.println("Stack is empty");
            return null;
        }
        return stackArr[top--];
    }
    public Object peek(){
        if(top == -1){
            System.out.println("Stack is empty");
            return null;
        }
        return stackArr[top];
    }
    public boolean isEmpty(){
        return top == -1;
    }
}

