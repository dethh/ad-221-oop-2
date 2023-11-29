package lb9;
import java.util.HashMap;
import java.util.Map;

public class t3 {
    public static void main(String[] args) {
        String text = "Certainty listening no no behaviour existence assurance situation is. " +
                "Because add why not esteems amiable him. Interested the unaffected mrs law friendship add principles. " +
                "Indeed on people do merits to. Court heard which up above hoped grave do. Answer living law things either sir bed length. " +
                "Looked before we an on merely. These no death he at share alone. Yet outward the him compass hearted are tedious.";

        Map<String, Integer> wordFrequency = getWordFrequency(text);

        // Вывод частоты встречаемости каждого слова
        System.out.println("Частота встречаемости слов:");
        for (Map.Entry<String, Integer> entry : wordFrequency.entrySet()) {
            String word = entry.getKey();
            int frequency = entry.getValue();
            System.out.println(word + ": " + ((double) frequency / wordCount(text)));
        }
    }

    // Метод для подсчета частоты встречаемости слов в тексте
    private static Map<String, Integer> getWordFrequency(String text) {
        Map<String, Integer> wordFrequency = new HashMap<>();
        String[] words = text.split("\\s+");

        for (String word : words) {
            // Приводим слово к нижнему регистру перед добавлением в карту
            word = word.toLowerCase();

            // Обновляем частоту встречаемости слова в карте
            wordFrequency.put(word, wordFrequency.getOrDefault(word, 0) + 1);
        }

        return wordFrequency;
    }

    // Метод для подсчета общего количества слов в тексте
    private static int wordCount(String text) {
        String[] words = text.split("\\s+");
        return words.length;
    }
}
