package Day07;

/**
 * @title:
 * @author: ZDY
 * @date: 2022/4/14 11:35
 * @Abstract： 求n个整数的和
 */
public class Demo2 {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 2, 5, 6, 67, 86};
        System.out.println(add(arr));
        System.out.println(add2(arr));
    }

    //普通方式
    public static int add(int[] a) {
        int num = 0;
        for (int i = 0; i < a.length; i++) {
            num += a[i];
        }
        return num;
    }

    //可变参数方式
    public static int add2(int... a) {
        int num = 0;
        for (int i = 0; i < a.length; i++) {
            num += a[i];
        }
        return num;
    }
}
