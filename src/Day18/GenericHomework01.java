package Day18;

/**
 * @title:
 * @author: ZDY
 * @date: 2022/5/9 2:29
 * @Abstract： #### 练习1
 * 1、声明一个坐标类Coordinate<T>，它有两个属性：x,y，都为T类型
 * 2、在测试类中，创建两个不同的坐标类对象，
 * 分别指定T类型为String和Double，并为x,y赋值，打印对象
 */
public class GenericHomework01 {
    public static void main(String[] args) {
        Coordinate<String> coordinate = new Coordinate<>();
        coordinate.setX("X坐标");
        coordinate.setY("Y坐标");
        System.out.println(coordinate);
        Coordinate<Double> coordinate1 = new Coordinate<>();
        coordinate1.setX(13.2);
        coordinate1.setY(14.3);
        System.out.println(coordinate1);
    }
}

class Coordinate<T> {
    private T x;
    private T y;

    public T getX() {
        return x;
    }

    public void setX(T x) {
        this.x = x;
    }

    public T getY() {
        return y;
    }

    public void setY(T y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Coordinate{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
