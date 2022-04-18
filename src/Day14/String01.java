package Day14;

import java.lang.String;
/**
 * @author 18124
 * 字符串String类
 */
public class String01 {
    public static void main(String[] args) {
        String str = "ABC";
        String str1 = "";
        String str2 = "abc";
        /*（1）boolean isEmpty()：字符串是否为空*/
        System.out.println(str.isEmpty());
        System.out.println(str1.isEmpty());
        /*（2）int length()：返回字符串的长度*/
        System.out.println(str.length());
        System.out.println(str1.length());
        /*（3）String concat(xx)：拼接，等价于+*/
        System.out.println(str.concat("123"));
        /*（4）boolean equals(Object obj)：比较字符串是否相等，区分大小写*/
        System.out.println(str.equals(str2));
        /*（5）boolean equalsIgnoreCase(Object obj)：比较字符串是否相等，不区分大小写*/
        System.out.println(str.equalsIgnoreCase(str2));
        /*（6）int compareTo(String other)：比较字符串大小，区分大小写，按照Unicode编码值比较大小*/
        System.out.println(str.compareTo(str2));
        /*（7）int compareToIgnoreCase(String other)：比较字符串大小，不区分大小写*/
        System.out.println(str.compareToIgnoreCase(str2));
        /*（8）String toLowerCase()：将字符串中大写字母转为小写*/

        /*（9）String toUpperCase()：将字符串中小写字母转为大写*/

        /*（10）String trim()：去掉字符串前后空白符*/
    }
}
