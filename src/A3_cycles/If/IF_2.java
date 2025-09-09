package A3_cycles.If;

public class IF_2 {
    public static void main(String[] args) {

        int i = 0;
        int j = 1;
        int a = (j += (j < 1) ? (+j) : (++i));

        System.out.println(a);
    }
}
