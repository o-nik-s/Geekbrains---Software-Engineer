// 1) Подсчитать количество вхождения каждого слова
// Пример:
// Россия идет вперед всей планеты. Планета — это не Россия.
// toLoverCase().

package geekbrains_course.Homework_5;

import java.util.HashMap;
import java.util.Map;

public class Task_1 {

    public static void main(String[] args) {

        String sentence = "Россия идет вперед всей планеты. Планета — это не Россия.";
        sentence = sentence.toLowerCase().replaceAll("[^A-Za-zА-Яа-я0-9 ]", "");
        String[] partsSentence = sentence.split(" ");
        Map<String, Integer> countWords = new HashMap<>();

        for (String word:
             partsSentence) {
            if (word!=""){
                countWords.putIfAbsent(word, 0);
                countWords.put(word, countWords.get(word)+1);
//                if (!countWords.containsKey(word)) {
//                    countWords.put(word, 1);
//                }
//                else {
//                    countWords.put(word, countWords.get(word)+1);
//                }
            }
        }

        for (String word :
                countWords.keySet()) {
            System.out.println(word + " встретилось: " + countWords.get(word) + " раз");
        }

    }

}
