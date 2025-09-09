package A5_map.HashMap;

import java.util.HashMap;
import java.util.Map;

public class HashMap_2 {
    public static void main(String[] args) {

        HashMap<Integer, String> map = new HashMap<>();

        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(4, "Grapes");
        map.put(5, "Kiwi");

        System.out.println("Размер мапы: " + map.size()); // 5

        map.put(5, "KIWI");
        map.put(3, "KIWI");

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println("Ключ: " + entry.getKey() + " Значение: " + entry.getValue());
        }
    }
}
