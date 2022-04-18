package PracticeDamo;

import java.util.Scanner;

/**
 * @author 18124
 * 题目：古典问题：有一对兔子，从出生后第3个月起每个月都生一对兔子，
 * 小兔子长到第三个月后每个月又生一对兔子，假如兔子都不死，问每个月的兔子对数为多少？
 * 分析：一月1对 二月1对 三月2对  四月3对  五月5对  六月
 * 斐波la
 */
public class Demo1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        System.out.println(fun(m));
    }
    private static int fun(int n){
        if(n==1 ||n==2) {
            return 1;
        } else {
            return fun(n-1)+fun(n-2);
        }
    }
}
