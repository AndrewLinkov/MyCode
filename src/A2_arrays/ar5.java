//5. Напишите программу, которая находит сумму чисел, стоящих на четных
//        и нечетных позициях в массиве.


package A2_arrays;

public class ar5 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};

        int evenSum = 0;
        int oddSum = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (i % 2 == 0) {
                evenSum += numbers[i];
            } else {
                oddSum += numbers[i];
            }
        }
        System.out.println("Сумма чисел на четных позициях в массиве: " + evenSum);
        System.out.println("Сумма чисел на нечетных позициях в массиве: " + oddSum);
    }
}
