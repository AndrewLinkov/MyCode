package A4_collections.set.HashSet;

public class HashSet {
    public static void main(String[] args) {

        // Создаем новый HashSet
        java.util.HashSet<String> fruits = new java.util.HashSet<>();

        // Добавление элементов в HashSet
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Date");
        fruits.add("Elderberry");

        // Вывод HashSet
        System.out.println("Содержимое HashSet: " + fruits);

        // Проверка наличия элементов
        String fruitToCheck = "Banana";
        if (fruits.contains(fruitToCheck)) {
            System.out.println(fruitToCheck + " присутствует в HashSet.");
        } else {
            System.out.println(fruitToCheck + " отсутствует в HashSet.");
        }

        // Попытка добавить дубликат
        boolean isAdded = fruits.add("Apple"); // Дубликат не будет добавлен
        if (isAdded) {
            System.out.println("Apple был добавлен.");
        } else {
            System.out.println("Apple - дубликат и не был добавлен.");
        }

        // Размер HashSet
        System.out.println("Количество элементов в HashSet: " + fruits.size());

        // Удаление элемента
        fruits.remove("Cherry");
        System.out.println("После удаления Cherry, HashSet: " + fruits);

        // Проверка размера после удаления
        System.out.println("Количество элементов в HashSet после удаления: " + fruits.size());

        // Итерация по элементам
        System.out.println("Итерация по элементам:");
        for (String fruet : fruits) {
            System.out.println(fruet);
        }

        // Очистка HashSet
        fruits.clear();
        System.out.println("После очистки, HashSet: " + fruits);
    }
}

