package Day16;

import java.util.LinkedList;

/**
 * @title:
 * @author: ZDY
 * @date: 2022/4/3 15:46
 * @Abstract： linkedList常用的方法都是首尾操作的方法
 * - void  addFirst(Object obj )
 * - void  addLast(Object obj )
 * - Object getFirst()
 * - Object getLast()
 * - Object removeFirst()
 * - Object removeLast ()
 */
public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("hello");
        list.add("java");
        list.addFirst("first");
        list.addLast("last");
        System.out.println(list);
        System.out.println(list.getFirst());
        System.out.println(list.get(1));
    }
}
