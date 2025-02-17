package A5_map.sortedMap;

import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMap_1 {
    public static void main(String[] args) {
        // Создаем SortedMap
        SortedMap<String, Integer> sortedMap = new TreeMap<>();

        // Добавляем элементы
        sortedMap.put("Apple", 3);
        sortedMap.put("Banana", 5);
        sortedMap.put("Cherry", 2);
        sortedMap.put("Mango", 4);

        // Выводим SortedMap
        System.out.println(sortedMap); // {Apple=3, Banana=5, Cherry=2, Mango=4}

        // Получаем первый и последний ключи
        System.out.println("Первый ключ: " + sortedMap.firstKey()); // Apple
        System.out.println("Последний ключ: " + sortedMap.lastKey()); // Mango

        // Получаем подтаблицу
        SortedMap<String, Integer> subMap = sortedMap.subMap("Banana", "Mango");

        System.out.println("Подтаблица от Banana до Mango: " + subMap); // {Banana=5, Cherry=2}

        // Голова и хвост
        SortedMap<String, Integer> headMap = sortedMap.headMap("Banana");
        System.out.println("HeadMap до Banana: " + headMap); // {Apple=3}

        SortedMap<String, Integer> tailMap = sortedMap.tailMap("Cherry");
        System.out.println("TailMap от Cherry: " + tailMap); // {Cherry=2, Mango=4}

        // Проверка размера
        System.out.println("Размер: " + sortedMap.size()); // 4

        // Удаляем элемент
        sortedMap.remove("Apple");
        System.out.println("После удаления Apple: " + sortedMap); // {Banana=5, Cherry=2, Mango=4}
    }
}
