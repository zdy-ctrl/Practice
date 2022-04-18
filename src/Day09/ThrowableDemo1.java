package Day09;

/**
 * @title:
 * @author: ZDY
 * @date: 2022/4/16 10:40
 * @Abstract：
 * 异常常用的方法：
 * `public void printStackTrace()`:打印异常的详细信息。
 *
 * `public String getMessage()`:获取发生异常的原因。
 *
 * **练习1**
 *
 * 1、声明Husband类，包含姓名和妻子属性，属性私有化，提供一个Husband(String name)的构造器，重写toString方法，返回丈夫姓名和妻子的姓名
 *
 * 2、声明Wife类，包含姓名和丈夫属性，属性私有化，提供一个Wife(String name)的构造器，重写toString方法，返回妻子的姓名和丈夫的姓名
 *
 * 3、声明TestMarry类，在main中，创建Husband和Wife对象后直接打印妻子和丈夫对象，查看异常情况，看如何解决
 */
public class ThrowableDemo1 {
    public static void main(String[] args) {
        Husband husband = new Husband("张三");
        System.out.println(husband);
        Wife wife = new Wife("李四");
    }
}

class Husband {
    private String name;
    private String wife;

    public Husband(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Husband{" +
                "name='" + name + '\'' +
                ", wife='" + wife + '\'' +
                '}';
    }
}
class Wife {
    private String name;
    private String husband;

    public Wife(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Wife{" +
                "name='" + name + '\'' +
                ", husband='" + husband + '\'' +
                '}';
    }
}
