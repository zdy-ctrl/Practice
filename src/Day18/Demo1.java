package Day18;

/**
 * @title:
 * @author: ZDY
 * @date: 2022/5/9 1:49
 * @Abstract： 泛型的使用：定义一个泛型类
 */
public class Demo1 {
    public static void main(String[] args) {
        student<String> student = new student<>();
        student.setResults("优秀");
        System.out.println(student);
        student<Integer> student1 = new student<>();
        student1.setResults(99);
        System.out.println(student1);

    }
}

class student<T> {
    private T results;

    public T getResults() {
        return results;
    }

    public void setResults(T results) {
        this.results = results;
    }

    @Override
    public String toString() {
        return "student{" +
                "results=" + results +
                '}';
    }
}

