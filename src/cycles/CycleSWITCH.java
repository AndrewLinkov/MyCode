package cycles;

import java.util.Scanner;

public class CycleSWITCH {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();

        switch (x) {
            case 1:
                System.out.println("Зеленый");
                break;
            case 2:
                System.out.println("Желтый");
                break;
            case 3:
                System.out.println("Красный");
                break;
            default:
                System.out.println("Неправильно введено число");
                break;
        }



    }
}
