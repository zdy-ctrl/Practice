package Day03;

import java.util.Scanner;

//已知2019年1月1日是星期二，从键盘输入2019年的任意一天，请判断它是星期几
public class Test2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("请输入几月");
        int month = in.nextInt();
        System.out.println("请输入几号");
        int day = in.nextInt();
        for (int i = 1; i <month; i++) {
            if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
                day += 31;
            } else if (month == 4 || month == 6 || month == 9 || month == 11) {
                day += 30;
            } else if (month == 2) {
                day += 28;
            }
        }
        int day_1 = day - 1;
        int week = day_1 % 7;
        System.out.println(month+"月"+day+"号，是星期"+(week+2));
    }
}
