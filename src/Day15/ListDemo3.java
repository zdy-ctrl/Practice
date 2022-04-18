package Day15;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @title:
 * @author: ZDY
 * @date: 2022/4/5 9:49
 * @Abstract：List集合的三种遍历方式
 */
public class ListDemo3 {
    public static void main(String[] args) {
        List list = new ArrayList<>();
        list.add("张三");
        list.add("李四");
        list.add("王五");
        list.add("赵六");
        //遍历1：Iterator循环
        /*Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }*/

        //遍历2：foreach循环
        /*for (Object o : list) {
            System.out.println(o);
        }*/

        //遍历3：普通for循环
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
