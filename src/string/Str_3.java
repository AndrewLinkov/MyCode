package string;

//Найти сколько раз в строке встречается буква а
public class Str_3 {
    public static void main(String[] args) {
        String str = "Было небо без огня и ветра";
        char ch = 'а';
        int count = 0;


        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                count++;
            }
        }
        System.out.println("Буква 'a' встречается " + count + " раз.");
    }
}
