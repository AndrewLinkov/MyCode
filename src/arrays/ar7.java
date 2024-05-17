//7. Напишите программу, которая находит сумму элементов в массиве,
//        которые больше и меньше заданного числа.

package arrays;

public class ar7 {
    public static void main(String[] args) {
        int[] numbers = {2, 5, 7, 10, 3, 8, 1};
        int sumGreater = 0;
        int sumLess = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > 7) {
                sumGreater += numbers[i];
            } else if (numbers[i] < 7) {
                sumLess += numbers[i];
            }
        }
        System.out.println("Сумма элементов больше 7: " + sumGreater);
        System.out.println("Сумма элементов меньше 7: " + sumLess);

    }
}
