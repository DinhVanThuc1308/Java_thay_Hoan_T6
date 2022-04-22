package stack;
public class Test {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        StackArr stack1 = new StackArr(a.length);
        for (int i : a){
            stack1.push(i);
        }
        System.out.println("Stack theo array: ");
        while (!stack1.isEmpty()) {
          System.out.print(stack1.pop());
          System.out.print(" ");
        }
        System.out.println("\n");
        System.out.println("Stack theo linkedlist:");
        Stackll stack2 = new Stackll();
        for(int i:a){
          stack2.push(i);
        }
        while(!stack2.isEmpty()){
           
          System.out.print(stack2.pop()+" ");
        }
    }
    
}
