package Day15;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 18124
 */
public class ListDemo {
    public static void main(String[] args) {
        List list = new ArrayList<>();
        List list1 = new ArrayList<>();

        /*添加元素*/
        //* void add(int index, E ele)
        list.add("hello");
        list.add("java");
        list.add("hello");
        list.add("zdy");
        list.add("zdy");
        list.add(0, "this");
        //* boolean addAll(int index, Collection<? extends E> eles)
        list1.addAll(0, list);
        System.out.println(list1);

        /*获取元素*/
        //* E get(int index)
        System.out.println(list.get(0));
        //* List subList(int fromIndex, int toIndex)
        System.out.println(list.subList(0, 5));

        /*获取元素索引*/
        //* int indexOf(Object obj)
        System.out.println("zdy的位置为"+list.indexOf("zdy"));
        //* int lastIndexOf(Object obj)
        System.out.println(list.lastIndexOf("zdy"));

        /*删除和替换元素*/
        //* E remove(int index)
        list.remove(0);
        System.out.println(list);
        //* E set(int index, E ele)
        list.set(1, "sign");
        System.out.println(list);

    }
}
