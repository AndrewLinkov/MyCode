package scanner;

import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {

        // ввод значений double
        Scanner scannerDouble = new Scanner(System.in);
        double double1 = scannerDouble.nextDouble();
        double double2 = scannerDouble.nextDouble();
        System.out.println(double1 + double2);

        // ввод значений int
        Scanner scannerInt = new Scanner(System.in);
        int int1 = scannerInt.nextInt();
        int int2 = scannerInt.nextInt();
        System.out.println(int1 + int2);


        // ввод значений String
        Scanner scannerString = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String str = scannerString.nextLine();
        System.out.println(str);

    }
}

//        next(): считывает введенную строку до первого пробела
//        nextLine(): считывает всю введенную строку
//        nextInt(): считывает введенное число int
//        nextDouble(): считывает введенное число double
//        nextBoolean(): считывает значение boolean
//        nextByte(): считывает введенное число byte
//        nextFloat(): считывает введенное число float
//        nextShort(): считывает введенное число short