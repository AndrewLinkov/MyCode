package streamAPI;

import java.util.ArrayList;
import java.util.List;

public class Data {
    private static List<Person> persons = new ArrayList<>();

    static {
        Person person1 = new Person("Иван", "Иванов", 35);
        Person person2 = new Person("Петр", "Петров", 12);
        Person person3 = new Person("Иван", "Сидоров", 85);
        Person person4 = new Person("Леон", "Островский", 44);
        Person person5 = new Person("Иван", "Ургант", 17);
        Person person6 = new Person("Елена", "Абрамова", 22);
        Person person7 = new Person("Инга", "Иванова", 28);

        persons.add(person1);
        persons.add(person2);
        persons.add(person3);
        persons.add(person3);
        persons.add(person4);
        persons.add(person5);
        persons.add(person6);
        persons.add(person7);

    }

    public static List<Person> getPersons() {
        return persons;
    }


}
