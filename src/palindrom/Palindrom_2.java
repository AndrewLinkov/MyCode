package palindrom;

import java.util.Scanner;

public class Palindrom_2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);;

        System.out.println("Введите текст: ");
        String str = sc.nextLine();

        if (str.length() < 20) {
            /*

            \\p{Punct} - все знаки препинания
            [^a-zA-Z0-9] - все буквы и цифры
            \\s - все пробелы
            + - Несколько вхождений

            "" - аргумент на что заменяются найденные символы
             */
            String cleanStr = str.replaceAll("[\\p{Punct}\\s]+", "");
            String lowerStr = cleanStr.toLowerCase();
            System.out.println("Очищенная строка: " + lowerStr);
            
            // Проверка на палиндром
            boolean isPalindrome = true;
            int left = 0;
            int right = lowerStr.length() - 1;
            
            while (left < right) {
                if (lowerStr.charAt(left) != lowerStr.charAt(right)) {
                    isPalindrome = false;
                    break;
                }
                left++;
                right--;
            }
            
            if (isPalindrome) {
                System.out.println("Это палиндром!");
            } else {
                System.out.println("Это не палиндром.");
            }
            
        } else {
            System.out.println("Ошибка");
        }
    }
}
