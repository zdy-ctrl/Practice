package Day17;

import java.util.*;

/**
 * @title:
 * @author: ZDY
 * @date: 2022/4/29 21:38
 * @Abstract：
 *  Map集合的常用API
 */
public class MapDemo01 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        Map<String, String> map1 = new HashMap<>();
        /**添加操作*/
        //V put(K key,V value) 添加键值对到集合中
        map.put("张三", "张三的老婆");
        map.put("李四", "李四的老婆");
        map.put("王五", "王五的老婆");
        map.put("赵六", "赵六的老婆");
        map.put("王五", "王五的老婆");
        map1.put("周七", "周七的老婆");
        map1.put("周八", "周八的老婆");
        map1.put("周九", "周九的老婆");
        //void putAll(Map<? extends K,? extends V> m) 添加集合到另一个集合中
        map.putAll(map1);
        for (Map.Entry<String, String> stringStringEntry : map.entrySet()) {
            System.out.println(stringStringEntry);
        }
        System.out.println("--------------------------");
        for (Map.Entry<String, String> entry : map1.entrySet()) {
            System.out.println(entry);
        }
        System.out.println("*********************************");
        /**删除操作*/
        //- void clear() 删除map集合中的所有元素
        /*map1.clear();
        for (Map.Entry<String, String> entry : map1.entrySet()) {
            System.out.println(entry);
        }*/
        //- V remove(Object key) 删除map集合中的一个元素
        map.remove("张三", "张三的老婆");
        for (Map.Entry<String, String> stringStringEntry : map.entrySet()) {
            System.out.println(stringStringEntry);
        }
        System.out.println("*************************************");
        /**元素查询的操作*/
        //- V get(Object key) 返回的是key对应的value值
        String s1 = map.get("李四");
        System.out.println(s1);
        System.out.println("----------------------------");
        //- boolean containsKey(Object key)  通过key查找集合中是否包含这个元素
        boolean a = map.containsKey("李四");
        if (a) {
            System.out.println("此集合包含这个元素");
        } else {
            System.out.println("此集合不包含这个元素");
        }
        System.out.println("----------------------------");
        //- boolean containsValue(Object value) 通过value查找集合中是否包含这个元素
        boolean b = map.containsValue("李四的老");
        if (b) {
            System.out.println("此集合包含这个元素");
        } else {
            System.out.println("此集合不包含这个元素");
        }
        System.out.println("--------------------------");
        //- boolean isEmpty() 判断这个集合是不是为空
        boolean empty = map.isEmpty();
        if (empty) {
            System.out.println("此集合为空");
        } else {
            System.out.println("此集合不为空");
        }
        System.out.println("**********************************");
        /**元视图操作*/
        //- Set<K> keySet() 把Map集合中的key封装到一个set集合中去
        Set<String> MapOfSet1 = map.keySet();
        for (String s : MapOfSet1) {
            System.out.print(s+" ");
        }
        System.out.println();
        //- Collection<V> values() 把Map集合中value封装到一个Collection集合中去
        Collection<String> MapOfCollection = map.values();
        for (String s : MapOfCollection) {
            System.out.print(s+" ");
        }
        System.out.println();
        //- Set<Map.Entry<K,V>> entrySet()
        Set<Map.Entry<String, String>> MapOfSetKeyAndValue = map.entrySet();
        for (Map.Entry<String, String> stringStringEntry : MapOfSetKeyAndValue) {
            System.out.println(stringStringEntry);
        }
    }
}
