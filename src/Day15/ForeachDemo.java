package Day15;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author 18124
 * 增强for循环专门用来遍历数组和集合
 */
public class ForeachDemo {
    public static void main(String[] args) {
        //使用增强for循环遍历数组
        int arr[] = {1, 2, 3, 4, 5, 6};
        for (int a : arr) {
            System.out.println(a);
        }
        System.out.println("---------------------");
        //使用增强for循环遍历集合(底层使用iterator实现的)
        Collection a = new ArrayList();
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);
        for (Object b : a) {
            System.out.println(b);
        }

    }
}
