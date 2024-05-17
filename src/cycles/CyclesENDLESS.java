package cycles;

import java.util.Scanner;

public class CyclesENDLESS {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        for (; ; ) {
            System.out.println("Выберете операцию! ");
            int value = scanner.nextInt();
            switch (value) {
                case 1:
                    System.out.println("Выбрана оперция сложения!");
                    System.out.println("Введите занчение 1 и 2");
                    int int1 = scanner.nextInt();
                    int int2 = scanner.nextInt();
                    int resultSum = int1 + int2;
                    System.out.println("Результат: " + resultSum);
                    break;
                case 2:
                    System.out.println("Выбрана операция вычитания");
                    System.out.println("Введите занчение 1 и 2");
                    int int11 = scanner.nextInt();
                    int int22 = scanner.nextInt();
                    int result = int11 - int22;
                    System.out.println("Результат: " + result);
                    break;
                default:
                    System.out.println("Выберете другую команду");
            }
        }
    }
}
