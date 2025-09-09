package A4_collections.set.HashSet;

import java.util.HashSet;

public class HashSet_1 {
    public static void main(String[] args) {

        HashSet<String> fruits = new HashSet<String>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Date");
        fruits.add("Elderberry");

        System.out.println("Вывод HashSet: " + fruits);

        String fruitToCheck = "Banana";
        if (fruits.contains(fruitToCheck)) {
            System.out.println(fruitToCheck + " В коллекции содержится Banana .");
        } else {
            System.out.println(fruitToCheck + " В коллекции НЕ содержится Banana .");
        }
    }
}

