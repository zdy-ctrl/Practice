package Day16;

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
        Set<Object> objects = new TreeSet<>();
        objects.add("12");
        objects.add("34");
        objects.add("24");
        objects.add("56");
        objects.add("14");
        objects.add("13");
        objects.add("65");
        objects.add("33");
        System.out.println(objects);
    }
}
