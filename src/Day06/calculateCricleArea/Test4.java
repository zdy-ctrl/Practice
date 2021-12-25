package Day06.calculateCricleArea;

import Day06.calculateRctangleAreea.Rectangle;

public class Test4 {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.setLength(5);
        rectangle.setWidth(3);
        System.out.println("面积是" + rectangle.getArea());
        System.out.println("周长是" + rectangle.getLength());
        System.out.println(rectangle.getInfo());
    }
}
