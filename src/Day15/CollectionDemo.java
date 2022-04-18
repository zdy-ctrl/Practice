package Day15;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/**
 * @author 18124
 * 迭代器练习
 */
public class CollectionDemo {
    public static void main(String[] args) {
        Collection c = new ArrayList();
        Collection b = new ArrayList();
        /***1、添加元素***/
//（1）add(E obj)：添加元素对象到当前集合中
        c.add("hello");
        c.add("world");
        c.add("123");
//（2）addAll(Collection<? extends E> other)：添加other集合中的所有元素对象到当前集合中，即this = this ∪ other
        b.addAll(c);
        System.out.println(b);
        /***2、删除元素***/
// （1） boolean remove(Object obj) ：从当前集合中删除第一个找到的与obj对象equals返回true的元素。
        c.remove("123");
        System.out.println(c);
// （2）boolean removeAll(Collection<?> coll)：从当前集合中删除所有与coll集合中相同的元素。即this = this - this ∩ coll
        c.add(123);
        c.add(123);
        c.add(123);
        System.out.println(c);
        c.removeAll(Collections.singleton(123));
        System.out.println(c);

        /***3、判断***/
//（1）boolean isEmpty()：判断当前集合是否为空集合。
//        c.remove("hello");
//        c.remove("world");
        if (c.isEmpty()) {
            System.out.println("this Collection is empty");
        } else {
            System.out.println(c);
        }
//（2）boolean contains(Object obj)：判断当前集合中是否存在一个与obj对象equals返回true的元素。
        if (c.contains("hello")) {
            System.out.println("this collection have this element!");
        }
//（3）boolean containsAll(Collection<?> c)：判断c集合中的元素是否在当前集合中都存在。即c集合是否是当前集合的“子集”。
        System.out.println(b);
        System.out.println(c);
        if (b.containsAll(c)) {
            System.out.println("Collection c is collection b subset!");
        } else {
            System.out.println("Collection c not collection b subset!");
        }
       /***4、获取元素个数***/
//（1）int size()：获取当前集合中实际存储的元素个数
        System.out.println("The number of elements of set C is "+c.size());
        /***5、交集***/
//（1）boolean retainAll(Collection<?> coll)：当前集合仅保留与c集合中的元素相同的元素，即当前集合中仅保留两个集合的交集，即this  = this ∩ coll；
        b.retainAll(c);
        System.out.println(b);
        /***6、转为数组***/
//（1）Object[] toArray()：返回包含当前集合中所有元素的数组
        Object[] arr = b.toArray();
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
