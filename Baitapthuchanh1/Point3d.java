public class Point3d extends Points {
    private double z;
    public Point3d(double x, double y, double z) {
        super(x, y);
        this.z = z;
    }
    public Point3d(){}
    public double getZ() {
        return this.z;
    }
    public void setZ(double z) {
        this.z = z;
    }
    


    }

}
