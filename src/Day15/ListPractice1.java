package Day15;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @title:
 * @author: ZDY
 * @date: 2022/4/5 9:12
 * @Abstract：练习：
 * 创建集合存储5个User对象，并遍历输出
 */
public class ListPractice1 {
    public static void main(String[] args) {
        List<User> list = new ArrayList<>();
        list.add(0, new User("张三"));
        list.add(1, new User("李四"));
        list.add(2, new User("王五"));
        list.add(3, new User("李六"));
        list.add(4, new User("赵七"));
        //遍历输出1.迭代器
        /*Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            iterator.next();
        }*/

        //2.foreach循环
        for (User user : list) {
            user.toString();
        }
    }
}

class User {
    public User(String name) {
        System.out.println("this is a User,name is" + name);
    }
}