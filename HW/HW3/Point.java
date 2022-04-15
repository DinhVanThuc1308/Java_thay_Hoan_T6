import java.lang.Math;
import java.util.Scanner;
public class Point{
    double x;
    double y;
    public Point(){};
    

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }


    public double getX() {
        return x;
    }
    public void setX(double x) {
        this.x = x;
    }
    public double getY() {
        return y;
    }
    public void setY(double y) {
        this.y = y;
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Point a = new Point();
        System.out.println("nhap vao gia tri ax:");
        a.setX(sc.nextDouble());sc.nextLine();
        System.out.println("nhap vao gia tri ay:");
        a.setY(sc.nextDouble());
        System.out.println("nhap vao gia tri bx:");
        Point b = new Point();
        b.setX(sc.nextDouble());sc.nextLine();
        System.out.println("nhap vao gia tri by:");
        b.setY(sc.nextDouble());
        Point c = new Point();
        System.out.println("nhap vao gia tri cx:");
        c.setX(sc.nextDouble());sc.nextLine();
        System.out.println("nhap vao gia tri cy:");
        c.setY(sc.nextDouble());        
        double d1; // ab
        double d2; // ac
        double d3; // bc
        d1=Math.sqrt((a.x-b.x)*(a.x-b.x)+(a.y-b.y)*(a.y-b.y));
        d2=Math.sqrt((a.x-c.x)*(a.x-c.x)+(a.y-c.y)*(a.y-c.y));
        d3=Math.sqrt((c.x-b.x)*(c.x-b.x)+(c.y-b.y)*(c.y-b.y));
        double chuvi = d1+d2+d3;
        double S = Math.sqrt((chuvi*(chuvi-d1)*(chuvi-d2)*(chuvi-d3))); 
        System.out.println("Bai 1-----------------------------------------------------------------------");
        
        if(d1+d2==d3||d1+d3==d2||d2+d3==d1) {
            System.out.println("c>-------------------------------------------------------------------");
            System.out.println("3 Diem A:B:C Thang hang");
        }
        else 
        {   
            System.out.println("e>-------------------------------------------------------------------");
            System.out.println("Chu vi tam giac la : "+chuvi);
            System.out.println("Dien tich hinh tam giac la : "+S);
        }
        System.out.println("d>-------------------------------------------------------------------");
        System.out.println("khoang cach giua diem a va b la "+d1);
        System.out.println("khoang cach giua diem a va c la "+d2);
        System.out.println("khoang cach giua diem b va c la "+d3);
        System.out.println("-----------------------------------------END Part1------------------------------------");
    }
}



