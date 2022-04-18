package Day15;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Random;

/**
 * @title:
 * @author: ZDY
 * @date: 2022/4/5 15:26
 * @Abstract：
 * 1、用一个String[]数组存点数
 * 2、用一个String[]数组存花色
 * 3、用一个String[]数组存大王、小王
 * 4、用上面的数组，生成一副扑克牌，放到Collection的集合中
 * 5、遍历显示全副扑克牌
 * 6、模拟给4个人随机发牌，每个人11张牌，分别放到四个Collection集合中
 * 7、显示每个人的牌和剩余的牌
 */
public class ListPractice4 {

    public static void main(String[] args) {
        /**生成一副扑克牌数组*/
        String[] points={"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
        String[] design = {"黑桃", "梅花", "方块", "红心"};
        String[] king = {"大王", "小王"};
        /**生成一个随机数*/
        Random random = new Random();
        /**放入扑克牌集合*/
        List<String> cards = new ArrayList<>();
        for (int i = 0; i < points.length; i++) {
            for (int j = 0; j < design.length; j++) {
                cards.add(design[j] + points[i]);
            }
        }
        for (int i = 0; i < king.length; i++) {
            cards.add(king[i]);
        }
        /**遍历扑克牌*/
        for (int i = 0; i < cards.size(); i++) {
            System.out.print(cards.get(i)+" ");
            if ((i+1) % 10 == 0) {
                System.out.println(" ");
            }
        }
        System.out.println("开始发牌");
        /**给4个人发牌*/
        List<String> one = new ArrayList<>();
        List<String> two = new ArrayList<>();
        List<String> three = new ArrayList<>();
        List<String> four = new ArrayList<>();
        for (int i = 0; i < 11; i++) {
            one.add(cards.remove(random.nextInt(cards.size())));
        }
        System.out.println(one);
        for (int i = 0; i < 11; i++) {
            two.add(cards.remove(random.nextInt(cards.size())));
        }
        System.out.println(two);
        for (int i = 0; i < 11; i++) {
            three.add(cards.remove(random.nextInt(cards.size())));
        }
        System.out.println(three);
        for (int i = 0; i < 11; i++) {
            four.add(cards.remove(random.nextInt(cards.size())));
        }
        System.out.println(four);
        /**显示剩下的牌*/
        System.out.println(cards);
    }
}
