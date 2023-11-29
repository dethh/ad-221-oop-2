package lb9;
import java.util.HashSet;
import java.util.Set;

public class t2 {
    public static void main(String[] args) {
        String text = "Certainty listening no no behaviour existence assurance situation is. Because add why not esteems amiable him. Interested the unaffected mrs law friendship add principles. Indeed on people do merits to. Court heard which up above hoped grave do. Answer living law things either sir bed length. Looked before we an on merely. These no death he at share alone. Yet outward the him compass hearted are tedious. ";

        Set<String> uniqueWords = getUniqueWords(text);

        // Вывод всех уникальных слов
        System.out.println("Уникальные слова: " + uniqueWords);
    }

    // Метод для выделения уникальных слов из текста
    private static Set<String> getUniqueWords(String text) {
        Set<String> uniqueWords = new HashSet<>();
        String[] words = text.split("\\s+");

        for (String word : words) {
            // Приводим слово к нижнему регистру перед добавлением в множество
            uniqueWords.add(word.toLowerCase());
        }

        return uniqueWords;
    }
}

