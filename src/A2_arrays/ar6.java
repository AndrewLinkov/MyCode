package A2_arrays;

public class ar6 {
    public static void main(String[] args) {

        /*
        6. Напишите программу, которая находит количество элементов в массиве,
        которые делятся и на 3, и на 5 без остатка.
         */
        int[] numbers = {15, 30, 47, 61};
        int count = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 3 == 0 && numbers[i] % 5 == 0) {
                count++;
            }
        }

        System.out.println("Количество элементов в массиве, которые делятся " +
                "на 3 и 5 без остатка: " + count);
    }
}
