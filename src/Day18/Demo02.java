package Day18;

/**
 * @title:
 * @author: ZDY
 * @date: 2022/5/9 2:16
 * @Abstract：
 * 泛型接口
 */
public class Demo02 {
    public static void main(String[] args) {
        stu stu = new stu();
        stu.test("hello");

    }
}

interface Student<T> {
    T test(T t);
}
/*使用方法一：明确接口的泛型类型，实现类不再是泛型类*/
class stu implements Student<String> {
    @Override
    public String test(String s) {
        System.out.println(s);
        return s;
    }
}
/*使用方法二：不明确接口的泛型类型，实现类还是泛型类*/
class stu1<T> implements Student<T> {

    @Override
    public T test(T t) {
        return null;
    }
}
