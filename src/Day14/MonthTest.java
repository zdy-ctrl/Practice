package Day14;

import java.util.Scanner;

import static java.lang.Integer.valueOf;

/**
 * @author 18124
 */
public class MonthTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个月份");
        int i = scanner.nextInt();
        int value = valueOf(i);
        Month month = Month.getByValue(value);
        System.out.println(month);
    }
}