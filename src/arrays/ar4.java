//4. Напишите программу, которая находит среднее арифметическое четных
//        и нечетных чисел в массиве.

package arrays;

public class ar4 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int evenSum = 0;
        int oddSum = 0;
        int evenCount = 0;
        int oddCount = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                evenSum += numbers[i];
                evenCount++;
            } else {
                oddSum += numbers[i];
                oddCount++;
            }
        }
        double evenAverage = (double) evenSum / evenCount;
        double oddAverage = (double) oddSum / oddCount;
        System.out.println("Среднее арифметическое четных чисел в массиве: " + evenAverage);
        System.out.println("Среднее арифметическое нечетных чисел в массиве: " + oddAverage);
    }
}
