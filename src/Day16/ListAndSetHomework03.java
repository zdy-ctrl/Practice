package Day16;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Random;

/**
 * @title:
 * @author: ZDY
 * @date: 2022/5/6 23:11
 * @Abstract： 案例：
 * ​	1、随机生成10个[1,100]之间的整数，放到List集合中，遍历显示
 * ​	2、找出前3名最大值，删除它们，注意可能重复
 * ​	3、显示删除后的结果
 */
public class ListAndSetHomework03 {
    public static void main(String[] args) {
        /*随机生成10个1-100之间的整数，存在List集合中，遍历显示*/
        ArrayList<Integer> list = new ArrayList<>();
        Random random = new Random();
        for (int j = 0; j < 10; j++) {
            int i = random.nextInt(100) + 1;
            list.add(i);
        }
        for (Integer integer : list) {
            System.out.print(integer+" ");
        }
        /*找出前三个最大的，删除他们*/
        Collections.sort(list);
        System.out.println(list);
        for (int i = 1; i < 4; i++) {
            System.out.println("集合中第" + i + "大的数是" + list.get(list.size() - 1));
            list.remove(list.size() - 1);
        }
        System.out.println(list);
    }
}
