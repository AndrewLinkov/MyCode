package palindrom;

import java.util.Scanner;

public class Palindrom_1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);;

        System.out.println("Введите текст: ");
        String str = sc.nextLine();

        if (str.length() < 20) {
            /*
            \\p{Punct} - все знаки препинания
            \\s - все пробелы
            [^a-zA-Z0-9] - все буквы и цифры
            + - Несколько вхождений

            "" - аргумент на что заменяются найденные символы
             */
            String cleanStr = str.replaceAll("[\\p{Punct}\\s]+", "");
            String lowerStr = cleanStr.toLowerCase();
            System.out.println("Очищенная строка: " + lowerStr);
        } else {
            System.out.println("Ошибка");
        }
    }
}
