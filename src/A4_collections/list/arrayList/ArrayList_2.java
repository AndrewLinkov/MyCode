package A4_collections.list.arrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayList_2 {
    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>(List.of(0, 1, 2, 3, 4, 5, 6, 7));

        //вывод пятого элемента
        System.out.println("Вывод элмеента с индексом 5: " + integers.get(5));

        System.out.println("Статус: ");
        for (Integer integer : integers) {
            System.out.println(integer);
        }

        //Добавление элемента с индексом 3.
        System.out.println("Добавление элемента с индексом 4, значение 100: ");
        integers.add(4, 100);

        System.out.println("Статус: ");
        for (Integer integer : integers) {
            System.out.println(integer);
        }
    }
}
