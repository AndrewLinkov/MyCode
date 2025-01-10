package A5_map.TreeMap;

import java.util.TreeMap;
import java.util.Map;

public class TreeMap_1 {
    public static void main(String[] args) {

        TreeMap<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("AAA", 2);
        treeMap.put("A", 3);
        treeMap.put("B", 5);
        treeMap.put("Gr", 4);

        // Итерация по ключам
        System.out.println("Ключи:");
        for (String key : treeMap.keySet()) {
            System.out.println(key);
        }

        // Итерация по значениям
        System.out.println("Значения:");
        for (Integer value : treeMap.values()) {
            System.out.println(value);
        }

        // Итерация по парам ключ-значение
        System.out.println("Пары ключ-значение:");
        for (Map.Entry<String, Integer> entry : treeMap.entrySet()) {
            System.out.println("Ключ: " + entry.getKey() + ", Значение: " + entry.getValue());
        }
    }
}
