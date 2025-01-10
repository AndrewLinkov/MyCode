package A4_collections.set.TreeSet;

//Стандартные методы работы с TreeSet

import java.util.TreeSet;

public class TreeSet_1 {
    public static void main(String[] args) {
        // Создаем TreeSet
        TreeSet<Integer> treeSet = new TreeSet<>();

        // Добавление элементов
        treeSet.add(10);
        treeSet.add(20);
        treeSet.add(5);
        treeSet.add(15);
        treeSet.add(25);

        // Попытка добавления дублирующего элемента
        boolean added = treeSet.add(40); // Это не добавит элемент
        System.out.println("Элемент 10 добавлен: " + added); // false

        // Вывод элементов в отсортированном порядке
        System.out.println("Элементы в TreeSet: " + treeSet); // [5, 10, 15, 20, 25]

        // Проверка наличия определенного элемента
        if (treeSet.contains(15)) {
            System.out.println("TreeSet содержит элемент 15.");
        }

        // Удаление элемента
        treeSet.remove(20);
        System.out.println("После удаления элемента 20: " + treeSet); // [5, 10, 15, 25]

        // Наименьший и наибольший элементы
        System.out.println("Наименьший элемент: " + treeSet.first()); // 5
        System.out.println("Наибольший элемент: " + treeSet.last()); // 40

        // Итерация по элементам
        System.out.println("Итерация по элементам:");
        for (Integer number : treeSet) {
            System.out.println(number);
        }
    }
}
