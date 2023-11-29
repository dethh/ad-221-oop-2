package lb6.analyzer;

public class LowerCaseAnalyzer implements StringAnalyzer {
    @Override
    public int analyze(String str) {
        // Возвращает количество строчных символов в строке
        int count = 0;
        for (char ch : str.toCharArray()) {
            if (Character.isLowerCase(ch)) {
                count++;
            }
        }
        return count;
    }
}

