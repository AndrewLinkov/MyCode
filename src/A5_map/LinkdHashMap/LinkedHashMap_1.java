package A5_map.LinkdHashMap;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMap_1 {
    public static void main(String[] args) {

        LinkedHashMap<Integer, String> map = new LinkedHashMap<>();

        map.put(1, "Apple");
        map.put(2, "Banana");

        map.put(4, "Grapes");
        map.put(5, "Kiwi");

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println("Вывод Key: " + entry.getKey() + " Вывод Value: " + entry.getValue());
        }

        // Добавление элементов
        map.put(5, "KIWI");
        map.put(3, "ORANGE");

        System.out.println("Вывод коллекции: ");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println("Вывод Key: " + entry.getKey() + " Вывод Value: " + entry.getValue());
        }
    }
}
