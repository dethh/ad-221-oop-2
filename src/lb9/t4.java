package lb9;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

public class t4 {
    public static void main(String[] args) {
        String text = "Certainty listening no no behaviour existence assurance situation is. " +
                "Because add why not esteems amiable him. Interested the unaffected mrs law friendship add principles. " +
                "Indeed on people do merits to. Court heard which up above hoped grave do. Answer living law things either sir bed length. " +
                "Looked before we an on merely. These no death he at share alone. Yet outward the him compass hearted are tedious.";

        List<String> sentences = splitIntoSentences(text);

        // Вывод несортированного списка
        System.out.println("Несортированный список предложений:");
        for (String sentence : sentences) {
            System.out.println(sentence);
        }

        // Сортировка списка предложений
        Collections.sort(sentences);

        // Вывод отсортированного списка
        System.out.println("\nОтсортированный список предложений:");
        for (String sentence : sentences) {
            System.out.println(sentence);
        }
    }

    // Метод для разбиения текста на предложения
    private static List<String> splitIntoSentences(String text) {
        List<String> sentences = new ArrayList<>();
        BreakIterator iterator = BreakIterator.getSentenceInstance(Locale.US);
        iterator.setText(text);

        int start = iterator.first();
        for (int end = iterator.next(); end != BreakIterator.DONE; start = end, end = iterator.next()) {
            sentences.add(text.substring(start, end).trim());
        }

        return sentences;
    }
}
