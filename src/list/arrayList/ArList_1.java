//типовой пример

package list.arrayList;

import java.util.ArrayList;

public class ArList_1 {
    public static void main(String[] args) {
        // Создание объекта ArrayList
        ArrayList<String> fruits = new ArrayList<>();

        // Добавление элементов в ArrayList
        fruits.add("Яблоко");
        fruits.add("Банан");
        fruits.add("Апельсин");
        fruits.add(1, "Груша"); //Данный элемент будет вторым по счету.

        // Получение элементов из ArrayList
        System.out.println("Получение элементов из ArrayList:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // Проверка наличия элемента в ArrayList
        System.out.println("Наличие элемента в ArrayList:");
        System.out.println("Содержит яблоко? " + fruits.contains("Яблоко"));
        System.out.println("Содержит грушу? " + fruits.contains("Груша"));

        // Получение размера ArrayList
        System.out.println("Размер ArrayList: " + fruits.size());

        // Удаление элемента из ArrayList по имени
        fruits.remove("Банан");

        // удаление по индексу
        fruits.remove(2);

        // Проверка удаления элемента
        System.out.println("После удаления элемента:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // Очистка ArrayList
        fruits.clear();
        System.out.println("Размер ArrayList после очистки: " + fruits.size());
    }
}