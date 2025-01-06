//2. Напишите программу, которая находит сумму всех чисел в массиве.

package A2_arrays;

public class ar2 {
    public static void main(String[] args) {
        int array[] = {1, 2, 12, 5, 6, 8};

        var sum = 0;
        for (int value : array) {
            sum += value;
        }

        System.out.println("Результат sum: " + sum);

        var sum2 = 0;
        for (int i = 0; i < array.length; i++) {
            sum2 += array[i];
        }
        System.out.println("Результат sum2: " + sum2);
    }

}
