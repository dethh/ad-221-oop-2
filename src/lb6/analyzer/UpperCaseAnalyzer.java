package lb6.analyzer;


public class UpperCaseAnalyzer implements StringAnalyzer {
    @Override
    public int analyze(String str) {
        // Возвращает количество заглавных символов в строке
        int count = 0;
        for (char ch : str.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                count++;
            }
        }
        return count;
    }
}
