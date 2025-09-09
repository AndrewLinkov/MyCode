// 9. Напишите программу, которая находит количество уникальных элементов в массиве.

package A2_arrays;

public class ar9 {
    public static void main(String[] args) {

        // 9. Напишите программу, которая находит количество уникальных элементов в массиве.

        int[] numbers = {2, 5, 7, 10, 3, 8, 1, 2, 5};
        int uniqueCount = 0;

        for (int i = 0; i < numbers.length; i++) {
            boolean isUnique = true;
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] == numbers[j]) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                uniqueCount++;
            }
        }

        System.out.println("Количество уникальных элементов в массиве: " + uniqueCount);
    }
}
