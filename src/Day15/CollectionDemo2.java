package Day15;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author 18124
 */
public class CollectionDemo2 {
    public static void main(String[] args) {
        Collection a = new ArrayList<>();
        Collection b = new ArrayList<>();
        /**添加元素*/
        //单个添加元素
        a.add("element A");
        a.add("element B");
        a.add("element C");
        a.add("element D");
        System.out.println(a);
        //添加元素到另外一个集合中
        b.addAll(a);
        System.out.println(b);

        /**删除元素*/
        //单个元素的删除remove
        a.remove("element D");
        //删除与其他集合交集的元素
        b.removeAll(a);
        System.out.println(a);
        System.out.println(b);

        /**判断*/
        //判空
        if (a.isEmpty()) {
            System.out.println("Collection a is empty!");
        } else {
            System.out.println("Collection a not empty!");
        }
        //判断当前集合中是否存在一个与obj对象equals返回true的元素 contains(包含)
        if (a.contains("element A")) {
            System.out.println("Collection a have element A");
        } else {
            System.out.println("Collection a not have element A");
        }
        //判断a集合中的元素是否在当前集合中都存在。即c集合是否是当前集合的“子集”。containsAll
        a.add("element D");
        System.out.println(a);
        System.out.println(b);
        if (a.containsAll(b)) {
            System.out.println("Collection b is Collection a subset!");
        } else {
            System.out.println("Collection b not Collection a subset!");
        }
        /**获取元素*/
        System.out.println("Collection a have " + a.size() + " element!");
        /**交集*/
        //当前集合仅保留与c集合中的元素相同的元素，即当前集合中仅保留两个集合的交集，即this  = this ∩ coll； retainAll 保留
        a.retainAll(b);
        System.out.println(a);
        /**转为数组*/
        //返回包含当前集合中所有元素的数组
        Object arr[] = a.toArray();
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
