package Day16;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

/**
 * @title:
 * @author: ZDY
 * @date: 2022/4/27 9:18
 * @Abstract：
 * set集合中实现排序的方法：
 * 一。在对象类实现Comparable接口重写CompareTo方法实现
 * 二。定义一个Comparator接口实现类专门用于对象的排序
 * 三。在newTreeSet集合时利用匿名内部类实现
 */
public class TreeSetStringDemo2 {
    public static void main(String[] args) {
        Set<Student> set = new TreeSet<>(new StuComparator());
        set.add(new Student(123, "curry", 100));
        set.add(new Student(124, "klay", 99));
        set.add(new Student(111, "green", 99));
        set.add(new Student(112, "curry2", 100));

        for (Student stu : set) {
            System.out.println(stu);
        }
    }
}

class StuComparator implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        Student s1 = (Student) o1;
        Student s2 = (Student) o2;
        int i = s2.getResults() - s1.getResults();
        i = i == 0 ? s1.getId() - s2.getId() : i;
        i = i == 0 ? s1.getName().compareTo(s2.getName()) : i;
        return i;
    }
}

class Student {
    private int id;
    private String name;
    private int results;

    public Student(int id, String name, int results) {
        this.id = id;
        this.name = name;
        this.results = results;
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

    public int getResults() {
        return results;
    }

    public void setResults(int results) {
        this.results = results;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", results=" + results +
                '}';
    }
}
