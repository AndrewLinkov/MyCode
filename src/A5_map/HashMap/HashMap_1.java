package A5_map.HashMap;

import java.util.HashMap;
import java.util.Map;

public class HashMap_1 {
    public static void main(String[] args) {

        HashMap<String, String> map = new HashMap<>();

        // Добавление элементов
        map.put("one", "Apple");
        map.put("two", "Banana");
        map.put("three", "Orange");
        map.put("four", "Grapes");
        map.put("five", "Kiwi");

        System.out.println("Вывод элемента по ключу one: " + map.get("one")); // 3

        System.out.println("вывод элемента по ключу two " + map.containsKey("two")); // true

        map.remove("Orange");

        System.out.println("Размер мапы: " + map.size()); // 3

        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println("Ключ: " + entry.getKey() + " Значение: " + entry.getValue());
        }

        System.out.println("Вывод значений Key");
        for (String key : map.keySet()) {
            System.out.println(key);
        }

        System.out.println("Вывод значений Values");
        for (String value : map.values()) {
            System.out.println(value);
        }
    }
}
