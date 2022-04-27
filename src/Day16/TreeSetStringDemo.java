package Day16;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 * @title:
 * @author: ZDY
 * @date: 2022/4/26 22:09
 * @Abstract：
 * 实现set如何实现去重和排序
 */
public class TreeSetStringDemo {
    public static void main(String[] args) {
        Set<User> treeSet = new TreeSet<>();
        treeSet.add(new User(123, "curry", 21));
        treeSet.add(new User(124, "klay", 22));
        treeSet.add(new User(123, "green", 25));
        treeSet.add(new User(111, "tom", 23));
        treeSet.add(new User(222, "rose", 21));
        //增强for循环遍历
        for (User user : treeSet) {
            System.out.println(user+" ");
        }
    }
}

class User implements Comparable{
    private int Id;
    private String name;
    private int age;

    public User(int id, String name, int age) {
        Id = id;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "Id=" + Id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        User user = (User) o;
        int i = this.Id - user.getId();
        i = i == 0 ? this.name.compareTo(user.name): i;
        i = i == 0 ? this.age - user.age : i;
        return i;
    }
}
