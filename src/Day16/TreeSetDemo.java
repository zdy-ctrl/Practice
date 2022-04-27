package Day16;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 * @title:
 * @author: ZDY
 * @date: 2022/4/14 17:14
 * @Abstract：
 * - 元素唯一
 * - 实现排序（取出的元素是经过排序的）
 */
public class TreeSetDemo {
    public static void main(String[] args) {
        Set<Integer> set = new TreeSet<>();
        set.add(12);
        set.add(34);
        set.add(24);
        set.add(56);
        set.add(14);
        set.add(13);
        set.add(65);
        set.add(33);
        System.out.println(set);
        //遍历TreeSet集合
        Iterator<Integer> it = set.iterator();
        while (it.hasNext()) {
            System.out.print(it.next()+" ");
        }
    }
}
