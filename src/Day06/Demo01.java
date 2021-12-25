package Day06;
//成员变量：
/*
* -类变量（静态成员变量）：有关键字static修饰的变量
*-实例变量（非静态成员变量）：没有关键字static修饰的变量
* */
public class Demo01 {
    public static void main(String[] args) {
        Demo s = new Demo();
        s.name = "张三";
        Demo.age = "18";
        //s.age = "18";  //出现警告
        s.Sleep();
    }
}

class Demo {
    //成员变量（实例变量）
    String name;
    //类变量
    static String age;
    void Sleep() {
        System.out.println(age+"的"+name+"在睡觉");
    }
}
