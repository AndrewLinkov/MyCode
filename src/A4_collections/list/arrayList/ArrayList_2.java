
// Пример перевода arrayList в Set

package A4_collections.list.arrayList;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class ArrayList_2 {
    public static void main(String[] args) {

        // Создание объекта ArrayList
        ArrayList<String> fruits = new ArrayList<>();

        // Добавление элементов в ArrayList
        fruits.add("Яблоко");
        fruits.add("Банан");
        fruits.add("Апельсин");

        Set<String> mySet = new HashSet<>(fruits);

        System.out.println("Список List: " + fruits);
        System.out.println("Список Set: " + mySet);
    }
}
