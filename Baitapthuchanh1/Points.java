public class Points {
    private double x, y;

    public Points(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public Points(){}

    public double getX() {
        return this.x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return this.y;
    }

    public void setY(double y) {
        this.y = y;
    }
    
    public static double khoang_cach(Points p1,Points p2)  {
        return Math.sqrt(Math.pow(p2.x - p1.x, 2) + Math.pow(p2.y - p1.y, 2));
    }
    public double phuong_trinh_duong_thang(double x,double y) {
        return 0;
    }
    public static void checkThangHang(Points a, Points b, Points c) {
        double d1 = khoang_cach(a,b);
        double d2 = khoang_cach(c,a);
        double d3 = khoang_cach(b,c);
        
        if(d1+d2==d3||d1+d3==d2||d2+d3==d1){
            System.out.println("3 diem thang hang");

        }
        else{
            double chuvi = d1+d2+d3;
            double S = Math.sqrt((chuvi*(chuvi-d1)*(chuvi-d2)*(chuvi-d3))); 
            System.out.println("S tam giac la : "+ S);
        }
        
    }
    public static String PtDuongThang(Points a, Points b){
        // double vectorA = b.getX() - a.getX();
        // double vectorB = b.getY() - a.getY();
        double vtptX = a.getY() - b.getY();
        double vtptY = b.getX() - a.getX();

        double kqdv = 0 - vtptX * a.getX() - vtptY * a.getY(); 

        String vt = ""+ vtptX + "x + " + vtptY + "y" + " + " + kqdv + " = 0";
        return vt;

    } 
    public static void main(String[] args) {
        Points p1 = new Points(4,5);
        Points p2 = new Points(6,7);
        Points p3 = new Points(3,9);
        System.out.println("Khoang cach 2 diem la: " + Points.khoang_cach(p1,p2));
        Points.checkThangHang(p1,p2,p3);
    }
}

