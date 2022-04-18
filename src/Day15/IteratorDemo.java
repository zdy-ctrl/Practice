package Day15;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @author 18124
 */
public class IteratorDemo {
//    /*public E next():返回迭代的下一个元素。
//    public boolean hasNext():如果仍有元素可以迭代，则返回 true。
//    public void remove():通过迭代器删除元素*/

    public static void main(String[] args) {
        Collection a = new ArrayList<>();
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);
        a.add(5);
//        a.remove(2);
        Iterator iterator = a.iterator();
        //public E next():返回迭代的下一个元素。

//        System.out.println(iterator.next()); /*NoSuchElementException没有这个元素异常*/
        //public boolean hasNext():如果仍有元素可以迭代，则返回 true。
       /* while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }*/

        // public void remove():通过迭代器删除元素 
        while (iterator.hasNext()) {
            Object o = iterator.next();
            if (o.equals(3)) {
                iterator.remove();
            }
        }
        System.out.println(a);
    }
}
