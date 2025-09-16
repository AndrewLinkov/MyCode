package LocalDate;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class LocalDateTest {
    public static void main(String[] args) {

        // Создание текущей даты
        LocalDate today = LocalDate.now();
        System.out.println("Сегодня: " + today);

        // Создание конкретной даты
        LocalDate specificDate = LocalDate.of(2023, 10, 15);
        System.out.println("Определенная дата: " + specificDate);

        //  --- Форматированием даты ---

        LocalDate date = LocalDate.of(2023, 10, 15);

        // Форматирование даты
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String formattedDate = date.format(formatter);
        System.out.println("Отформатированная дата: " + formattedDate); // "15/10/2023"

        // Парсинг строки в объект LocalDate
        LocalDate parsedDate = LocalDate.parse("15/10/2023", formatter);
        System.out.println("Парсинг даты: " + parsedDate);

        //  --- Арифметика с данными ---

        // Добавление дней
        LocalDate futureDate = today.plusDays(10); // После 10 дней
        System.out.println("Дата через 10 дней: " + futureDate);

        // Вычитание дней
        LocalDate pastDate = today.minusDays(10); // За 10 дней до
        System.out.println("Дата 10 дней назад: " + pastDate);
    }
}
