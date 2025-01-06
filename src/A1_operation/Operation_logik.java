package A1_operation;

public class Operation_logik {
    public static void main(String[] args) {
        int a = 5;
        int b = 6;

/*
        System.out.println("Оператор НЕ (Отрицвние)");
        if (a == 5) {
            System.out.println("а = 5");
        } else if (a != 5) {
            System.out.println("а не = 5");
        }

        System.out.println("Логическое И (AND, умножение) возвращает true если оба операнда равны 5");
        if ((a & b) == 5) {
            System.out.println("a и b = 5");
        } else if ((a & b) != 5) {
            System.out.println("a и b не= 5" );
        }
*/
        System.out.println("Логическое ИЛИ (OR, сложение) возвращает true если хотя бы один из операндов 5");
        if ((a | b) == 5) {
            System.out.println("a или b = 5");
        } else if ((a | b) != 5) {
            System.out.println("a или b не= 5");
        }

/*
        System.out.println("Логическое исключающее ИЛИ (XOR) возвращает true если хотя бы один и только один из операндов 5");
        if ((a ^ b) == 5) {
            System.out.println("a или b = 5");
        } else if ((a ^ b) != 7) {
            System.out.println("a или b не= 5");
        }
*/
    }
}
