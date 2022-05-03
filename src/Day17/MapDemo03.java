package Day17;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

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
        /*HashMap*/
        HashMap<String, Double> HashMap = new HashMap<>();
        HashMap.put("zzy", 98.5);
        HashMap.put("xxb", 98.5);
        HashMap.put("zll", 98.5);
        HashMap.put("null", null);
        /*集合遍历*/
        for (String s : HashMap.keySet()) {
            System.out.println(s + "==" + HashMap.get(s));
        }
        System.out.println("-------------------------------");
        /*LinedHashMap*/
        LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("张三", 97);
        linkedHashMap.put("李四", 98);
        linkedHashMap.put("王五", 99);
        linkedHashMap.put("null", null);
        /*遍历集合*/
        for (Map.Entry<String, Integer> entry : linkedHashMap.entrySet()) {
            System.out.println(entry);
        }
        System.out.println("-------------------------------");
        /*TreeMap
        * 底层红黑树：元素唯一，无序，但是实现了排序
        * 如何实现元素唯一？前提元素必须可以比较大小
        * */
        TreeMap<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("张三", 12);
        treeMap.put("王五", 14);
        treeMap.put("李四", 13);
        treeMap.put("null", null);
        for (Map.Entry<String, Integer> entry : treeMap.entrySet()) {
            System.out.println(entry);
        }
    }
}