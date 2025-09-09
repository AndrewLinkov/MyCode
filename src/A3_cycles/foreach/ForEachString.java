package A3_cycles.foreach;

import java.util.ArrayList;
import java.util.List;

public class ForEachString {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("John");
        names.add("Jane");
        names.add("Bob");
        names.add("Alice");
        names.add("Mike");

        for (String name : names) {
            System.out.println(name);
        }
    }
}
