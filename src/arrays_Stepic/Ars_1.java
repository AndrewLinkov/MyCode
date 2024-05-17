//Вводится число n, затем n чисел целых, по одному на каждой строке.
// Затем вводится число, на которое нужно умножить все введённые выше числа.
// Выведите на экран результат умножения построчно.

package arrays_Stepic;

import java.util.Scanner;

public class Ars_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введено число n ");
        int n = sc.nextInt();

        System.out.println("Заполните массив чисел, размер массива равен числу n");
        int[] mas = new int[n];
        for (int i = 0; i < n; i++)
            mas[i] = sc.nextInt();
        // вводится число b на которое нужно умножить введенные числа массива
        System.out.println("Введите число b:");
        int b = sc.nextInt();
        //проходим по массиву чисел n и умножаем на b
        for (int i = 0; i < n; i++)
            System.out.println("Результат: " + mas[i] * b);
    }
}