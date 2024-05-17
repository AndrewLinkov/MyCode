// 8. Напишите программу, которая находит наибольший и наименьший элемент в массиве.

package arrays;

public class ar8 {
    public static void main(String[] args) {
        int[] numbers = {2, 5, 7, 10, 3, 8, 1};
        int max = numbers[0];
        int min = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        System.out.println("Наибольший элемент в массиве: " + max);
        System.out.println("Наименьший элемент в массиве: " + min);
    }
}
