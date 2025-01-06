//Вводится список (сначала количество элементов, потом сами элементы).
// Найдите сумму всех элементов и выведите её. А потом выведите введённые
// числа в обратном порядке.

package A2_arrays.arrays_Stepic;

import java.util.Scanner;

public class Ars_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введено число n ");
        int n = sc.nextInt();

        System.out.println("Заполните массив чисел, размер массива равен числу n");
        int[] array = new int[n];
        for (int i = 0; i < n; i++)
            array[i] = sc.nextInt();

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println("Сумма: " + sum);

        //Числа выводятся в обратном порядке
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.println("Вывод числе в обратном порядке: ");
            System.out.println(array[i]);
        }
    }
}
