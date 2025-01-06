package A3_cycles.For;

/*
Напишите программу, которая считает натуральное число n,
а затем выведет на экран построчно все числа от 1 до n включительно.
 */

import java.util.Scanner;

public class FOR_1 {
    public static void main(String[] args) {

        System.out.println("Введите натуральное число: ");
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();

        for (int i = 1; i <= a; i++) {
            System.out.println(i);
        }
    }
}
