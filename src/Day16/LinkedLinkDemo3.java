package Day16;

import java.util.LinkedList;

/**
 * @title:
 * @author: ZDY
 * @date: 2022/4/14 16:05
 * @Abstract： LinkedLink还可以实现队列和栈结构
 */
public class LinkedLinkDemo3 {
    public static void main(String[] args) {
        LinkedList<Object> list = new LinkedList<>();
      /*  **栈**：是一种抽象的数据结构，数据存取特点为后进先出（LIFO），LinkedList中的栈方法：
        - void push(E e) ：压栈
        - E pop() ：弹栈*/
        list.push("1");
        list.push("2");
        list.push("3");
        System.out.println(list);
        list.pop();
        System.out.println(list);
        list.pop();
        System.out.println(list);
    }
}
