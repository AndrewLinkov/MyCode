package A5_map.HashMap;

//Как перебрать все ключи в Мапе.
//Как перебрать все занчения в Мапе.

import java.util.HashMap;
import java.util.Map;

public class HashMap_1 {
    public static void main(String[] args) {

        HashMap<String, String> map = new HashMap<>();

        // Добавление пар ключ-значение
        map.put("one", "Apple");
        map.put("two", "Banana");
        map.put("three", "Orange");
        map.put("four", "Grapes");
        map.put("five", "Kiwi");

        // Получение значения по ключу
        System.out.println("Количество яблок: " + map.get("one")); // 3

        // Проверка наличия ключа
        System.out.println("Есть ли позиция two? " + map.containsKey("two")); // true

        // Удаление элемента
        map.remove("Orange");

        // Размер мапы
        System.out.println("Размер карты: " + map.size()); // 3

        // Вывод всех ключей и значений используем метод entrySt()
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println("Номер позиции: " + entry.getKey() + " Фрукт: " + entry.getValue());
        }

        System.out.println("Вывод всех ключей");
        for (String key : map.keySet()) {
            System.out.println(key);
        }

        System.out.println("Вывод всех значений");
        for (String value : map.values()) {
            System.out.println(value);
        }
    }
}
