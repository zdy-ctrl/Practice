package Day16;

import java.util.*;

/**
 * @title:
 * @author: ZDY
 * @date: 2022/5/3 22:33
 * @Abstract：
 * 案例：
 * ​	1、用一个String[]数组存点数
 * ​	2、用一个String[]数组存花色
 * ​	3、用一个String[]数组存大王、小王
 * ​	4、用上面的数组，生成一副扑克牌，放到Collection的集合中
 * ​	5、遍历显示全副扑克牌
 * ​	6、模拟给4个人随机发牌，每个人11张牌，分别放到四个Collection集合中
 * ​	7、显示每个人的牌和剩余的牌
 */
public class ListAndSetHomework01 {
    public static void main(String[] args) {
        String[] points = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K",}; //定义点数数组
        String[] color = {"黑桃", "红桃", "梅花", "方块",}; //定义花色数组
        String[] king = {"大王", "小王"}; //定义大小王数组
        List<String> list = new ArrayList<>();
        /**把扑克牌存进list集合中*/
        for (int i = 0; i < points.length; i++) {
            for (int j = 0; j < color.length; j++) {
                String s = color[j].concat(points[i]);
                list.add(s);
            }
        }
        list.add(king[0]);
        list.add(king[1]);
        /**遍历一遍扑克牌*/
        for (int i = 0; i < list.size(); i++) {
            if (i % 10 == 0) {
                System.out.println(list.get(i));
            } else {
                System.out.print(list.get(i) + " ");
            }
        }
        System.out.println("--------------------------------------------------------");
        /**模拟给4个人随机发牌*/
        /*先把牌打乱*/
        Collections.shuffle(list);
        /*截取一段固定牌数给一个人*/
        int p = 11;
        /**截取扑克牌集合中的子链作为发的牌*/
        List<String> list1 = list.subList(list.size() - p, list.size());
        Collections.sort(list1); //给扑克牌排序
        List<String> list2 = list.subList(list.size() - 2 * p, list.size() - p);
        Collections.sort(list2); //给扑克牌排序
        List<String> list3 = list.subList(list.size() - 3 * p, list.size() - 2 * p);
        Collections.sort(list3); //给扑克牌排序
        List<String> list4 = list.subList(list.size() - 4 * p, list.size() - 3 * p);
        Collections.sort(list4); //给扑克牌排序
        List<String> list5 = list.subList(0, list.size() - 4 * p);  //剩余牌数
        System.out.println("张三的牌："+list1);
        System.out.println("李四的牌："+list2);
        System.out.println("王五的牌："+list3);
        System.out.println("赵六的牌："+list4);
        System.out.println("剩余牌："+list5);
    }
}
