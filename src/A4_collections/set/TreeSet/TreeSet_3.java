package A4_collections.set.TreeSet;

// Как проверить в списке Set пришли все поля?

import java.util.Set;
import java.util.TreeSet;

public class TreeSet_3 {
    public static void main(String[] args) {

        Set<Integer> mySet = new TreeSet<>();
        mySet.add(1);
        mySet.add(5);
        mySet.add(3);

        int expectedSize = 3;
        if (mySet.size() == expectedSize) {
            System.out.println("Все элементы успешно добавлены. Размер: " + mySet.size());
        } else {
            System.out.println("Ошибка: Не все элементы добавлены. Ожидалось: " + expectedSize + ", получено: " + mySet.size());
        }
    }
}