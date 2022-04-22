package stack;
public class Stackll implements Interface {
    static class Node{
        Object data;
        
        Node next;
        public Node(Object data, Node next){
            this.data = data;
            this.next = next;
        }
    }
    Node root;
    int size=0;
    


    @Override
    public void push(Object value) {
        Node newNode = new Node(value, null);
        if (root == null){
            root = newNode;
        }
        else{
            Node temp = root;
            while (temp.next != null){
                temp = temp.next;
            }
            temp.next = newNode;
            size++;
            
        }
        
        
    }

    @Override
    public Object pop() {
        if (root == null){
            System.out.println("ngan xep rong");
        }
        else{
            root = root.next;
            size--;
        }
        return root.data;
    }

    @Override
    public Object peek() {
        if (root == null){
            System.out.println("ngan xep rong");
        }
            return root.data;
    }

    @Override
    public boolean isEmpty() {
        if (root == null){
            return true;
        }   
        return false;
        
    }
    
}
