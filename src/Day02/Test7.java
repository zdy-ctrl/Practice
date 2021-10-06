package Day02;

import java.util.Scanner;

//今天是周2，100天以后是周几？
public class Test7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("请输入今天星期几");
        int week = in.nextInt();
        Scanner in_1 = new Scanner(System.in);
        System.out.println("请输入你想知道多少天之后是星期几");
        int day = in_1.nextInt();
        int temp = 7 - week;
        int week_1 = day - temp;
        int week_2 = week_1 % 7;
        System.out.println(day+"天之后，星期"+week_2);
    }
}
