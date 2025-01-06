package A3_cycles.ForTernars;

public class FR_1 {
    public static void main(String[] args) {

        int i = 0;
        int j = 1;

        int b = j += (j < 1) ? (+j) : ++i;

        System.out.println(b);
    }
}
