package Day16;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

/**
 * @title:
 * @author: ZDY
 * @date: 2022/4/18 22:56
 * @Abstract： 随机产生10个100以内的偶数，存放到一个List中，并且遍历显示它们
 */
public class homeworkDemo1 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Random random = new Random();
        for (int j = 0; j < 10; j++) {
            //产生随机数
            int i = random.nextInt(100);
            //判断随机数是不是偶数是存入list集合
            if (i % 2 == 0) {
                list.add(i);
                //否随机数+1再存入集合
            } else {
                list.add(i + 1);
            }
        }
        System.out.println(list);
        //遍历集合 增强for循环遍历
        for (Integer it : list) {
            System.out.print(it+" ");
        }
        System.out.println("");
        //iterator迭代器遍历
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            System.out.print(it.next()+" ");
        }
        System.out.println(" ");
        //普通for循环遍历
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i)+" ");
        }
    }
}
