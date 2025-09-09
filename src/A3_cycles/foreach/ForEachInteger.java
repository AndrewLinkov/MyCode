package A3_cycles.foreach;

import java.util.ArrayList;
import java.util.List;

public class ForEachInteger {
    public static void main(String[] args) {

        List<Integer> num = new ArrayList<>();
        num.add(1);
        num.add(2);
        num.add(3);
        num.add(4);
        num.add(5);

        for (Integer nums : num) {
            System.out.println(nums);
        }
    }
}
