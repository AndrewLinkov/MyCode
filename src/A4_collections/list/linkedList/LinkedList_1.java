package A4_collections.list.linkedList;

//Создание списка. Стандартные операции.

import java.util.LinkedList;

public class LinkedList_1 {
    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();
        list.add("Первый");
        list.add("Второй");
        list.add("Третий");
        list.add("Четвертый");
        list.add("Пятый");
        list.add("Шестой");

        for (String l : list) {
            System.out.println(l);
        }

        //удаление элемента с индексом 1
        list.remove(1);

        for (String l : list) {
            System.out.println(l);
        }

        //Вывод элемента по индексу
        System.out.println("Вывод элемента по 2 индексу: " + list.get(2));
    }
}
