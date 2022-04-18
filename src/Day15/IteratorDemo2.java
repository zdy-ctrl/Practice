package Day15;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * title:迭代器练习
 *
 * @author: ZDY
 * @date: 2022/4/2 20:53
 * @Abstract：遍历集合的几种方法
 */
public class IteratorDemo2 {
    public static void main(String[] args) {
        Collection a = new ArrayList<>();
        a.add("abc");
        a.add("aaa");
        a.add("123");
        a.add("456");
        //Iterator遍历
        Iterator it = a.iterator();
        while (it.hasNext()) {
            String s = (String) it.next();
            System.out.println(s);
        }
        System.out.println("-------------");
        //增强for循环
        for (Object o : a) {
            System.out.println(o);
        }

    }
}
