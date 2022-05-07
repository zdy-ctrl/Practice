package Day16;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Random;

/**
 * @title:
 * @author: ZDY
 * @date: 2022/5/7 21:49
 * @Abstract： - 随机生成30个数，范围2-100，获取其中的质数。
 */
public class ListAndSetHomework04 {
    public static void main(String[] args) {
        ArrayList<Integer> getNum = GetNum();
        System.out.println("你生成的随机数是：" + getNum);
        ArrayList<Integer> pNum = Prime(getNum);
        System.out.println("随机生成的数里面质数为：" + pNum);
    }

    /*把集合里面的质数放在一个集合中*/
    public static ArrayList<Integer> Prime(ArrayList<Integer> getNum) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < getNum.size(); i++) {
            Integer integer = getNum.get(i);
            if (isP(integer)) {
                list.add(integer);
            }
        }
        return list;
    }
    
    /*随机生成30个数范围在2-100内*/
    public static ArrayList<Integer> GetNum() {
        ArrayList<Integer> list = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 30; i++) {
            int i1 = random.nextInt(98) + 2;
            list.add(i1);
        }
        return list;
    }

    /*判断是不是素数*/
    public static Boolean isP(int n) {
        boolean isPrime = true;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }
}
