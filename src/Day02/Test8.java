package Day02;

import java.util.Scanner;

//求三个整数x,y,z中的最大值
public class Test8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("请输入三个数");
        int x = in.nextInt();
        int y = in.nextInt();
        int z = in.nextInt();
//        int Max = 0;
//        if (x > y) {
//            Max = x;
//        } else {
//            Max = y;
//        }
//        if (Max > z) {
//            Max = Max;
//        } else {
//            Max = z;
//        }
        int Max = x > y ? x : y;
        Max = Max > z ? Max : z;
        System.out.println(x+" "+y+" "+z+"中"+Max+"最大");
    }
}
