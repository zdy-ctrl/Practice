package Day15;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

/**
 * @author ZDY
 * @date: 2022/4/2 20:23
 */
public class ListDemo2 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5,6};
        List list = Arrays.asList(arr);
        System.out.println(list);
        List<? extends Serializable> list1 = Arrays.asList(1, "hello", 3.1419936);
        System.out.println(list1);
        for (Serializable serializable : list1) {
            System.out.println(serializable);
        }
    }
}
