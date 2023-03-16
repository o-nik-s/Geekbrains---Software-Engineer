// Подсчитать количество искомого слова, через map (наполнением значение,
// где искомое слово будет являться ключом)

package geekbrains_course.Homework_5;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task_2_2 {

    static String fileName = "text.txt"; // Данный файл должен лежать в корневой директории проекта и быть с размеченными переносами строк

    public static void main(String[] args) throws Exception {

        String dir = System.getProperty("user.dir");

        String text = readTextFile(dir + "\\" + fileName);
//        System.out.println(text);

        Scanner scanner = new Scanner(System.in);
//        System.out.println("Введите текст: ");
//        String text = scanner.nextLine();
        System.out.print("Введите искомое слово: ");
        String searchWord = scanner.nextLine();
        scanner.close();

        text = text.toLowerCase().replaceAll("[^A-Za-zА-Яа-я0-9 ]", "");
        String[] partsText = text.split(" ");
        searchWord = searchWord.toLowerCase();
        Map<String, Integer> countWords = new HashMap<>();

        for (String word:
                partsText) {
            if (word!=""){
                countWords.putIfAbsent(word, 0);
                countWords.put(word, countWords.get(word)+1);
            }
        }

        Integer count = countWords.get(searchWord);
        count = count == null ? 0 : count;
        System.out.println("Слово " + searchWord + " встретилось " + count  + " раз");

    }

    public static String readTextFile(String fileName) throws Exception {
        String text = Files.lines(Paths.get(fileName)).reduce("", String::concat);
        return text;
    }

}
