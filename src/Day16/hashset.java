package Day16;

import java.util.HashSet;
import java.util.Set;

/**
 * @title:
 * @author: ZDY
 * @date: 2022/4/14 17:12
 * @Abstract： 唯一
 */
public class hashset {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("aa");
        hashSet.add("bb");
        hashSet.add("cc");
        hashSet.add("dd");
        hashSet.add("dd");
        System.out.println(hashSet);
    }
}
