package A5_map.HashMap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class HashMap_4 {
    public static void main(String[] args) {

        // Создаем HashMap и добавляем элементы
        HashMap<Integer, String> map = new HashMap<>();

        // Создание мапы
        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(4, "Grapes");
        map.put(5, "Kiwi");

        // Получаем коллекцию всех значений (объектов MyClass)
        Collection<String> values = map.values();

        // Итерируем по коллекции и выводим хешкоды
        for (String element : values) {
            System.out.println(element.hashCode());
        }
    }
}
