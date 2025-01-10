package A4_collections.set.TreeSet;

import java.util.TreeSet;

public class TreeSet_2 {
    public static void main(String[] args) {
        // Создаем TreeSet
        TreeSet<String> treeSet = new TreeSet<>();

        // Добавление элементов
        treeSet.add("AAA");
        treeSet.add("CCC");
        treeSet.add("String");
        treeSet.add("AString");
        treeSet.add("U");
        treeSet.add("A");

        for (String value : treeSet) {
            System.out.println(value);
        }
    }
}