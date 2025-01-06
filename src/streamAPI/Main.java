package streamAPI;

import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Person> persons = Data.getPersons();

        // Использование Stream API

        //Использование методов .filter .sorted
        //Создаем поток
/*        List<Person> persons1 = persons.stream()
                //Применим метод фильтрации.
                .filter(p -> p.getAge()>30)
                //Проведем сортировку (Изменив класс Person, добавлен метод compareTo)
                .sorted()
                //Применим метод, который возвратит коллекцию
                .collect(Collectors.toList());
*/
        //использование метода .map. Все стали Ивановы

        List<Person> persons1 = persons.stream()
                //Применим метод map.
                .map(person -> new Person(person.getFirstName(), "Иванов", person.getAge()))
                //Применим метод, который возвратит коллекцию
                .collect(Collectors.toList());

        //Получение списка персон с помощью цикла
        for (int i = 0; i < persons1.size(); i++) {
            System.out.println(persons1.get(i));
        }
    }
}
