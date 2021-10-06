package Day03;

import java.util.Scanner;

/*
案例需求：
       编写一个程序，为一个给定的年份找出其对应的中国生肖。中国的生肖基于12年一个周期，每年用一个动物代表：
       rat（鼠）、ox（牛）、tiger（虎）、rabbit（兔）、dragon（龙）、snake（蛇）、
       horse（马）、sheep（羊）、monkey（候）、rooster（鸡）、dog（狗）、pig（猪）。
       提示：2017年：鸡   2017 % 12 == 1
*/
public class Test01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("请输入年份");
        int year = in.nextInt();
        switch (year % 12) {
            case 1:
                System.out.println("鸡年");
                break;
            case 2:
                System.out.println("狗年");
                break;
            case 3:
                System.out.println("猪年");
                break;
            case 4:
                System.out.println("鼠年");
                break;
            case 5:
                System.out.println("牛年");
                break;
            case 6:
                System.out.println("虎年");
                break;
            case 7:
                System.out.println("兔年");
                break;
            case 8:
                System.out.println("龙年");
                break;
            case 9:
                System.out.println("蛇年");
                break;
            case 10:
                System.out.println("马年");
                break;
            case 11:
                System.out.println("羊年");
                break;
            case 12:
                System.out.println("猴年");
                break;
        }
    }
}
