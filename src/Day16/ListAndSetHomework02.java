package Day16;

import org.junit.Test;

import java.util.*;

/**
 * @title:
 * @author: ZDY
 * @date: 2022/5/4 9:18
 * @Abstract： 模拟乐透号码。
 * - 随机生成10个号码放到集合中，范围1-50，作为乐透号码。不能重复。
 * - 键盘录入10个整数放到集合中，范围1-50，不能重复。
 * - 录入的整数与乐透号码对比，统计猜中了几个。
 */
public class ListAndSetHomework02 {
    public static void main(String[] args) {
        ArrayList<Integer> List1 = InputNum();
        System.out.println("您的号码为：" + List1);
        ArrayList<Integer> List2 = LotNum();
        System.out.println("乐透号码为：" + List2);
        int count = 0;
        for (int i = 0; i < List1.size(); i++) {
            Integer num = List1.get(i);
            if (List2.contains(num)) {
                count++;
            }
        }
        System.out.println("你正确的号码有" + count + "个");
    }

    /*键盘输入10个不重复范围在1-50的整数*/
    public static ArrayList<Integer> InputNum() {
        ArrayList<Integer> list1 = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入10位范围1-50的整数，不能重复");
        for (int i = 0; i < 10; ) {
            int i1 = sc.nextInt();
            if (i1 >= 1 && i1 <= 50 && !list1.contains(i1)) {
                list1.add(i1);
                i++;
            } else {
                System.out.println("输入数字有错误，请重新输入！");
            }
        }
        sc.close();
        return list1;
    }
/*随机生成10个号码不能重复范围在1-50之间*/
    public static ArrayList<Integer> LotNum() {
        ArrayList<Integer> list = new ArrayList<>();
        Random random = new Random();
        for (int j = 0; j < 10; ) {
            int i = random.nextInt(50) + 1;
            if (!list.contains(i)) {
                list.add(i);
                j++;
             }
        }
        return list;
    }
}
