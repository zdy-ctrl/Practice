package Day07;

/**
 * @title:
 * @author: ZDY
 * @date: 2022/4/14 11:24
 * @Abstract：静态方法  可变形参
 */
public class Demo1 {
    public static void main(String[] args) {
        //命令行参数
        System.out.println(args.length);
        test(1, "this", "is", "a", "variable", "parameter");
    }

    public static void test(int a, String... b) {
        System.out.println(a);
        System.out.println(b);//[Ljava.lang.String;@14ae5a5 数组的地址
    }
}
