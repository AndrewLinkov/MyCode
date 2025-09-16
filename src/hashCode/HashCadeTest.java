package hashCode;

import java.util.Objects;

public class HashCadeTest {
    public static void main(String[] args) {

        // Получение HashCode строки
        String text = "Пример строки";
        int hash = text.hashCode();
        System.out.println("Хэш строки: " + hash);

        // Получение HashCode объекта
        String name = "Иванов";
        int age = 30;
        int hashCodeObj = Objects.hash(name, age);
        System.out.println("Хэш объекта: " + hashCodeObj);
    }
}
