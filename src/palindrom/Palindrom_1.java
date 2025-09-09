package palindrom;

import java.util.Scanner;

public class Palindrom_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text;

        System.out.println("Введите текст: ");
        text = scanner.nextLine();

        System.out.println(isPalindrom(text));
    }

    public static boolean isPalindrom(String text) {
        String clean = text.replace("\\s+", "").toLowerCase();
        StringBuilder plain = new StringBuilder(clean);
        StringBuilder reverse = plain.reverse();

        return (reverse.toString().equals(clean));
    }
}
