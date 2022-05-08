package Day16;

import org.junit.Test;

import java.util.LinkedHashSet;
import java.util.Scanner;

/**
 * @title:
 * @author: ZDY
 * @date: 2022/5/7 23:19
 * @Abstract： 键盘录入一个字符串，去掉其中重复字符，打印出不同的那些字符，必须保证顺序。
 * 例如输入：aaaabbbcccddd，打印结果为：abcd。
 * 提示：LinkedHashSet的使用
 */
public class ListAndSetHomework06 {
    public static void main(String[] args) {
        LinkedHashSet<Character> set1 = Input();
        System.out.println("set1 = " + set1);
    }

    /*键盘输入字符串*/
    @Test
    public static LinkedHashSet<Character> Input() {
        LinkedHashSet<Character> set = new LinkedHashSet<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一串字符：");
        String str = scanner.nextLine();
        //先打印一下没有去重之前的字符串
        System.out.println("str = " + str);
        //利用charAt()方法遍历字符串输入到LinedHashSet集合中去
        for (int i = 0; i < str.length(); i++) {
            set.add(str.charAt(i));
        }
        return set;
    }

}
