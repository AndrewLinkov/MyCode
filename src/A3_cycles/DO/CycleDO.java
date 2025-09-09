package A3_cycles.DO;

import java.util.Scanner;

public class CycleDO {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int choice;
        do {
            System.out.println("Выберите действие:");
            System.out.println("1 - сложение");
            System.out.println("2 - вычитание");
            System.out.println("0 - выход");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    performAddition();
                    break;
                case 2:
                    performSubtraction();
                    break;
                case 0:
                    System.out.println("До свидания!");
                    break;
                default:
                    System.out.println("Ошибка: некорректный выбор.");
                    break;
            }
        } while (choice != 0);
    }

    public static void performAddition() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число:");
        double num1 = scanner.nextDouble();
        System.out.println("Введите второе число:");
        double num2 = scanner.nextDouble();
        double result = num1 + num2;
        System.out.println("Результат: " + result);
    }

    public static void performSubtraction() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число:");
        double num1 = scanner.nextDouble();
        System.out.println("Введите второе число:");
        double num2 = scanner.nextDouble();
        double result = num1 - num2;
        System.out.println("Результат: " + result);
    }
}
