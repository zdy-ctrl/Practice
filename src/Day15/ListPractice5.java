package Day15;

import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

/**
 * @title:
 * @author: ZDY
 * @date: 2022/4/5 16:19
 * @Abstract：
 * 模拟乐透号码
 * * 随机生成10个号码放到集合中，范围1-50，作为乐透号码。不能重复。
 * * 键盘录入10个整数放到集合中，范围1-50，不能重复。
 * * 录入的整数与乐透号码对比，统计猜中了几个。
 */
public class ListPractice5 {
    public static void main(String[] args) {
        /**创建一个乐透集合，不能重复*/
        Set<Integer> lotteryOut = new HashSet<>();
        /**随机生成10个号码范围在1-50放在乐透集合*/
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            lotteryOut.add(random.nextInt(50)+1);
        }
        /**创建一个键盘录入号码，彩票号码，范围1-50，不能重复*/
        Set<Integer> lotteryIn = new HashSet<>();
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 10; ) {
            System.out.println("请输入您第" + (i+1) + "个号码");
            int a= scanner.nextInt();
            if (a > 50) {
                System.out.println("号码超过50，请重新输入！");
            } else {
                lotteryIn.add(a);
                i++;
            }
        }
        scanner.close();
        if (lotteryIn.size() < 10) {
            System.out.println("您的号码有重复的，请重新检查！");
        }
        /**彩票号码*/
        Object[] arr = lotteryIn.toArray();
        System.out.println("你的彩票号码为：");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(" ");
        /**把集合转化为数组遍历 中奖号码*/
        Object[] arr1 = lotteryOut.toArray();
        System.out.println("中奖号码为：");
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }

    }
}
