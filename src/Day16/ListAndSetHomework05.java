package Day16;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Random;

/**
 * @title:
 * @author: ZDY
 * @date: 2022/5/7 23:02
 * @Abstract： 1、请定义方法public static int listTest(Collection list,String s)统计集合中指定元素出现的次数
 * 2、创建集合，集合存放随机生成的30个小写字母
 * 3、用listTest统计，某些元素的出现次数
 */
public class ListAndSetHomework05 {
    public static void main(String[] args) {
        ArrayList<String> randomNumber = RandomNumber();
        System.out.println("随机生成的30个字母为：" + randomNumber);
        int times = listTest(randomNumber, "s");
        System.out.println("s出现的次数为：" + times);
    }

    /*创建集合，随机存放生成的30个大小写字母*/
    public static ArrayList<String> RandomNumber() {
        ArrayList<String> list = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 30; i++) {
            char c = (char) ((char) random.nextInt(26) + 97);
            list.add(String.valueOf(c));
        }
        return list;
    }
    /*统计集合中指定元素出现的次数*/
    public static int listTest(Collection<String> list, String s) {
        int count = 0;
        for (String s1 : list) {
            if (s.equals(s1)) {
                count++;
            }
        }
        return count;
    }
}
