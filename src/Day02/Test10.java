package Day02;

import java.util.Scanner;

/*
        案例：
        小明要到美国旅游，可是那里的温度是以华氏度为单位记录的。
        它需要一个程序将华氏温度（80度）转换为摄氏度，
        并以华氏度和摄氏度为单位分别显示该温度。
        ℃=（℉-32）/1.8
*/
public class Test10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("请输入一个华氏温度");
        double Fahrenheit = in.nextDouble();
        double Celsius = (Fahrenheit - 32) / 1.8;
        System.out.println("摄氏温度为"+Celsius);
    }
}
