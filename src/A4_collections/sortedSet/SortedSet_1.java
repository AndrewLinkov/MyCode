package A4_collections.sortedSet;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSet_1 {
    public static void main(String[] args) {
        // Создаем SortedSet
        SortedSet<Integer> sortedSet = new TreeSet<>();

        // Добавляем элементы
        sortedSet.add(5);
        sortedSet.add(3);
        sortedSet.add(8);
        sortedSet.add(1);

        // Выводим SortedSet
        System.out.println(sortedSet); // [1, 3, 5, 8]

        // Получаем первый и последний элементы
        System.out.println("Первый элемент: " + sortedSet.first()); // 1
        System.out.println("Последний элемент: " + sortedSet.last()); // 8

        // Получаем подмножество
        SortedSet<Integer> subset = sortedSet.subSet(2, 6);
        System.out.println("Подмножество: " + subset); // [3, 5]

        // Голова и хвост
        SortedSet<Integer> headSet = sortedSet.headSet(5);
        System.out.println("HeadSet до 5: " + headSet); // [1, 3]

        SortedSet<Integer> tailSet = sortedSet.tailSet(3);
        System.out.println("TailSet от 3: " + tailSet); // [3, 5, 8]

        // Проверка размера
        System.out.println("Размер: " + sortedSet.size()); // 4
    }
}
