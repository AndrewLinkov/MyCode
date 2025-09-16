package string;

import java.util.Scanner;

public class String_1 {
    public static void main(String[] args) {

        /*
        На вход подается строка. Перевести стоку в верхний и нижний регистр
         */

        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        String strUp = str.toUpperCase();
        System.out.println(strUp);

        String strLow = str.toLowerCase();
        System.out.println(strLow);
    }
}
