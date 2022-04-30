package Day17;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @title:
 * @author: ZDY
 * @date: 2022/4/30 14:41
 * @Abstract：
 * map常见的实现类有HashMap，TreeMap,LinedHashMap和Properties
 * HashMap和HashTable都是哈希表但是：(无序)
 * HashMap是线程不安全的，允许存在使用null值和null键
 * HashTable是线程安全的，不允许存在null对象作用为键值对
 * linkedHashMap 有序的
 */
public class MapDemo03 {
    public static void main(String[] args) {
        HashMap<String, Double> HashMap = new HashMap<>();
        HashMap.put("张三", 98.5);
        HashMap.put("李四", 98.5);
        HashMap.put("王五", 98.5);
        HashMap.put("null", null);
        /*集合遍历*/
        for (String s : HashMap.keySet()) {
            System.out.println(s + "==" + HashMap.get(s));
        }

        LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("张三", 97);
        linkedHashMap.put("李四", 98);
        linkedHashMap.put("王五", 99);
        linkedHashMap.put("null", null);
        /*遍历集合*/
        for (Map.Entry<String, Integer> entry : linkedHashMap.entrySet()) {
            System.out.println(entry);
        }

    }
}
