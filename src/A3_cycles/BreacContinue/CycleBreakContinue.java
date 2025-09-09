package A3_cycles.BreacContinue;

public class CycleBreakContinue {
    public static void main(String[] args) {

        for (int i = 10; i < 20; i +=2 ) {
            if (i >15)
                break;
            if (i % 4 == 0)
                continue;

            System.out.println(i);
        }
    }
}
