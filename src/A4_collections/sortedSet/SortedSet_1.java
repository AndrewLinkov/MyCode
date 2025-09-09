package A4_collections.sortedSet;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSet_1 {
    public static void main(String[] args) {

        SortedSet<Integer> sortedSet = new TreeSet<>();

        sortedSet.add(5);
        sortedSet.add(3);
        sortedSet.add(8);
        sortedSet.add(1);

        System.out.println(sortedSet); // [1, 3, 5, 8]

        System.out.println("Вывод первого значения: " + sortedSet.first()); // 1
        System.out.println("Вывод последнего значения: " + sortedSet.last()); // 8

        System.out.println("Размер множества: " + sortedSet.size()); // 4
    }
}
