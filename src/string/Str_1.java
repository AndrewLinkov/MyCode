// Вывести в консоли только повторяющиеся слова
package string;

import java.util.HashMap;
import java.util.Map;

public class Str_1 {
    public static void main(String[] args) {
        String str = "one two three four two four five four three four six nine three";

        // Разбиваем строку на слова
        String[] words = str.split("\\s+");

        // Используем map для подсчёта вхождений слов
        Map<String, Integer> wordCount = new HashMap<>();

        /* Подсчитываем количество вхождений каждого слова
        В цикле мы увеличиваем счетчик каждого слова,
        используя метод getOrDefault(), который возвращает текущее количество
        вхождений (или 0, если слово еще не встречалось).
         */
        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        /*
        В конце мы проходим по карте и выводим
        только те слова, которые встречаются более одного раза,
        используя условие if (entry.getValue() > 1)
         */
        System.out.println("Повторяющиеся слова:");
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey());
            }
        }
    }
}
