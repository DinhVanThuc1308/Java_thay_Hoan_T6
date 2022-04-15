import java.util.*;

public class StackDemo {

   static void showpush(Stack st, int a) {
      st.push(new Integer(a));
      System.out.println("them vao(" + a + ")");
      System.out.println("Ngan xep co phan tu la: " + st);
   }

   static void showpop(Stack st) {
      System.out.print("pop(lay ra) -> ");
      Integer a = (Integer) st.pop();
      System.out.println(a);
      System.out.println("gia tri trong ngan xep : " + st);
   }

   public static void main(String args[]) {
      Stack st = new Stack();
      System.out.println("gia tri trong ngan xep : " + st);
      showpush(st, 9);
      showpush(st, 10);
      showpush(st, 11);
      showpop(st);
      showpop(st);
      showpop(st);
      try {
         showpop(st);
      } catch (EmptyStackException e) {
         System.out.println("Ngan xep rong");
      }
   }
}