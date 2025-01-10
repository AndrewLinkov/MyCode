package string;

import javax.sound.midi.Soundbank;

public class Str_4_Equals {
    public static void main(String[] args) {

        String str1 = "Hello";
        String str2 = "Hello";

        System.out.println("Результат: " + (str1 == str2));        // true
        System.out.println("Результат: " + str1.equals(str2) );    // true

        String str3 = new String("World");
        String str4 = new String("World");

        System.out.println("Результат: " + (str3.equals(str4)));    // true
        System.out.println("Результат: " + (str3 == str4));         // false

        System.out.println("------------------------------");
        System.out.println("Результат: " + (str1 == str3));         // false
        System.out.println("Результат: " + (str1.equals(str3)));    // false
    }
}
