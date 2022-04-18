package Day15;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @title:
 * @author: ZDY
 * @date: 2022/4/5 9:42
 * @Abstract：练习二：
 *  * 使用List集合存储整数或字符串或者自定义对象（比如Student）
 *  * 使用三种方式遍历List集合
 */
public class ListPractice2 {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student(111, "张三"));
        list.add(new Student(112, "李四"));
        list.add(new Student(113, "王五"));
        list.add(new Student(114, "赵六"));
        /**三种遍历方式：方式一迭代器遍历*/
        Iterator<Student> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("--------------------");
        /**遍历方式二：foreach循环遍历*/
        for (Student student : list) {
            System.out.println(student);
        }
        System.out.println("--------------------");
        /**遍历方式三：普通for循环遍历*/
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}

class Student {
    private int id;
    private String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
