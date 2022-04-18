package Day15;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @title:
 * @author: ZDY
 * @date: 2022/4/5 9:42
 * @Abstract：练习三：
 *  * 使用泛型把自定义类型元素存入List集合，并使用3种方式遍历
 */
public class ListPractice3 {
    public static void main(String[] args) {
        List<teacher> teacherList = new ArrayList<>();
        teacherList.add(new teacher(121, "张老师"));
        teacherList.add(new teacher(122, "李老师"));
        teacherList.add(new teacher(123, "王老师"));
        /**list三种方式遍历集合*/
        //方式一：迭代器遍历
        Iterator<teacher> iterator = teacherList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("--------------------------");
        //方式二：增强for循环遍历
        for (teacher teacher : teacherList) {
            System.out.println(teacher);
        }
        System.out.println("--------------------------");
        //方式三：普通for循环遍历
        for (int i = 0; i < teacherList.size(); i++) {
            System.out.println(teacherList.get(i));
        }
    }
}

class teacher {
    private int id;
    private String name;

    public teacher(int id, String name) {
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
        return "teacher{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
