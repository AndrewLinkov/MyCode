package A2_arrays;

public class AR3 {
    public static void main(String[] args) {

        //3. Напишите программу, которая находит количество четных и нечетных
        // чисел в массиве и считает их суммы.

        int[] numbers = {1, 2, 3, 4, 5};

        int evenCount = 0;
        int oddCount = 0;
        int evenSum = 0;
        int oddSum = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                evenCount++;
                evenSum += numbers[i];
            } else {
                oddCount++;
                oddSum += numbers[i];
            }
        }
        System.out.println("Количество четных чисел в массиве: " + evenCount);
        System.out.println("Сумма четных чисел в массиве: " + evenSum);
        System.out.println("Количество нечетных чисел в массиве: " + oddCount);
        System.out.println("Сумма нечетных чисел в массиве: " + oddSum);
    }
}

