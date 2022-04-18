package Day16;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 * @title:
 * @author: ZDY
 * @date: 2022/4/14 17:13
 * @Abstract： 元素唯一 无序
 */
public class LinkedHashset {
    public static void main(String[] args) {
        Set<String> Set = new LinkedHashSet<>();
        Set.add("aa");
        Set.add("bb");
        Set.add("cc");
        System.out.println(Set);
    }

}
