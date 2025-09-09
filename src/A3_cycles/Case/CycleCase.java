package A3_cycles.Case;

public class CycleCase {
    public static void main(String[] args) {

        int a = 9;
        switch (a) {
            case 0:
                System.out.println("0");
            case 5:
                System.out.println("5");
                break;
            case 9:
                System.out.println("9");
            case 10:
                System.out.println("10");
                break;
            default:
                System.out.println("!");
        }
    }
}
