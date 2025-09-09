package A2_arrays;

public class ar1 {
    public static void main(String[] args) {

        //1. Напишите программу, которая находит среднее арифметическое чисел в массиве,
        // максимальное и минимальное число в массиве.

        int[] array = {1, 3, 5, 3, 8, 9};
        int sum = 0;
        int max = array[0];
        int min = array[0];

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        double result = (double) sum / array.length;
        System.out.println("Среднее арифметическое число: " + result);

        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("Максимальное число: " + max);

        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("Минимальное число: " + min);
    }
}
