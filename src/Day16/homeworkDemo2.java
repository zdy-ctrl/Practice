package Day16;

import java.util.*;

/**
 * @title:
 * @author: ZDY
 * @date: 2022/4/18 22:56
 * @Abstract： 随机产生10个100以内的偶数，存放到一个Set中，并且遍历显示它们
 */
public class homeworkDemo2 {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        Random random = new Random();
        for (int j = 0; j < 10; j++) {
            //产生随机数
            int i = random.nextInt(100);
            //判断随机数是不是偶数是存入list集合
            if (i % 2 == 0) {
                set.add(i);
                //否随机数+1再存入集合
            } else {
                set.add(i + 1);
            }
        }
        System.out.println(set);
        /*遍历集合*/
        //增强for循环
        for (Integer it : set) {
            System.out.print(it+" ");
        }
        //
    }
}
