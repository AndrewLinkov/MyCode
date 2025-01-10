package A5_map.HashMap;

import java.util.HashMap;
import java.util.Map;

public class HashMap_2 {
    public static void main(String[] args) {

        HashMap<Integer, String> map = new HashMap<>();

        // Добавление пар ключ-значение
        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(4, "Grapes");
        map.put(5, "Kiwi");


        // Размер мапы
        System.out.println("Размер мапы: " + map.size()); // 5

        map.put(5, "KIWI");
        map.put(3, "KIWI");

        // Вывод всех ключей и значений используем метод entrySet()
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println("Номер позиции: " + entry.getKey() + " Фрукт: " + entry.getValue());
        }
    }
}
