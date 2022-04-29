package Day17;

import java.util.HashMap;
import java.util.Map;

/**
 * @title:
 * @author: ZDY
 * @date: 2022/4/29 23:46
 * @Abstract：
 * Map集合元素的遍历：
 * Map的遍历，不能支持foreach，因为Map接口没有继承java.lang.Iterable<T>接口，也没有实现Iterator iterator()方法。只能用如下方式遍历：
 * （1）分开遍历：
 * - 单独遍历所有key
 * - 单独遍历所有value
 * （2）成对遍历：
 * - 遍历的是映射关系Map.Entry类型的对象，Map.Entry是Map接口的内部接口。
 * 每一种Map内部有自己的Map.Entry的实现类。在Map中存储数据，实际上是将Key---->value的数据存储在Map.Entry接口的实例中，
 * 再在Map集合中插入Map.Entry的实例化对象
 */
public class MapDemo2 {
    public static void main(String[] args) {
        /**Map集合遍历的4种方法*/
        Map<String, String> map = new HashMap<>();
        map.put("张三", "张三的老婆");
        map.put("李四", "李四的老婆");
        map.put("王五", "王五的老婆");
        /*遍历所有的key值*/
        for (String key : map.keySet()) {
            System.out.print(key+" ");
        }
        System.out.println();
        /*遍历集合中所有的value值*/
        for (String value : map.values()) {
            System.out.print(value+" ");
        }
        System.out.println();
        /*第一种遍历（二次取值）普遍使用*/
        for (String key : map.keySet()) {
            System.out.println(key + "====" + map.get(key));
        }
        /*第二种遍历：使用entrySet遍历Map中的集合键值对*/
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry);
        }
    }
}
