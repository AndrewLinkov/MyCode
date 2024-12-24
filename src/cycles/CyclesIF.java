package cycles;

import java.util.Scanner;

public class CyclesIF {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберете занчение");
        int sc = scanner.nextInt();

        int a = 5;
        int b = 2;

        if (sc == 1) {
            int value1 = a + b;
            System.out.println(value1);
        } else if (sc == 2) {
            int value2 = a - b;
            System.out.println(value2);
        } else {
            System.out.println("Операция не выбрана");
        }
    }
}
