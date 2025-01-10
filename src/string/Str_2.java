package string;

//Разделить строку на слова, вывести эти слова.
public class Str_2 {
    public static void main(String[] args) {
        String str = "Это был тяжелый год для, нас двоих. Ежик был прав.";
        String str2 = "Привет ";
        String str3 = "Мир";
        String str4 = "Привет мир и солнце!";

        //Разделение по пробелам
//        String[] arrays = str.split(" ");

        System.out.println("Разделение строки на слова: ");
        String[] arrays = str.split("[.,\\s]+");
        for (String array : arrays) {
            System.out.println(array);
        }

        System.out.println("Сложение строк: ");
        String result = str2 + str3;
        System.out.println("Результат сложения строк: " + result);


        System.out.println("Разделение строки на символы: ");
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            System.out.println(c);
        }

        System.out.println("Удаление пробелов из строки");
        String resultNotSpace = str4.replace(" ", "");
        System.out.println(resultNotSpace);
    }
}
