package Day16;

import java.util.LinkedList;

/**
 * @title:
 * @author: ZDY
 * @date: 2022/4/14 15:44
 * @Abstract： 底层原理：双向链表
 * LinkedLink还可以实现队列和栈结构
 */
public class LinkedLinkDemo2 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        /***队列**：是一种抽象的数据结构，数据存取特点为先进先出（FIFO），LinkedList中的队列方法：
         - boolean offer(Object obj) : 入队
         - Object poll() : 出队
         - Object peek() : 检查*/
        list.offer("1");
        list.offer("2");
        list.offer("3");
        System.out.println(list);
        String poll = list.poll();
        System.out.println(list);
        String poll1 = list.poll();
        System.out.println(list);
        list.offer("4");
        System.out.println(list.peek());//如果集合里面有元素就输出第一个元素  如果没有就输出null
    }
}
