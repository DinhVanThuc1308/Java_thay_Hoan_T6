import java.util.Scanner;

public class Btth1 {
    public static void in_mang(int [] a ){

        for (int i = 0; i < a.length; i++){
            System.out.print(a[i] + " ");
        }
    }
    public static void trungbinhcong(int [] a){
        int sum = 0;
        int dem = 0;
        for (int i = 0; i < a.length; i++){
            sum += a[i];
            dem +=1;

        }
        System.out.println("Trung binh cong: " + (double) sum/dem);

    }
    public static void sap_xep(int[] a){
        int temp = 0;
        for (int i = 0; i < a.length; i++){
            for (int j = 0; j < a.length; j++){
                if(a[i]> a[j]){
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }   
        }
        in_mang(a);
    }
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi ban nhap vao do dai cua chuoi");
        n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sap_xep(a);
        trungbinhcong(a);
        
    }
}