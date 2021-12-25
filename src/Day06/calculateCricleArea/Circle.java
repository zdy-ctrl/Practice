package Day06.calculateCricleArea;

 public class Circle {
    private double r;

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public  void showArea() {
        double Area;
        Area = 3.14 * r * r;
        System.out.println("半径为" + r + "的面积为" + Area);
    }

    public void showPerimeter(double r) {
        double Perimeter;
        this.r = r;
        Perimeter = 2 * 3.14 * r;
        System.out.println("半径为" + r + "圆形的周长为" + Perimeter);
    }
}