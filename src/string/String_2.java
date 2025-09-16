package string;

public class String_2 {

    /*
    Убрать из строки все знаки препинания и пробелы и проверить на палидром
     */

    public static void main(String[] args) {

        String str = "asdFdsa !";

        String cleanStr = str.replaceAll("[\\s\\p{Punct}]+", "");
        System.out.println(cleanStr);

        boolean palidromStr = new StringBuilder(cleanStr).reverse().toString().equalsIgnoreCase(cleanStr);
        System.out.println(palidromStr);
    }






















        /*

        System.out.println("Строка с спецсимволами, знаками препинания, пробелами, спецсимволами");
        String str1 = "123abcABCфыкФЫК < > $ !!! () [] : +/ ";
        String str2 = "asdffdsa";

            /*
            \\p{Punct} - все знаки препинания
            \\s - все пробелы
            + - Несколько вхождений
            [^a-zA-Z0-9] - все буквы и цифры
            "" - аргумент на что заменяются найденные символы
             */

        /*
        // Вывод строки без пробелов
        String cleanStr = str1.replaceAll("[\\s\\p{Punct}]+", "");
        System.out.println("Строка без пробелов: " + cleanStr);

        String cleanStr1 = str2.replaceAll("[^a-zA-Z0-9]+", "").toUpperCase();
        System.out.println("Строка без спецсимволов: " + cleanStr1);

        // Проверка на палиндром
        boolean isPalindrome = new StringBuilder(str1).reverse().toString().equalsIgnoreCase(str1);
        System.out.println("Является ли строка палиндромом: " + isPalindrome);

    }

         */



}
